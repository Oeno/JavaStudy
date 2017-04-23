package Extends;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oeno on 2017. 4. 23..
 */
public class Team {
    private int teamId;
    private String teamName;
    private List<Member> teamMembers;

    // To increase teamId from value '1'
    private static int teamIdCount = 0;

    public Team(String teamName) {
        teamId = teamIdCount++;
        this.teamName = teamName;
        teamMembers = new ArrayList();
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Member> getTeamMembers() {
        return teamMembers;
    }

    public void hireMember(Member member) {
        teamMembers.add(member);
    }

    public void hireMember(List<Member> hiredList) {
        teamMembers.addAll(hiredList);
    }

    public void fireMember(Member member) {
        teamMembers.remove(member);
    }

    public void fireMember(List<Member> firedList) {
        teamMembers.removeAll(firedList);
    }

    @Override
    public boolean equals(Object obj) {
        Team team = (Team) obj;

        if (teamId == team.getTeamId() &&
                teamName.equals(team.getTeamName()) &&
                teamMembers.equals(team.getTeamMembers())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        String s = "" + teamId + teamName + teamMembers.hashCode();
        return s.hashCode();
    }

    public void DoConference(List<Member> memberList, List<String> taskList) {
        int taskCount = 0;
        for (Member member : memberList) {
            if (taskList.size() < taskCount) {
                break;
            } else {
                for (Member teamMember : teamMembers) {
                    if (teamMember.equals(member)) {
                        teamMember.addTask(taskList.get(taskCount));
                        taskCount++;
                        break;
                    }
                }
            }
        }
    }

}
