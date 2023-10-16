package controllers;

import views.LoginPnl;
import views.StartFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {
    StartFrame sf;
    boolean isEyeEnabled=false;
    public Control(){
        sf = new StartFrame(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "SEE_PASSWORD":    managePasswordButton();
        }
    }
    private void managePasswordButton(){
        LoginPnl log_in=sf.getLoginPnl();
        if(!isEyeEnabled){
            isEyeEnabled=true;
            log_in.getEyeButton().setIcon(
                    new ImageIcon(getClass()
                            .getResource("/assets/eye.png")));
            sf.getLoginPnl().getPassword().setEchoChar((char)0);
        }else  {
            isEyeEnabled=false;
            log_in.getEyeButton().setIcon(
                    new ImageIcon(getClass()
                            .getResource("/assets/eye-off.png")));
            sf.getLoginPnl().getPassword().setEchoChar('*');
        }
    }
}
