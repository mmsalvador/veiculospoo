package com.veiculos;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private double quilometragem;
	private Placa placa;
	
	public Veiculo (String marca, String modelo, int ano, double quilometragem, Placa placa) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.quilometragem = quilometragem;
		this.placa = placa;
		
	}
	
	public Placa getPlaca() {
		return placa;
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
	public void realizarManutencao(double quilometragem) {
		if (quilometragem >= this.quilometragem) {
			this.quilometragem = quilometragem;
			System.out.println("Manutenção realizada. Quilometragem: " + this.quilometragem);
		}else {
			System.out.println("A manutenção não pode ser realizada com uma quilometragem inferior á atual quilometragem do carro");
			
		}	
	}
	@Override
	public String toString() {
		return "\nVeiculo: \nMarca= " + marca + "\nModelo= " + modelo + "\nAno= " + ano + "\nQuilometragem= " + quilometragem
				+ "\nPlaca= " + placa + "\n";
	}

}
