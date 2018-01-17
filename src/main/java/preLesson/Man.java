package preLesson;

/**
 * Created by pawel on 17.01.18.
 */
public class Man {

    // fields must be private - please find out why. Because the information can see only programmer
    private String name;
    private int age;

    // Constuctor with two parameters: name and age. These parameters must be given during create new object
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Due to private fields we need special method to get field's value. So we need 'getters':
    public String getName() {
        return name;
    }

    // this method - getter - is 'public', returns 'int' value
    public int getAge() {
        return age;
    }
}
