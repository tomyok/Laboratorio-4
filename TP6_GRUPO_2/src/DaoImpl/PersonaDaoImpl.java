package DaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Dao.PersonaDao;
import Entidad.Persona;



public class PersonaDaoImpl implements PersonaDao
{
	private static final String readDni = "SELECT * FROM personas WHERE dni = ?";
	private static final String insert = "INSERT INTO personas(dni, nombre, apellido) VALUES(?, ?, ?)";
	private static final String delete = "DELETE FROM personas WHERE dni = ?";
	private static final String readall = "SELECT * FROM personas";
	private static final String edit = "UPDATE personas SET nombre = ?, apellido = ? WHERE dni = ?";
		
	@Override
	public Persona readDni (String dni)
	{
		PreparedStatement statement;
		ResultSet resultSet;
		Persona persona = new Persona();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(readDni);
			statement.setString(1, dni);
			resultSet = statement.executeQuery();
			
			resultSet.next();
			persona.setDni(resultSet.getString(1));
			persona.setNombre(resultSet.getString(2));
			persona.setApellido(resultSet.getString(3));
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return persona;
	}
	
	@Override
	public boolean insert(Persona persona)
	{
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isInsertExitoso = false;
		try
		{
			statement = conexion.prepareStatement(insert);
			statement.setString(1, persona.getDni());
			statement.setString(2, persona.getNombre());
			statement.setString(3, persona.getApellido());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isInsertExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return isInsertExitoso;
	}
	
	@Override
	public boolean delete(Persona persona_a_eliminar)
	{
		PreparedStatement statement;
		Connection conexion = Conexion.getConexion().getSQLConexion();
		boolean isdeleteExitoso = false;
		try 
		{
			statement = conexion.prepareStatement(delete);
			statement.setString(1, persona_a_eliminar.getDni());
			if(statement.executeUpdate() > 0)
			{
				conexion.commit();
				isdeleteExitoso = true;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return isdeleteExitoso;
	}
	
	@Override
	public List<Persona> readAll()
	{
		PreparedStatement statement;
		ResultSet resultSet; //Guarda el resultado de la query
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(readall);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				personas.add(getPersona(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return personas;
	}		

	@Override
	public boolean edit(Persona persona_modificar) {
	    Connection conexion = Conexion.getConexion().getSQLConexion();
	    PreparedStatement ps;
	    boolean isEditExitoso = false;
	    try {
	        ps = conexion.prepareStatement(edit);
	        ps.setString(1, persona_modificar.getNombre());
	        ps.setString(2, persona_modificar.getApellido());
	        ps.setString(3, persona_modificar.getDni());

	        if (ps.executeUpdate() > 0) {
	            isEditExitoso = true;
	        }
	       
	        conexion.commit();
	    } catch (SQLException e) {
	        e.printStackTrace();
	        try {
	            conexion.rollback();
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	    }  
	    return isEditExitoso;
	}
	
	private Persona getPersona(ResultSet resultSet) throws SQLException
	{
		String dni = resultSet.getString("Dni");
		String nombre = resultSet.getString("Nombre");
		String apellido = resultSet.getString("Apellido");
		return new Persona(dni, nombre, apellido);
	}
}
