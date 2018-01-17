package preLesson;

/**
 * Created by pawel on 17.01.18.
 */
public class PreLessonMain {

    public static void main(String[] args) {

        // Here we star our small program

        // first we need to create new instance of Man class:
        Man firstObject = new Man("Pawel", 29);
        Man secondObject = new Man("Krzysiek", 55);

        // display object's name

        System.out.println("FirstObject name is: " + firstObject.getName());
        System.out.println("SecondObject name is: " + secondObject.getName());


        //TODO: display object's age
    }
}
