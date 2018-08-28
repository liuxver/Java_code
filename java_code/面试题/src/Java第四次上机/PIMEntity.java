/**
 * @Description
 * @Author: XiongKai
 * @studentNo 15130120199
 * @Emailaddress 1249235131@qq.com
 */

package Java第四次上机;

import java.util.ArrayList;

public abstract class PIMEntity {
    String Priority;
    String owner, sharedFlag;
    public PIMEntity(){
        Priority = "normal";
    }
    public PIMEntity(String priority){
        Priority = priority;
    }
    
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPriority() {
        return Priority;
    }
    public void setPriority(String p) {
        Priority = p;
    }
    
	abstract public void fromString(ArrayList<String> list);
    abstract public String toString();
	public void fromString(String s) {
		// TODO Auto-generated method stub
		
	}
}

