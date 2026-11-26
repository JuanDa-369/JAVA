 package com.cmc.repaso.entidades;

public class Validación {

	public boolean validarMonto(double monto) {
		if(monto >0 ) {
			return true;
		}else {
			return false;
		}
	}
}
