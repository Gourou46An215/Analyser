package UI;

import data.Diagram;
import data.Sequences;

import java.util.Scanner;

public class UI {
    private static Scanner reader = new Scanner(System.in);

    public String askString() {
        reader.nextLine();
        System.out.println("Please, enter a string to analyse :");
        return reader.nextLine();
    }

    public void printNumericalDiagram(Diagram diagram){
        System.out.println("\n");
        Sequences[] sequences=diagram.getSequences();
        for (int i=0; i<diagram.getLastIndex();i++) {
            System.out.println("The sequence \""+sequences[i].getValue()+"\" occurred "+sequences[i].getCount()+" time(s).");
        }
    }

    public void printCharDiagram(Diagram diagram){
        System.out.println("\n");
        int imax=diagram.getLastIndex();
        Sequences[] sequences=diagram.getSequences();
        for (int i=0;i<imax;i++) {
            System.out.print(sequences[i].getCount());
            System.out.printf("%5s ",sequences[i].getValue());
            for(int j=0;j<sequences[i].getCount();j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }

    public int printMenu(){
        System.out.print("\n\n\n");
        System.out.println("Please, choose which output do you want to be generated :");
        System.out.println("0 - Graphical Output");
        System.out.println("1 - Numerical Output");
        System.out.println("2 - Both");
        System.out.println("3 - Exit");
        return reader.nextInt();
    }

    public int printMenu2(){
        System.out.println("Please, choose what do you want to be analysed :");
        System.out.println("0 - Monograms");
        System.out.println("1 - Bigrams");
        System.out.println("2 - Trigrams");
        return reader.nextInt();
    }

    public void printError() {
        System.out.println("Error, please try again...");
    }
}
