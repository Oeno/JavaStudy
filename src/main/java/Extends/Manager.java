package Extends;

import com.google.common.base.Objects;

import java.util.List;

/**
 * Created by oeno on 2017. 5. 11..
 */
public class Manager extends Member{
    private int incentives;

    public Manager(String name, int salary) {
        super(name, salary);
        incentives = 0;
    }

    public int getIncentives() {
        return incentives;
    }

    public void setIncentives(int incentives) {
        this.incentives = incentives;
    }

    public void distributeWork(List<Member> memberList, String task) {
        for (Member member : memberList) {
            member.getTaskList().add(task);
            incentives+=5000;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Manager manager = (Manager)obj;
        return super.equals(obj) && (incentives == manager.incentives);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), incentives);
    }
}