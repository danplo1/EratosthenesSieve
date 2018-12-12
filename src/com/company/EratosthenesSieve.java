package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class EratosthenesSieve {

    public static void main(String[] args) {

        //Generowanie liczb pierwszych z użyciem sita Eratostenesa

        int n = 1000 +1; // przedział od 0 do 999
        long start = System.nanoTime(); // czas rozpoczęcia


        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje n w przedziale od 0 do 1000: ");
        n = sc.nextInt();

        boolean first[] = new boolean[n];
        Arrays.fill(first, true); // wypełnia wartość true
        first[0] = false;
        first[1] = false;

        for (int i = 2; i < n; i++) { // sprawdzanie kolejnychwielokroności

            if (first[i] == true) {

                for (int j = i + i; j < n; j = j + i) {
                    first[j] = false;
                }
            }
        }

        long stop = System.nanoTime(); // czas zakończenia działania programu

        for (int i = 0; i < n; i++) { // petla, która pokazuje wyniki
            if (first[i] == true) {
                System.out.println(i + " ");
            }
        }
        System.out.println(String.format("%n%sms", stop, start)); // wyświetla czas wykonanania
    }
}





