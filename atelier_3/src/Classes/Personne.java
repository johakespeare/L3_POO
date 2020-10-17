/**
 * Classe Personne
 * @author  johanna Fericean
 *
 */
package Classes;
import java.util.*;

public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
    private static int compteurPersonne =0;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		compteurPersonne++;
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le pr�nom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'ann�e de naissance
	 * @param numero le n� de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le pr�nom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Pr�nom : "+prenom+"\n"+
		"N�(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	/**
	 * Accesseur
	 * @return compteurPersonne
	 */
	public static int getCompteurPersonne() {
		return compteurPersonne;
	}

	/**
	 * retourne vrai si la personne1 est plus Agee que la personne2 sinon retourne faux
	 * @param personne1
	 * @param personne2
	 * @return boolean
	 */
	public static boolean plusAge(Personne personne1,Personne personne2){
		Boolean result;
		if(personne1.getDateNaissance().before(personne2.getDateNaissance())){
			result = true;
		}
		else {
			result=false;
		}
		return result;
	}



	/**
	 * retourne vraie si l'objet personne est plusAgee que la personne 2 sinon retourne false
	 * @param personne2
	 * @return boolean
	 */
	public boolean plusAgeeQue(Personne personne2){
		return(plusAge(this,personne2));
	}


	/**
	 * retourne true si l'objet est identique à l'objet personne ( hormis l'adresse) sinon false
	 * @param objet
	 * @return boolean
	 */
	public boolean equals(Object objet) {
		Boolean result;
		if (this == objet){
			result = true;
		}

		Personne personne = (Personne) objet;
		 if( Objects.equals(nom, personne.getNom()) && Objects.equals(prenom, personne.prenom) &&
				Objects.equals(dateNaissance, personne.dateNaissance)){
			result=true;
		}
		else{
			result=false;
		}
		return result;
	}


}

    
   
   