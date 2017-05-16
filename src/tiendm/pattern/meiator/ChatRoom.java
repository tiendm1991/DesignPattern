package tiendm.pattern.meiator;

import java.util.Date;

public class ChatRoom {
	public static void showMessage(User user, String mess){
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + mess);
	}
	
}
