package ar.edu.unlam;

public class DiabeticoTipo1 extends Diabetico {
	public DiabeticoTipo1(String nombre, Plato unPlato) {
		super(nombre, unPlato);
		super.EsInsulinoDependiente=false;
	}
}
