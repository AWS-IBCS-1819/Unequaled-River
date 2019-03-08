import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class frame extends JFrame{

  public frame(){
    this.setVisible(true);
    this.setTitle("MLA Citation Generator");
    this.setSize(300, 700);
    //this.setLocationRelativeTo(null);//put the window in center
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new FlowLayout());

    JPanel pan1 = new JPanel();
    pan1.setVisible(true);
    //pan1.setBorder(new TitledBorder("fill out the information:"));
    // pan1.setBackgound(Color.BLUE);
    // this.setContentPane(pan1);

    Label l1 = new Label();
    l1.setText("Article title: ");
    this.add(l1);
    TextField text1 = new TextField(20);
    this.add(text1);
  }



  public static void main(String[] args) {
    frame frame1 = new frame();
  }

}
