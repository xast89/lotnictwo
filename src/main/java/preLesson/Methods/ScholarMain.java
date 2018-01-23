package preLesson.Methods;

/**
 * Created by pawel on 21.01.18.
 */
public class ScholarMain {


    public static void main(String[] args) {

        Scholar gandalf = new Scholar();

        double result = gandalf.adding(6.88, 1.62);
        double resultdivision = gandalf.division(6.5,0.5);
        double resultsubstraction = gandalf.subtraction(2018,1991);
        double resoltmultiplication = gandalf.multiplication(170, 77.4);

        System.out.println("Our multiplicatnion result is " + resoltmultiplication);
        System.out.println("Our substraction restult is" + resultsubstraction);
        System.out.println("Our division result is " + resultdivision);
        System.out.println("Our adding result is " + result);
    }
}
