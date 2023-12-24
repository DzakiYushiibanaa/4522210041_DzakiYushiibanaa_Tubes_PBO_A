import java.util.Scanner;

interface OperasiPenilaian {
    void inputDetails();
    void displayMenu();
}

abstract class Penilaian implements OperasiPenilaian {
    public abstract void displayValue();
    public abstract void sortValues();
}

class Quiz extends Penilaian {
    private int[] quiz;

    public Quiz() {
        this.quiz = new int[5];
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====MENGINPUT NILAI QUIZ 5X PERTEMUAN=====");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan Nilai Quiz Pertemuan Ke-" + (i + 1) + " = ");
            quiz[i] = scanner.nextInt();
        }
    }

    @Override
    public void displayMenu() {

    }

    @Override
    public void displayValue() {
        System.out.println("\nMenampilkan Nilai QUIZ 5X PERTEMUAN");
        for (int i = 0; i < 5; i++) {
            System.out.println(" Nilai Quiz Pertemuan Ke-" + (i + 1) + " = " + quiz[i]);
        }
        System.out.println();
    }

    @Override
    public void sortValues() {
        // Tidak perlu diimplementasikan untuk kelas Quiz
    }
}

class Latihan extends Penilaian {
    private int[] latihan;

    public Latihan() {
        this.latihan = new int[7];
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== PENILAIAN LATIHAN SOAL 7X PERTEMUAN ====");
        for (int i = 0; i < 7; i++) {
            System.out.print("Masukkan Nilai Latihan Soal Pertemuan Ke-" + (i + 1) + " = ");
            latihan[i] = scanner.nextInt();
        }
    }

    @Override
    public void displayMenu() {

    }

    @Override
    public void displayValue() {
        System.out.println("\nMenampilkan Nilai LATIHAN SOAL 7X PERTEMUAN");
        for (int i = 0; i < 7; i++) {
            System.out.println(" Nilai Latihan Soal Pertemuan Ke-" + (i + 1) + " = " + latihan[i]);
        }
        System.out.println();
    }

    @Override
    public void sortValues() {
        // Implementasi insertion sort untuk pengurutan nilai latihan
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (latihan[i] > latihan[j]) {
                    int temp = latihan[i];
                    latihan[i] = latihan[j];
                    latihan[j] = temp;
                }
            }
        }
    }
}

class Grade extends Penilaian {
    private int uts, uas;

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== PENILAIAN UTS DAN UAS DENGAN GRADE =====");
        System.out.println("===============================================");
        System.out.println("      No       Range Nilai      Grade       ");
        System.out.println("      1.         81-100           A         ");
        System.out.println("      2.         71-80            B         ");
        System.out.println("      3.         61-70            C         ");
        System.out.println("      4.         51-60            D         ");
        System.out.println("      5.         0-50             E         ");
        System.out.println("===============================================");

        System.out.print(" Masukkan Nilai UTS Anda = ");
        uts = scanner.nextInt();

        System.out.print(" Masukkan Nilai UAS Anda = ");
        uas = scanner.nextInt();
    }

    @Override
    public void displayMenu() {

    }

    @Override
    public void displayValue() {
        System.out.println("\nNilai UTS Anda Adalah " + uts);
        System.out.println("Nilai UAS Anda Adalah " + uas);

        System.out.println("Grade Nilai UTS: " + calculateGradeByScore(uts));
        System.out.println("Grade Nilai UAS: " + calculateGradeByScore(uas));
        System.out.println();
    }

    @Override
    public void sortValues() {
        // Tidak perlu diimplementasikan untuk kelas Grade
    }

    private String calculateGradeByScore(int score) {
        if (score >= 81 && score <= 100) {
            return "A";
        } else if (score >= 71 && score <= 80) {
            return "B";
        } else if (score >= 61 && score <= 70) {
            return "C";
        } else if (score >= 51 && score <= 60) {
            return "D";
        } else {
            return "E";
        }
    }
}

class Utama implements OperasiPenilaian {
    private String namaMahasiswa;
    private String npm;

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPENILAIAN ALGORITMA DAN PEMOGRAMAN");
        System.out.print("Masukkan Nama Mahasiswa = ");
        namaMahasiswa = scanner.next();

        System.out.print("Masukkan NPM = ");
        npm = scanner.next();
    }

    @Override
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        Penilaian[] Penilaian = {new Quiz(), new Latihan(), new Grade()};

        while (true) {
            System.out.println("\nMenu Pilihan Nilai");
            System.out.println("1. Menampilkan Nilai Quiz");
            System.out.println("2. Menampilkan Nilai Latihan Soal");
            System.out.println("3. Menampilkan Grade Nilai UTS & UAS");
            System.out.println("4. Program Selesai");
            System.out.print("Masukkan Angka [1/2/3/4] : ");

            int choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    Penilaian[choice - 1].inputDetails();
                    Penilaian[choice - 1].displayValue();
                    break;
                case 4:
                    System.out.println("Program Selesai");
                    return;
                default:
                    System.out.println("Angka Tidak Valid");
                    break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Utama utama = new Utama();
        utama.inputDetails();
        utama.displayMenu();
    }
}