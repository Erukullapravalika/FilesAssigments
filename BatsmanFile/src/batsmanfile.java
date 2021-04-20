import java.io.File;
import java.io.IOException;

public class batsmanfile {
	public static void main(String[] args) {
		File file=new File("batsman.dat");
		try {
			boolean status=file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


}
