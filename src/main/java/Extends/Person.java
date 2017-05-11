package Extends;

import com.google.common.base.Objects;

/**
 * Created by oeno on 2017. 4. 23..
 */
public class Person {
    private int id;
    private String name;
    // 피로도
    protected int fatigue;


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

    public void rest() {
        if (fatigue > 0) {
            fatigue--;
        } else {
            System.out.println("I'm not tired to rest");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return (id == person.id) && name.equals(person.name) && (fatigue == person.fatigue);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, name, fatigue);
    }
}
