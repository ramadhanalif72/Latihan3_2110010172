
package geometri;


public class Main {
    public static void main(String[] args) {
        double radius = 10.0;
        Lingkaran lingkaran = new Lingkaran(radius);

        double luasLingkaran = lingkaran.luas();
        double kelilingLingkaran = lingkaran.keliling();

        System.out.println("Luas lingkaran: " + luasLingkaran);
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);

        System.out.println();

        // Objek Persegi Panjang
        double panjang = 4.0;
        double lebar = 5.0;
        PesegiPanjang pesegiPanjang = new PesegiPanjang(panjang, lebar);

        double luasPesegiPanjang = pesegiPanjang.luas();
        double kelilingPesegiPanjang = pesegiPanjang.keliling();

        System.out.println("Luas persegi panjang: " + luasPesegiPanjang);
        System.out.println("Keliling persegi panjang: " + kelilingPesegiPanjang);
    }
    }
    
   
    
    
            
    
}
