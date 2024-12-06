package com.veiculos;

public class Carro  extends Veiculo{
	
	private String tipoCombustivel;
	private double capacidadeTanque;
	private double nivelTanque;
	
	public Carro (String marca, String modelo, int ano, double quilometragem, Placa placa, String tipoCombustivel, double capacidadeTanque) {
		
		super(marca, modelo, ano, quilometragem, placa);
		this.tipoCombustivel = tipoCombustivel;
		this.capacidadeTanque = capacidadeTanque;
		this.nivelTanque = 0.0;
	}
	
	public double getNivelTanque() {
		
		return nivelTanque;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public void abastecerTanque(double abastecimento) {
		
		if (abastecimento <= 0) {
			System.out.println ("Quantia inválida para o abastecimento");
		}
		
		if(nivelTanque + abastecimento > capacidadeTanque) {
			System.out.println("Não é possivel abastercer essa quantia, pois o valor excede a capacidade do tanque");
			nivelTanque = capacidadeTanque; //Abastecimento máximo
			System.out.println("Entranto o tanque foi abastecido até a quantia máxima de " + capacidadeTanque + " litros");
			}else {
				System.out.println("Abastecendo com " + abastecimento + " litos");
				nivelTanque += nivelTanque + abastecimento;
			}
			System.out.println("Novo nível do tanque: " + nivelTanque);
	}

	@Override
	public String toString() {
		return super.toString()+ "\nTipo: Carro \nTipo de Combustivel= " + tipoCombustivel + "\nCapacidade do Tanque= " + capacidadeTanque + "\nNível do Tanque= "
				+ nivelTanque + "\n";
	}
	

 
	

}
