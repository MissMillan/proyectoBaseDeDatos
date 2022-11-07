package ejercicioSQL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;







public class RepositorioAlumnoImpl implements RepositorioAlumno<Alumno>{

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }


	@Override
	public List<Alumno> listar() {
		List<Alumno> alumnos = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM tb_alumno")) {
            while (rs.next()) {
                Alumno p = crearProducto(rs);
                alumnos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alumnos;
		
	}
	
	//-----------------------------------------------------------
    private Alumno crearProducto(ResultSet rs) throws SQLException {
        Alumno p = new Alumno();
        p.setId(rs.getInt("id"));
        p.setNombre(rs.getString("nombre"));
        p.setApellidos(rs.getString("apellidos"));
        p.setDni(rs.getString("dni"));

        return p;
    }

	//-----------------------------------------------------------
	@Override
	public void guardar(Alumno alumno) {
		// TODO Auto-generated method stub
        String sql;
   
            sql = "INSERT INTO tb_alumno(nombre, apellidos,dni) VALUES(?,?,?)";
        
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, alumno.getNombre());
            stmt.setString(2, alumno.getApellidos());
            stmt.setString(3, alumno.getDni());


            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
		
	}
    
}
