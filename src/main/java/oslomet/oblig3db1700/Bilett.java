package oslomet.oblig3db1700;

public class Bilett {
    private int id;
    private String film;
    private int antall;
    private String fornavn;
    private  String etternavn;
    private  String epost;
    private  String telefon;//siden integers ikke kan være "null" måtte telefon bli en string her, siden man kan velge å ha telefon nummer eller ikke, med int haade telefon nummertet vært 0

    public Bilett() {
    }

    public Bilett(int id, String film, int antall, String fornavn, String etternavn, String epost, String telefon){
        this.id=id;
        this.film=film;
        this.antall=antall;
        this.fornavn=fornavn;
        this.etternavn=etternavn;
        this.epost=epost;
        this.telefon=telefon;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id= id;
    }
//------------
    public String getFilm(){
        return film;
    }
    public void setFilm(String film) {
        this.film = film;
    }
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
    public String  getTelefon(){return telefon;}
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

}
