public class LoopingExercise {
    public static void main(String[] args) {

        System.out.println("--- Contoh Looping FOR (Angka 1 sampai 5) ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hitungan ke-" + i);
        }

        System.out.println("\n--- Contoh Looping WHILE (Menghitung mundur) ---");

        int hitunganMundur = 3;
        while (hitunganMundur > 0) {
            System.out.println("Tinggal " + hitunganMundur + "...");
            hitunganMundur--;

        }
        System.out.println("Selesai!");
    }
}