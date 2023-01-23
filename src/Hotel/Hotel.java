package Hotel;

import java.util.ArrayList;

public class Hotel {

	private static int nb;
	private String nomHotel;
	private ArrayList<Chambre> listeChambre = new ArrayList<Chambre>();
	public String getNomHotel() {
		return nomHotel;
	}
	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}
	public ArrayList<Chambre> getListeChambre() {
		return listeChambre;
	}
	public void setListeCambre(ArrayList<Chambre> listeChambre) {
		this.listeChambre = listeChambre;
	}
	@Override
	public String toString() {
		return "Hotel [nomHotel=" + nomHotel + ", listeCambre=" + listeChambre + "]";
	}
	
	
	
}
