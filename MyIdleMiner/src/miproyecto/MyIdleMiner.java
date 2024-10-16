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
 
public enum TipoMinar{
    ORO,
    DIAMANTE
}
    
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
    private TipoMinar tipo;



//Constructores

    public Oro(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int minar){
    
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
        this.minar = minar;
        this.tipo = TipoMinar.ORO;
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
            sb.append(", tipo=").append(tipo);
            sb.append('}');
            return sb.toString();
        }
        
        public void setIcono(String Icono){
            
            this.icono = Icono;
        }
        
        public void setprecioVenta(int precio){
            
            this.precioVenta = precio;
        }
        
        public void setduracionProduccion(int duracion){
            
            this.duracionProduccion = duracion;
        }
        
        public void setminar(int Minar){
            
            this.minar = Minar;
        }
        
        public void setexperienciaRecolecta(int experiencia){
            
            this.experienciaRecolecta = experiencia;
        }
        
        public String getIcono(){
            
            return icono;
        }
        
        public int getprecioVenta(){
            
            return precioVenta;
        }
        
        public int getduracionProduccion(){
            
            return duracionProduccion;
        }
        
        public int getminar(){
            
            return minar;
        }
        
        public int getexperienciaRecolecta(){
            
            return experienciaRecolecta;
        }
        
        public TipoMinar getTipo(){
            
            return tipo;
        }
    
    
    }

    public static void main(String[] args){
        
        MyIdleMiner idleMiner = new MyIdleMiner();
        
        Oro o1 = idleMiner.new Oro();
        Oro o2 = idleMiner.new Oro(Oro.ICONO, 5, 10, 20, 1);
        Oro o3 = idleMiner.new Oro(o1);
        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
        System.out.println("Precio: " + o1.getprecioVenta());
        System.out.println("Duracion de la produccion: " + o1.getduracionProduccion());
        System.out.println("Exp: " + o1.getexperienciaRecolecta());
        System.out.println("Icono: " + o1.getIcono());
        System.out.println("Minar: " + o1.getminar());
        
        o1.setprecioVenta(5);
        System.out.println("Precio: " + o1.getprecioVenta());
        
        o1.setduracionProduccion(10);
        System.out.println("Duracion de la produccion: " + o1.getduracionProduccion());
        
        o1.setexperienciaRecolecta(20);
        System.out.println("Exp: " + o1.getexperienciaRecolecta());
        
        System.out.println(o1);
        
    }

}
