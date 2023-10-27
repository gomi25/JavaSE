package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * InputStream / OutputStream
 * 	바이트(byte) 기반 입력과 출력을 다루는 추상클래스이다.
 *  
 * FileInputStream
 * 	파일을 byte 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 	파일을 byte 단위로 순차적으로 쓰는 객체
 * 
 */
public class IO04 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// 객체 생성
			fis = new FileInputStream("./upload/hello.txt");
		
			File f1 = new File("./upload2");
			if(f1.mkdir()) {
				System.out.println("upload2 디렉토리 생성되었습니다.");
			}
			
			// hello2.txt 파일이 없으면 생성해준다
			// 단 디렉토리 생성은 하지 않는다. 그래서 위에서 디렉토리를 생성해주었음.
			fos = new FileOutputStream("./upload2/hello2.txt");
			
			int readByteCnt = 0;
			byte[] b = new byte[1024];	// 1024 크기의 byte 배열 만듬
			
			// (readByteCnt = fis.read(b)) != -1
			// 	read라는 메서드가 1024 크기만큼 데이터를 읽고 몇바이트를 읽었는지 정수로 리턴
			// 	읽을 데이터가 없으면 -1 반환
			while((readByteCnt = fis.read(b)) != -1) {
				fos.write(b, 0, readByteCnt);	//	읽은 거 다 적으라는 뜻
			}

			System.out.println("파일 복사 완료!");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();	// close() 잘 시켜주기
				if(fis != null) fis.close();	// close() 잘 시켜주기
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}
