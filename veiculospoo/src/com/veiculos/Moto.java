package com.veiculos;

public class Moto extends Veiculo {
	
	private int cilindrada;
	
	public Moto (String marca, String modelo, int ano, double quilometragem, Placa placa, int cilindrada) {
		super (marca, modelo, ano, quilometragem, placa);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public void darPartida() {
		System.out.println("Ligando moto...");
		System.out.println("Moto ligada.");
	}

	@Override
	public String toString() {
		return super.toString() + "\nTipo: Moto\nCilindrada= " + cilindrada + "\n";
	}
	
	
	

}
