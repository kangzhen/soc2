import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class TestURL {

    Hello
	totutyt/**
     *
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		URL url=new URL("http://news.163.com");
		InputStream in=url.openStream();
		OutputStream out=new FileOutputStream(new File("d://163news.html"));
		byte[] b=new byte[1024];
		while(in.read(b)!=-1);
		{
			out.write(b);
			
		}
		
		in.close();
		out.close();
			
		
	}

}
