/**
 * 
 * @author Miguel
 * @version 24/05/19
 * Javadoc hecho por Jose
 * Esta es la clase Persona que nos dará un nombre, teléfono y dni.
 */
public class Persona {
	String nombre;
	String dni;
	String telefono;
		
	/**
	 * Es un constructor en el que se establece los atributos de la persona.
	 * @param nombre .Establece el nombre.
	 * @param dni .Establece el dni.
	 * @param telefono .Establece el teléfono.
	 */
	public Persona(String nombre, String dni, String telefono) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	 
	/**
	 * 
	 * @return .Devuelve un String con el nombre.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * 
	 * @param nombre .Usa el parámetro nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * 
	 * @return .Devuelve un String con el dni.
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * 
	 * @param dni .Usa el parámetro dni.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * 
	 * @return .Devuelve un String con el teléfono.
	 */
	public String getTelefono() {
		return telefono;
	}
	 
	/**
	 * 
	 * @param telefono .Usa el parámetro teléfono.
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}

