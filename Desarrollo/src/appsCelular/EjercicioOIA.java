package appsCelular;

import java.io.File;

public abstract class EjercicioOIA {
	protected File entrada;
	protected File salida;
	
	public EjercicioOIA(File e, File s){
		this.entrada = e;
		this.salida = s;
	}
	
	public abstract void resolver();
}