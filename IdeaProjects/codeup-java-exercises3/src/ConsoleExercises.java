import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

//        Scanner scanner = new Scanner(System.in);
        System.out.format("The value of Pi is approximately %.2f %n", pi);
//        The value of pi is approximately 3.14.

//        Explore the Scanner Class
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an Integer: ");
//        int userInput = sc.nextInt();
//        System.out.println("You entered: " + userInput);

//        What happens if you input something that is not an integer?
//
//        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//
//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?
//                Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.

        System.out.println("Enter three words: ");
        String userInput = sc.nextLine();
        String userInput2 = sc.nextLine();
        String userInput3 = sc.nextLine();
        System.out.println();
//
//        do you capture all of the words?
//        Rewrite the above example using the .nextLine method.
//
//        Calculate the perimeter and area of Codeup's classrooms
//
//        Prompt the user to enter values of length and width of a classroom at Codeup.
//
//                Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//
//                Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
//                The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
//
//                Bonuses
//
//        Accept decimal entries
//        Calculate the volume of the rooms in addition to the area and perimeter


    }
}
