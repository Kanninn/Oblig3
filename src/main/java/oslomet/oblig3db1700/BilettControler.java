package oslomet.oblig3db1700;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BilettControler {
    @Autowired
    BilettRepo rep;

    @PostMapping("/lagre")
    public void lagreBilett(Bilett innBilett){
        rep.lagreBilett(innBilett);
    }
    @GetMapping("/hentAlle")
    public List<Bilett> hentAlle(){
        return rep.hentAlleBiletter();
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        rep.slettAlleBiletter();
    }
}