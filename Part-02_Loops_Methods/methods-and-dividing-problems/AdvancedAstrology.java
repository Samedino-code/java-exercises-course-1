
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int countprint = 1;
        while (countprint <= number) {
            System.out.print("*");
            countprint++;
        }
        System.out.println("");

    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int countspace = 1;
        while (countspace <= number) {
            System.out.print(" ");
            countspace++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int e = 1; e <= size; e++) {
            printSpaces(size -e);
            printStars(e);

        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int size = 1;
        for (int e = 1; e<= height; e++) {
            printSpaces(height -e);
            printStars(size);
            size = size +2;            
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
