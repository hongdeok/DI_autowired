package khd;

public class AppleSpeaker implements Speaker {	
	public AppleSpeaker() {
		System.out.println("==> AppleSpeaker 객체 생성");
	}
	
	public void volumeUp () {  							//volumnUp 메소드 생성
		System.out.println("AppleSpeaker---소리를 올린다.");
	}
	
	public void volumeDown () {  					   //volumnDown 메소드 생성
		System.out.println("AppleSpeaker---소리를 내린다.");
	}
}
