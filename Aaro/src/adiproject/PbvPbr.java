package adiproject;

public class PbvPbr {

	public static void main(String[] args) { 
		 Laddu laddu=new Laddu(); 
		 laddu.size=20; 
		 
		 System.out.println("Size of laddu before PBV..:"+laddu.size);
		 
		 new PBV().accept(laddu.size); 
		 
		 System.out.println("Size of laddu after PBV..:"+laddu.size); 		 
		 System.out.println("Size of laddu before PBR..:"+laddu.size);
		 
		 
		 new PBR().accept(laddu); 
		 
		 System.out.println("Size of laddu after PBR...:"+laddu.size);
		 }

}

class PBV {
	public void accept(int size) {
		size = size - 5;
		System.out.println(size);
	}
}

class PBR {
	public void accept(Laddu laddu) {
		laddu.size = laddu.size - 10;
		System.out.println(laddu.size);
	}
}

class Laddu {
	int size;
}
