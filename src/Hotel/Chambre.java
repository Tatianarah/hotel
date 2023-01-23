package Hotel;

import java.util.ArrayList;

public class Chambre {

	
	
	private int numero;
	private String type;
	private boolean etat=true;
	private float tarif;


	public Chambre() {}
	public Chambre(int numero, String type, boolean etat, float tarif, ArrayList<Chambre> listeChambre) {
		super();
		this.numero = numero;
		this.type = type;
		this.etat = etat;
		this.tarif = tarif;
		
	}
	
	public int getNumero() {
	return numero;}

	public void setNumero(int numero) {
	this.numero = numero;}

	public String getType() {
	return type;}

	public void setType(String type) {
	this.type = type;}



	public float getTarif() {
	return tarif;
	}

	public void setTarif(float tarif) {
	this.tarif = tarif;
	}

	
	public boolean getEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}
	@Override
	public String toString() {
		return "Chambre [numero=" + numero + ", type=" + type + ", etat=" + etat + ", tarif=" + tarif + "]";
	}
	
	
	

	
	
	
	
}
