//Commit 6.1//
public class Movil{
    private Cargador cargador;
    private int almacenamiento;
    private String marca;
    
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
           System.out.println("Tipo de conector: " + cargador.getTipoDeConector());
           System.out.println("CorrienteSuministrada: " + cargador.getCorrienteSuministrada() + " A ");
           System.out.println("Longitud del cable: " + cargador.getLongitudCable() + "m");
           System.out.println("Tipo de recubrimiento: " + cargador.getTipoRecubrimiento());
    }
    
    public void setCargador(Cargador cargador) {
        this.cargador = cargador;
    }
}