
package herenciafiguras;
/**
 * Clase Padre o superclase que guarda los atributos que heredaran las subclases
 * @author Michael Cardenas 
 * @author Edgar Kreicj
 */
public class FigurasGeometricas {
    private Punto puntoA;  //Creacion atributo de la clase Punto
    private Punto puntoB; // creacion atributo de la clase Punto

    private double area;
    
    private double perimetro;
    
    /*
    *Constructor que inicializa las variables
    */
    public FigurasGeometricas(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    
    /*
    *Metoodo que calcula la distancia entre dos puntos este metodo lo llamaran
    *las subclases para usarlo
    */
    
    public double calcularLado(Punto punto,Punto puntodos){
        double auxiliarX=Math.pow(puntodos.getX()-punto.getX(), 2);
        double auxiliarY=Math.pow(puntodos.getY()-punto.getY(), 2);
        double lado=Math.sqrt(auxiliarX+auxiliarY);
        return lado;
    }
    /**
     * metodo que regresa el valor del puntoA
     * @return PuntoA 
     */
    public Punto getPuntoA() {
        return puntoA;
    }
    /**
     * metodo que recibe como parametro el puntoA
     * @param puntoA 
     */
    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }
    
    /**
     * metodo que regresa el valor del puntoB
     * @return puntoB
     */
    public Punto getPuntoB() {
        return puntoB;
    }
    
    /**
     * metodo que recible el puntoB
     * @param puntoB 
     */
    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
}
