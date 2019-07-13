package dateFormat;
import java.util.Date;
import java.text.*;

public class SimpleDateFormat {

	
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getYear()+1900);
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(date));
		*/
	}

}
