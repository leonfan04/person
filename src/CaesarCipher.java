import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение N (число для сдвига алфавита): ");
        int shift = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите сообщение для шифрования: ");
        String message = scanner.nextLine();

        String encryptedMessage = encrypt(message, shift);

        System.out.println("Зашифрованное сообщение: " + encryptedMessage);
    }

    public static String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : message.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                result.append((char) ((character - base + shift) % 26 + base));
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}
