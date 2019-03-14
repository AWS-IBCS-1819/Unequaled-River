import javax.swing.*;
import java.awt.*;
import java.awt.Color;$
import java.awt.event.*;

public class AL extends javax.swing.JFrame implements WindowListener,ActionListener {

        CitationGenerator newCG;
        Button b, b2;
        TextField text1;
        TextField text2;
        TextField text2sub1;
        TextField text2sub2;
        TextField text3;
        TextField text4;
        TextField text5;
        TextField text61;
        TextField text62;
        TextField text63;
        TextArea ta1;
        int trackCiteName;

        Citation newC0;
        Citation newC1;
        Citation newC2;
        Citation newC3;
        Citation newC4;
        Citation newC5;
        Citation newC6;
        Citation newC7;
        Citation newC8;
        Citation newC9;
        Citation newC10;



        public AL(String title) { //constructor
                super(title); //call the super class (must be the first statement)
                setLayout(new FlowLayout());
                addWindowListener(this);
                // setBackgound(Color. ORANGE);

                newCG = new CitationGenerator();
                trackCiteName = 0;
                newC0  = new Citation();
                newC1  = new Citation();
                newC2  = new Citation();
                newC3  = new Citation();
                newC4  = new Citation();
                newC5  = new Citation();
                newC6  = new Citation();
                newC7  = new Citation();
                newC8  = new Citation();
                newC9  = new Citation();
                newC10  = new Citation();
                newCG.CarrayList.add(newC0);
                newCG.CarrayList.add(newC1);
                newCG.CarrayList.add(newC2);
                newCG.CarrayList.add(newC3);
                newCG.CarrayList.add(newC4);
                newCG.CarrayList.add(newC5);
                newCG.CarrayList.add(newC6);
                newCG.CarrayList.add(newC7);
                newCG.CarrayList.add(newC8);
                newCG.CarrayList.add(newC9);
                newCG.CarrayList.add(newC10);



                JPanel infoPanel = new JPanel();
                infoPanel.setLayout(new GridLayout(0, 2));
                infoPanel.setVisible(true);
                infoPanel.setSize(200,100);
                add(infoPanel);



                Label l1 = new Label();
                l1.setText("Article title: ");
                infoPanel.add(l1, BorderLayout.NORTH);
                text1 = new TextField(20);
                infoPanel.add(text1);

                //Author's name
                Label l2 = new Label();
                l2.setText("Author's name (first name): ");
                infoPanel.add(l2);
                text2 = new TextField(20);
                infoPanel.add(text2);
                Label l2sub1 = new Label();
                l2sub1.setText("Author's name (middle name): ");
                infoPanel.add(l2sub1);
                text2sub1 = new TextField(20);
                infoPanel.add(text2sub1);
                Label l2sub2 = new Label();
                l2sub2.setText("Author's name (last name): ");
                infoPanel.add(l2sub2);
                text2sub2 = new TextField(20);
                infoPanel.add(text2sub2);

                Label l3 = new Label();
                l3.setText("Website title: ");
                infoPanel.add(l3);
                text3 = new TextField(20);
                infoPanel.add(text3);

                Label l4 = new Label();
                l4.setText("Publisher: ");
                infoPanel.add(l4);
                text4 = new TextField(20);
                infoPanel.add(text4);

                Label l5 = new Label();
                l5.setText("URL: ");
                infoPanel.add(l5);
                text5 = new TextField(20);
                infoPanel.add(text5);

                //dates
                Label l61 = new Label();
                l61.setText("Date published (day): ");
                infoPanel.add(l61);
                text61 = new TextField(20);
                infoPanel.add(text61);

                Label l62 = new Label();
                l62.setText("Date published (month): ");
                infoPanel.add(l62);
                text62 = new TextField(20);
                infoPanel.add(text62);

                Label l63 = new Label();
                l63.setText("Date published (year): ");
                infoPanel.add(l63);
                text63 = new TextField(20);
                infoPanel.add(text63);

                b = new Button("Create citation");
                add(b);

                ta1 = new TextArea(20, 50);
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

//--------------actionPerformed------------------
        public void actionPerformed(ActionEvent e) {
          Object clickedButton = e.getSource();
          if (clickedButton.equals(b)) {

            ta1.setText("");//clear the TextArea
            text1.setText("");
            text2.setText("");
            text2sub1.setText("");
            text2sub2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text61.setText("");
            text62.setText("");
            text63.setText("");

            newCG.CarrayList.get(trackCiteName).setArticleTitle(text1.getText());
            newCG.CarrayList.get(trackCiteName).setAuthorFirst(text2.getText());
            newCG.CarrayList.get(trackCiteName).setAuthorMiddle(text2sub1.getText());
            newCG.CarrayList.get(trackCiteName).setAuthorLast(text2sub2.getText());
            newCG.CarrayList.get(trackCiteName).setWebTitle(text3.getText());
            newCG.CarrayList.get(trackCiteName).setPublisher(text4.getText());
            newCG.CarrayList.get(trackCiteName).setURL(text5.getText());
            newCG.CarrayList.get(trackCiteName).setDateDay(text61.getText());
            newCG.CarrayList.get(trackCiteName).setDateMonth(text62.getText());
            newCG.CarrayList.get(trackCiteName).setDateYear(text63.getText());




            newCG.printCitationList(newCG.CarrayList);

            for (int i = 0; i<newCG.CarrayList.size(); i++) {
              ta1.append(newCG.CarrayList.get(i).formatIntoString() + "\n");
            }

            trackCiteName = trackCiteName+1;

          }
          if (clickedButton.equals(b2)) {

          }
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
