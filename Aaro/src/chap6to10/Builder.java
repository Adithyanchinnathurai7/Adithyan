package chap6to10;

public class Builder {
	
	public static void main(String[] args) {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB",true).setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
	
	}
}

class Computer {

	// required parameters
	private String HDD;
	private String RAM;
	private boolean j;


	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	
	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}
	
	public boolean getJ() {
		return j;
	}
	

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	
	}

	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.j=builder.j;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	// Builder Class
	public static class ComputerBuilder {
		// required parameters
		private String HDD;
		private String RAM;
		private boolean j;
		
		// optional parameters

		private boolean isBluetoothEnabled;
		private boolean isGraphicsCardEnabled;

		public ComputerBuilder(String hdd, String ram,boolean y) {
			this.HDD = hdd;
			this.RAM = ram;
			this.j=y;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;

			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
	
		public Computer build() {
			return new Computer(this);	
		}
		
		
	}
}
