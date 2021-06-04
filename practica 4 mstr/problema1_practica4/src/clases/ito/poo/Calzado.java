package clases.ito.poo;

import java.util.Arrays;

public class Calzado {

	public Calzado(int clave, String material, String troquel, int cantidadxDia, String[] colores) {
		super();
		this.clave = clave;
		this.material = material;
		this.troquel = troquel;
		this.cantidadxDia = cantidadxDia;
		this.colores = colores;
	}


	private int clave;
	private String material;
	private String troquel;
	private int cantidadxDia;
	private String[] colores = null;{
		
	
	}


	public int getClave() {
		return clave;
	}


	public void setClave(int clave) {
		this.clave = clave;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getTroquel() {
		return troquel;
	}


	public void setTroquel(String troquel) {
		this.troquel = troquel;
	}


	public int getCantidadxDia() {
		return cantidadxDia;
	}


	public void setCantidadxDia(int cantidadxDia) {
		this.cantidadxDia = cantidadxDia;
	}


	public String[] getColores() {
		return colores;
	}


	public void setColores(String[] colores) {
		this.colores = colores;
	}


	@Override
	public String toString() {
		return "Calzado [clave=" + clave + ", material=" + material + ", troquel=" + troquel + ", cantidadxDia="
				+ cantidadxDia + ", colores=" + Arrays.toString(colores) + "]";
	}


	public float costoPorLote(double costoXUnidad) {
		return (float) (this.cantidadxDia*costoXUnidad);
		
	}
}
