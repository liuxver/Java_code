
public class FinallyDemo {
	public static void main(String[] args){
	java.io.PrintWriter output=null; //��ʼ���ļ�����
	
	try{
		output=new java.io.PrintWriter("txst.txt");//�����ļ�
		output.println("welcome to liuxv and wuyue ");//д������
	}
	catch(java.io.IOException ex){
		ex.printStackTrace();
	}
	
	finally{
		if(output!=null)
			output.close();
	}
	
	System.out.println("End of pragram.");
	}
}
