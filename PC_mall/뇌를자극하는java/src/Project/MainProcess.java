package Project;

public class MainProcess {
	LoginView loginView;
	MenuJTabaleExam menuJTabaleExam;
	
	public MainProcess() {
		System.out.println(" MainProcess() 생성자");
	}
	
	// 테스트프레임창
    public void showFrameTest1(){
    	System.out.println("MainProcess.showFrameTest();");
    	
        loginView.dispose();   // 로그인창닫기
        
        this.menuJTabaleExam = new MenuJTabaleExam(); 
       
    }	
	
	
	public static void main(String[] args) {
		
		System.out.println( "MainProcess.main() 메소드");
	
		
		//메인 클래스 실행
		MainProcess main = new MainProcess();
		main.loginView = new LoginView();
		main.loginView.setMain(main);
	}
 public void showFrameTest() {
	 loginView.dispose();

	 
 }
}
