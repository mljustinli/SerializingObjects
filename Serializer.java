import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer {
	public static String FOLDER = "Player";
	public static String PLAYER_SAVE_FILE = "PlayerInfo.txt";
	
	public void serialize(PlayerInfo pi) throws IOException {
		File f1 = new File ("Player");
		f1.mkdir();
		File f = new File(FOLDER + "/" + PLAYER_SAVE_FILE);
		if (!f.exists()) {
//			f.mkdir();
			f.createNewFile();
		}
		
		try {
			FileOutputStream fout = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(pi);
			oos.close();
			System.out.println("Done");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public PlayerInfo deserialize() {
		PlayerInfo pi;
		try {
			FileInputStream fin = new FileInputStream(FOLDER + "/" + PLAYER_SAVE_FILE);
			ObjectInputStream ois = new ObjectInputStream(fin);
			pi = (PlayerInfo)ois.readObject();
			ois.close();
			return pi;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
}
