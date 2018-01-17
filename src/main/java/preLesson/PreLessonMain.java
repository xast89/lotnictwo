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
    }

    //TODO: please create class Woman with 4 fields: int, double,String, boolean (for example: int age, String name... )
    //TODO: create 4 constructors: with no param, with one param, with two params, with three params and one with all 4 params
    //TODO: create getters for all 4 fields

    //TODO: in PreLessonMain create one single object of Woman class (using contructor with 4 params) and display all value in console.

}
