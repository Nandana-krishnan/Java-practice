package guis;
import java.awt.GridBagLayout;

import javax.swing.*;
public class SwingDemo extends JFrame {
	SwingDemo()
	{
		setSize(250,250);
		setTitle("My Application");
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jl = new JLabel("yes its mine");
		jl.setBounds(40,40,90,20);
		add(jl);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		//Event Dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				new SwingDemo();
			}
		});
	}
}
