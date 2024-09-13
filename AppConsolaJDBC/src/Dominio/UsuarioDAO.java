package Dominio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.CallableStatement;

public class UsuarioDAO {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "root";
	private String dbName = "bdregistro";
	
	public UsuarioDAO() {
		
	}
	
	public int agregarUsuario(Usuario usuario) {
		String query = "Insert Into usuario(nombre,apellido) Values ('"+usuario.getNombre()+"','"+usuario.getApellido()+"')";
		
		Connection cn = null;
		
		int filas=0;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return filas;
	}
	
	public Usuario obtenerUsuario(int id) {
		Usuario x = new Usuario();
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(host+dbName+"?useSSL=false",user,pass);
			Statement st = cn.createStatement();
			String query = "Select * From usuario Where id =" + id;
			ResultSet rs = st.executeQuery(query);
			rs.next();
			x.setNombre(rs.getString("nombre"));
			x.setApellido(rs.getString("apellido"));
			x.setId(rs.getInt("id"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return x;
	}
	
	public ArrayList<Usuario> obtenerListadoUsuarios(){
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(host+dbName+"?useSSL=false",user,pass);
			String query = "Select * From usuario";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
			Usuario x = new Usuario();
			x.setNombre(rs.getString("nombre"));
			x.setApellido(rs.getString("apellido"));
			x.setId(rs.getInt("id"));
			lista.add(x);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public void agregarUsuarioSP(Usuario us) {
		Connection cn = null;
		
		try {
			cn = DriverManager.getConnection(host+dbName+"?useSSL=false",user,pass);
			CallableStatement cst = cn.prepareCall("CALL crearUsuario(?,?)");
			cst.setString(1, us.getNombre());
			cst.setString(2, us.getApellido());
			cst.execute();
			System.out.println("Usuario creado con exito.");
		}
		catch (Exception e) {
			System.out.println("Error al crear un usuario.");
			e.printStackTrace();
		}
	}
	
}
