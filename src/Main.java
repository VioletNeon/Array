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

        // Task-2
        for (byte i = 0; i < arrayInt.length; i++) {
            if (i == arrayInt.length - 1) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }

        for (byte i = 0; i < arrayFloat.length; i++) {
            if (i == arrayFloat.length - 1) {
                System.out.println(arrayFloat[i]);
                break;
            }
            System.out.print(arrayFloat[i] + ", ");
        }

        for (byte i = 0; i < arrayArbitrary.length; i++) {
            if (i == arrayArbitrary.length - 1) {
                System.out.println(arrayArbitrary[i]);
                break;
            }
            System.out.print(arrayArbitrary[i] + ", ");
        }
    }
}