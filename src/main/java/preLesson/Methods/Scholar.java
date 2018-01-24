package preLesson.Methods;

import java.awt.*;

/**
 * Created by pawel on 21.01.18.
 */
public class Scholar {


    public double adding(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {

        if (b == 0) {
            b = 1;
        }

        return a / b;
    }

    public void isPossitive(int a) {
        if (a > 0) {
            System.out.println("Podana liczba " + a + " jest wieksza od zera");
        } else {
            System.out.println("Podana liczba " + a + " NIE jest wieksza od zera");
        }
    }

    public void sprawdzamPrzedzialy(int a) {
        if (a > 10) {
            System.out.println("Jest wieksze od 10");
        } else if (a < -10) {
            System.out.println("Jest mniejsze od -10");
        } else {
            System.out.println("jest w przedziale miedzy -10 a 10");
        }
    }

    public void liczbyDodatnie(int a) {
        if (a > 0) {
            System.out.print("liczba" + a + "jest dodatnia");
        } else if (a < 0) {
            System.out.println("liczba" + a + "jest liczb");
        }
    }

    public void ilośćCyfr(int a) {
        if (a > 10) {
            System.out.println("liczba" + a + "jest wiecej niż jednocyfrowa");
        }
    }
    public void imiona (String a) {
        if (a == "Maciej") {
            System.out.print("Witam Cię Macieju");
        } else if (a != "Maciej") {
            System.out.println("Nie znam Cię");
        }
    }
        public void rodzinaMroczkow(String a,String b) {
            if (a == "Jacek") {
                System.out.println("Syn Jędrzeja i Elżbiety Mroczek");
            } else if (b == "Wojtek") {
                System.out.println("Najmłodszy syn Jędrzeja i Elżbiety Mroczek ");
            } else {
                System.out.println("Nie jest to Syn Jędrzeja i Elżbiety Mroczek");
            }
        }

}
