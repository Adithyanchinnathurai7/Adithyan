package adiproject;

import fullinheritance.acsmodfr;

public class difpacknonsub
{

	public void met() {
	acsmodfr dd=new acsmodfr();
	//System.out.println(dd.pri);
	//System.out.println(dd.nomod);
	// System.out.println(dd.pro);
	System.out.println(dd.pub);
	}
}
class difpksub extends  acsmodfr 
{
	public void met() {
	
	//	System.out.println(pri);
	//	System.out.println(nomod);
		System.out.println(pro);
		System.out.println(pub);
		}
}


