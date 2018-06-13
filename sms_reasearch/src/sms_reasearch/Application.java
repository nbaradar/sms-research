package sms_reasearch;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				createAndShowGUI();
			}
		});
	}
	
	private static void createAndShowGUI(){
		JFrame mainFrame = new JFrame("MainFrame");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel testLabel = new JLabel("TestLabel");
		testLabel.setPreferredSize(new Dimension(175, 100));
		
		mainFrame.getContentPane().add(testLabel, BorderLayout.CENTER);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
