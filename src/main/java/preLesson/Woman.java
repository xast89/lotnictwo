package preLesson;

public class Woman {
    private String name;
    private int age;
    private double growth;
    private boolean adult;

    public Woman (String name, int age, double growth,boolean adult){
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.adult = adult;
    }
    public Woman (String name, int age,boolean adult) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.adult = adult;
    }
    public Woman (String name, double growth,boolean adult){
        this.name = name;
        this.growth = growth;
        this.adult = adult;
    }
    public Woman (int age,double growth,boolean adult){
        this.age = age;
        this.growth = growth;
        this.adult = adult;
    }


    public Woman (String name, int age, double growth) {
        this.name = name;
        this.age = age;
        this.growth = growth;

    }
    public Woman (){}

      public String getName(){return name;}

    public int getAge() {
        return age;
    }

    public double getGrowth() {
        return growth;
    }

    public boolean isAdult() {
        return adult;
    }
}
