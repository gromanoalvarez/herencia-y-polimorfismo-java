package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class testHospital {

	@Test
	public void queSePuedanCrearLosDiferentesPacientes() {
		Paciente nuevo1 = new Diabetico();
		Paciente nuevo2 = new Oncologico();
		Paciente nuevo3 = new Celiaco();
		Paciente nuevo4 = new Hipertenso();
		Paciente nuevo5 = new General();

		assertNotNull(nuevo1);
		assertNotNull(nuevo2);
		assertNotNull(nuevo3);
		assertNotNull(nuevo4);
		assertNotNull(nuevo5);
	}

	@Test
	public void queSePuedanCrearLosDiferentesPacientesConConstructor() {
		Plato nuevoPlato = new Plato("FideosConTuco", TipoDeElaboracion.EN_OLLA);

		Paciente nuevo1 = new Diabetico("emma", nuevoPlato);
		Paciente nuevo2 = new Oncologico("juan", nuevoPlato);
		Paciente nuevo3 = new Celiaco("german", nuevoPlato);
		Paciente nuevo4 = new Hipertenso("mariana", nuevoPlato);
		Paciente nuevo5 = new General("gustavo", nuevoPlato);

		assertNotNull(nuevo1);
		assertNotNull(nuevo2);
		assertNotNull(nuevo3);
		assertNotNull(nuevo4);
		assertNotNull(nuevo5);
	}

	@Test
	public void queSePuedaCrearUnPlato() {
		Plato platoCena = new Plato("Fideos a la bolognesa", TipoDeElaboracion.EN_OLLA);

		assertNotNull(platoCena);

	}

	@Test
	public void queOncologicoTengaUnaRestriccionAlimentaria() {

		Plato platoCenaNoPermitido = new Plato("Fideos a la bolognesa", TipoDeElaboracion.CRUDO);

		Paciente nuevo2 = new Oncologico("pedro", platoCenaNoPermitido);

		assertTrue(nuevo2.restriccionAlimentaria(platoCenaNoPermitido));

	}

	@Test
	public void queCeliacoTengaUnaRestriccionAlimentaria() {
		Plato platoCena = new Plato("Fideos a la bolognesa", TipoDeElaboracion.EN_OLLA);
		platoCena.ingresarIngredienteALaColeccion("Sal");
		Plato platoCenaNoPermitido = new Plato("Fideos a la bolognesa", TipoDeElaboracion.CRUDO);
		platoCenaNoPermitido.ingresarIngredienteALaColeccion("trigo");

		Paciente nuevo2 = new Celiaco("pedro", platoCena);

		assertFalse(nuevo2.restriccionAlimentaria(platoCena));
		assertTrue(nuevo2.restriccionAlimentaria(platoCenaNoPermitido));

	}

	@Test
	public void queHipertensoTengaUnaRestriccionAlimentaria() {
		Plato platoCena = new Plato("Fideos a la bolognesa", TipoDeElaboracion.EN_OLLA);
		platoCena.ingresarIngredienteALaColeccion("Oregano");
		Plato platoCenaNoPermitido = new Plato("Fideos a la bolognesa", TipoDeElaboracion.CRUDO);
		platoCenaNoPermitido.ingresarIngredienteALaColeccion("sal");

		Paciente nuevo2 = new Hipertenso("pedro", platoCena);

		assertFalse(nuevo2.restriccionAlimentaria(platoCena));
		assertTrue(nuevo2.restriccionAlimentaria(platoCenaNoPermitido));

	}

	@Test
	public void queGeneralTengaUnaRestriccionAlimentaria() {
		Plato platoCena1 = new Plato("Fideos a la bolognesa", TipoDeElaboracion.EN_OLLA);
		platoCena1.ingresarIngredienteALaColeccion("Sal");
		Plato platoCena2 = new Plato("Fideos a la bolognesa", TipoDeElaboracion.AL_HORNO);
		platoCena2.ingresarIngredienteALaColeccion("Trigo");
		Plato platoCena3 = new Plato("Fideos a la bolognesa", TipoDeElaboracion.FRITO);
		platoCena3.ingresarIngredienteALaColeccion("Azucar");
		Plato platoCena4 = new Plato("Fideos a la bolognesa", TipoDeElaboracion.CRUDO);
		platoCena4.ingresarIngredienteALaColeccion("Avena");

		Paciente nuevo1 = new General("pedro", platoCena1);
		Paciente nuevo2 = new General("juan", platoCena2);
		Paciente nuevo3 = new General("martin", platoCena3);
		Paciente nuevo4 = new General("carlos", platoCena4);

		assertFalse(nuevo1.restriccionAlimentaria(platoCena1));
		assertFalse(nuevo2.restriccionAlimentaria(platoCena2));
		assertFalse(nuevo3.restriccionAlimentaria(platoCena3));
		assertFalse(nuevo4.restriccionAlimentaria(platoCena4));

	}

	@Test
	public void queTodosLosDiabeticoTengaUnaRestriccionAlimentaria() {
		Plato platoCena = new Plato("Fideos a la bolognesa", TipoDeElaboracion.EN_OLLA);
		platoCena.ingresarIngredienteALaColeccion("sal");
		Plato platoCenaNoPermitido = new Plato("Fideos a la bolognesa", TipoDeElaboracion.CRUDO);
		platoCenaNoPermitido.ingresarIngredienteALaColeccion("azucar");

		Paciente nuevo2 = new Diabetico("pedro", platoCena);
		Paciente nuevo3 = new DiabeticoTipo1("pedro", platoCena);
		Paciente nuevo4 = new DiabeticoTipo2("pedro", platoCena);

		assertFalse(nuevo2.restriccionAlimentaria(platoCena));
		assertTrue(nuevo2.restriccionAlimentaria(platoCenaNoPermitido));
		assertFalse(nuevo3.restriccionAlimentaria(platoCena));
		assertTrue(nuevo3.restriccionAlimentaria(platoCenaNoPermitido));
		assertFalse(nuevo4.restriccionAlimentaria(platoCena));
		assertTrue(nuevo4.restriccionAlimentaria(platoCenaNoPermitido));
	}

	@Test
	public void queDiabeticoTipo1NoSeaInsulinoDependiente() {
		Plato platoCena = new Plato("Fideos a la bolognesa", TipoDeElaboracion.EN_OLLA);
		Paciente nuevo2 = new DiabeticoTipo1("pedro", platoCena);
		DiabeticoTipo1 nuevo3 = (DiabeticoTipo1) nuevo2;

		assertFalse(nuevo3.SaberSiRequiereInsulina());

	}

	@Test
	public void queDiabeticoTipo2SeaInsulinoDependiente() {
		Plato platoCena = new Plato("Fideos a la bolognesa", TipoDeElaboracion.EN_OLLA);
		Paciente nuevo2 = new DiabeticoTipo2("pedro", platoCena);
		DiabeticoTipo2 nuevo3 = (DiabeticoTipo2) nuevo2;

		assertTrue(nuevo3.SaberSiRequiereInsulina());

	}

}
