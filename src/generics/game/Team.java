package generics.game;

import java.util.*;

public class Team<T extends Users> {
    private String name;
    private List<T> list = new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }
    public void addUser(T user) {
        list.add(user);
        System.out.println(user.getName() + " added to team");
    }
    public void play_with(Team<T> team) {
        String winner_name = "";
        Random random = new Random();
        int i = random.nextInt(2);
        switch (i) {
            case 0:
                winner_name = this.name;
                break;
            case 1:
                winner_name = team.name;
        }
        System.out.println(winner_name+" is win ");
    }
}
