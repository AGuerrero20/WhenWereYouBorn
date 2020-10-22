import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your age?");
    //this ask for your age
    int age = scan.nextInt();
    
    if(age <= 15){
      System.out.println("Then you can't drive on your own");
    }
    System.out.println("What year is it?");
    //this ask for the current year
    int currentYear = scan.nextInt();

    if(currentYear < 2020){
      System.out.println("liar");
    }

    int birthYear = currentYear - age;
    System.out.println("The year you were born was " + birthYear);
    System.out.println("Is this correct? If false put 1 if true put 0");
    int correct = scan.nextInt();

    if(correct == 1)
    {
      System.out.println("then the year you were born is within one year of our guess");
    }
    if(correct == 0){
      System.out.println("then good, this program was correct");
    }
  }
}