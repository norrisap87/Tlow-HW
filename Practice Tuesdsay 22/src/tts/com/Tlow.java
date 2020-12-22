package tts.com;
import java.util.Scanner;
public class Tlow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("How are you feeling today? (okay, good, bad)");
        String feeling = input.nextLine();

        {
            if (feeling.equals("okay")) {
                System.out.println("Okay is better than terrible!");
            }

            if (feeling.equals("good")) {
                System.out.println("That is great!");
            }

            if (feeling.equals("bad")) {
                System.out.println("It be like that sometimes");
            }
        }

            System.out.println("\nShall we continue our interview? (yes, no, ugh)");
            String query = input.nextLine();

        {
            if (query.equals("yes")) {
                System.out.println("\nYou are the best!");
            }

            if (query.equals("no")) {
                System.out.println("\nThanks for your time ^-^");
            }
            if (query.equals("ugh")) {
                System.out.println("\nHey, I have feelings ya know!");
            }
        }
                    System.out.println("\n\nYour participation is appreciated.");
                }
            }
