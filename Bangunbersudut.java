import java.util.Scanner;

// SuperClass
// Inheritance
public class Bangunbersudut {

    //Class Attributes 
    private float panjang;
    private float lebar;
    private float tinggi;

    // Class Methods:
    public void setPanjang(){                                
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Panjang: ");          // Setter for panjang
        this.panjang = x.nextFloat();
    }

    public void setLebar(){                                 
        Scanner x = new Scanner(System.in); 
        System.out.print("Masukkan Lebar: ");            // Setter for lebar
        this.lebar = x.nextFloat();
    }

    public void setTinggi(){
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Tinggi: ");          // Setter for tinggi
        this.tinggi = x.nextFloat();
    }

    public float getPanjang(){                               
        return panjang;                                     // Getter for panjang
    }

    public float getLebar(){                                
        return lebar;                                       // Getter for lebar
    }

    public float getTinggi(){
        return tinggi;                                      // Getter for tinggi
    }

    public float Luas(float x, float y){
        float z = x * y;
        return z;
    }

}
