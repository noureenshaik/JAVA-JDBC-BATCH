import java.util.ArrayList;
import java.util.Collections;

public class Sports implements Comparable<Sports>{

	String name;
	int rank;
	public Sports(String name, int rank) {
		super();
		this.name = name;
		this.rank = rank;
	}
	public String getName() {
		return name;
	}
	public int getRank() {
		return rank;
	}
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Sports o) {
		if(rank<o.rank) {
			return -1;
		}else if(rank>o.rank) {
			return 1;
		}else
		
		return 0;
	}
	
}
class mainnn{
	public static void main(String [] args) {
		ArrayList<Sports> list=new ArrayList<>();
		list.add(new Sports("Soccer",1));
		list.add(new Sports("Hockey",5));
		list.add(new Sports("nba",2));
		
		for(Sports s:list) {
			System.out.println(s.rank+" "+s.name);
		}
		Collections.sort(list);
		for(Sports s:list) {
			System.out.println(s.rank+"  "+s.name);
		}
	}
}
