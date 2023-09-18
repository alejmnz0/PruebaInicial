package model;

import java.util.Random;

public class CampoBatalla {

	Personaje luchador1, luchador2;

	public CampoBatalla(Personaje luchador1, Personaje luchador2) {
		super();
		this.luchador1 = luchador1;
		this.luchador2 = luchador2;
	}
	
	public void batallar () {
		Random random = new Random ();
		do {
			luchador2.recibirGolpe(random.nextInt(1, 4) * luchador1.getPuntosFuerza());
			luchador1.recibirGolpe(random.nextInt(1, 4) * luchador2.getPuntosFuerza());
		}while(luchador1.getVida()>0 && luchador2.getVida()>0);
		
	}
	
	public static int elegirPrimero () {
		Random random = new Random ();
		return random.nextInt(0, 2);
	}
}
