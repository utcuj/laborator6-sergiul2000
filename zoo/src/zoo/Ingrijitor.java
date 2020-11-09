package zoo;

public class Ingrijitor {
	String nume;
	int varsta;
	String specializare;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public String getSpecializare() {
		return specializare;
	}
	public void setSpecializare(String specializare) {
		this.specializare = specializare;
	}
	public Ingrijitor(String nume, int varsta, String specializare) {
		this.nume = nume;
		this.varsta = varsta;
		this.specializare = specializare;
	}
	
	public Ingrijitor() {
		
	}
	
	public String toString() {
		return nume+" "+varsta+" "+" "+specializare+" ";
	}
	
	

}
