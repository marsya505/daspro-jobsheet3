import java.util.Scanner;
/**
 * Siakad11
 */
public class Siakad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double quizscore, assignmentscore, UTSscore, UASscore, finalscore;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        quizscore = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        assignmentscore = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        UTSscore = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        UASscore = sc.nextDouble();
        finalscore = (quizscore * 0.20) + (assignmentscore * 0.15) + (UTSscore * 0.30) + (UASscore * 0.35);
        System.out.println("Nama: " + nama + "NIM: " + nim);
        System.out.println("Kelas: " + kelas + "Absen: " + absen);
        System.out.println("Nilai Akhir: " + finalscore);

    }
}