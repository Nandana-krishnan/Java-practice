package guis;
import javax.swing.*;
public class JButtonDemo extends JFrame
{
	JButtonDemo()
	{
		setSize(200,200);
		setTitle("a button program");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton jb = new JButton("SUBMIT");
		jb.setSize(,100);
		add(jb);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable()
		{
				public void run();
				{
					new JButtonDemo();
				}
				});

	}

}
