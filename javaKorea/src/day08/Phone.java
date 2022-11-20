package day08;

public class Phone {
	public static void main(String[] args) {
		PhoneImpl pi = new PhoneImpl();
		pi.bigdata();
		pi.Net();
		pi.Msg();
		pi.Call();
		pi.speed();
	}
}

// Interface(선언만) -> InterfaceImpl(구현까지)
// Impl : 구현부
class PhoneImpl extends AbstractClass1{

	@Override
	public void Call() {
		// TODO Auto-generated method stub
		System.out.println("전화를 합니다.");
	}

	@Override
	public void Msg() {
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}

	@Override
	public void Net() {
		// TODO Auto-generated method stub
		System.out.println("인터넷을 합니다.");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("LTE 빠름");
	}
	
}