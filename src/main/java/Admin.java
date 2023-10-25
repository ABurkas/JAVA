public class Admin extends User implements Zachowania{

    private String _weryfikacja = "";
    public String get_weryfikacja() {
        return weryfikacja;
    }

    public void set_weryfikacja(String weryfikacja) {
        _weryfikacja = weryfikacja;
    }

    private String weryfikacja = "";


    @Override
    public void dodaj_uzytkownika(String id) {

    }

    @Override
    public void usun_uzytkownika(String id) {

    }
}
