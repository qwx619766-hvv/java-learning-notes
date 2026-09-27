package phase0;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + (j * i) + "\t" );
            }
            System.out.println();
        }

        int count = 0;
        int sum = 0;
        for (int k = 1; k <= 100; k++) {
            if (k % 3 == 0) {
                count++;
                sum += k;
            }

        }
        System.out.print(count + " " + sum);
    }


}

