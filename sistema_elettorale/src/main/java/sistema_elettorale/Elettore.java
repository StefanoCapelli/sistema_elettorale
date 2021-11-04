/**
 * PROGETTO INGEGNERIA DEL SOFTWARE: ASSIGNMENT 2
 * GRUPPO: CAPELLI STEFANO 922842 			LEONCINI LORENZO 930936	
 *	 
 */
package sistema_elettorale;

/**
 * La classe elettore identifica un elettore tramite ID (che verrà gestito in modo univoco [es. SPID]).
 * L'attributo aggiuntivo che si è deciso di aggiungere è il nome dell'elettore.
 */
public class Elettore {
	
	/**
	 * Costruttore della classe 
	 * input: ID e nome
	 */
	public Elettore(String iD, String nome) {
		super();
		
		boolean check_result = CheckID(ID);
		if (check_result) {
			this.ID = iD;
		}
		this.nome = nome;
	}

	private String ID;
	private String nome;
	
	/**
	 * output: ID dell'elettore
	 */
	public String getID() {
		return ID;
	}
	
	/**
	 * input: ID dell'elettore  
	 */
	public void setID(String iD) {
		ID = iD;
	}
	
	/**
	 * output: nome dell'elettore
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * input: nome dell'elettore
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Funzione (non completa) per votare in una determinata elezione
	 * input: scheda elettorale (ID elezione) 
	 * output: scelta dell'elettore
	 */
	public void Vota( ) {
		
	}

	/**
	 * Funzione (non completa) per il controllo sulla validità dell'ID elettore
	 * input: ID dell'elettore 
	 * output: approvazione o meno dell'ID
	 */
	public boolean CheckID(String iD) {
		
		//if (true) {
		//	return true;
		//}
		
		return false;
	}
}
