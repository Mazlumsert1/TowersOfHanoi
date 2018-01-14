import java.util.Scanner;

public class TowersOfHanoi {


    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int NumberOfDiscs = scanner.nextInt();
        towersOfHanoi.solveHanoi(NumberOfDiscs, "P_1", "P_2", "P_3");
    }


    // n er Antal disc, start, midt og end er vores 3 poles
    private void solveHanoi(int nDisks, String start, String midt, String end) {
       // BASE CASE, hvis kun 1 disc flyt fra start til slut
        if (nDisks == 1) {
            System.out.println(start + " -> " + end);
            // RECURSIVE CASE, n > 1
        } else {
            // 
            solveHanoi(nDisks - 1, start, end, midt);
            System.out.println(start + " -> " + end);
            solveHanoi(nDisks - 1, midt, start, end);
        }
    }




}
