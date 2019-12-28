import java.lang.String;

public class Sas extends Entreprise {

    private String adresse;

    public Sas(int chiffreAffaires, String siret, String denomination, String adresse) {
        super(chiffreAffaires, siret, denomination);
        this.setAdresse(adresse);
    }


    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double calculerImpot(){
        return chiffreAffaires*0.33;
    }
}