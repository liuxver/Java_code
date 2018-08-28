/**
 * @Description
 * @Author: XiongKai
 * @studentNo 15130120199
 * @Emailaddress 1249235131@qq.com
 */

package Java第四次上机;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;

class PIMTodo extends PIMEntity{
    String date,todoText;
    
	public void fromString(ArrayList<String> list){
		owner = list.get(0);
		sharedFlag = list.get(1);
        date=list.get(2);
        todoText=list.get(3);
        Priority=list.get(4);
    }
    public String toString() {
        return(" :TODO " + owner + " "+ sharedFlag + " " + Priority + " " + date + " " + todoText);
    }
    
    public Date getDate() throws Exception {
    	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    	return df.parse(date);
    }
}

