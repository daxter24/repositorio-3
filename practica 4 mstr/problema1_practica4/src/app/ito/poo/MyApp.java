package app.ito.poo;

import clases.ito.poo.Calzado;

public class MyApp {

	static void run() {
		
		Calzado calzadoX= (new Calzado(66666,"cuero","patito",50,new String[]{"rojo","negro","cafe","morado"}));
		float costoTotal=calzadoX.costoPorLote(10.0);
		
		System.out.println (calzadoX);
		System.out.println("El costo total por lote es:"+costoTotal);
	}
	
		


	public static void main(String[] args) {
		run();
	} 

}
