import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;

public class ImageAudioAnimation extends JApplet {
	private final static int NUM=3;
	private int current=0;
	private ImageIcon[] icons=new ImageIcon[NUM];
	private AudioClip[] audioClips=new AudioClip[NUM];
	private AudioClip currentAudioClip;
	
	private int[] delays={3000,4000,5000};
	
	private Timer timer=new Timer(delays[0],new TimerListener());
	
	private JLabel jlblImageLabel=new JLabel();
	private JButton jbtResume=new JButton("Resume");
	private JButton jbtSuspend=new JButton("Suspend");
	private JComboBox jcboNations=new JComboBox(new Object[]{"liuxv","xiaomengmeng","wuyue"});
	
	public ImageAudioAnimation(){
		for(int i=0;i<NUM;i++){
			icons[i]=new ImageIcon(getClass().getResource("image/"+i+".gif"));
			audioClips[i]=Applet.newAudioClip(getClass().getResource("audio/"+i+".MP3"));
		}
		
		JPanel panel=new JPanel();
		panel.add(jbtResume);
		panel.add(jbtSuspend);
		panel.add(new Label("Select"));
		panel.add(jcboNations);
		add(jlblImageLabel,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		
		jbtResume.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				start();
			}
		});
		
		jbtSuspend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				stop();
			}
		});
		
		jcboNations.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				stop();
				current=jcboNations.getSelectedIndex();
				presentNation(current);
				timer.start();
			}
		});
		
		timer.start();
		jlblImageLabel.setIcon(icons[0]);
		jlblImageLabel.setHorizontalAlignment(JLabel.CENTER);
		currentAudioClip=audioClips[0];
		currentAudioClip.play();
		
		
	}
	
	private class TimerListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			current=(current+1)%NUM;
			presentNation(current);
		}
	}
	
	private void presentNation(int index){
		jlblImageLabel.setIcon(icons[index]);
		jcboNations.setSelectedIndex(index);
		currentAudioClip=audioClips[index];
		currentAudioClip.play();
		timer.setDelay(delays[index]);
	}
	
	public void start(){
		timer.start();
		currentAudioClip.play();
		
	}
	
	public void stop(){
		timer.stop();
		currentAudioClip.stop();
	}
	
	
	
	
}





















