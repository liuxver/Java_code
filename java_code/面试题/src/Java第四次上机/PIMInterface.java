package Java���Ĵ��ϻ�;
//package Java�������ϻ�;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
*
*author:liuxv
*student_number:15130120185
*email:liuxver444@gmail.com
*email1:1369058574@qq.com
*/
public interface PIMInterface {

	public List<PIMEntity> getNotes();

	public List<PIMEntity> getTodos();

	public List<PIMEntity> getAppointments();


	public List<PIMEntity> getContact();


	public List<PIMEntity> getItemsForDate(Date d);


	
}
