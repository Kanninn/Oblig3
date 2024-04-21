package oslomet.oblig3db1700;

public class Bilett {
    private String film;
    private int antall;
    private String fornavn;
    private  String etternavn;
    private  String epost;
    private  int telefon;

    public Bilett(String film, int antall, String fornavn, String etternavn, String epost, int telefon){
        this.film=film;
        this.antall=antall;
        this.fornavn=fornavn;
        this.etternavn=etternavn;
        this.epost=epost;
        this.telefon=telefon;
    }
    public Bilett(){
    }
//------------
    public String getFilm(){return film;}
    public void setFilm(String film) {this.film = film;}
//-------------
    public int getAntall(){return antall;}
    public void setAntall(int antall){this.antall = antall;}
//-------------
    public String getFornavn(){return fornavn;}
    public void setFornavn(String fornavn) {this.fornavn = fornavn;}
//--------
    public String getEtternavn(){return etternavn;}
    public void setEtternavn(String etternavn) {this.etternavn = etternavn;}
//------
    public String getEpost(){return epost;}
    public void setEpost(String epost) {this.epost = epost;}
//-----
    public int getTelefon(){return telefon;}
    public void setTelefon(int telefon) {this.telefon = telefon;}


}
