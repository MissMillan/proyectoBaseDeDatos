package ejercicioSQL;

import java.util.Date;




public class MainSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try  {

        	//Connection conn = ConexionBaseDatos.getInstance()
        	RepositorioAlumno<Alumno> repositorioAlumn = new RepositorioAlumnoImpl();

         
            System.out.println("============= Insertamos nuevo alumno =============");
            Alumno alumno1 = new Alumno("Luis","Gomez","1234A");
            Alumno alumno2 = new Alumno("Rosa","Padilla","2222B");
            Alumno alumno3 = new Alumno("Juan","Lopez","3333C");
  
          /*  repositorioAlumn.guardar(alumno1);
            repositorioAlumn.guardar(alumno2);
            repositorioAlumn.guardar(alumno3);*/
          //  System.out.println("Alumno guardado con éxito");
            repositorioAlumn.listar().forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
