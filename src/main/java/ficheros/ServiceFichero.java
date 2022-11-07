package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import ejercicioSQL.Alumno;
import ejercicioSQL.MainSQL;
import ejercicioSQL.RepositorioAlumno;
import ejercicioSQL.RepositorioAlumnoImpl;

public class ServiceFichero {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);

            try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))){
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    //-------------------------------------------
    public void EscribirFicheroTexto (String nombre){

    	RepositorioAlumno infoAlumno = new RepositorioAlumnoImpl();
    	List<Alumno> listaAlumnos = new ArrayList<Alumno>();
    	listaAlumnos = infoAlumno.listar();
    
    	
    		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))){
    			bw.write("Mensaje a escribir en el fichero");
    			
    	    	for(int i =0; i <listaAlumnos.size(); i++) {
    	    		bw.write("\n");
    	    		bw.write(listaAlumnos.get(i).getId()+ " | "+listaAlumnos.get(i).getNombre()+" | "
    	    	+ listaAlumnos.get(i).getApellidos()+ " | "+listaAlumnos.get(i).getDni() );
    	    		
    	    	}
    		} catch (IOException e) {
    			e.printStackTrace();
    		} 
    	
    }
}
