import java.util.Random;
import java.util.Scanner;

public class CardValueGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int værdi = 1;
        boolean keepGuess = false;
        boolean gæt = false;
        boolean number = false;
        boolean number2 = false;
        int farve = 0;
        Random ran = new Random();
        farve = ran.nextInt(4 + 1);
        System.out.println("svar er:" + farve);
        System.out.println("Gæt hvilken farve: klør = 1, hjerte = 2, spar = 3, ruder = 4");
        while (!gæt) {
            int svar = scan.nextInt();
            int svar2 = 0;
            if (svar == farve) {
                System.out.println("Du har gættet rigig. Gæt værdien:");
                gæt = true;
            } else {
                System.out.println("Du har svaret forkert. Prøv igen");
                svar2 = scan.nextInt();
                if (svar2 == farve) {
                    System.out.println("Du har gættet rigtig. Gæt værdien:");
                    gæt = true;
                } else {
                    System.out.println("Du har tabt spillet");
                    gæt = false;

                    return;
                }

            }

            if (svar == farve || svar2 == farve) {
                værdi = ran.nextInt(13 + 1);
            }
            System.out.println("svar er:" + værdi);
            System.out.println("Du skal gætte værdien");
            while (!number) {
                int svar3 = scan.nextInt();
                if (svar3 == værdi) {
                    System.out.println("Du har gættet rigtig på værdien. Tillykke.");
                    keepGuess = false;
                    return;
                } else {
                    System.out.println("Du har gættet forkert.");
                    if (svar3 > værdi) {
                        System.out.println("Du har gættet for højt.");
                    } else if (svar3 < værdi) {
                            System.out.println("Du har gættet for lavt");
                            keepGuess = true;
                    } else {
                            System.out.println("Du har gættet forkert, du har 1 forsøg tilbage");
                            int svar4 = scan.nextInt();
                            if (svar4 > værdi) {
                                System.out.println("Du har gættet for højt.");
                            } else if (svar4 < værdi)
                                {
                                    System.out.println("Du har gættet for lavt");
                                    keepGuess = true;
                                } else {
                                    System.out.println("Du har gættet forkert. Du har tabt");
                                    int svar5 = scan.nextInt();
                                    if (svar5 > værdi) {
                                        System.out.println("Du har gættet for højt.");
                                    } else if (svar5 < værdi) {
                                            System.out.println("Du har gættet for lavt");
                                            keepGuess = false;
                                            return;
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }