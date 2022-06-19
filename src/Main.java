public class Main {
    public static void main(String[] args) {
        //первая задача
        int[] firstArr = new int[3];
        firstArr[0] = 1;
        firstArr[1] = 2;
        firstArr[2] = 3;
        double[] secondArr = {1.57, 7.654, 9.986};
        long[] thirdArr = {2_345_678_901L, 4_567_789_012L, 8_901_234_567L, 10_234_567_890L};
        //вторая задача
        for (int i = 0; i < 3; i++) {
            System.out.print(firstArr[i]);
            if (i < firstArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(secondArr[i]);
            if (i < secondArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < thirdArr.length; i++) {
            System.out.print(thirdArr[i]);
            if (i < thirdArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //третья задача
        for (int i = 0; i < 3; i++) {
            System.out.print(firstArr[(firstArr.length - i - 1)]);
            if (i < firstArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(secondArr[(secondArr.length - i - 1)]);
            if (i < secondArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < thirdArr.length; i++) {
            System.out.print(thirdArr[(thirdArr.length - i - 1)]);
            if (i < thirdArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //четвертая задача
        for (int i = 0; i < 3; i++) {
            if (firstArr[i] % 2 != 0) {
                System.out.print(firstArr[(i)] + 1);
            } else {
                System.out.print(firstArr[i]);
            }
            if (i < firstArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}