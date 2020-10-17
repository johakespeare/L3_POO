package Test;
import Classes.Adresse;
import Classes.Personne;

import java.util.GregorianCalendar;

public class TestQuestion1 {

    public static void main(String args[]){
        int nb_persones_crees=5;

        //test compteur
        for (int i=0;i<nb_persones_crees;i++){
            GregorianCalendar calendar = new GregorianCalendar(2000,9,30);
            Adresse adresse = new Adresse(20,"des potiers","20167","malibou");
            Personne p = new Personne("jean","marc",calendar,adresse);
            System.out.println("personne numéro :" + p.getCompteurPersonne());
            System.out.println(p.toString());
        }



        // test equals
        //test plusAgeQue



    }

}