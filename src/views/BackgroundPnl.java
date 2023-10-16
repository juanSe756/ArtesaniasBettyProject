package views;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class BackgroundPnl extends JPanel {
    private Image backgroundImage;
    private String path = "/assets/wood_bg2.jpg";
    public void paint(Graphics g){
        backgroundImage = new ImageIcon(getClass().getResource(path)).getImage();
        g.drawImage(backgroundImage,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
