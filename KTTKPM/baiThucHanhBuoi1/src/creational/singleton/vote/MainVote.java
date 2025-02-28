package creational.singleton.vote;

public class MainVote {
    public static void main(String[] args) {
        User user=new User("Minh");
        user.vote(Candidate.BIDEN);
        User user1=new User("hieuCodeNguAhuhu");
        user1.vote(Candidate.TRUMP);
        User user2=new User("hieuProAhoho");
        user2.vote(Candidate.TRUMP);
        Election.getInstance().printResult();
        user.vote(Candidate.BIDEN);
        Election.getInstance().printResult();
    }
}
