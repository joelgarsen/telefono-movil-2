//Commit 6.1//
public class Cargador
{
    private String tipoDeConector;
    private int corrienteSuministrada;
    private Cable clavija;

    public Cargador(String tipoDeConector, int corrienteSuministrada) {
        this.tipoDeConector = tipoDeConector;
        this.corrienteSuministrada = corrienteSuministrada;
    }
    
    public String getTipoDeConector(){
        return tipoDeConector;
    }
    
    public int getCorrienteSuministrada() {
        return corrienteSuministrada;
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
    }
}
