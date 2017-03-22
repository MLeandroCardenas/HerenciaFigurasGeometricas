
package herenciafiguras;
/**
 * subclase Cuadrado que hereda atributos de la superclase
 * @author Michael Cardenas 
 * @author Edgar Kreicj
 */
public class Cuadrado extends FigurasGeometricas{
    private Punto puntoC;
    private Punto puntoD;
/**
 * metodo construtor que inicializa los atributos de la subclase y la superclase
 * @param puntoA
 * @param puntoB
 * @param puntoC
 * @param puntoD 
 */
    public Cuadrado(Punto puntoA, Punto puntoB, Punto puntoC, Punto puntoD) {
        super(puntoA, puntoB); //Aqui se llama a la superclase y se inicializan sus atributos
        this.puntoC = puntoC;
        this.puntoD = puntoD;
    }
    /**
     * metodo que reune los metodos que realizan todos los calculos 
     */
    public void iniciar() {
         if(IsCuadrado()){
            System.out.println("LadoA = " + calcularLado1());
            System.out.println("LadoB = " + calcularLado2());
            System.out.println("LadoC = " + calcularLado3());
            System.out.println("LadoD = " + calcularLado4());
            System.out.println(cuadradoRectangulo());
            System.out.println("El perimetro es: " + calcularPerimetro());
            System.out.println("El Area es: " + calcularArea());
         }else{
              System.out.println("Las coordenadas no indican que es un cuadrado o rectangulo");
         } 
     }
    /**
     * metodo que regresa el metodo de la superclase con los valores de la subclase como parametros
     * @return super
     */
    private double calcularLado1(){
        return super.calcularLado( getPuntoA(), getPuntoB());
    }
    /**
     * metodo que regresa el metodo de la superclase con los valores de la subclase como parametros
     * @return super
     */
    private double calcularLado2(){
        return super.calcularLado(getPuntoB(), this.puntoC);
    }
    
    /**
     * metodo que regresa el metodo de la superclase con los valores de la subclase como parametros
     * @return super
     */
    private double calcularLado3(){
        return super.calcularLado(this.puntoC, this.puntoD);
    }
    
    /**
     * metodo que regresa el metodo de la superclase con los valores de la subclase como parametros
     * @return super
     */
    private double calcularLado4(){
        return super.calcularLado(this.puntoD, getPuntoA());
    }
    /**
     * metodo que hace la validacion si es cuadrado o no
     * @return true o false
     */
     private boolean IsCuadrado(){
            
         if(getPuntoA().getY() == getPuntoB().getY() & getPuntoB().getX() == this.puntoC.getX() 
                 & this.puntoC.getY() == this.puntoD.getY() & getPuntoA().getX() == this.puntoD.getX()){
             return true;
         }
         else if(getPuntoA().getX() == getPuntoB().getX() & getPuntoB().getY() == this.puntoC.getY()
                 & this.puntoD.getX() == this.puntoD.getX() & this.puntoD.getY() == getPuntoA().getY() ){
             
                 return true;
             
         } else{
             return false;
         }
      }
     
     /**
      * metodo que retorna el perimetro de un cuadrado
      * @return calcularLado1
      */
     
     private String cuadradoRectangulo(){
         if(calcularLado1() == calcularLado2() & calcularLado2() == calcularLado3() & calcularLado3() == calcularLado4()
                 & calcularLado4() == calcularLado1()){
             return "ES UN CUADRADO";
         }
         else{
             return "ES UN RECTANGULO";
         }
     }
     
     private double calcularPerimetro(){
         return calcularLado1() + calcularLado2() + calcularLado3() + calcularLado4()+  super.getPerimetro();
     }
     /**
      * metodo que retorna el area de un cuadrado
      * @return calcularArea
      */
     private double calcularArea(){
         return calcularLado1() * calcularLado4() + super.getArea();
     }
   /**
    * metodo que regresa el valor del puntoC
    * @return puntoC
    */
    public Punto getPuntoC() {
        return puntoC;
    }
    /**
     * metodo que recibe como parametro el valor del puntoC
     * @param puntoC 
     */
    public void setPuntoC(Punto puntoC) {
        this.puntoC = puntoC;
    }
    
    /**
     * metodo que retorna el valor del puntoD
     * @return puntoD
     */
    public Punto getPuntoD() {
        return puntoD;
    }
    
    /**
     * metodo que recibe como parametro el valor del atributo tipo clase puntoD
     * @param puntoD 
     */
    public void setPuntoD(Punto puntoD) {
        this.puntoD = puntoD;
    }
}
