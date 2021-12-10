package mailClass;

public class Mail {
	private int id;
	private String Expediteur;
	private String Destinataire;
	private String Sujet;
	private String Objet;
	public Mail(int id, String expediteur, String destinataire, String sujet, String objet) {
		super();
		this.id = id;
		Expediteur = expediteur;
		Destinataire = destinataire;
		Sujet = sujet;
		Objet = objet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExpediteur() {
		return Expediteur;
	}
	public void setExpediteur(String expediteur) {
		Expediteur = expediteur;
	}
	public String getDestinataire() {
		return Destinataire;
	}
	public void setDestinataire(String destinataire) {
		Destinataire = destinataire;
	}
	public String getSujet() {
		return Sujet;
	}
	public void setSujet(String sujet) {
		Sujet = sujet;
	}
	public String getObjet() {
		return Objet;
	}
	public void setObjet(String objet) {
		Objet = objet;
	}
	
}
