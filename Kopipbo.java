package kopipbo;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Kopipbo {
 
    public static void main(String[] args) {
 
        Scanner rcs = new Scanner(System.in);
 
        ArrayList<String> Kopi = new ArrayList<String>();
        ArrayList<String> Topping = new ArrayList<String>();
        ArrayList<String> Asal = new ArrayList<String>();
 
        MesinKopi Arabica = new MesinKopi();
        Arabica.setKopi("Arabica");
        Arabica.setAsal("Timur Tengah");
        Kopi.add(Arabica.getKopi());
        Asal.add(Arabica.getAsal());
 
        MesinKopi Robusta = new MesinKopi();
        Robusta.setKopi("Robusta");
        Robusta.setAsal("Eropa");
        Kopi.add(Robusta.getKopi());
        Asal.add(Robusta.getAsal());
 
        MesinKopi Florest = new MesinKopi();
        Florest.setKopi("Florest");
        Florest.setAsal("Asia");
        Kopi.add(Florest.getKopi());
        Asal.add(Florest.getAsal());
 
        koppi ryan = new koppi();
        ryan.setkoppi("Caramel");
        Topping.add(ryan.getTopping());
        ryan.setkoppi("Cream");
        Topping.add(ryan.getTopping());
 
        try {
 
            System.out.println("==============Daftar Kopi===============");
            for (int i = 0; i < Kopi.size(); i++) {
                int j = i + 1;
                System.out.println("[" + j + "] Kopi " + Kopi.get(i) + " Asal " + Asal.get(i));
            }
 
            System.out.print("Pilih Kopi : ");
            int pilihkopi = rcs.nextInt() - 1;
            System.out.println("=======================================");
 
            for (int i = 0; i < Topping.size(); i++) {
                int j = i + 1;
                System.out.println("[" + j + "] Topping " + Topping.get(i));
            }
 
            System.out.print("Pilih Topping : ");
            int pilihtopping = rcs.nextInt() - 1;
            System.out.println("========================================");
 
            System.out.println("Pesanan anda adalah Kopi " + Kopi.get(pilihkopi) + " \nberasal dari " + Asal.get(pilihkopi) + " dengan Topping " + Topping.get(pilihtopping));
 
        } catch (Exception x) {
            System.out.println("Inputan Salah !");
            System.out.println(x + "\n");
        }
 
    }
}
 
 