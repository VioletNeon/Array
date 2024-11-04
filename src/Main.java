import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task-1
        int[] arrayInt = new int[3];

        for (byte i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayInt));

        float[] arrayFloat = {1.57F, 7.654F, 9.986F};
        System.out.println(Arrays.toString(arrayFloat));

        boolean[] arrayArbitrary = new boolean[3];
        arrayArbitrary[0] = true;
        arrayArbitrary[2] = true;
        System.out.println(Arrays.toString(arrayArbitrary));
    }
}