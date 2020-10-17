/**
 * Classe Manager
 * @author  johanna Fericean
 *
 */
package Classes;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employe{
protected Secretaire secretaire;


    private Manager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, double salaire,GregorianCalendar date_embauche ,Secretaire secretaire) {
        super(leNom,lePrenom,laDate,lAdresse,salaire,date_embauche);
        this.secretaire=secretaire;
    }

    /**
     * la fonction créée un manager en vérifiant son age
     * @param leNom
     * @param lePrenom
     * @param laDate
     * @param lAdresse
     * @param salaire
     * @param date_embauche
     */
    public static Manager createManager(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, double salaire, GregorianCalendar date_embauche,Secretaire secretaire){
        int AGE_MINIMUM = 16;
        int AGE_MAXIMUM = 65;

        int age =  date_embauche.get(Calendar.YEAR)-laDate.get(Calendar.YEAR);

        if((age>AGE_MINIMUM)&&(age<AGE_MAXIMUM)&&(salaire>0)){
            Manager e = new Manager(leNom, lePrenom, laDate, lAdresse, salaire,date_embauche,secretaire);
            return e;
        }
        else{ System.err.println("l'age n'est pas valide");
        return null;}

    }

    /**
     * la fonction augmente le salaire
     * @param pourcentage
     */
    public void augmenterLeSalaire(int pourcentage){
        double AUGMENTATION =0.5;
        if(pourcentage>=0){
            this.salaire = this.salaire*pourcentage + AUGMENTATION *(this.salaire); //mettre 0.5 en constante

        }
        else{
            System.err.println("le pourcentage n'est pas positif!");
        }
    }

    /**
     * SETTER
     * @param secretaire la nouvelle secretaire
     */
    public void setSecretaire(Secretaire secretaire){

        if(this.secretaire==null){
            this.secretaire= secretaire;
        }
        else{
            System.err.println("le manager "+ this.getNom() + " a déja une secrétaire");
        }

    }

    /**
     * accesseur
     * @return secretaire
     */
    public Secretaire getSecretaire() {
        return secretaire;
    }




}
