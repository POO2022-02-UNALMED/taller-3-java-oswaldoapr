package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	static int numTv = 0;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		
		TV.numTv += 1;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setVolumen(int volumen) {
		if(this.estado && volumen >= 0 && volumen <= 7) {
			this.volumen = volumen;
		}
	}
	
	public int getCanal() {
		return this.canal;
	}
	
	public void setCanal(int canal) {
		if(this.estado && canal >= 1 && canal <= 120) {
			this.canal = canal;
		}
	}
	
	public static int getNumTV() {
		return TV.numTv;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTv = numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if(this.estado && this.canal < 120) {
			this.canal += 1;
		}	
	}
	
	public void canalDown() {
		if(this.estado && this.canal > 1) {
			this.canal -= 1;
		}	
	}
	
	public void volumenUp() {
		if(this.estado && this.volumen < 7) {
			this.volumen += 1;
		}
	}
	
	public void volumenDown() {
		if(this.estado && this.volumen > 0) {
			this.volumen -= 1;
		}
	}
}
