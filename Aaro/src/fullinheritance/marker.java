package fullinheritance;

public class marker {

			public static void main(String[] args) {
				CorporationIDCard ourstudents=new CorpStudent();
				ConventIDCard students2=new ConventStudent();
				
				marker camp=new marker();
				camp.luxuryRoom(students2);
				camp.ordinaryRoom(ourstudents);
				camp.mess((ConventIDCard)ourstudents);
			}
			
			public void luxuryRoom(ConventIDCard cid) {
				
			}
			public void ordinaryRoom(CorporationIDCard cic) {
				
			}
			public void mess(ConventIDCard cid) {
				
			}
		}
		interface CorporationIDCard{
			
		}
		interface ConventIDCard{
			
		}
		class CorpStudent implements CorporationIDCard,ConventIDCard{
			
		}
		class ConventStudent implements ConventIDCard{
			
		}

	


