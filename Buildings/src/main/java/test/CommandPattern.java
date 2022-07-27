package test;



public class CommandPattern {

	public static void main(String[] args) 
	{
		UniversalRemote.useRemote();
	}

}

class UniversalRemote {
	public static void useRemote() {
		Tv tv = new Tv();
		SetTopBox setTopBox = new SetTopBox();
		NetFlix netFlix = new NetFlix();
		SoundSystem soundSystem = new SoundSystem();

		FatherNewsChannel fncc = new FatherNewsChannel(tv, setTopBox, soundSystem, netFlix);

		MotherOldMovie mod = new MotherOldMovie(tv, setTopBox, soundSystem, netFlix);

		MotherSerial msc = new MotherSerial(tv, setTopBox, soundSystem, netFlix);
		
		Remote universalRemote = new Remote();
		universalRemote.executeCommand(3);
		universalRemote.setCommand(fncc, 3);
		universalRemote.setCommand(mod, 2);
		universalRemote.setCommand(msc, 1);
		
		System.out.println("");
		universalRemote.executeCommand(3);
	}
}

class Tv {
	public void av1() {
		System.out.println("tv switched to av1 mode...");
	}

	public void switchOn() {
		System.out.println("tv switched on....");
	}
}

class SetTopBox {
	public void newsChannel() {
		System.out.println("news channel started.....");
	}

	public void serialChannel() {
		System.out.println("serial channel started.....");
	}
}

class NetFlix {
	public void movieOld() {
		System.out.println("old movie started....");
	}

}

class SoundSystem {
	public void lowSound() {
		System.out.println("sound volume....decreased....");
	}
}

interface Command {
	public void execute();

}

class FatherNewsChannel implements Command {
	Tv tv;
	SetTopBox setTopBox;
	SoundSystem soundSystem;
	NetFlix netFlix;

	public FatherNewsChannel(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;

	}

	@Override
	public void execute() {
		System.out.println("Father Tv action started");
		tv.switchOn();
		tv.av1();
		setTopBox.newsChannel();
		soundSystem.lowSound();
		System.out.println("appa seeing news....");
	}
}

	class MotherOldMovie implements Command {
		Tv tv;
		SetTopBox setTopBox;
		SoundSystem soundSystem;
		NetFlix netFlix;

		public MotherOldMovie(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
			this.tv = tv;
			this.setTopBox = setTopBox;
			this.soundSystem = soundSystem;
			this.netFlix = netFlix;
		}

		@Override
		public void execute() {
			System.out.println("Amma Tv action started");
			tv.switchOn();
			tv.av1();
			netFlix.movieOld();
			soundSystem.lowSound();
			System.out.println("Amma  seeing oldmovie....");

		}

	}

	class MotherSerial implements Command {
		Tv tv;
		SetTopBox setTopBox;
		SoundSystem soundSystem;
		NetFlix netFlix;

		public MotherSerial(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
			this.tv = tv;
			this.setTopBox = setTopBox;
			this.soundSystem = soundSystem;
			this.netFlix = netFlix;
		}

		@Override
		public void execute() {
			System.out.println("mother serial command started....");
			tv.switchOn();
			tv.av1();
			setTopBox.serialChannel();
			System.out.println("enjoy the serial mom..........");

		}
	}

	class DummyCommand implements Command {
		@Override
		public void execute() {

		}
	}

	class Remote {
		Command command[] = new Command[5];

		public Remote() {
			for (int i = 0; i < command.length; i++) {
				command[i] = new DummyCommand();
			}

		}

		public void setCommand(Command command, int slot) {
			this.command[slot] = command;
		}

		public void executeCommand(int slot) {
			command[slot].execute();
		}
	}

