package Week5;

import java.util.Scanner;

public class Assigment1 {

    static class Lingkaran {
        private double jariJari;
        private String warna;

        public Lingkaran(double jariJari, String warna) {
            this.jariJari = jariJari;
            this.warna = warna;
        }

        public double getJariJari() { return jariJari; }
        public String getWarna() { return warna; }

        public double hitungLuas() { return Math.PI * jariJari * jariJari; }
        public double hitungKeliling() { return 2 * Math.PI * jariJari; }
    }

    static class Persegi {
        private double sisi;
        private String warna;

        public Persegi(double sisi, String warna) {
            this.sisi = sisi;
            this.warna = warna;
        }

        public double getSisi() { return sisi; }
        public String getWarna() { return warna; }

        public double hitungLuas() { return sisi * sisi; }
        public double hitungKeliling() { return 4 * sisi; }
    }

    static class PersegiPanjang {
        private double panjang, lebar;
        private String warna;

        public PersegiPanjang(double panjang, double lebar, String warna) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.warna = warna;
        }

        public double getPanjang() { return panjang; }
        public double getLebar() { return lebar; }
        public String getWarna() { return warna; }

        public double hitungLuas() { return panjang * lebar; }
        public double hitungKeliling() { return 2 * (panjang + lebar); }
    }

    // === CLASS SEGITIGA SIKU-SIKU ===
    static class Segitiga {
        private double alas, tinggi;
        private String warna;

        public Segitiga(double alas, double tinggi, String warna) {
            this.alas = alas;
            this.tinggi = tinggi;
            this.warna = warna;
        }

        public double getAlas() { return alas; }
        public double getTinggi() { return tinggi; }
        public String getWarna() { return warna; }

        public double hitungLuas() { return 0.5 * alas * tinggi; }
        public double hitungKeliling() {
            double miring = Math.sqrt(alas * alas + tinggi * tinggi);
            return alas + tinggi + miring;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int menu;

        do {
            System.out.println("======= Menu Bangun Datar =======");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            menu = in.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("Jari-jari: ");
                    double r = in.nextDouble();
                    System.out.print("Warna: ");
                    String w = in.next();
                    Lingkaran ling = new Lingkaran(r, w);
                    System.out.println("--- Data Lingkaran ---");
                    System.out.printf("Warna: %s%n", ling.getWarna());
                    System.out.printf("Jari-jari: %.2f%n", ling.getJariJari());
                    System.out.printf("Keliling: %.2f%n", ling.hitungKeliling());
                    System.out.printf("Luas: %.2f%n", ling.hitungLuas());
                }
                case 2 -> {
                    System.out.print("Sisi: ");
                    double s = in.nextDouble();
                    System.out.print("Warna: ");
                    String w = in.next();
                    Persegi p = new Persegi(s, w);
                    System.out.println("--- Data Persegi ---");
                    System.out.println("Warna: " + p.getWarna());
                    System.out.println("Sisi: " + p.getSisi());
                    System.out.println("Keliling: " + p.hitungKeliling());
                    System.out.println("Luas: " + p.hitungLuas());
                }
                case 3 -> {
                    System.out.print("Panjang: ");
                    double pj = in.nextDouble();
                    System.out.print("Lebar: ");
                    double lb = in.nextDouble();
                    System.out.print("Warna: ");
                    String w = in.next();
                    PersegiPanjang pp = new PersegiPanjang(pj, lb, w);
                    System.out.println("--- Data Persegi Panjang ---");
                    System.out.println("Warna: " + pp.getWarna());
                    System.out.println("Panjang: " + pp.getPanjang());
                    System.out.println("Lebar: " + pp.getLebar());
                    System.out.println("Keliling: " + pp.hitungKeliling());
                    System.out.println("Luas: " + pp.hitungLuas());
                }
                case 4 -> {
                    System.out.print("Alas: ");
                    double a = in.nextDouble();
                    System.out.print("Tinggi: ");
                    double t = in.nextDouble();
                    System.out.print("Warna: ");
                    String w = in.next();
                    Segitiga sg = new Segitiga(a, t, w);
                    System.out.println("--- Data Segitiga ---");
                    System.out.println("Warna: " + sg.getWarna());
                    System.out.println("Alas: " + sg.getAlas());
                    System.out.println("Tinggi: " + sg.getTinggi());
                    System.out.printf("Keliling: %.2f%n", sg.hitungKeliling());
                    System.out.printf("Luas: %.2f%n", sg.hitungLuas());
                }
                case 5 -> System.out.println("Terima kasih, program selesai.");
                default -> System.out.println("Pilihan tidak ada!");
            }
            System.out.println();
        } while (menu != 5);

        in.close();
    }
}
