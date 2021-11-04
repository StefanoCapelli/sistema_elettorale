/**
 * PROGETTO INGEGNERIA DEL SOFTWARE: ASSIGNMENT 2
 * GRUPPO: CAPELLI STEFANO 922842 	 				LEONCINI LORENZO 930936	
 *	 
 */
package sistema_elettorale;

/**
 * La classe Scrutatore è stata implementata come idea temporanea, dato che il ruolo non era precedentemente presente.
 * interpretandolo come entità assegnata agli scrutini (senza futura implementazione reale di questa classe)
 *
 */
public class Scrutatore {

	
	private int IDscrutatore;
	//private Elezione e; == variabile che rimanda ad una successivo oggetto Elezione non ancora presente

	/**
	 * costruttore della classe Scrutatore
	 * input: ID dello scrutatore, Elezione
	 */
	public Scrutatore(int iDscrutatore) {
		super();
		//variabile elezione
		IDscrutatore = iDscrutatore;
	}
		
	/**
	 * output: ID dello scrutatore
	 */
	public int getIDscrutatore() {
		return IDscrutatore;
	}
	
	/**
	 * input: identificativo numerico dello scrutatore
	 */
	public void setIDscrutatore(int iDscrutatore) {
		IDscrutatore = iDscrutatore;
	}
		
	/**
	 * Funzione (non completa) per iniziare la fase di scrutinio
	 * input: Elezione
	 * output: variabile booleana di successo o fallimento
	 */
	public void InizioScrutinio() {
		
	}
	
	
	/**
	 * Funzione (non completa) per ottenere i risultati dello scrutinio 
	 * output: storico dei risultati ottenuti dello scrutatore
	 */
	public void GetRisultati( ) {
		
	}
	

}
