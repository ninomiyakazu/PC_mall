package chap19;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.mail.search.SentDateTerm;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;





public class Exercise19_3 {

	public static void main(String[] args) {
	  JFrame frame = new JFrame("덧셈 프로그램");
	  frame.setPreferredSize(new Dimension(250, 120));
	  
	  
	  Container contentPane = frame.getContentPane();
	  FlowLayout Layout = new FlowLayout();
	  contentPane.setLayout(Layout);
	  
	  JTextField text1 = new JTextField(5);
	  JTextField text2 = new JTextField(5);
	  JTextField text3 = new JTextField(5);
	  JButton okBtn = new JButton("확인");
	  JButton cancelBtn = new JButton("취소");
	  
	  okBtn.addActionListener(new Exercise19_3_Listener(text1, text2, text3));
	  cancelBtn.addActionListener(new Exercise19_3_Listener(text1, text2, text3));
	  
	  
	  
	   contentPane.add(new JTextField(5));
	  contentPane.add(new JLabel("+"));
	  contentPane.add(new JTextField(5));
	  contentPane.add(new JLabel("="));
	  contentPane.add(new JTextField(5));
	  contentPane.add(new JButton("확인"));
	  contentPane.add(new JButton("취소"));
	  
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.pack();
	  frame.setVisible(true);
      frame.setLocationRelativeTo(null);  //화면 정중앙 배치 
	}

}
