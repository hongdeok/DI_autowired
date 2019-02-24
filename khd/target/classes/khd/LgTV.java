package khd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;

	public LgTV() {
		System.out.println("===> LG TV 객체 생성");	
	}
	public void powerOn() {
		System.out.println("LG TV---전원을 켠다.");
	}	
	public void powerOff() {
		System.out.println("LG TV---전원을 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}	
}
