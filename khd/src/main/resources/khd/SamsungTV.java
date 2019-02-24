package khd;

public class SamsungTV implements TV {	
	private Speaker speaker;   // speaker라는 멤버변수 변경(SonySpeaker --> Speaker)
	private int price;
	
	public SamsungTV() {		//기본 생성자
		System.out.println("==> SamsungTV(1) 객체 생성");
	}
	public void setSpeaker(Speaker speaker) {           //세터 인젝션
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}
	public void setPrice(int price) {				    //세터 인젝션
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}
	public void powerOn() {
		System.out.println("SamsungTV---전원을 켠다.(가격 : " + price + ")");
	}	
	public void powerOff() {
		System.out.println("SamsungTV---전원을 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}	
}
