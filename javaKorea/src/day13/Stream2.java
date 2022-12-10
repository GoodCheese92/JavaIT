package day13;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Stream2 {
	public static void main(String[] args) {
		FileCtrl fc = new FileCtrl();
		// int result = fc.makeFile("C:\\java");
		// System.out.println(result);
		
		fc.delFile("C:\\java");
		
	}
}

class FileCtrl {
	// 파일 만들기
	public int makeFile(String path) {			// 생성에 실패하면 0, 성공하면 1을 반환
		int isSuccess = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 파일 이름을 입력하세요(확장자까지)>>");
		String filename = sc.nextLine();
		File file = new File(path+"\\"+filename);
		
		if(file.exists()) {
			System.out.println("이미 존재하는 파일입니다.");
			return -1;
		}
		
		try {
			file.createNewFile();
			isSuccess = 1;
		} catch (IOException e) {
			e.printStackTrace();		// 콘솔 창에 오류내역을 적어줌
			return 0;
		} finally {
			sc.close();
			// try : 시도하고자하는 코드
			// catch : try 안에서 오류가 나면 수행할 코드
			// finally : try 또는 catch가 끝나면 수행할 코드
		}
		
		if(file.exists()) {
			System.out.println("파일 생성 완료!");
		}
		
		return isSuccess;
	}
	
	// 파일 삭제하기
	public int delFile(String path) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 파일 이름을 입력하세요(확장자까지)>>");
		String filename = sc.nextLine();
		File file = new File(path+"\\"+filename);
		
		boolean isDeleted = file.delete();
		sc.close();
		if(isDeleted) {
			System.out.println("삭제 성공!");
			return 1;
		} else {
			System.out.println("삭제 실패...");
			return 0;
		}
	}
}