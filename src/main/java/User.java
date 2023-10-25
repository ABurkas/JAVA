public abstract class User {
    private String _imie = "";
    private String _nazwisko = "";

    private String _ranking = "";

    public String get_Ranking() {
        return _ranking;
    }

    public void set_ranking(String ranking) {
        _ranking = ranking;
    }

    private String ranking = "";

    public User(){
        //_imie = "BRAK";
        set_imie("BRAK");
        set_nazwisko("BRAK");
    }

    public User(String imie, String nazwisko){
        set_imie(imie);
        set_nazwisko(nazwisko);
    }

    public void set_imie(String imie){
        _imie = imie;
    }

    public void set_nazwisko(String nazwisko){
        _nazwisko = nazwisko;
    }

    public String get_imie(){
        return _imie;
    }

    public String get_nazwisko(){
        return _nazwisko;
    }

    public String toString(){
        return get_imie() + " " + get_nazwisko() + " " + get_Ranking() + "\n";
    }

    public enum Ranking{
        Złoty, Srebrny, Brazowy;
    }
}
