package Extends;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oeno on 2017. 4. 23..
 */
public class Member extends Person{
    private List<String> tasks;

    int[] num = new int[3];
    int re = num.length;
    public Member(String name) {
        super(name);
        tasks = new ArrayList();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void addTask(List<String> taskList) {
        tasks.addAll(taskList);
    }

    public void work(String task) {
        if (tasks.contains(task)) {
            tasks.remove(task);
            increaseFatigue();
        } else {
            System.out.println("That Work is out of my jurisdiction!");
        }
    }

    public void rest() {
        if (getFatigue() > 0) {
            decraseFatigue();
        } else {
            System.out.println("I'm not tired to rest");
        }
    }
}
