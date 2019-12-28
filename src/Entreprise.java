/**
 * Created by meyna on 28/12/2019.
 */
public abstract class Entreprise {

    protected int chiffreAffaires;
    protected String siret;
    protected String denomination;

    public Entreprise(int chiffreAffaires, String siret, String denomination) {
        this.chiffreAffaires = chiffreAffaires;
        this.siret = siret;
        this.denomination = denomination;
    }

    abstract double calculerImpot();

}
