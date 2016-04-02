import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
//		PlayerInfo pi = new PlayerInfo(34, 58);
//		
//		Serializer s = new Serializer();
//		s.serialize(pi);
		
		PlayerInfo pi;
		Serializer s = new Serializer();
		pi = s.deserialize();
		
		System.out.println(pi.getHunger());
	}
}
