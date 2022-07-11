package adiproject;

public class SevaiDemo {

	public static void main(String[] args) {

		SevaiMaiyam sevai=new SevaiMaiyam();
		sevai.executeCommand(4);
		
		Corporation corporation=new Corporation();
		Health health=new Health();
		Police police=new Police();
		
		Command deathCommand=new DeathCertificateCommand(corporation,health,police);
		
		sevai.setCommand(deathCommand, 4);
		
		sevai.executeCommand(4);
		
	}
	}
	final class Health{
		public void doPostMortem() {
			System.out.println("post mortem done...");
		}
	}
	final class Police{
		public void doInvestigation() {
			System.out.println("police investigation done...");
		}
	}
	final class Corporation{
		public void deathCertificate() {
			System.out.println("death certificate given...");
		}
	}
	class SevaiMaiyam{
		Command[] command=new Command[0];
		public SevaiMaiyam() {
			for(int i=0;i<command.length;i++) {
				command[i]=new DummyCommand();
			}
		}
		public void setCommand(Command command, int slot) {
			this.command[slot]=command;
		}
		public void executeCommand(int slot) {

		}
	}
	interface Command{
		public void execute();
	}
	class DummyCommand implements Command{
		@Override
		public void execute() {
			System.out.println("I am dummy I am yet to be operational...");
		}
	}
	class DeathCertificateCommand implements Command{
		Corporation corporation;
		Health health;
		Police police;
		
		public DeathCertificateCommand() {
			// TODO Auto-generated constructor stub
		}
		public DeathCertificateCommand(Corporation corporation,Health health,Police police) {
			this.corporation=corporation;
			this.health=health;
			this.police=police;
		}
		@Override
		public void execute() {
			System.out.println("death certificate process started...");
			health.doPostMortem();
			police.doInvestigation();
			corporation.deathCertificate();
			System.out.println("Take the death certificate....");		
		}

}
