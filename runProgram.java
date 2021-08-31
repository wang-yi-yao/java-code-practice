import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class runProgram extends JFrame {
    public runProgram() {
        super("Java Window Test");

        //Gets screen width and height
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();

        //Sets Java window height
        int windowWidth = 600;
        int windowHeight = 400;

        //Exits program upon closing
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Halves screen width and height to find the center of the screen
        //Then halfs the window size and subtracts it from the halved screen size.
        setLocation(((int)screenWidth/2)-(windowWidth/2), ((int)screenHeight/2)-(windowHeight/2));         
        setSize(windowWidth, windowHeight);
        setVisible(true);
	
	//Add a label to the center of the window
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

	//Add a button that closes the window and exits the program
        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    dispose();
                    System.exit(0);
                }
            }
        );
        add(close, BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		public void run() {
			new runProgram();
		}
	});
    }
}
