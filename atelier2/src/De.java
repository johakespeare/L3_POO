/**
 * Classe De
 * classe mère des autres classes dés
 * @version 1.0
 *
 * @author Johanna Fericean
 */

import java.util.*;

public class De {
    
    /***   ATTRIBUTS   ***/
protected int nbFaces;
protected String nom;
protected static Random r = new Random();
protected static int i=0;
    
    /***   CONSTRUCTEUR   ***/
    public De(int nbFaces , String nom){
         /**
         * @param nbFaces = le nombre de faces du Dé
         * @param nom = le nom du Dé
         **/
        this.nbFaces=nbFaces;
        this.nom = nom;
        i++;}

    public De(){
        this.setNbFaces(6);
        this.setNom("De n°"+ i);
        i++;}

    public De(int nbFaces){
         /**
         * @param nbFaces = le nombre de faces du Dé
         **/
        this.nbFaces= nbFaces;
        this.setNom("De n°"+ i);
        i++;}

    /***    METHODES    ***/
    public int getNbFaces() {
        /**@return nbFaces 
        **/
        return nbFaces;}

    public void setNbFaces(int nbFaces) {
        /**remplace le nbFaces par le nbFaces passé en paramètre si il est compris
        entre 3 et 120 inclus
        * @param nbFaces = le nouveau nombre de faces
        **/
        if((nbFaces>=3)&&(nbFaces<=120)){
                this.nbFaces = nbFaces;}
        else {
            System.err.print("pas bonne valeur");}}

    public String getNom() {
        /** @return : le nom du Dé
        **/
        return nom;}

    public void setNom(String nom) {
        /**remplace le nom par le nom placé en paramètres si il n'est pas null
        * @param nom = le nouveau nom du dé
        **/
        if(nom.length()!=0){
        this.nom = nom;}
        else{
            System.err.println(" le nom n'est pas correcte");}}

    public int lancer(){
         /** lance le Dé, la fonction retournera une valeure entre 1 et  le nombre de faces
        * @return tirage = le resultat du lancer
        **/
        int tirage = r.nextInt(this.getNbFaces() +1) ;
        return(tirage);}

    public int lancer(int nbCoups){
        /** lance le Dé autant de fois qu'il y'a de nbCoups et retourne le meilleur tirage
        * @return max = le meilleur tirage
        **/
        int max=0;
        for (int i=0;i<nbCoups;i++){
            int lancer = lancer();
            //System.out.println(lancer); 
            if(max<lancer){
                max=lancer;}}
        return(max);}

}
