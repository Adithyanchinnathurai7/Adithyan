package adiproject;
public class Builder {

	public static void main(String[] args) 
	{
		Computer com=new Computer.ComputerBuilder("qqq", "hgfyu").build();
		System.out.println();
		
		
		
	
	

}

class Computer
{
	private String HDD;
	private String RAM;
//	
//	private boolean isGraphicsCardEnabled;
//	private boolean isBluetoothEnabled;
//	
	public String getHDD() 
	{
		return HDD;
	}
	public String getRAM() 
	{
		return RAM;
	}
//	public boolean isGraphicsCardEnabled() 
//	{
//		return isGraphicsCardEnabled;
//	}
//	public boolean  isBluetoothEnabled()
//	{
//		return isBluetoothEnabled;
//	}
	private Computer(ComputerBuilder builds) 
	{
		this.HDD = builds.HDD;
		this.RAM = builds.RAM;
	}
	
		
	
	
	public static class ComputerBuilder
	{
		private String HDD;
		private String RAM;
//		
//		private boolean isGraphicsCardEnabled;
//		private boolean isBluetoothEnabled;
//		
		public  ComputerBuilder(String hdd,String ram) 
		{
			this.HDD = hdd;
			this.RAM = ram;
		}
		public Computer build()
		{
			return new Computer(this);
		}
	}
}


