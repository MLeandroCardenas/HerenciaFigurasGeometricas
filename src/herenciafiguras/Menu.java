
package herenciafiguras;
import java.util.Scanner;
/**
 * clase menu que pedira los datos y es independiente de la superclase
 * @author Michael Cardenas
 * @author Edgar Kreicj
 */
public class Menu {
     private Scanner teclado = new Scanner(System.in);
    /**
     * constructor vacio que inicia el menu de opciones
     */
    public Menu() {
        solicitarDatos();
    }    
    /**
     * metodo para manejar el menu de opciones
     */
    private void solicitarDatos() {        
        
        while(true) {            
            System.out.println("------ BIENVENIDO -------");
            System.out.println("1- Triangulo 2- Circulo 3- Cuadrado 4- Finalizar");
            byte valor = teclado.nextByte();
            if(valor == 1) { //Entra a realizar las operaciones del triangulo
                  realzarOperacionesTriangulo();
            } else if (valor == 2) { //Entra a realizar las operaciones del circulo
                    RealizarOperacionCirculo();
            }  else if (valor == 3) { //Entra a realizar las operaciones del cuadrado o rectangulo
                    realzarOperacionesCuadrado();
            }  else if (valor == 4) { //Entra a realizar las operaciones del cuadrado o rectangulo                
                break;
            } else {
                System.out.println("Tomo una opcion erronea.");
            }        
        }
    }
    /**
     * Se piden las coordenadas del triangulo
     */
    private void realzarOperacionesTriangulo() {
        double x, y;
        System.out.println("Digite el punto x1: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y1: ");        
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y); //Creacion de objeto de la clase Punto
        System.out.println("Digite el punto x2: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y2: ");        
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y);
        System.out.println("Digite el punto x3: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y3: ");        
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);        
        Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
        triangulo.iniciar();        
    }
    
    /**
     * Se piden las coordenadas del cuadrado / rectangulo
     */
       private void realzarOperacionesCuadrado() {
        double x, y;
        System.out.println("Digite el punto x1: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y1: ");        
        y = teclado.nextDouble();
        Punto punto1 = new Punto(x, y); // Se crea objeto de la clase punto
        System.out.println("Digite el punto x2: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y2: ");        
        y = teclado.nextDouble();
        Punto punto2 = new Punto(x, y); // Se crea objeto de la clase punto
        System.out.println("Digite el punto x3: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y3: ");        
        y = teclado.nextDouble();
        Punto punto3 = new Punto(x, y);  // Se crea objeto de la clase punto
        System.out.println("Digite el punto x4: ");        
        x = teclado.nextDouble();
        System.out.println("Digite el punto y4: ");        
        y = teclado.nextDouble();
        Punto punto4 = new Punto(x,y);  // Se crea objeto de la clase punto
              
        /**
         * Se crea objeto de la clase cuadrado 
         * se invoca al metodo iniciar
         */
        Cuadrado cuadrado = new Cuadrado(punto1, punto2, punto3,punto4);
        cuadrado.iniciar();
   }
       /**
        * Se piden los datos del circulo
        */
       private void RealizarOperacionCirculo(){
           double x,y,radio;
           System.out.println("Digite el punto x1: ");        
             x = teclado.nextDouble();
            System.out.println("Digite el punto y1: ");
            y = teclado.nextDouble();
            Punto punto1 =new Punto(x,y); 
            System.out.println("Digite el punto x1: ");
            x= teclado.nextDouble();
            System.out.println("Digite el punto en y1: ");
            y= teclado.nextDouble();
            Punto punto2 = new Punto(x,y);

            
         /**
         * Se crea objeto de la clase Circulo
         * se invoca al metodo iniciarCirculo
         */
            Circulo circulo = new Circulo(punto1, punto2);
            circulo.IniciarCirculo(); 
       }
}
