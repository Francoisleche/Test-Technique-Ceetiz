/**
 * Created by meyna on 28/12/2019.
 */
public class Impot {

    public static void main(String[] args) {


        if(args.length==3){//java Impot 123 monentreprise 155000
            AutoEntreprise auto = new AutoEntreprise(Integer.parseInt(args[2]),args[0],args[1]);
            System.out.println(auto.calculerImpot());
        }else if(args.length==4){
            Sas sas = new Sas(Integer.parseInt(args[2]),args[0],args[1],args[3]);
            System.out.println(sas.calculerImpot());
        }else{
            System.err.println("Syntax : java Impot 123 monentreprise 155000 OU BIEN java Impot 345 sas 855477 15rueMontmorency  ");
        }

    }
}
