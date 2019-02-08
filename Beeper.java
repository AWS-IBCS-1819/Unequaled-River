/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package events;

/*
 * Beeper.java requires no other files.
 */

import java.awt.*; //import all the java liberay that is needed for the construction of this program
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Beeper extends JPanel //subclass Beeper inherit and overwrite the function and properties of its superclass JPanel
                    implements ActionListener {// //ActionListener is implemented so that can response to what happened
    JButton button;// a button is created

    public Beeper() {// constructor method
        super(new BorderLayout());//call JPanel superclass
        button = new JButton("Click Me"); // create new button
        button.setPreferredSize(new Dimension(200, 80));// set the size of the button
        add(button, BorderLayout.CENTER);//put button in center of frame
        button.addActionListener(this);// add listener to button to listen action
    }

    public void actionPerformed(ActionEvent e) {//response of the action
        Toolkit.getDefaultToolkit().beep();//make the button beep
    }


    public static void main(String[] args) {
      JFrame frame = new JFrame("Beeper");//new instance of frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit the window properly

      JComponent newContentPane = new Beeper();//new instance of newContentPane
      newContentPane.setOpaque(true);//set color
      frame.setContentPane(newContentPane);// set contentpen

      frame.pack();
      frame.setVisible(true);//make frame visible
    }
}
