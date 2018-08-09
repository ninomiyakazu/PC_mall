package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 
public class LoginView extends JFrame{
    private MainProcess main;
    private TestFrm testFrm;
   
    private JButton btnLogin;
    private JButton btnInit;
    private JPasswordField passText;
    private JTextField userText;
    private boolean bLoginCheck;
   
    public static void main(String[] args) {
        //new LoginView();
    }
 
    public LoginView() {
        // setting
        setTitle("주소록 관리 프로그램");
        setSize(280, 150);
        setResizable(false);
        setLocation(900, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        JPanel panel = new JPanel();
        placeLoginPanel(panel);
       
       
        // add
        add(panel);
       
        // visiible
        setVisible(true);
    }
   
    public void placeLoginPanel(JPanel panel){
        panel.setLayout(null);     
        JLabel userLabel = new JLabel("사용자");
        userLabel.setBounds(10, 10, 80, 25);
        panel.add(userLabel);
       
        JLabel passLabel = new JLabel("비밀번호");
        passLabel.setBounds(10, 40, 80, 25);
        panel.add(passLabel);
       
        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        panel.add(userText);
       
        passText = new JPasswordField(20);
        passText.setBounds(100, 40, 160, 25);
        panel.add(passText);
        passText.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                  
            }
        });
       
        btnInit = new JButton("리셋");
        btnInit.setBounds(10, 80, 100, 25);
        panel.add(btnInit);
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });
       
        btnLogin = new JButton("로그인");
        btnLogin.setBounds(160, 80, 100, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isLoginCheck();
            }
        });
    }
   
    public void isLoginCheck(){
        if(userText.getText().equals("kosea") && new String(passText.getPassword()).equals("kosea1234")){
            JOptionPane.showMessageDialog(null, "로그인에 성공했습니다");
            bLoginCheck = true;
           
            // 로그인 성공이라면 매니져창 뛰우기
            if(isLogin()){
            	
            new TestFrm();
              
            }                  
        }else{
            JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.");
        }
    }
 
   
    // mainProcess와 연동
    public void setMain(MainProcess main) {
        this.main = main;
    }
   
 
    public boolean isLogin() {     
        return bLoginCheck;
    }
 
}
 

