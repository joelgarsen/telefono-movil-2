public class movil {
    public Cargador cargador;
    public int almacenamiento;
    public String marca;
    
    public movil (String tipoDeConector, int corrienteSuministrada, int almacenamiento, String marca){
        this.cargador = new Cargador(tipoDeConector,corrienteSuministrada);
        this.almacenamiento = almacenamiento;
        this.marca = marca;
    }
}