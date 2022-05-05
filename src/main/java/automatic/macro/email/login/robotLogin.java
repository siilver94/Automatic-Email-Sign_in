import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.*;

public class RobotDemo {
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		String exeFile =  ""; // 실행할 파일 위치
		Process p;
		
		int URLaddress[] = {

				KeyEvent.VK_D,
				KeyEvent.VK_A,
				KeyEvent.VK_U,
				KeyEvent.VK_M,
				KeyEvent.VK_PERIOD, // . 온점
				KeyEvent.VK_N,
				KeyEvent.VK_E,
				KeyEvent.VK_T,
				KeyEvent.VK_ENTER

		};

		int ID[] = {
				KeyEvent.VK_S,
				KeyEvent.VK_I,
				KeyEvent.VK_L,
				KeyEvent.VK_V,
				KeyEvent.VK_E,
				KeyEvent.VK_R,
				//KeyEvent.VK_UNDERSCORE,
				KeyEvent.VK_9,
				KeyEvent.VK_4
		};

		int PW[] = {
				KeyEvent.VK_,
				KeyEvent.VK_,
				KeyEvent.VK_,
				KeyEvent.VK_,
				KeyEvent.VK_,
				KeyEvent.VK_,
				KeyEvent.VK_,
				KeyEvent.VK_
						
		};

		try {
			Robot robot = new Robot();
			p = rt.exec(exeFile); // 프로그램 실행
			p.waitFor();

			Thread.sleep(1000);
			 robot.mouseMove(412, 53); //주소창에 마우스 가져가서 클릭
			 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

			for (int i = 0; i < URLaddress.length; i++) { // naver.com 입력 후 엔터까지
				robot.keyPress(URLaddress[i]);
				robot.keyRelease(URLaddress[i]);
			}

		   	robot.delay(1000); // 페이지 로딩을 위해 딜레이 1초

			 robot.mouseMove(1302, 313); //naver.com 의 로그인 버튼
			 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

			robot.delay(1000); // 페이지 로딩을 위해 딜레이 1초

			 robot.mouseMove(697, 239); //ID 텍스트상자에 마우스 가져가기
			 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			robot.delay(1000); // 페이지 로딩을 위해 딜레이 1초

			for (int i = 0; i < ID.length; i++) { // ID 입력
				robot.keyPress(ID[i]);
				robot.keyRelease(ID[i]);
			}
			 robot.mouseMove(712, 297); //PW 텍스트상자에 마우스 가져가기
			 robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			 robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

			for (int i = 0; i < PW.length; i++) { // PW 입력
				robot.keyPress(PW[i]);
				robot.keyRelease(PW[i]);
			}

			robot.mouseMove(790, 390); //LOGIN 버튼 눌리기
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

			System.exit(0); // 시스템 종료

		} catch (AWTException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
