//Commit 6.1//
public class movil {
    public Cargador cargador;
    public int almacenamiento;
    public String marca;
    
    public movil (int corrienteSuministrada, int almacenamiento, String marca){
        this.almacenamiento = almacenamiento;
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    
    public Cargador getCargador() {
        return cargador;
    }
    
    public void setMarca(String newMarca) {
        marca = newMarca;
    }
    
    public void setAlmacenamiento(int newAlmacenamiento) {
        almacenamiento = newAlmacenamiento;
    }
    
    public void imprimirDetalles(){
           System.out.println("Almacenamiento: " + almacenamiento + " Gb");
           System.out.println("Marca: " + marca);
    }
    
    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }
}