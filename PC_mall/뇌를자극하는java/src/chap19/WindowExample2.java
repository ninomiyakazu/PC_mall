package chap19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Administrator
 *
 */
public class WindowExample2 {

	public static void main(String[] args) {
	
		JFrame jframe = new JFrame("Hello Program");
		jframe.setPreferredSize(new Dimension(250, 350));
		//jframe.setLocation(500, 400);
		
		ImageIcon image = new ImageIcon("images/fda.jpg");
		JLabel imageLabel = new JLabel(image);
		
		Container container = jframe.getContentPane();
		
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		JLabel label = new JLabel("Hello");
		
		container.add(text, BorderLayout.CENTER);
		container.add(button, BorderLayout.EAST);
		container.add(text, BorderLayout.SOUTH);
	//	container.add(imageLabel, BorderLayout.NORTH);
		
		ActionListener listener = new ConfirmButtonActionListener(text, label);
		
		button.addActionListener(listener);
				
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.pack();
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null); 

	}

}