package khd;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker{     //최상위의 Speaker를 interface로 구현하고 implements 함	
	public SonySpeaker() {
		System.out.println("==> SonySpeaker 객체 생성");
	}
	
	public void volumeUp () {  							//volumnUp 메소드 생성
		System.out.println("SonySpeaker---소리를 올린다.");
	}
	
	public void volumeDown () {  					   //volumnDown 메소드 생성
		System.out.println("SonySpeaker---소리를 내린다.");
	}

}
