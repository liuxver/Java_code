import java.io.*;
public class TestObjectOutputStream {
	/**write a object to the file
	 * by use ObjectOutputStream
	 * @param args
	 * @throws IOException
	 */
    public static void main(String[] args) throws IOException{
    	/**use Buffered output create a buffer to prove the quality.
    	 * 
    	 */
    	ObjectOutputStream output=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("object.dat")));
    	
    	output.writeUTF("liuxv");
    	output.writeDouble(100.0);
    	output.writeObject(new java.util.Date());
    	
    	output.close();
    }
}
