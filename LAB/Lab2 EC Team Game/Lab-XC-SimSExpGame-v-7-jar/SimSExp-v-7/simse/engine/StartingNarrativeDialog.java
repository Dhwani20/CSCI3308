/* File generated by: simse.codegenerator.enginegenerator.StartingNarrativeDialogGenerator */
package simse.engine;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class StartingNarrativeDialog extends JDialog implements ActionListener
{
private JTextArea textArea;
private JButton okButton;

public StartingNarrativeDialog(JFrame owner)
{
super(owner, true);

setTitle("Welcome!");

// Create main panel (box):
Box mainPane = Box.createVerticalBox();
mainPane.setMaximumSize(new Dimension(300, 300));

// Create text area panel:
textArea = new JTextArea(15, 30);
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
textArea.setEditable(false);
textArea.setText("Welcome to the SimSE XP game! Your development team has been hired by the Children's Television Workshop to create the Sesame Street Web portal, where kids can interact with Elmo, Big Bird, Grover, and their other favorite characters, create their own Sesame Street episodes, and watch them, all through their Web browser.\n\nThe customer has some general ideas about what exactly they want the system to do, but there are a lot of things they are not sure about yet. The customer has a FIRM deadline of 1800 clock ticks from today -- they hear that Nickelodian is currently working on something similar, so they want to make sure that they beat them with the release of their system first.\n\nBecause of the unsure requirements and the strict deadline,  management has decided that an Extreme Programming (XP) software development approach is best. XP is an agile development process that emphasizes pair programming, test-driven development, continuous testing, integration, refactoring, and small, frequent releases. Using XP, we can develop and release the most well-defined parts of the system first, and save a lot of the functionality until later, so the customer won't have to flesh out all of the requirements right away. In addition, these small, frequent releases will help the customer to decide where they want to go with the system next. In the past, XP projects have also yielded excellent results in terms of completing on schedule (a critical issue for this project).\n\nIn XP, all of development is centered around user stories, short descriptions of the different features of the system. Therefore, to monitor the progress of the project, keep an eye on the user stories artifact.\n\nThe XP model used in this game is largely based on the information given at http://www.extremeprogramming.org/. The most important rules to follow to succeed in this game are as follows:\n1) Always create tests as early as possible, especially before coding (test-driven development).\n2) Do as many development activities in pairs as possible.\n3) Test as often as possible (continuous testing).\n4) Refactor all code.\n5) Involve the customer as much as possible.\n\nThere are a few simplifications made in this game that you should also be aware of:\n1) In reality, XP projects typically have at least 10-12 iterations. In this project, you will have far fewer than that.\n2) XP dictates that only one pair can integrate their code at a time. In this project, multiple people can integrate at once.\n3) Budget is ignored in this game.\n\nFinally, good luck! Remember, the deadline of 1800 ticks is STRICT. Once 1800 ticks are up, the customer will force you to release whatever your integrated system consists of at that point. You will then be given a game score based on how complete and correct the system is." + "");
textArea.setCaretPosition(0);
JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
mainPane.add(scrollPane);

// Create okButton pane and button:
JPanel okButtonPane = new JPanel();
okButton = new JButton("OK");
okButton.addActionListener(this);
okButtonPane.add(okButton);
mainPane.add(okButtonPane);

// Set main window frame properties:
setBackground(Color.black);
setContentPane(mainPane);
validate();
pack();
repaint();
toFront();
// Make it show up in the center of the screen:
Point ownerLoc = owner.getLocationOnScreen();
Point thisLoc = new Point();
thisLoc.setLocation((ownerLoc.getX() + (owner.getWidth() / 2) - (this.getWidth() / 2)), (ownerLoc.getY() + (owner.getHeight() / 2) - (this.getHeight() / 2)));
setLocation(thisLoc);
setVisible(true);
}

public void actionPerformed(ActionEvent evt) // handles user actions
{
Object source = evt.getSource();
if(source == okButton)
{
setVisible(false);
dispose();
}
}
}