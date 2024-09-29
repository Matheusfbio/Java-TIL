package challanges;

public class SumNumbersPar {

    public static void main(String[] args) {
        int numbersPar = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                continue;
            }
            numbersPar += i;
        }

        System.out.println(numbersPar);
    }
}
