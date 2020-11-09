package zoo;
import java.util.*;


public class Test {

	public static void main(String[] args) {
		Scanner myObj=new Scanner(System.in);
		System.out.println("Introduceti numele gradinii zoologice");
		String nume=myObj.nextLine();
		System.out.println("Introduceti nr. de animale al gradinii zoologice");
		int nrAnimale=myObj.nextInt();
		Ingrijitor vasile=new Ingrijitor("vasile",23,"panda");
		Ingrijitor dorel=new Ingrijitor("dorel",33,"delfini");
		Ingrijitor maricica=new Ingrijitor("maricica",53,"pinguini");

		Animal[] vector=new Animal[3] ;
		UrsuletulPanda panda=new UrsuletulPanda(vasile,"Matei","alb cu negru",2,0);
		Delfin delfin =new Delfin(dorel,"Nemo","albastru",3,0);
		Pinguin pingu=new Pinguin(maricica,"Rece","alb",5,0);
		vector[0]=panda;
		vector[1]=delfin;
		vector[2]=pingu;
		//System.out.println(vector[0].toString());
		
		Ingrijitor[] vi=new Ingrijitor[3];
		vi[0]=vasile;
		vi[1]=dorel;
		vi[2]=maricica;
		GradinaZoo gradina=new GradinaZoo(nume,nrAnimale,vector);
		System.out.println(gradina.toString());
		for(int y=0;y<3;y++)
			System.out.println(vi[y].toString());
		panda.doarmeOre(13);
		delfin.innoataKm(20);
		pingu.mergenPasi(4000);
		System.out.println(panda.toString());
		System.out.println(delfin.toString());
		System.out.println(pingu.toString());
		
		myObj.close();
		
	}

}
