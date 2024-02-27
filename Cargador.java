//Commit 6.1//
public class Cargador {
    private String tipoDeConector;
    private int corrienteSuministrada;
    private Cable cable;
    public Cargador(String tipoDeConector, int corrienteSuministrada, int longitud, String tipoDeRecubrimiento) {
        this.cable = new Cable (longitud, tipoDeRecubrimiento);
        this.tipoDeConector = tipoDeConector;
        this.corrienteSuministrada = corrienteSuministrada;
    }
    
    public String getTipoRecubrimiento(){
        return cable.getTipoDeRecubrimiento();
    }
    
    public int getLongitudCable(){
        return cable.getLongitud();
    }
    
    public String getTipoDeConector(){
        return tipoDeConector;
    }
    
    public int getCorrienteSuministrada() {
        return corrienteSuministrada;
    }
    
    public Cable getCable() {
        return cable;
    }
    
    public void setTipoDeConector(String newTipoDeConector) {
        tipoDeConector = newTipoDeConector;
    }
    
    public void setCorrienteSuministrada(int newCorrienteSuministrada) {
        corrienteSuministrada = newCorrienteSuministrada;
    }
    
    public void imprimirDetalles(){
           System.out.println("CorrienteSuministrada: " + corrienteSuministrada + " A ");
           System.out.println("Tipo de conector: " + tipoDeConector);
           System.out.println("Longitud del cable: " + cable.getLongitud() + "m");
           System.out.println("Tipo de recubrimiento: " + cable.getTipoDeRecubrimiento());
    }
    
    public void setCable(Cable cable) {
         this.cable = cable;
    }
}
