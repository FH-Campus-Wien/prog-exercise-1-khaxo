package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        int a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum=0;

        sum = a+ b+ c+ (int)d+(int)e+(int)f+(int)g+(int)h;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        int number1, number2;
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        number2 = scanner.nextInt();
        System.out.println(number1 + number2);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        int x,y;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: "); x = scanner.nextInt();
        System.out.print("y: "); y = scanner.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;



        System.out.println("After Swap:");
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1, n2;

        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        if (n1 > n2){
            System.out.println("n1: n2: n1 > n2");
        }
        else if (n2 == n1) {
            System.out.println("n1: n2: n1 == n2");
        }
        else{
            System.out.println("n1: n2: n2 > n1");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        int Umsatz;

        System.out.print("Enter annual Revenue: ");

        Scanner scanner = new Scanner(System.in);
        Umsatz = scanner.nextInt();


        if ((0 <= Umsatz)&&(Umsatz >= 100000)){
            System.out.println("Invalid Revenue");
        }
        if ((0 <= Umsatz)&&(Umsatz < 20000)){
            System.out.println("Poor Sales Revenue");
        }
        if ((20000 <= Umsatz)&&(Umsatz < 50000)){
            System.out.println("Average Sales Revenue");
        }
        if ((50000 <= Umsatz)&&(Umsatz < 80000)){
            System.out.println("Good Sales Revenue");
        }
        if ((80000 <= Umsatz)&&(Umsatz < 100000)){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        int x = 1;
        String CommissionClass;

        System.out.print("Enter CommissionClass: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();

        switch (x){
            case 1: CommissionClass = "Your Commission Rate was set to 0.01";
                break;
            case 2: CommissionClass = "Your Commission Rate was set to 0.02";
                break;
            case 3: CommissionClass = "Your Commission Rate was set to 0.03";
                break;
            case 4: CommissionClass = "Your Commission Rate was set to 0.04";
                break;
            default: CommissionClass = "Your Commission Rate was set to 0.0";
                break;
        }
        System.out.println(CommissionClass);
    }

    //todo Task 9
    public void leapyear(){
        int year;
        boolean leap = false;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        System.out.print("Year: ");

        if (year % 4 == 0) {
            if (year %100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if (leap)
            System.out.println("Leapyear");
        else
            System.out.println("Not a Leapyear");
    }

    //todo Task 10
    public void transposedNumbers(){
        int VertauschteZahl = 0;
        int Faktor = 100;
        int Nummer;
        Scanner scanner = new Scanner(System.in);
        Nummer = scanner.nextInt();



        for(int i = 0; i < 3; i++){
            VertauschteZahl = (Nummer % 10)*Faktor + VertauschteZahl;
            Nummer = Nummer / 10;
            Faktor = Faktor / 10;
        }
        System.out.println("Number: " + VertauschteZahl);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}