package exercises;

public class MediumDifficulty {
    public static void main(String[] args) {
        String code = CeasarCipher("Hello world", 5);
        System.out.println("Cipher: " + code);
    }


    public static String CeasarCipher(String text, int key) {

        System.out.println("Original Text: " + text);
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int ascii = chars[i];
            if (ascii <= 90 && ascii >= 65) {
                // this means that the letter is in uppercase
                ascii += key;
                if (ascii > 90) {
                    ascii -= 26;
                }
            } else if (ascii <= 122 && ascii >= 97) {
                // this means that the letter is in lowercase
                ascii += key;
                if (ascii > 122) {
                    ascii -= 26;
                }
            }

            // ascii deve ser igual a intervalo(65,90) ou intervalo(97,122)
            chars[i] = (char) ascii;

        }

        return String.valueOf(chars);
    }
}
