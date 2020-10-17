/**
 * Classe Secretaire
 * @author  johanna Fericean
 *
 */
package Classes;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Secretaire extends Employe {
    ArrayList<Manager> list_managers = new ArrayList<Manager>();

    private Secretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, double salaire, GregorianCalendar date_embauche) {
        super(leNom, lePrenom, laDate, lAdresse, salaire, date_embauche);
    }

    /**
     * fonction qui créée une secrétaire
     * @param leNom
     * @param lePrenom
     * @param laDate
     * @param lAdresse
     * @param salaire
     * @param date_embauche
     */
    public static Secretaire createSecretaire(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse, double salaire, GregorianCalendar date_embauche){
        int AGE_MINIMUM = 16;
        int AGE_MAXIMUM = 65;

        int age =  date_embauche.get(Calendar.YEAR)-laDate.get(Calendar.YEAR);

        if((age>AGE_MINIMUM)&&(age<AGE_MAXIMUM)&&(salaire>0)){
            Secretaire e = new Secretaire(leNom, lePrenom, laDate, lAdresse, salaire,date_embauche);
            return e;
        }
        else{ System.err.println("l'age n'est pas valide");
        return null;}

    }

    /** fonction qui ajoute un manager à la secrétaire, si elle en a déjà 5, n'en ajoute pas
     * @param manager = le manager qu'on ajoute à la secrétaire
     */
    public void add_manager(Manager manager){
        int MAX_MANAGERS=5;
        if(list_managers.size()<MAX_MANAGERS){
            list_managers.add(manager);}
        else System.err.println("trop de managers");
    }
    /** fonction qui supprimer un manager
     * @param manager = le manager qu'on supprime à la secrétaire
     */
    public void del_manager(Manager manager){

        list_managers.remove(manager);
    }

    /**la fonction augmente le salaire du manager
     * @param pourcentage = taux d'augmentation du salaire
     */
    public void augmenterLeSalaire(int pourcentage){
        if(pourcentage>=0){
            this.salaire = this.salaire*pourcentage + this.getManagers()*0.1*(this.salaire);

        }
        else{
            System.err.println("le pourcentage n'est pas positif!");
        }
    }
    /**
     * retourne le nombre de managers de la secrétaire
     */
    public int getManagers(){

        return(list_managers.size());
    }











}
