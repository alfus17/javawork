package test;
public class test1 implements SoundPlayer {

	public static void main(String[] args) {
		test1 ts = new test1();
		
		ts.play();
	}

	@Override
	public void play() {
		System.out.println("play mp3");
		
	}

}
