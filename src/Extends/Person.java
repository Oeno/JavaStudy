package Extends;

/**
 * Created by oeno on 2017. 4. 23..
 */
public class Person {
    private int id;
    private String name;
    // 피로도
    private int fatigue;


    // To increase id from value '1'
    private static int idCount = 0;

    public Person(String name) {
        id = idCount++;
        this.name = name;
        this.fatigue = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFatigue() {
        return fatigue;
    }

    public void increaseFatigue() {
        fatigue++;
    }

    public void decraseFatigue() {
        fatigue--;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;

        if (id == person.id &&
                name.equals(person.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        String s = "" + id + name;
        return s.hashCode();
    }
}
