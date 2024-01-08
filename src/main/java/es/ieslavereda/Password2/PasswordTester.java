package es.ieslavereda.Password2;

public class PasswordTester {
    public static void main(String[] args) {
        Password[] passwords = new Password[Input.getInteger("¿Cuantas contraseñas deseas crear?: ")];

        int longitudPasswords;
        do {
            longitudPasswords = Input.getInteger("¿De que longitud quieres que seaan las contraseñas? (1-15): ");
        } while (longitudPasswords<=0 || longitudPasswords>15);

        for (int i = 0; i < passwords.length; i++) {
            passwords[i] = new Password(longitudPasswords);
        }

        boolean[] esFuertePassword = new boolean[passwords.length];
        int i = 0;

        for (Password password:passwords) {
            esFuertePassword[i] = password.esFuerte();
            System.out.println("Fuerte:" + esFuertePassword[i] + " -> " + "Contraseña:" + password.getContraseña());
        }
    }
}