/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;
import ito.poo.clases.Maquinas;
import java.util.HashSet;
public class MaquinaLlenadoyEnvasado extends Maquinas {
	public MaquinaLlenadoyEnvasado(int envasesXmin, HashSet<String> listaRegulacionMl) {
		super();
		this.envasesXmin = envasesXmin;
		this.listaRegulacionMl = listaRegulacionMl;
	}
	private int envasesXmin = 0;
	private HashSet<String> listaRegulacionMl = new HashSet<String>();
	public MaquinaLlenadoyEnvasado() {
		// Start of user code constructor for MaquinaLlenadoyEnvasado)
		super();
		// End of user code
	}
	public int costoLlyEn() {
		// Start of user code for method costoLlyEn
		int costoLlyEn = 0;
		return costoLlyEn;
		// End of user code
	}
	public int getEnvasesXmin() {
		return this.envasesXmin;
	}
	public void setEnvasesXmin(int newEnvasesXmin) {
		this.envasesXmin = newEnvasesXmin;
	}
	public HashSet<String> getListaRegulacionMl() {
		return this.listaRegulacionMl;
	}
	@Override
	public String toString() {
		return "MaquinaLlenadoyEnvasado [envasesXmin=" + envasesXmin + ", listaRegulacionMl=" + listaRegulacionMl + "]";
	}
}
