package by.academy.classwork.lesson4;

//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

public class Task24 {
    public static void main(String[] args) {
        int sum = 1;
        long multi = 1;
        for (int j = 2; j <= 10; j++) {
            sum += j;
            multi *= sum;
        }
        System.out.println(multi);
    }
}

