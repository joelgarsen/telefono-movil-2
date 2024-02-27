//Commit 6.1//
public class Cable {
   private int longitud;
   private String tipoDeRecubrimiento;
   
   public Cable (int longitud, String tipoDeRecubrimiento){
       this.longitud = longitud;
       this.tipoDeRecubrimiento = tipoDeRecubrimiento;
   }
   
   public int getLongitud() {
        return longitud;
   } 
    
   public String getTipoDeRecubrimiento() {
       return tipoDeRecubrimiento;
   }
   
   public void setMarca(int newLongitud) {
       longitud = newLongitud;
   }
   
   public void setTipoDeRecubrimiento(String newTipoDeRecubrimiento) {
       tipoDeRecubrimiento = newTipoDeRecubrimiento;
   }
   
   public void imprimirDetalles(){
       System.out.println("Longitud: " + longitud + " cm");
       System.out.println("Tipo de recubrimiento: " + tipoDeRecubrimiento);
   }
}