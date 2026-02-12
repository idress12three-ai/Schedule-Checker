import java.util.ArrayList;

public class CanAttend {

	//precondition: the meetings arraylist is not null. and contains valid meeting intervals (starts is less than end).  
	//postcondition: returns true if there is a scedualing conflict metween meetings and false if there is no conflicts.
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		for ( int i=0 ; i< meetings.size(); i++){
			for (int j =i+1; j<meetings.size(); j++){
				int sOne= meetings.get(i).getStart();
				int eOne= meetings.get(i).getEnd();
				int sTwo= meetings.get(j).getStart();
				if (sTwo>sOne && sTwo< eOne){
					return true;
				}
			}
			
			
			
			
		}

		return false; //replace me with actual logic please!

	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		
		System.out.println(!canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
		//please include additional testing here!
		meet.clear();
		meet.add(new MeetingInterval(100, 200));
		meet.add(new MeetingInterval(250, 300));
		System.out.println(!canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
	}
}


