package com.company;

import javax.swing.*;
import java.awt.*;
        import java.awt.event.MouseEvent;
        import java.awt.event.MouseListener;
    
public class Panel extends JPanel implements MouseListener {
    public Panel(){
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon bia = new ImageIcon("src/obrazki/bialy.png");
        ImageIcon czar = new ImageIcon("src/obrazki/czarny.jpg");
        System.out.println(g.getClipBounds().width + " " + g.getClipBounds().height);
        // 299 x 299
        g.setColor(Color.blue);
        g.drawLine(0,0,639,479);
        g.setColor(Color.gray);
        for(int i=0; i< 32; i++){
            g.drawLine(i*20,0,i*20,479);
        }
        for(int i=0; i< 24; i++){
            g.drawLine(0,i*20,639,i*20);
        }
        g.setColor(Color.red);
        g.drawLine(320,0,320,479);
        g.drawLine(321,0,321,479);

        g.drawLine(320-10,20,320,0);
        g.drawLine(320+10, 20,320, 0 );
        g.drawLine(0, 240,640, 240 );
        g.drawLine(0, 241,641, 241 );
        g.drawLine(640, 240,620, 230 );
        g.drawLine(640, 240,620, 250 );




        for (int i=0; i<8; i++){
            for(int j=0;j<8; j++){
                if((i+j)%2==0){
                    g.drawImage(bia.getImage(), i*40, j*40, 40,40, null);
                }
                else{
                    g.drawImage(czar.getImage(), i*40,j*40, 40,40, null);

                }
            }
        }



    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getX() >=0 && e.getX() <=40)
            if(e.getY() >=0 && e.getY() <=40)
                System.out.println(e.getX() + " " + e.getY());

        if(e.getX() >=40 && e.getX() <=80)
            if(e.getY() >=0 && e.getY() <=40)
                System.out.println("WITAM!");

        int a = e.getX();
        int b = e.getY();
        getGraphics().drawLine(a - 10, b + 10, a + 10, b - 10);
        getGraphics().drawLine(a - 10, b - 10, a + 10, b + 10);
    }


    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
