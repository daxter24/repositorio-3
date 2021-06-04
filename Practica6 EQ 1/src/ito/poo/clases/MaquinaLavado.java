/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;
import ito.poo.clases.Maquinas;
public class MaquinaLavado extends Maquinas {
	public MaquinaLavado(int capacidadL, int envasesLavadosXmin) {
		super();
		this.capacidadL = capacidadL;
		this.envasesLavadosXmin = envasesLavadosXmin;
	}
	private int capacidadL = 0;
	private int envasesLavadosXmin = 0;
	public MaquinaLavado() {
		super();
	}
	public int costoLavado() {
		int costoLavado = 25;
		return costoLavado;
		// End of user code
	}
	public int getCapacidadL() {
		return this.capacidadL;
	}
	public void setCapacidadL(int newCapacidadL) {
		this.capacidadL = newCapacidadL;
	}
	public int getEnvasesLavadosXmin() {
		return this.envasesLavadosXmin;
	}
	public void setEnvasesLavadosXmin(int newEnvasesLavadosXmin) {
		this.envasesLavadosXmin = newEnvasesLavadosXmin;
	}
	@Override
	public String toString() {
		return "MaquinaLavado [capacidadL=" + capacidadL + ", envasesLavadosXmin=" + envasesLavadosXmin + "]";
	}
}
