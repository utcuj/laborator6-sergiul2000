package zoo;

public class Pinguin extends Animal {
	
	String activitatePreferata;
	int nrPasi;
	public void mananca() {
		
	}

	public Pinguin(Ingrijitor costel,String nume,String culoare,int varsta,int nrPasi) {
		super(costel,nume,culoare,varsta);
		this.activitatePreferata="plimbarea";
		this.nrPasi=nrPasi;
	}

	public int getNrPasi() {
		return nrPasi;
	}

	public void mergenPasi(int nrPasi) {
		this.nrPasi = nrPasi;
	}

	public String getActivitatePreferata() {
		return activitatePreferata;
	}

	public String toString() {
		return nume+" "+culoare+" "+varsta+" "+activitatePreferata+" "+nrPasi
				+" ";
	}
	
	
}
