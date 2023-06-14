
package geometri;


public class Lingkaran {
    private double radius;
    
    public Lingkaran (double radius){
        this.radius = radius;
    }

    Lingkaran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double luas(){
                return 3.14*radius*radius;
    }
    public double keliling () {
        return 2*3.14*radius;
    }
        
    
}
