package netlinks.mobile.metier;

public class Restaurant extends Lieu{

	public Integer nbFourchettes;
	public String type;
	
	public Integer getNbFourchettes() {
		return nbFourchettes;
	}
	public void setNbFourchettes(Integer nbFourchettes) {
		this.nbFourchettes = nbFourchettes;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
