import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Lingkaran obj = new Lingkaran();
        // obj.setR();
        // obj.Luas(obj.getR());
        // System.out.println(obj.getLuas());

        // HashMap Using WrapperClassess (Float)
        HashMap<String, Float> BangunDatar = new HashMap<String, Float>();

        boolean n = true;
        do {
            
            Scanner q = new Scanner(System.in);
            System.out.print("LUAS BANGUN DATAR\n1. Persegi\n2. Segitiga\n3. Lingkaran\n\n4. Berhenti\nPILIHAN: ");
            int a = q.nextInt();

            if (a == 1) {
                
                System.out.println("___PERSEGI___");
                Persegi obj = new Persegi();
                obj.setPanjang();
                obj.setLebar();
                float Luas = obj.Luas(obj.getPanjang(), obj.getLebar());
                System.out.println("Luas Persegi = " + Luas);    
                BangunDatar.put("Persegi", Luas);
                
                Scanner x = new Scanner(System.in);
                System.out.print("Apakah anda ingin mencari luas bangun datar lain?\n1. Ya\n2. Tidak\nPILIHAN: ");
                int j = x.nextInt();

                if (j == 1) {
                    n = true;
                } 
                else if (j == 2) {
                    n = false;
                }
                else{
                    System.out.println("Masukan salah!");
                }
            } 

            else if (a == 2) {

                System.out.println("___SEGITIGA___");
                Segitiga obj = new Segitiga();
                obj.setLebar();
                obj.setTinggi();
                float Luas = obj.Luas(obj.getLebar(), obj.getTinggi());
                BangunDatar.put("Segitiga", Luas);

                Scanner x = new Scanner(System.in);
                System.out.print("Apakah anda ingin mencari luas bangun datar lain?\n1. Ya\n2. Tidak\nPILIHAN: ");
                int j = x.nextInt();

                if (j == 1) {
                    n = true;
                } 
                else if (j == 2) {
                    n = false;
                }
                else{
                    System.out.println("Masukan salah!");
                }
            }

            else if (a == 3){

                System.out.println("___LINGKARAN___");
                Lingkaran obj = new Lingkaran();
                obj.setR();
                float Luas = obj.Luas(obj.getR());
                System.out.println("Luas Lingkaran = " + Luas);
                BangunDatar.put("Lingkaran", Luas);
                
                Scanner x = new Scanner(System.in);
                System.out.print("Apakah anda ingin mencari luas bangun datar lain?\n1. Ya\n2. Tidak\nPILIHAN:");
                int j = x.nextInt();

                if (j == 1) {
                    n = true;
                } 
                else if (j == 2) {
                    n = false;
                }
                else{
                    System.out.println("Masukan salah!");
                }
            }

            else if  (a == 4){
                n = false;
            }

            else{
                System.out.println("Masukan salah!");
            }

        }

        while (n);

        if (BangunDatar.isEmpty() == false){
            
            // Create File
            Scanner x = new Scanner(System.in);
            System.out.print("Masukkan nama file penyimpanan data: ");
            String nama_file = "E:\\Programming\\Java\\Tugas Final\\File Text\\" + x.nextLine() + ".txt";

            try {
                File myFile = new File(nama_file);
                if (myFile.createNewFile()) {
                    System.out.println("File berhasil dibuat: " + myFile.getName() );
                } 
                else {
                    System.out.println("File dengan nama yang sama sudah ada.\nMengganti isi file...");
                }
            } 
            catch (IOException e) {
                System.out.println("Ada masalah saat membuat file.");
            }

            // Write File
            try {
                FileWriter tulis = new FileWriter(nama_file);
                tulis.write("=======> Data Luas Bangun Datar <=======");
    
                for (HashMap.Entry<String, Float> set : BangunDatar.entrySet()){            // Iteration
                    switch(set.getKey()){
                        case "Persegi":
                            tulis.write("\nLuas Persegi = " + set.getValue());
                            break;
                        case "Segitiga":
                            tulis.write("\nLuas Segitiga = " + set.getValue());
                            break;
                        case "Lingkaran":
                            tulis.write("\nLuas Lingkaran = " + set.getValue());
                    }
        
                }
                tulis.close();
                System.out.println("Selesai Menulis Data Pada File\n");
            } 
            
            catch (IOException e) {
                System.out.println("Ada masalah saat menulis file.");
            }
    
            //Read File
            Scanner R = new Scanner(System.in);
            System.out.print("Apakah anda ingin membaca isi file?\n1. Ya\n2. Tidak\nPILIHAN: ");
            if (R.nextInt() == 1) {
                try {
                    File fileobj = new File(nama_file);
                    Scanner baca = new Scanner(fileobj);
                    while (baca.hasNextLine()) {
                    String data = baca.nextLine();
                    System.out.println(data);
                }
                baca.close();
                }
        
                catch (FileNotFoundException e) {
                    System.out.println("Ada masalah saat membaca file.");
                }
    
            }
        }
        
        System.out.println("\nPROSES SELESAI");
    }
}
