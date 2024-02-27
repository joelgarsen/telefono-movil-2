//Commit 6.1//
public class Movil {
    public Cargador cargador;
    public int almacenamiento;
    public String marca;
    
    public Movil (int almacenamiento, String marca, String tipoDeConector, int corrienteSuministrada, int longitud, String tipoDeRecubrimiento){
        this.cargador = new Cargador (tipoDeConector, corrienteSuministrada, longitud, tipoDeRecubrimiento);
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
           System.out.println("Tipo de conector: " + cargador.tipoDeConector);
           System.out.println("CorrienteSuministrada: " + cargador.corrienteSuministrada + " A ");
           System.out.println("Longitud del cable: " + cargador.cable.longitud + "m");
           System.out.println("Tipo de recubrimiento: " + cargador.cable.tipoDeRecubrimiento);
    }
    
    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }
}