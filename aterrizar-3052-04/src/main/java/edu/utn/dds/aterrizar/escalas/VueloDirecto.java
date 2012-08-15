package edu.utn.dds.aterrizar.escalas;

import java.util.List;

import edu.utn.dds.aterrizar.aerolineas.Aerolinea;
import edu.utn.dds.aterrizar.manejoDeFechas.DateTime;
import edu.utn.dds.aterrizar.manejoDeFechas.SimpleDateParser;
import edu.utn.dds.aterrizar.vuelo.Asiento;

public class VueloDirecto implements Vuelo {
 protected DateTime fechaSalida;
 protected DateTime fechaLlegada;
 protected String origen;
 protected String destino;
 private List<Asiento> asientos;
protected String codigo;
protected Aerolinea aerolinea;
 
	public  VueloDirecto(String origen, String destino, String fechaSalida,
		String fechaLlegada, Aerolinea aerolinea) {
	this.origen= origen;
	this.destino= destino;
	this.fechaSalida= new DateTime(SimpleDateParser.ISO8601(), fechaSalida);
	this.fechaLlegada = new DateTime(SimpleDateParser.ISO8601(), fechaLlegada);
	this.aerolinea= aerolinea;
	}

	public long getDuration(){
		return this.fechaSalida.diasDeDiferenciaCon(this.fechaLlegada);
	
	}
	
	public void agregarAsiento(Asiento asiento){
		this.asientos.add(asiento);
	}

	@Override
	public void setCodigo(String codigo) {
		this.codigo= codigo;
	}
	@Override
	public List<Asiento> getAsientos(){
		return this.asientos;
	}
	@Override
	public Asiento getPrimerAsiento(){
		return this.asientos.get(0);
	}

	public void setOrigen(String origen) {
		this.origen=origen;
		
	}

	public void setDestino(String destino) {
		this.destino= destino;
	}

	@Override
	public DateTime getFechaLlegada() {
		return this.fechaLlegada;
	}

	@Override
	public DateTime getFechaSalida() {
		return this.fechaSalida;
	}
		
	@Override
	public String getOrigen(){
		return this.origen;
	}
	@Override
	public String getDestino(){
		return this.destino;
	}

	@Override
	public Aerolinea getAerolinea() {
		return this.aerolinea;
	}

	public String getCodigo() {
		return this.codigo;
	}
}
