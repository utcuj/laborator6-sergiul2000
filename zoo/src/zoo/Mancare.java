package zoo;

public abstract class Mancare {
		String nume;
		int cantitate;//cantitate reprezinta nr. de mese
		int ora;
		public String getNume() {
			return nume;
		}
		public void setNume(String nume) {
			this.nume = nume;
		}
		public int getCantitate() {
			return cantitate;
		}
		public void setCantitate(int cantitate) {
			this.cantitate = cantitate;
		}
		public int getOra() {
			return ora;
		}
		
		public void setOra(int ora) {
			this.ora = ora;
		}
		
		public Mancare(String nume, int cantitate, int ora) {
			this.nume = nume;
			this.cantitate = cantitate;
			this.ora = ora;
		}
		
		public void animalulaMancat() {
			
			cantitate--;//cand mananca,reducem nr. de mese cu 1
			
		}
}
