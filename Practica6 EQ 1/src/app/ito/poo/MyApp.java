package app.ito.poo;
import ito.poo.clases.Maquinas;
import ito.poo.clases.MaquinaLavado;
import ito.poo.clases.MaquinaEmpaquetado;
import ito.poo.clases.MaquinaLlenadoyEnvasado;
public class MyApp {
	
static void run () {
	MaquinaLavado x;
	x = new MaquinaLavado();
	System.out.println(new MaquinaLavado(15000,2));
	System.out.println(x.costoLavado());

	MaquinaEmpaquetado y;
	y = new MaquinaEmpaquetado();
	System.out.println(new MaquinaEmpaquetado());
	System.out.println(y.costoEmpaquetado());
	
	MaquinaLlenadoyEnvasado s;
	s= new MaquinaLlenadoyEnvasado();
	System.out.println(new MaquinaLlenadoyEnvasado());

}
	public static void main(String[] args) {
		run();
	}
}
