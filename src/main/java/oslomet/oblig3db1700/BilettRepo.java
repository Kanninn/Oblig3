package oslomet.oblig3db1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BilettRepo {

    @Autowired
    private JdbcTemplate db;//Brukes til å akksesere databasen

    public void lagreBilett(Bilett bilett) {
        String sql = "INSERT INTO BILETT (film, antall, fornavn, etternavn, epost, telefon) VALUES(?,?,?,?,?,?)";
        db.update(sql,bilett.getFilm(), bilett.getAntall(), bilett.getFornavn(), bilett.getEtternavn(), bilett.getEpost(), bilett.getTelefon());
    }
//     fornavn, etternavn, epost, telefon
//bilett.getFornavn(), bilett.getEtternavn(), bilett.getEpost(), bilett.getTelefon()
    public List<Bilett> hentAlleBiletter(){
        String sql = "SELECT* FROM BILETT ORDER BY ETTERNAVN; SELECT * FROM Bilett";
        List<Bilett> alleBiletter= db.query(sql, new BeanPropertyRowMapper(Bilett.class));
        return alleBiletter;
    }
    public void slettAlleBiletter(){
        String sql = "DELETE FROM Bilett";
        db.update(sql);
    }


}
