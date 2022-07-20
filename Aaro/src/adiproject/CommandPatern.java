package adiproject;

public class CommandPatern {

	public static void main(String[] args) {
		universalRemote.useRemote();

	}

}

class universalRemote {
	public static void useRemote() {
		System.out.println("Demonstration of Remote");

		Tv tv = new Tv();
		SetTopBox setTopBox = new SetTopBox();
		NetFlix netFlix = new NetFlix();
		SoundSystem soundSystem = new SoundSystem();

		FatherNewsChannelCommand fncc = new FatherNewsChannelCommand(tv, setTopBox, soundSystem, netFlix);
		MotherOldMovieCommand msc = new MotherOldMovieCommand(tv, setTopBox, soundSystem, netFlix);
		MotherSerialCommand momc = new MotherSerialCommand(tv, setTopBox, soundSystem, netFlix);

		Remote universalRemote = new Remote();
		universalRemote.executeCommand(1);
		universalRemote.setCommand(fncc, 0);
		universalRemote.setCommand(momc, 1);
		universalRemote.setCommand(msc, 2);

		System.out.println("My Father Wants to see news channel...");
		universalRemote.executeCommand(0);
	}
}

class Tv {
	public void switchOn() {
		System.out.println("tv switched on....");
	}

	public void av1() {
		System.out.println("tv switched to av1 mode");
	}

}

class SetTopBox {
	public void newsChannel() {
		System.out.println("news channel start...");
	}

	public void serialChannel() {
		System.out.println("serial channel started");
	}
}

class NetFlix {
	public void movieOld() {
		System.out.println("old movie started..");
	}

}

class SoundSystem {
	public void lowSound() {
		System.out.println("sound volume....decreased..");
	}
}

interface Commandss {
	public void execute();
}

class FatherNewsChannelCommand implements Commandss {
	Tv tv;
	SetTopBox setTopBox;
	SoundSystem soundSystem;
	NetFlix netFlix;

	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
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
		System.out.println("dad enjay your news channel...");

	}
}

class MotherOldMovieCommand implements Commandss {

	Tv tv;
	SetTopBox setTopBox;
	SoundSystem soundSystem;
	NetFlix netFlix;

	public MotherOldMovieCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {

		System.out.println("mother old movie commmand started");
		tv.switchOn();
		tv.av1();
		netFlix.movieOld();
		System.out.println("mom enjay the old movie mom...");
	}
}

class MotherSerialCommand implements Commandss {

	Tv tv;
	SetTopBox setTopBox;
	SoundSystem soundSystem;
	NetFlix netFlix;

	public MotherSerialCommand(Tv tv, SetTopBox setTopBox, SoundSystem soundSystem, NetFlix netFlix) {

		this.tv = tv;
		this.setTopBox = setTopBox;
		this.soundSystem = soundSystem;
		this.netFlix = netFlix;
	}

	@Override
	public void execute() {

		System.out.println("mother old movie commmand started");
		tv.switchOn();
		tv.av1();
		setTopBox.serialChannel();
		System.out.println("mom enjay the old movie mom...");
	}
}

class DummayCommand implements Commandss {
	@Override
	public void execute() {
		System.out.println(" I am a dummy button");
	}
}

class Remote {

	Commandss[] command = new Commandss[6];

	public Remote() {
		for (int i = 0; i < command.length; i++) {
			command[i] = new DummayCommand();
		}
	}

	public void setCommand(Commandss commandss, int slot) {
		this.command[slot] = commandss;
	}

	public void executeCommand(int slot) {
		command[slot].execute();
	}

}
