/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clases.ito.poo;

import java.util.ArrayList;
import java.util.HashSet;
// Start of user code (user defined imports)

// End of user code

/**
 * Description of Fruta.
 * 
 * @author USUARIO
 */

public class Fruta {
	
	public Fruta(String nombre, float extension, String tiempoCosecha, float cantCosechaxtiempo,
			float costoPromedio, float precioVentaProm) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tiempoCosecha = tiempoCosecha;
		this.cantCosechaxtiempo = cantCosechaxtiempo;
		this.costoPromedio = costoPromedio;
		this.precioVentaProm = precioVentaProm;
		
	}
	
	

	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property extension.
	 */
	public float extension = 0F;

	/**
	 * Description of the property tiempoCosecha.
	 */
	public String tiempoCosecha;

	/**
	 * Description of the property cantCosechaxtiempo.
	 */
	public float cantCosechaxtiempo;

	/**
	 * Description of the property costoPromedio.
	 */
	public float costoPromedio = 0F;

	/**
	 * Description of the property precioVentaProm.
	 */
	public float precioVentaProm = 0F;

	// Start of user code (user defined attributes for Fruta)
	

	// End of user code

	/**
	 * The constructor.
	 */

	/**
	 * Description of the method agregarPeriodo.
	 * @param periodo 
	 * @param cantEstimada 
	 */
	private ArrayList<String>periodo=new ArrayList<String>();
	private ArrayList <Float>cantEstimada = new ArrayList<Float>();
	
	public void agregarPeriodo(String periodo, float cantEstimada) {
		// Start of user code for method agregarPeriodo
		this.periodo.add(periodo);
		this.cantEstimada.add(cantEstimada);
		// End of user code
	}

	/**
	 * Description of the method eliminarPeriodo.
	 * @param i 
	 * @return 
	 */
	public Boolean eliminarPeriodo(int i) {
		// Start of user code for method eliminarPeriodo
		Boolean eliminarPeriodo = false;
		if(i>=0 && i<this.periodo.size()) {
			this.periodo.remove(i);
			this.cantEstimada.remove(i);
			eliminarPeriodo=true;
		}
		return eliminarPeriodo;
		// End of user code
		
	}

	/**
	 * Description of the method costoPeriodo.
	 * @param i 
	 * @return 
	 */
	public float costoPeriodo(int i) {
		// Start of user code for method costoPeriodo
		float costoPeriodo = 0F;
		if(i>=0 && i<this.periodo.size()) {
			
			costoPeriodo=this.cantEstimada.get (i)*this.costoPromedio;
		}
		return costoPeriodo;
	}

	/**
	 * Description of the method ganancia.
	 * @param i 
	 * @return 
	 */
	public float ganancia(int i) {
		// Start of user code for method ganancia
		float ganancia = 0F;
		if(i>=0&&i<this.periodo.size()) {
			ganancia=this.precioVentaProm-(this.cantEstimada.get(i)*this.costoPromedio);
		}
			
			
		return ganancia;
		// End of user code
	}

	// Start of user code (user defined methods for Fruta)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns extension.
	 * @return extension 
	 */
	public float getExtension() {
		return this.extension;
	}

	/**
	 * Sets a value to attribute extension. 
	 * @param newExtension 
	 */
	public void setExtension(float newExtension) {
		this.extension = newExtension;
	}

	/**
	 * Returns tiempoCosecha.
	 * @return tiempoCosecha 
	 */
	public String getTiempoCosecha() {
		return this.tiempoCosecha;
	}

	/**
	 * Returns cantCosechaxtiempo.
	 * @return cantCosechaxtiempo 
	 */
	public float getCantCosechaxtiempo() {
		return this.cantCosechaxtiempo;
	}

	/**
	 * Returns costoPromedio.
	 * @return costoPromedio 
	 */
	public float getCostoPromedio() {
		return this.costoPromedio;
	}

	/**
	 * Sets a value to attribute costoPromedio. 
	 * @param newCostoPromedio 
	 */
	public void setCostoPromedio(float newCostoPromedio) {
		this.costoPromedio = newCostoPromedio;
	}

	/**
	 * Returns precioVentaProm.
	 * @return precioVentaProm 
	 */
	public float getPrecioVentaProm() {
		return this.precioVentaProm;
	}

	/**
	 * Sets a value to attribute precioVentaProm. 
	 * @param newPrecioVentaProm 
	 */
	public void setPrecioVentaProm(float newPrecioVentaProm) {
		this.precioVentaProm = newPrecioVentaProm;
	}

	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", extension=" + extension + ", tiempoCosecha=" + tiempoCosecha
				+ ", cantCosechaxtiempo=" + cantCosechaxtiempo + ", costoPromedio=" + costoPromedio
				+ ", precioVentaProm=" + precioVentaProm + ", periodo=" + periodo + ", cantEstimada=" + cantEstimada
				+  "]";
	}

}
