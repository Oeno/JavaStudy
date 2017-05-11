package Extends;

import com.google.common.base.Objects;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oeno on 2017. 4. 23..
 */
public class Member extends Person{
    private int salary;
    private List<String> taskList;

    public Member(String name, int salary) {
        super(name);
        this.salary = salary;
        taskList = new ArrayList();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getTaskList() {
        return taskList;
    }

    public void work(String task) {
        if (taskList.contains(task)) {
            taskList.remove(task);
            fatigue++;
        } else {
            System.out.println("That Work is out of my jurisdiction!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        Member member = (Member)obj;
        return super.equals(obj) && taskList.equals(member.taskList) && (salary == member.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), taskList, salary);
    }
}
