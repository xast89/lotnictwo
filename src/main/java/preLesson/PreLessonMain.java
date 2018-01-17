package preLesson;

/**
 * Created by pawel on 17.01.18.
 */
public class PreLessonMain {

    public static void main(String[] args) {

        // Here we star our small program

        // first we need to create new instance of Man class:
        Man firstObject = new Man( "Pawel", 29);
        Man secondObject = new Man("Krzysiek", 55);
        Man thirdObject = new Man( "Jacek",  27);
        // display object's name

        System.out.println("FirstObject name is: " + firstObject.getName ());
        System.out.println("SecondObject name is: " + secondObject.getName());
        System.out.println("thirdObject name is: " + thirdObject.getName());

        System.out.println ("FirstObject age is: " +firstObject.getAge());
        System.out.println("secondObject age is: " +secondObject.getAge());
        System.out.println("thirdObject age is: " +thirdObject.getAge());
        //TODO: display object's age
    }

}
