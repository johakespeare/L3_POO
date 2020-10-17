/**
 * Classe Employe
 * @author  johanna Fericean
 *
 */
package Classes;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employe extends Personne {
    protected double salaire;
    protected GregorianCalendar date_embauche;

    protected Employe(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, double salaire, GregorianCalendar date_embauche) {
        super(leNom, lePrenom, laDate, lAdresse);
        this.salaire = salaire;
        this.date_embauche = date_embauche;
    }

    /**
     * fonction qui créée un employé
     * @param leNom le nom de l'employé
     * @param lePrenom le prénom de l'émployé
     * @param laDate la date de naissance de l'employé
     * @param lAdresse l'adresse de l'employé
     * @param salaire le salaire de l'employé
     */
    public static Employe createEmploye(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse,double salaire,GregorianCalendar date_embauche){
        int AGE_MINIMUM = 16;
        int AGE_MAXIMUM = 65;


        int age =  date_embauche.get(Calendar.YEAR)-laDate.get(Calendar.YEAR);


        if((age>AGE_MINIMUM)&&(age<AGE_MAXIMUM)&&(salaire>0)){
            Employe e = new Employe(leNom, lePrenom, laDate, lAdresse, salaire,date_embauche);
            return e;
        }
        else{ System.err.println("l'age n'est pas valide il a "+ age +" ans" );
        return null;}
    }


    /**
     * Accesseur
     * @return
     */
    public double getSalaire() {
        return salaire;
    }

    /**
     * fonction qui augmente le salaire
     * @param pourcentage augmentation du salaire
     */
    public void augmenterLeSalaire(double pourcentage){

        if(pourcentage>0){
            this.salaire = this.salaire + this.salaire*pourcentage;
        }
        else{
            System.err.println("le pourcentage n'est pasp positif");
        }
    }

    /**
     * fonction qui calcule le nombre d'années que l'employé a passé dans l'entreprise
     * @return nbannées
     */
    public int calculAnnuite(){
        //GregorianCalendar today = new GregorianCalendar()
        Calendar c = Calendar. getInstance();
        int year = c. get(Calendar. YEAR);
        int yearEmbauche = this.date_embauche.get(Calendar.YEAR);
        return( year-yearEmbauche+1);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "salaire=" + salaire +
                ", date_embauche=" + date_embauche +
                '}';
    }

}
