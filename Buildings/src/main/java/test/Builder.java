package test;


public class Builder {

	public static void main(String[] args) 
	{
		Computer com=new Computer.ComputerBuilder("500gb","2gb","64Mp")
				.setGraphicsCardEnabled(true)
				.setBluetoothEnabled(false)
				.setWifi(true)
				.innermet();
		System.out.println(com.getHdd());
		System.out.println(com.getRam());
		System.out.println(com.getCamera());
		System.out.println(com.isGraphicsCardEnabled());
		System.out.println(com.isBluetoothEnabled());
		System.out.println(com.isWifi());

	}

}
class Computer
{
	private String Ram;
	private String Hdd;
	private String Camera;
	private boolean GraphicsCardEnabled;
	private boolean BluetoothEnabled;
	private boolean Wifi;
	
	
	public String getRam() {
		return Ram;
		
	}
	public String getHdd() {
		return Hdd;
	}
	public String getCamera() {
		return Camera;
	}
		
	public boolean isGraphicsCardEnabled() {
		return GraphicsCardEnabled;
		
	}
	public boolean isBluetoothEnabled()
	{
		return BluetoothEnabled;
	}
	public boolean isWifi() {
		return Wifi;
	}
	
	private Computer(ComputerBuilder builder) {
		
		this.Ram=builder.Ramm;
		this.Hdd=builder.Hddd;
		this.Camera=builder.Cameraa;
		
		this.GraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.BluetoothEnabled=builder.isBluetoothEnabled;
		this.Wifi=builder.isWifi;
	}
	
	public static class ComputerBuilder 
	{
		private String Ramm;
		private String Hddd;
		private String Cameraa;
		
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		private boolean isWifi;
		
		
		
		
		public  ComputerBuilder(String r,String h,String c) {
			this.Ramm=r;
			this.Hddd=h;
			this.Cameraa=c;
			
			
		} 
		public ComputerBuilder setGraphicsCardEnabled(boolean g) {
			this.isGraphicsCardEnabled=g;
			return this;
		}
		public  ComputerBuilder setBluetoothEnabled(boolean b) {
			this.isBluetoothEnabled=b;
			return this;
		}
		public ComputerBuilder setWifi(boolean w) {
			this.isWifi=w;
			return this;
			
		}
		public Computer innermet()
		{
			return new Computer(this);
		}
		
	}
}