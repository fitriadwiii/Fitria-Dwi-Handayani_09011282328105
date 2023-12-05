import java.util.Scanner;

public class AutentikasiPengguna {
    public static void main(String[] args) {
        // Nilai yang telah ditentukan untuk username dan password
        String usernameTersimpan = "dwifitria";
        String passwordTersimpan = "Dwi715*";

        try (// Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String passwordInput = scanner.nextLine();

            // Memeriksa apakah input sesuai dengan nilai yang telah ditentukan
            if (usernameInput.equals(usernameTersimpan) && passwordInput.equals(passwordTersimpan)) {
                System.out.println("Autentikasi Berhasil");
            } else {
                System.out.println("Autentikasi Gagal");;
            }
        }
    }
}
    

