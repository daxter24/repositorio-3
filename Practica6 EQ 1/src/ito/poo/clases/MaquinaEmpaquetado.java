/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package ito.poo.clases;

import ito.poo.clases.Maquinas;
import java.util.HashSet;

public class MaquinaEmpaquetado extends Maquinas {
	public MaquinaEmpaquetado(HashSet<String> tipoEmpaque, int empaquesPorMinuto) {
		super();
		this.tipoEmpaque = tipoEmpaque;
		this.empaquesPorMinuto = empaquesPorMinuto;
	}
	private HashSet<String> tipoEmpaque = new HashSet<String>();
	private int empaquesPorMinuto = 0;
	public MaquinaEmpaquetado() {
		super();
	}
	public int costoEmpaquetado() {
		int costoEmpaquetado = 0;
		return costoEmpaquetado;

	}
	public HashSet<String> getTipoEmpaque() {
		return this.tipoEmpaque;
	}
	public int getEmpaquesPorMinuto() {
		return this.empaquesPorMinuto;
	}
	public void setEmpaquesPorMinuto(int newEmpaquesPorMinuto) {
		this.empaquesPorMinuto = newEmpaquesPorMinuto;
	}
	@Override
	public String toString() {
		return "MaquinaEmpaquetado [tipoEmpaque=" + tipoEmpaque + ", empaquesPorMinuto=" + empaquesPorMinuto + "]";
	}

}
