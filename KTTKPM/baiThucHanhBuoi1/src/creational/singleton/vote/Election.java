package creational.singleton.vote;

import java.util.ArrayList;
import java.util.List;

public class Election {
    private static Election instance;
    private int trump , biden ;
    List<String>userIds;
    private Election() {
        trump  = 0;
        biden  = 0;
        userIds = new ArrayList<>();
    }
    public static Election getInstance() {
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }
    protected void vote(Candidate c,String userId) {
        for(var id: userIds) {
            if(id.equals(userId)){
                return;
            }
        }
        userIds.add(userId);
        if (c == Candidate.TRUMP) {
            trump++;
        } else if (c == Candidate.BIDEN) {
            biden++;
        }
    }
    public void printResult() {
        System.out.println("Kết quả bầu cử:");
        System.out.println("Trump: " + this.trump + " phiếu");
        System.out.println("Biden: " + this.biden + " phiếu");
    }
}
