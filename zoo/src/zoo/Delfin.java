package zoo;

public class Delfin extends Animal {
	
	String activitatePreferata;
	int nrKmInnotati;
	public void mananca() {
		
	}

	public Delfin(Ingrijitor costel,String nume,String culoare,int varsta,int nr) {
		super(costel,nume,culoare,varsta);
		this.activitatePreferata="innotul";
		this.nrKmInnotati=nr;
	}
	public String getActivitatePreferata() {
		return activitatePreferata;
	}
	
	public int getNrKmInnotati() {
		return nrKmInnotati;
	}
	
	public void innoataKm(int nr) {
		this.nrKmInnotati=nr;
	}
	
	public String toString() {
		return nume+" "+culoare+" "+varsta+" "+activitatePreferata+" "+nrKmInnotati+" ";
	}
}
