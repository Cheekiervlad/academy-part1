package by.academy.homework.homework2;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество игроков n");
        int n = sc.nextInt();
        dealCards(n);
        sc.close();
    }

    private static void dealCards(int n) {
        if (n < 1) {
            System.out.println("Число игроков должно быть больше или равно 1");
            return;
        }

        int cardsForOnePerson = 5;
        String[] suit = {"Червей", "Пика", "Бубна", "Крести"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        int cardsInDeck = suit.length * rank.length;
        String[] deck = new String[cardsInDeck];
        Random random = new Random();

        if (n > cardsInDeck / cardsForOnePerson) {
            System.out.println("Максимальное количество игроков: " + cardsInDeck / cardsForOnePerson);
            return;
        }

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                deck[rank.length * i + j] = rank[j] + " " + suit[i];
            }
        }

        for (int i = 0; i < deck.length; i++) {
            int numberOfRandomCard = random.nextInt(deck.length);
            String temp = deck[numberOfRandomCard];
            deck[numberOfRandomCard] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < cardsForOnePerson; j++) {
                System.out.println(deck[cardsForOnePerson * i + j]);
            }
            System.out.println();
        }
    }
}