package Test;
import java.util.GregorianCalendar;
import Classes.*;

public class Main {

    public static void main(String args[]){

        GregorianCalendar dateEmbauche = new GregorianCalendar(2020,12,3);
        GregorianCalendar dateValide = new GregorianCalendar(2000,9,30);
        GregorianCalendar dateNonValide = new GregorianCalendar(2015,5,20);
        GregorianCalendar dateNonValide2 = new GregorianCalendar(1900,6,19);

        Adresse adresse = new Adresse(12," les lauriers","20167","ajaccio");

        Employe e1 = Employe.createEmploye("employe1","georges",dateValide,adresse,1200,dateEmbauche);
        Employe e2 = Employe.createEmploye("employePasValide","cindy",dateNonValide,adresse,1200,dateEmbauche);
        Employe e3 = Employe.createEmploye("employePasValide","lea",dateNonValide2,adresse,1200,dateEmbauche);

        Secretaire s1 = Secretaire.createSecretaire("secretaire1","caroline",dateValide,adresse,100,dateEmbauche);
        Secretaire s2 = Secretaire.createSecretaire("secretaire2","Gertrude",dateValide,adresse,1500,dateEmbauche);


        Manager m1 = Manager.createManager("manager1","serge",dateValide,adresse,4000,dateEmbauche,s1);
        Manager m2 = Manager.createManager("manager2","serge",dateValide,adresse,4000,dateEmbauche,s1);
        Manager m3 = Manager.createManager("manager3","serge",dateValide,adresse,4000,dateEmbauche,s1);
        Manager m4 = Manager.createManager("manager4","serge",dateValide,adresse,4000,dateEmbauche,s1);
        Manager m5 = Manager.createManager("manager5","serge",dateValide,adresse,4000,dateEmbauche,s1);
        Manager m6 = Manager.createManager("manager6","serge",dateValide,adresse,4000,dateEmbauche,s2);

        // test limite nb secretaires
        m6.setSecretaire(s1);

        //test augmentation salaiez
       Employe[] liste_employes = new Employe[]{e1, s1, s2, m1, m2, m3, m4, m5, m6};

       for(int i=0;i< liste_employes.length;i++){
           System.out.println("ancien salaire de "+ liste_employes[i].getNom() + " est "+liste_employes[i].getSalaire());
           liste_employes[i].augmenterLeSalaire(0.1);
           System.out.println("nouveau salaire de "+ liste_employes[i].getNom() + " est "+liste_employes[i].getSalaire());
       }

    }

}
