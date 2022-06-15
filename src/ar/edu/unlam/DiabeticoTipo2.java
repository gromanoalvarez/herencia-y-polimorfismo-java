package ar.edu.unlam;

public class DiabeticoTipo2 extends Diabetico{

	
	public DiabeticoTipo2(String nombre, Plato unPlato) {
		super(nombre, unPlato);
		super.EsInsulinoDependiente=true;
	}
}
