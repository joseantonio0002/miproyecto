/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miproyecto;

import java.util.ArrayList;
import java.util.List;

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
    public static final int EXPERIENCIA = 1;
    public static final int PRECIO_VENTA = 2;
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



    
public class Diamante {
    
    public static final String ICONO = "/img/diamante.png";
    public static final int DURACION = 5;
    public static final int EXPERIENCIA = 2;
    public static final int PRECIO_VENTA = 3;
    public static final int MINAR = 20;
    
    private String icono;
    private int duracionProduccion;
    private int experienciaRecolecta;
    private int precioVenta;
    private int minar;
    private TipoMinar tipo;
    
    
    //Constructores
    
    
    public Diamante(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int minar){
        
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
        this.minar = minar;
    }
    
    public Diamante(){
        
    }
    
    public Diamante(Diamante otro){
        
        this(otro.icono, otro.duracionProduccion, otro.experienciaRecolecta, otro.precioVenta, otro.minar);
    }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Diamante{");
            sb.append("icono=").append(icono);
            sb.append(", duracionProduccion=").append(duracionProduccion);
            sb.append(", experienciaRecolecta=").append(experienciaRecolecta);
            sb.append(", precioVenta=").append(precioVenta);
            sb.append(", minar=").append(minar);
            sb.append(", tipo=").append(tipo);
            sb.append('}');
            return sb.toString();
        }
    
    public void setIcono(String icono){
        
        this.icono = icono;
    }
    
    public String getIcono(){
        
        return icono;
    }
    
    public void setduracionProduccion(int duracionProduccion){
        
        this.duracionProduccion = duracionProduccion;
    }
    
    public int getduracionProduccion(){
        
        return duracionProduccion;
    }
    
    public void setexperienciaRecolecta(int experienciaRecolecta){
        
        this.experienciaRecolecta = experienciaRecolecta;
    }
    
    public int getexperienciaRecolecta(){
        
        return experienciaRecolecta;
    }
    
    public void setprecioVenta(int precioVenta){
        
        this.precioVenta = precioVenta;
    }
    
    public int getprecioVenta(){
        
        return precioVenta;
    }
    
    public void setminar(int minar){
        
        this.minar = minar;
    }
    
    public int getminar(){
        
        return minar;
    }
    
    public TipoMinar getTipo(){
        
        return tipo;
    }
    
}   
    

    public class Minero{
        
        public static final int MAX_PICAR = 1;
        public static final int CAPACIDAD = 2;
        
        private List<Oro> picarOro;
        private List<Diamante> picarDiamante;
    
     public Minero(){

         this.picarOro = new ArrayList<>();
         this.picarDiamante = new ArrayList<>();
        }

      
    public List<Oro> getPicarOro(){
        
        return picarOro;
    }
    
    public List<Diamante> getPicarDiamante(){
        
        return picarDiamante;
    }
    
    //Funcionalidades
    
    public boolean puedePicar(){
        
        return puedePicarOro() || puedePicarDiamante();
    }
    
    public boolean puedePicarOro(){
        
        return picarOro.size() < MAX_PICAR && picarDiamante.isEmpty();
    }
    
    public boolean puedePicarDiamante(){
        
        return picarDiamante.size() < MAX_PICAR && picarOro.isEmpty();
    }
    
    public void minarOro(Oro esteOro){
        
        if(puedePicar()){
            picarOro.add(esteOro);
        }
    }
    
    public void recogerOro(Oro esteOro){
        
        picarOro.remove(esteOro);
    }
    
    public void minarDiamante(Diamante esteDiamante){
        
        if(puedePicar()){
            picarDiamante.add(esteDiamante);
        }
    }
    
    public void recogerDiamante(Diamante esteDiamante){
        
        picarDiamante.remove(esteDiamante);
    }
    
    public boolean estaPicandoOro(){
        
        return !picarOro.isEmpty();
    }
    
    public boolean estaPicandoDiamante(){
        
        return !picarDiamante.isEmpty();
    }
    
    public boolean estaPicando(){
        
        return estaPicandoOro() || estaPicandoDiamante();
    }
    
    public Oro getPrimerPicarOro(){
        
        return this.picarOro.isEmpty() ? null : this.picarOro.get(0);
    }
    
    public Diamante getPrimerPicarDiamante(){
        
        return this.picarDiamante.isEmpty() ? null : this.picarDiamante.get(0);
    }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Minero{");
            sb.append("picarOro=").append(picarOro);
            sb.append(", picarDiamante=").append(picarDiamante);
            sb.append('}');
            return sb.toString();
        }
    

    }
    
    
    public static void main(String[] args){
        
        MyIdleMiner idleMiner = new MyIdleMiner();
        
        Oro o1 = idleMiner.new Oro();
        Oro o2 = idleMiner.new Oro(Oro.ICONO, 2, 1, 2, 10);
        Oro o3 = idleMiner.new Oro(o1);
        Diamante d1 = idleMiner.new Diamante();
        Diamante d2 = idleMiner.new Diamante(Diamante.ICONO, 5, 2, 3, 20);
        Diamante d3 = idleMiner.new Diamante(d1);

        
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
        System.out.println("Precio: " + o1.getprecioVenta());
        System.out.println("Duracion de la produccion: " + o1.getduracionProduccion());
        System.out.println("Exp: " + o1.getexperienciaRecolecta());
        System.out.println("Icono: " + o1.getIcono());
        System.out.println("Minar: " + o1.getminar());
        
        System.out.println("Precio: " + d1.getprecioVenta());
        System.out.println("Duracion de la produccion: " + d1.getduracionProduccion());
        System.out.println("Exp: " + d1.getexperienciaRecolecta());
        System.out.println("Icono: " + d1.getIcono());
        System.out.println("Minar: " + d1.getminar());
        
        o1.setprecioVenta(2);
        System.out.println("Precio: " + o1.getprecioVenta());
        
        d1.setprecioVenta(3);
        System.out.println("Precio: " + d1.getprecioVenta());
        
        o1.setduracionProduccion(2);
        System.out.println("Duracion de la produccion: " + o1.getduracionProduccion());
        
        d1.setduracionProduccion(5);
        System.out.println("Duracion de la produccion: " + d1.getduracionProduccion());
        
        o1.setexperienciaRecolecta(1);
        System.out.println("Exp: " + o1.getexperienciaRecolecta());
        
        d1.setexperienciaRecolecta(2);
        System.out.println("Exp: " + d1.getexperienciaRecolecta());
        
        o1.setminar(10);
        System.out.println("Min: " + o1.getminar());
        
        d1.setminar(20);
        System.out.println("Min: " + d1.getminar());
        
        System.out.println(o1);
        
        
        Minero m1 = idleMiner.new Minero();
        Minero m2 = idleMiner.new Minero();
        Minero m3 = idleMiner.new Minero();
        
        
        System.out.println();
        System.out.println("Minero 1: " + m1);
        System.out.println("Minero 2: " + m2);
        System.out.println("Minero 3: " + m3);
        
        System.out.println("¿m1 puede picar? " + m1.puedePicar());
        System.out.println("¿m2 puede picar? " + m2.puedePicar());
        System.out.println("¿m3 puede picar? " + m3.puedePicar());
        
        m1.minarOro(o1);
        System.out.println("Minero 1: " + m1);
        System.out.println("¿m1 puede picar? " + m1.puedePicar());
        m1.minarOro(o1);
        System.out.println("Minero 1: " + m1);
        m1.minarOro(o2);
        System.out.println("Minero 1: " + m1);
        m1.minarDiamante(d2);
        System.out.println("Minero 1: " + m1);
        
        m2.minarDiamante(d2);
        System.out.println("Minero 2: " + m2);
        
        
        System.out.println("Minero 1 ¿picando?: " + m1.estaPicando());
        System.out.println("Minero 1 ¿pica oro?: " + m1.estaPicandoOro());
        System.out.println("Minero 1 ¿pica diamante?: " + m1.estaPicandoDiamante());
        System.out.println("Minero 2 ¿pica oro?: " + m2.estaPicandoOro());
        System.out.println("Minero 2 ¿pica diamante?: " + m2.estaPicandoDiamante());
        
        
        System.out.println("Minero 1 primer oro: " + m1.getPrimerPicarOro());
        System.out.println("Minero 1 primer diamante: " + m1.getPrimerPicarDiamante());
        System.out.println("Minero 2 primer oro: " + m2.getPrimerPicarOro());
        System.out.println("Minero 2 primer diamante: " + m2.getPrimerPicarDiamante());
               
    }

}
