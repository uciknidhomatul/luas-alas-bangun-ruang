package luas_bangun2._dua;
import java.util.Scanner;
public class Luas_bangun2_dua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih bentuk yang ingin dihitung:");
        System.out.println("1. Kerucut");
        System.out.println("2. Tabung");
        System.out.println("3. Kubus");
        System.out.println("4. Balok");
        System.out.println("5. Bola");
        System.out.print("Masukkan nomor bentuk: ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                Kerucut();
                break;
            case 2:
                Tabung();
                break;
            case 3:
                Kubus();
                break;
            case 4:
                Balok();
                break;
            case 5:
                Bola();
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public static void Kerucut() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi kerucut: ");
        double tinggi = input.nextDouble();

        double volume = (1.0 / 3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
        double luasPermukaan = Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(tinggi, 2) + Math.pow(jariJari, 2)));

        System.out.println("Volume kerucut: " + volume);
        System.out.println("Luas permukaan kerucut: " + luasPermukaan);
    }

    public static void Tabung() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari tabung: ");
        double r = input.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = input.nextDouble();

        double volume = Math.PI * Math.pow(r, 2) * t;
        double luasPermukaan = 2 * Math.PI * r * (r + t);

        System.out.println("Volume tabung: " + volume);
        System.out.println("Luas permukaan tabung: " + luasPermukaan);
    }

    public static void Kubus() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = input.nextInt();

        int volume = sisi * sisi * sisi;
        int luasPermukaan = 6 * sisi * sisi;

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }

    public static void Balok() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        int panjang = input.nextInt();

        System.out.print("Masukkan lebar balok: ");
        int lebar = input.nextInt();

        System.out.print("Masukkan tinggi balok: ");
        int tinggi = input.nextInt();

        int volume = panjang * lebar * tinggi;
        int luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

        System.out.println("Volume balok: " + volume);
        System.out.println("Luas permukaan balok: " + luasPermukaan);
    }
    
    public static void Bola(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = input.nextDouble();

        // Menghitung volume bola
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(jariJari, 3);

        // Menghitung luas permukaan bola
        double luasPermukaan = 4 * Math.PI * Math.pow(jariJari, 2);

        System.out.println("Volume bola: " + volume);
        System.out.println("Luas permukaan bola: " + luasPermukaan);
    }
}               
