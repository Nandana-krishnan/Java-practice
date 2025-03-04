package guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TrafficLight extends JFrame implements ActionListener {
	JRadioButton r ,y,g;
	TrafficLight()
	{
		setTitle("TrafficLight");
		r = new JRadioButton("RED");
		y = new JRadioButton("YELLOW");
		g = new JRadioButton("GREEN");
		r.setBounds(50,50,100,20);
		y.setBounds(50,100,100,20);
		g.setBounds(50,150,100,20);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r);
		bg.add(y);
		bg.add(g);
		r.addActionListener(this);
		y.addActionListener(this);
		g.addActionListener(this);
		add(r);
		add(y);
		add(g);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics gr)
	{
		gr.setColor(Color.DARK_GRAY);
		gr.drawRect(180,50,50,150);
		gr.setColor(Color.DARK_GRAY);
		gr.drawOval(190,70,30,40);
		gr.fillOval(190,70,30,40);
		if(r.isSelected())
		{
			gr.setColor(Color.RED);
			gr.fillOval(190,70,30,40);
		}
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				new TrafficLight();
			}
		});

	}

}
