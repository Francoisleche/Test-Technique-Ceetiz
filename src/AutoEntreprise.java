import java.lang.String;

public class AutoEntreprise extends Entreprise{

    public AutoEntreprise(int chiffreAffaires, String siret, String denomination) {
        super(chiffreAffaires, siret, denomination);
    }

    public double calculerImpot(){
        return chiffreAffaires*0.25;
    }

}