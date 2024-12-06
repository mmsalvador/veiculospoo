package com.veiculos.sistema;

import com.veiculos.Carro;
import com.veiculos.Moto;
import com.veiculos.Placa;

public class Sistema {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Toyota", "Corolla", 2020, 15000.0, Placa.SP, "Gasolina", 50.0);
		Moto moto = new Moto ("Honda", "CB500", 2022, 5000.0, Placa.RJ, 500);
				
		carro.abastecerTanque(30);
		carro.realizarManutencao(17000.0);
		moto.darPartida();

		System.out.println(carro);
		System.out.println(moto);
	}

}
