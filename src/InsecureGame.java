import java.util.Scanner;

public class InsecureGame {
public static void main( String[] args ){
    System.out.println( " Hella Insecure: Issa vs. Lawrence");
    int teamIssa = 0;
    int teamLawrence = 0;
    String myAnswer;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Team Issa Score: " + teamIssa);
    System.out.println("Team Lawrence Score: " + teamLawrence);
    System.out.println("Lets Play!");
    System.out.println("was Issa wrong for cheating on Lawerence? (Y/N");
    myAnswer = keyboard.nextLine();
    if (myAnswer == "Y") {
        teamLawrence = teamLawrence + 1;
    } else {
        teamIssa = teamIssa + 1;
    }
    System.out.println("He broke up with his girlfriend after learning she cheated on him." + "moved all of his stuff out and had sex with a cute woman who'd been feeling him for months. Was he wrong(Y/N)?");
    myAnswer = keyboard.nextLine();
    if (myAnswer == "Y"){
        teamLawrence = teamLawrence + 1;
    } else {
        teamIssa = teamIssa + 1;
    }
    System.out.println("did Issa deserve to be called a hoe?");
    if (myAnswer == "Y"){
        teamLawrence = teamLawrence +1;
    } else {
        teamIssa = teamIssa + 1;
    }
    System.out.println("Did his joblessness make him depressed, and sap his initiative and his" + "willingnes to put any effort into being a good boyfriend? (Y/N)");
    keyboard.next();
    if (myAnswer == "Y"){
        teamIssa = teamIssa + 1;
    } else {
        teamLawrence = teamLawrence + 1;
    }
    if (teamLawrence > teamIssa) {
        System.out.println("Team Lawrence wins!");
    } else if (teamIssa == teamLawrence){
        System.out.println("They both full of shit");
    }else {
        System.out.println("team Issa Wins! Lawrence is a fboy!");
    }
    keyboard.close();
}
}

