package Project;

import javax.swing.JFrame;

public class TestFrm extends JFrame {
       public TestFrm() {
    	   
    	System.out.println("TestFrm()");
   		String[] args = {"GUI", "참가자 명단 프로그램"};
   		
   		new MenuJTabaleExam(); //생성자 호출
   		
   		new MenuJTabaleExam().main(args);
       }
}
