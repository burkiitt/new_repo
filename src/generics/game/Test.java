package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar = new Schoolar("Jon" , 18);
        Schoolar schoolar2 = new Schoolar("May" , 18);

        Students students = new Students("Richard" , 20);
        Students students2 = new Students("GON" , 19);

        employee employee = new employee("David" , 30);
        employee employee2 = new employee("Bob" , 15);

        Team<Schoolar> team = new Team<>("Schoolar");
        team.addUser(schoolar);
        team.addUser(schoolar2);
        Team<Schoolar> team_schoolar = new Team<>("Schoolar2");
        team_schoolar.addUser(schoolar);
        team_schoolar.addUser(schoolar2);
        Team<Students> team2 = new Team<>("Students");
        team2.addUser(students);
        team2.addUser(students2);
        Team<employee> team3 = new Team<>("Employee");
        team3.addUser(employee);
        team3.addUser(employee2);
        team.play_with(team_schoolar);

    }
}
