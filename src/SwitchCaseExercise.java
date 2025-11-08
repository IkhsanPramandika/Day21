public class SwitchCaseExercise {
    public static void main(String[] args) {
        String hari = "Rabu";

        System.out.print("Hari ini adalah hari " + hari + ". ");
        switch (hari) {
            case "Senin":
            case "Selasa":
            case "Rabu":
            case "Kamis":
                System.out.println("Saatnya bekerja keras!");
                break;
            case "Jumat":
                System.out.println("Semangat, besok libur !");
                break;
            case "Sabtu":
            case "Minggu":
                System.out.println("Waktunya liburan wkwk!");
                break;
            default:
                System.out.println("Nama hari tidak valid.");
        }
    }
}