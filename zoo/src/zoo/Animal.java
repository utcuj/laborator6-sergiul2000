	package zoo;
	
	public abstract class Animal {
		
		String nume;
		String culoare;
		int varsta;
		Ingrijitor costel;
	
		public Ingrijitor getCostel() {
			return costel;
		}
		public void setCostel(Ingrijitor costel) {
			this.costel = costel;
		}
		public String getNume() {
			return nume;
		}
		public void setNume(String nume) {
			this.nume = nume;
		}
		public String getCuloare() {
			return culoare;
		}
		public void setCuloare(String culoare) {
			this.culoare = culoare;
		}
		public int getVarsta() {
			return varsta;
		}
		public void setVarsta(int varsta) {
			this.varsta = varsta;
		}
		
		 public abstract void mananca();
		
		public Animal(Ingrijitor costel,String nume,String culoare,int varsta) {
			this.costel=costel;
			this.nume=nume;
			this.culoare=culoare;
			this.varsta=varsta;
			
		}
		
		public Animal() {
			
			
		}
	
	}
