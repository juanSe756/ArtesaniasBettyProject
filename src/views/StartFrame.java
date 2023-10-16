package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame {
    BackgroundPnl bgPanel = new BackgroundPnl();
    LoginPnl loginPnl;
    public StartFrame(ActionListener a){
        setTitle("Artesanias Betty");
        setLayout(new GridBagLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize((int) screenSize.getWidth(), (int) screenSize.getHeight());
        System.out.println((int) screenSize.getWidth() +"---"+""+ (int) screenSize.getHeight());
        //imagen de fondo (?)
        //setContentPane(bgPanel);
        getContentPane().setBackground(new Color(85,55,57));

        initComponents(a);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    private void initComponents(ActionListener a){
        loginPnl=new LoginPnl(a);
        //add(new JPanel());
        //add(loginPnl);
        //add(new JPanel());
        GridBagConstraints gbc = new GridBagConstraints();
        //gbc.weightx=GridBagConstraints.HORIZONTAL;
        //gbc.weighty=GridBagConstraints.NORTH;
        //gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        gbc.insets.set(0,0,0,0);
        gbc.ipady=0;
        gbc.ipadx=0;
        gbc.gridx=0;
        gbc.gridy=0;
        getContentPane().add(loginPnl,gbc);
    }
    public LoginPnl getLoginPnl() {
        return loginPnl;
    }
}
