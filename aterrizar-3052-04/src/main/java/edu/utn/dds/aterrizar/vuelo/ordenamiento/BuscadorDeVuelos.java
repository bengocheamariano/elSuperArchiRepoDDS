package edu.utn.dds.aterrizar.vuelo.ordenamiento;

import java.util.List;


import edu.utn.dds.aterrizar.escalas.Vuelo;

public class BuscadorDeVuelos extends Query<Vuelo>{
	public BuscadorDeVuelos(List<Vuelo> elementosOriginales) {
		super(elementosOriginales);
	}
}
