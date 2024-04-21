package oslomet.oblig3db1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BilettRepo {

    @Autowired
    private JdbcTemplate db;//Brukes til å akksesere databasen

    public void lagreBilett(Bilett innBilett) {
        String sql = "INSERT INTO BILETT (film, antall, fornavn, etternavn, epost, telefon) VALUES(?,?,?,?,?,?)";
        db.update(sql, innBilett.getFilm(), innBilett.getAntall(), innBilett.Fornanvn(), innBilett.Etternavn(), innBilett.Epost(), innBilett.Telefon());
    }

        public List<Bilett> hentAlleBiletter(){
            String sql = "SELECT * FROM BILETT";
            List<Bilett> alleBiletter= db.query(sql, new BeanPropertyRowMapper(Bilett.class));
            return alleBiletter;
        }

        public void slettAlleBiletter(){
            String sql = "DELETE FROM KUNDE";
            db.update(sql);
        }


}
