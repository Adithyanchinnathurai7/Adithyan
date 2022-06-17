package fullinheritance;

public class acsmodfr 
{

	private int pri;
	int nomod;
	protected int pro;
	public int pub;
	public void met()
	{
		System.out.println(pri);
		System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
	}

}
	/*class Smaepacknonsub
	{
		
		public void met() {
		acsmodfr dd=new acsmodfr();
		System.out.println(dd.pri);
		System.out.println(dd.nomod);
		System.out.println(dd.pro);
		System.out.println(dd.pub)
		}
	}*/
	class samepcksub extends acsmodfr
	{
		public void met() {
			
//			System.out.println(pri);
			System.out.println(nomod);
			System.out.println(pro);
			System.out.println(pub);
			}
	}
class Tdrr{
	public static void main(String[] args) {
		acsmodfr gh=new acsmodfr();
		gh.met();
		//gh.met1();
	}
}