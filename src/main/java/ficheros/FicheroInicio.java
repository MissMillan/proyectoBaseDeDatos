package ficheros;



public class FicheroInicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//Ruta relativa a la carpeta del proyecto
        String nombreArchivo = "./recursos/sql-Alumno.txt";

        ServiceFichero service = new ServiceFichero();
        //service.mostrarContenidoDirectorio("./recursos/");
       // service.crearArchivo(nombreArchivo);
        service.EscribirFicheroTexto(nombreArchivo);
	}

}
