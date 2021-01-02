public class Rotate {
    public static void main(String[] args) {

    }
    public static String rotationalCipher(String input, int rotationFactor) {

        final StringBuilder stringBuilder = new StringBuilder(input.length());

        for (char character : input.toCharArray()) {
            stringBuilder.append(rotate(character, rotationFactor));
        }
        return stringBuilder.toString();
    }

    private static char rotate(char character, int rotationFactor) {
        if (character >= 'a' && character <= 'z') {
            return rotateInRange('a', 'z', character, rotationFactor);
        } else if (character >= 'A' && character <= 'Z') {
            return rotateInRange('A', 'Z', character, rotationFactor);
        } else if (character >= '0' && character <= '9') {
            return rotateInRange('0', '9', character, rotationFactor);
        }
        return character;
    }

    private static char rotateInRange(char start, char end, char character, int rotationFactor) {
        return (char) ((((character - start) + rotationFactor) % (end - start + 1)) + start);
    }

}
