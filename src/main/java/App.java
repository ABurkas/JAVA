import java.sql.SQLOutput;

public class App {
    public static void main(String[] args){
//        User user1 = new User();
//        user1.set_imie("Jacek");
//        user1.set_ranking(User.Ranking.Srebrny.name());
//
//       User user2 = new User("Janek", "Jankowski");
//       user2.set_imie("Janek");
//        user2.set_ranking(User.Ranking.Złoty.name());

        Admin admin1 = new Admin();
        admin1.set_weryfikacja("poprawnie");

        System.out.println(admin1);
    }
}
