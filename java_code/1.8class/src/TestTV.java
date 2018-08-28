public class TestTV {
	public static void main(String[] args){
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		TV tv2=new TV();
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelUp();
		tv2.volumeUp();
		
		System.out.println("tv1's channel is "+tv1.getChannel()+" and volue level is "+tv1.getVolumeLevel());
		System.out.println("tv2's channel is "+tv2.getChannel()+" and volue level is "+tv2.getVolumeLevel());
		
		System.out.println();
		System.out.println("tv3's chanal is "+new TV().getChannel());
		
	}
}
