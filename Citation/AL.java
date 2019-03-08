import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class AL extends javax.swing.JFrame implements WindowListener,ActionListener {

        Button b, b2;

        private int numClicks = 0;

        public AL(String title) { //constructor
                super(title); //call the super class (must be the first statement)
                setLayout(new FlowLayout());
                addWindowListener(this);
                // setBackgound(Color. ORANGE);




                JPanel infoPanel = new JPanel();
                // infoPanel.setBorder(new LineBorder(Color .BLACK, 3));
                //infoPanel.setBackgound(Color.ORANGE);
                infoPanel.setLayout(new GridLayout(0, 2));
                infoPanel.setVisible(true);
                infoPanel.setSize(200,100);
                add(infoPanel);



                Label l1 = new Label();
                l1.setText("Article title: ");
                infoPanel.add(l1, BorderLayout.NORTH);
                TextField text1 = new TextField(20);
                infoPanel.add(text1);

                //Author's name
                Label l2 = new Label();
                l2.setText("Author's name (first name): ");
                infoPanel.add(l2);
                TextField text2 = new TextField(20);
                infoPanel.add(text2);
                Label l2sub1 = new Label();
                l2sub1.setText("Author's name (middle name): ");
                infoPanel.add(l2sub1);
                TextField text2sub1 = new TextField(20);
                infoPanel.add(text2sub1);
                Label l2sub2 = new Label();
                l2sub2.setText("Author's name (last name): ");
                infoPanel.add(l2sub2);
                TextField text2sub2 = new TextField(20);
                infoPanel.add(text2sub2);

                Label l3 = new Label();
                l3.setText("Website title: ");
                infoPanel.add(l3);
                TextField text3 = new TextField(20);
                infoPanel.add(text3);

                Label l4 = new Label();
                l4.setText("Publisher: ");
                infoPanel.add(l4);
                TextField text4 = new TextField(20);
                infoPanel.add(text4);

                Label l5 = new Label();
                l5.setText("URL: ");
                infoPanel.add(l5);
                TextField text5 = new TextField(20);
                infoPanel.add(text5);

                //dates
                Label l61 = new Label();
                l61.setText("Date published (day): ");
                infoPanel.add(l61);
                TextField text61 = new TextField(20);
                infoPanel.add(text61);

                Label l62 = new Label();
                l62.setText("Date published (month): ");
                infoPanel.add(l62);
                TextField text62 = new TextField(20);
                infoPanel.add(text62);

                Label l63 = new Label();
                l63.setText("Date published (year): ");
                infoPanel.add(l63);
                TextField text63 = new TextField(20);
                infoPanel.add(text63);

                b = new Button("Create citation");
                add(b);

                TextArea ta1 = new TextArea(20, 50);
                add(ta1);

                b2 = new Button("Sort in alphabetic order");
                add(b2);

                b.addActionListener(this);
                b2.addActionListener(this);
        }

        public static void main(String[] args) {
                AL myWindow = new AL("MLA Citation Generator");
                myWindow.setSize(450,700);
                myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
          String clickedButton = e.getActionCommand();
          System.out.println(clickedButton + " clicked");
        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}
