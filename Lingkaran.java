import java.util.Scanner;

public class Lingkaran implements BangunTakBersudut {
    
    private float r;
    private float LL;
    
    public void setR(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Masukkan panjang jari-jari lingkaran: ");
        this.r = obj.nextFloat();
    }
    public float getR(){
        return r;
    }

    public float getLuas(){
        return LL;
    }

    public float Luas(float x){
        BangunTakBersudut L = (y) -> (float) x * (float) x * (float) 3.14;
        this.LL = L.Luas(x);
        return L.Luas(x);
    }
    
}
