
package reloj;

import javax.swing.JOptionPane;

/**
 *
 * @author LUIS
 */
public class Reloj {
   private int hora;
   private int  minuto;
   private int minutos;
   private int minutosTotales;
   private double grado;
   private double gradosTotales;
   private String tipo = "AM";
   private String mostrar;
   private String aviso;
    
   /** public static void main(String[] args) {
        Reloj reloj = new Reloj();
        
        reloj.setHora(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas transcurridas desde las 12:00")));
        reloj.setMinuto(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos de la hora")));
        reloj.getMinutoshs();
        JOptionPane.showMessageDialog(null,reloj.mostrarTexto());
    }
  **/
   
   public void setHora(int hora) {
           this.hora = hora;      
   }
   
   public int getHora() {
       if(hora==0){
           hora = 12;
       }
       return hora;
    }
   
    public void setMinuto(int minuto) {
            this.minuto = minuto;       
    }
    
    public int getMinuto() {
        return minuto;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        if ("AM".equals(tipo)){
            this.tipo="AM";
        }
        else{
            this.tipo="PM";
        }
        return tipo;
    }
   
    public int getMinutoshs() {
        if(hora==12){
           minutos = hora*0;
       }else{
        minutos = hora*60; 
        }
        return minutos;
    }
        
    public int getMinutostotales() {
        getMinutoshs();
        minutosTotales = minutos + minuto;
        return minutosTotales;
    }
    
    public double gradosTotales(){
        
            grado = (minutos * 0.5) + (minuto * 0.5);
            gradosTotales = grado -( minuto*6 );
        
        return gradosTotales;
        }
    public String getAviso(){
        return aviso = ("Si se mide un ángulo en sentido contrario al "
                + "\nsentido de giro de las agujas del reloj, se considera "
                + "\npositivo. Si se mide en el sentido de giro de las agujas del "
                + "\nreloj, se considera negativo. ");
    }
    
    public String mostrarTexto(){
        
        if(hora < 0 || hora > 12 || minuto < 0 || minuto > 59){
            mostrar = "\nINGRESE LAS CIFRAS CORRECTAS"
                    + "\nEN UN FORMATO DE 12 DE HRS";
        }
        else{
            mostrar = "\nLa hora ingresada es : " 
                    + getHora()+":"+ getMinuto() + " " + getTipo()
                    +"\n\nHan pasado " + getMinutostotales() 
                    + " Minutos desde las 12:00 " + getTipo()
                    +"\n\nLos grados de esta hora son : " + gradosTotales() + "°";
        
        }
        return mostrar;
    }
}
