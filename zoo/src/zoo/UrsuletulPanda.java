package zoo;

public class UrsuletulPanda extends Animal {
	
	String activitatePreferata;
	int oreDormite;
	
	public void mananca() {
		
	}

	public UrsuletulPanda(Ingrijitor costel,String nume,String culoare,int varsta,int oreDormite) {
		super(costel,nume,culoare,varsta);
		this.activitatePreferata="dormitul";
		this.oreDormite=oreDormite;
	}
	
	public String getActivitatePreferata() {
		return activitatePreferata;
	}
	
	public void doarmeOre(int valoare) {
		oreDormite=valoare;	
	}
	
	public int getOreDormite() {
		return oreDormite;
	}
	public String toString() {
		return nume+" "+culoare+" "+varsta+" "+activitatePreferata+" "+oreDormite+" ";
	}
	public UrsuletulPanda() {
		
	}
	
}
