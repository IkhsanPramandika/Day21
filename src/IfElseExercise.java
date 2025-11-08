public class IfElseExercise {
    public static void main(String[] args) {
        int nilaiUjian = 85;

        System.out.println("Nilai Anda: " + nilaiUjian);


        if (nilaiUjian >= 90) {
            System.out.println("Selamat! Anda mendapatkan nilai A.");
        } else if (nilaiUjian >= 80) {
            System.out.println("Bagus! Anda mendapatkan nilai B.");
        } else if (nilaiUjian >= 70) {
            System.out.println("Cukup! Anda mendapatkan nilai C.");
        } else {
            System.out.println("Maaf, Anda mendapatkan nilai D. Perlu belajar lebih giat.");
        }
    }
}