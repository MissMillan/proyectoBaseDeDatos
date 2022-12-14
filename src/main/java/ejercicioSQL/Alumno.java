package ejercicioSQL;

public class Alumno {

	private int id;
	private String nombre;
	private String apellidos;
	private String dni;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
	public Alumno() {
		super();
	}
	public Alumno(int id, String nombre, String apellidos, String dni) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	
	public Alumno(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	@Override
	public String toString() {
		return String.format("Alumno [id=%s, nombre=%s, apellidos=%s, dni=%s]", id, nombre, apellidos, dni);
	}
	
	
}
