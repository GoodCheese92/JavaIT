package day13;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Socket1 {
	public static void main(String[] args) {
		// 소켓 : 프로그램 간 메시지 주고받기
		MyServer ms = new MyServer();
		//MyClient mc = new MyClient();
		
		// 소켓통신을 하려면 같은 네트워크를 사용해야 함
		// 여러군데서 접속을 하게 하려면 클라우드 또는 웹호스팅을 해야함
		
		// ip : 192.168.3.20  // cmd 창에 ipconfig 
		// port : 13000
		ms.go(21000);		// 서버를 13000번으로 실행
		// mc.go("192.168.3.13", 19000);
		
	}
}


//  TCP/IP 통신을 Socket으로 진행
class MyServer {
	// 들어오는 메시지 (수신)
	InputStream is;
	ObjectInputStream ois;
	// 나가는 메시지 (송신)
	OutputStream os;
	ObjectOutputStream oos;
	// 서버로 설정
	ServerSocket serverSocket;
	// 메시지를 직접적으로 처리할 소켓을 추가생성
	Socket socket;
	String msg;
	
	public void go(int port) {		// 서버는 컴퓨터의 IP와 설정한 PORT로 연결을 시작
		// 문을 연다
		try {
			serverSocket = new ServerSocket(port);
			// 수신 대기
			while(true) {
				System.out.println("수신 대기 중");
				socket = serverSocket.accept();		// 누군가 들어올 때까지 대기상태
				System.out.println("접속IP : "+socket.getInetAddress());
				
				// 누군가 접속해서 메시지를 보내면
				is = socket.getInputStream();
				ois = new ObjectInputStream(is);
				
				os = socket.getOutputStream();
				oos = new ObjectOutputStream(os);
				
				// 메시지 수신 완료
				msg = (String)ois.readObject();
				System.out.println("클라이언트 : "+msg);
				
				String respond = "서버가 준 메시지 : " + msg;
				oos.writeObject(respond);			// 클라이언트로 백
				
				// socket.close();			// 연결을 종료한다.
			}
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}
}

class MyClient {
	// 들어오는 메시지 (수신)
	InputStream is;
	ObjectInputStream ois;
	// 나가는 메시지 (송신)
	OutputStream os;
	ObjectOutputStream oos;
	
	// 메시지를 직접적으로 처리할 소켓을 추가생성
	Socket socket;
	String msg;
	Scanner sc = new Scanner(System.in);		// 콘솔 입력을 위해(임시)
	
	public void go(String ip, int port) {
		try {
			socket = new Socket(ip, port);		// 서버에 접속
			// 메시지를 내보낼 준비 (송신준비)
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
			
			// 받을 준비 (수신준비)
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			
			// 소켓 통신
			System.out.print("보낼 메시지>>");
			msg = sc.nextLine();
			oos.writeObject(msg);			// 메시지 송신
			
			String respond = (String)ois.readObject();		// 메시지 수신 완료
			System.out.println("서버 응답 : "+respond);
			
			socket.close();		// 소켓 연결을 끊는다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}