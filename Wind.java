package practice;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class Wind extends JFrame{
	public static void main(String args[]) {
		Wind frame = new Wind("Title");
		frame.setVisible(true);

	}
	Wind(String title){
		setTitle(title);
		setBounds(1000,1000,2000,1600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel p = new JPanel();

	    JTextArea area1 = new JTextArea();
	    JTextArea area2 = new JTextArea(3, 20);
	    area2.setPreferredSize(new Dimension(600, 500));
	    JTextArea area3 = new JTextArea();
	    area3.setRows(6);
	    area3.setColumns(15);

	    p.add(area1);
	    p.add(area2);
	    p.add(area3);

	    Container contentPane = getContentPane();
	    contentPane.add(p, BorderLayout.CENTER);
	}
}
