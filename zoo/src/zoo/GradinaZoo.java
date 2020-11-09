package zoo;

public class GradinaZoo {

	String nume;
	int nrTotalAnimale;
	Animal[] animaleleGradinii;

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getNrTotalAnimale() {
		return nrTotalAnimale;
	}
	public void setNrTotalAnimale(int nrTotalAnimale) {
		this.nrTotalAnimale = nrTotalAnimale;
	}
	public Animal[] getAnimaleleGradinii() {
		return animaleleGradinii;
	}
	public void setAnimaleleGradinii(Animal[] animaleleGradinii) {
		this.animaleleGradinii = animaleleGradinii;
	}
	
	public GradinaZoo(String nume, int nrTotalAnimale, Animal[] animaleleGradinii) {
		super();
		this.nume = nume;
		this.nrTotalAnimale = nrTotalAnimale;
		this.animaleleGradinii = animaleleGradinii;
	}
	
	public String toString() {
		String sirAux="";
		for(int i=0;i<nrTotalAnimale;i++)
			sirAux+=animaleleGradinii[i].nume+" are culoarea "+animaleleGradinii[i].culoare+", "+animaleleGradinii[i].varsta+" ani"+", este ingrijit de "+animaleleGradinii[i].costel.nume+"\n";
		return "Numele gradinii zoo este "+nume+", are "+nrTotalAnimale+" animale.\nAnimalele sunt:\n"+sirAux+" ";
	}
	
 
	
	
}
