package testmyapplet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class HelloWorld extends Applet{
  public static void main(String[] args){
  Frame frame = new Frame("Roseindia.net");
  frame.setSize(400,200);
  Applet app = new HelloWorld();
  frame.add(app);
  frame.setVisible(true);
  frame.addWindowListener(new WindowAdapter(){
  public void windowClosing(WindowEvent e){
  System.exit(0);
  }
  });
  }
  @Override
public void init() {
	// TODO Auto-generated method stub
	super.init();
}
public void paint(Graphics g){
  g.drawString("Hello World!",200,100);
  }
}
