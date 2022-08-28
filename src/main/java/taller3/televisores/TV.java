package taller3.televisores;

public class TV {
    Marca marca;
    public int canal=1;
    int precio=500;
    boolean estado;
    int volumen=1;
    Control control;
    static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public void turnOn() {
        this.estado=true;
    }
    
    public void turnOff() {
        this.estado=false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp(){
        if (canal<120){
            this.canal+=1;
        }
    }

    public void canalDown(){
        if (canal>1){
            this.canal-=1;
        }
    }

    public void volumenUp(){
        if (volumen<7){
            this.canal+=1;
        }
    }

    public void volumenDown(){
        if (volumen>0){
            this.canal-=1;
        }
    }    
}

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn() {
        this.estado=true;
    }
    
    public void turnOff() {
        this.estado=false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp(){
        if (canal<120){
            this.canal+=1;
        }
    }

    public void canalDown(){
        if (canal>1){
            this.canal-=1;
        }
    }

    public void volumenUp(){
        if (volumen<7){
            this.canal+=1;
        }
    }

    public void volumenDown(){
        if (volumen>0){
            this.canal-=1;
        }
    }
}
