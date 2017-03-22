
package herenciafiguras;
/**
 * Clase Circulo que es una subclase de la clase principal o clase padre 
 * @author Michael Cardenas 
 * @author  Edgar Kreicj
 */
public class Circulo extends FigurasGeometricas{
    static final double PI=3.141592; //Variable tipo final y estatica compartida para todas las clases y objetos
    /**
     * metodo constructor que inicializa atributos y llama a los atributos de la superclase
     * @param puntoA
     * @param puntoB
     * 
     */
    public Circulo(Punto puntoA, Punto puntoB) {
        super(puntoA, puntoB); //Aqui se llama a la superclase
    }
        /**
         * metodo que reune los demas metodos que realizan los calculos
         */
        public void IniciarCirculo(){
            System.out.println("DISTANCIA: " + calcularDistanciaPuntos());
            System.out.println("RADIO: " + calcularRadio());
            System.out.println("AREA = " + calcularArea());
            System.out.println("PERIMETRO = " + calcularPerimetro());
            System.out.println("DIAMETRO= " + calcularDiametro());
    }
        
        /**
         * metodo que regresa a la funcion de la superclase los puntos
         * @return  super
         */
        private double calcularDistanciaPuntos(){
            return super.calcularLado(getPuntoA(), getPuntoB());
        }
        
        private double calcularRadio(){
            return super.calcularLado(getPuntoA(), getPuntoB()) / 2;
        }
      /**
       * metodo que regresa el resultado del area
       * @return  PI*Math.pow(radio,2);
       */
      private double calcularArea(){
          return PI*Math.pow(super.calcularLado(getPuntoA(), getPuntoB())/2,2);
      }
      /**
       * Metodo que calcula el perimetro y lo retorna
       * @return 2*PI*radio;
       */
       private double calcularPerimetro(){
          return 2*PI * super.calcularLado(getPuntoA(), getPuntoB()) / 2;
      }
       /**
        * metodo que calcula el diametro y lo retorna
        * @return radio*2;
        */
       private double calcularDiametro(){
          return super.calcularLado(getPuntoA(), getPuntoB()) / 2 * 2;
      }

}
