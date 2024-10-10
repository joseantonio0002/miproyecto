/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miproyecto;

/**
 *
 * @author frama
 */ 
public class MyIdleMiner {

//Atributos
    
public class Oro {

    public static final String ICONO = "/img/oro.png";
    public static final int DURACION = 2;
    public static final int EXPERIENCIA = 10;
    public static final int PRECIO_VENTA = 20;
    public static final int MINAR = 10;         
    
    private String icono;
    private int duracionProduccion;
    private int experienciaRecolecta;
    private int precioVenta;
    private int minar;



//Constructores

    public Oro(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int minar){
    
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
        this.minar = minar;
    }
    
    public Oro(){
        
    }
 
    public Oro(Oro otro){
        
        this(otro.icono, otro.duracionProduccion, otro.experienciaRecolecta, otro.precioVenta, otro.minar);
    }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Oro{");
            sb.append("icono=").append(icono);
            sb.append(", duracionProduccion=").append(duracionProduccion);
            sb.append(", experienciaRecolecta=").append(experienciaRecolecta);
            sb.append(", precioVenta=").append(precioVenta);
            sb.append(", minar=").append(minar);
            sb.append('}');
            return sb.toString();
        }
    
    
    }

    public static void main(String[] args){
        
        MyIdleMiner idleMiner = new MyIdleMiner();
        
        Oro o1 = idleMiner.new Oro();
        Oro o2 = idleMiner.new Oro(Oro.ICONO, 3, 10, 20, 1);
        Oro o3 = idleMiner.new Oro(o1);
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
    }

}
