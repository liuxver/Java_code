import javax.swing.*;
import java.net.URL;
import java.applet.*;
public class DisplayImagePlayAudio extends JApplet {
	private AudioClip audioClip;
	public DisplayImagePlayAudio(){
		URL urlForImage=getClass().getResource("b.gif");
		add(new JLabel(new ImageIcon(urlForImage)));
		
		URL urlForAudio=getClass().getResource("a.MP3");
		System.out.println(urlForAudio);
		audioClip=Applet.newAudioClip(urlForAudio);
		audioClip.play();
	}
	
	public void start(){
		if(audioClip!=null)
			audioClip.loop();
	}
	
	public void stop(){
		if(audioClip!=null)
			audioClip.stop();
	}
	
	
}
