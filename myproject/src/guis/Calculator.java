package guis;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Calculator implements ActionListener 
{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bequals,bclear,bdot,bmul,bdif,bdiv,badd;
	JTextField ibox;
	JFrame f;
	GridBagLayout gl;
	GridBagConstraints gc;
	Calculator()
	{
		f =new JFrame("Calculator");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		gl = new GridBagLayout();
		gc = new GridBagConstraints();
		f.setLayout(gl);
		ibox = new JTextField();
		ibox.setEditable(false);
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		badd = new JButton("+");
		bmul = new JButton("x");
		bdif = new JButton("-");
		bdiv = new JButton("/");
		bclear = new JButton("C");
		bequals = new JButton("=");
		bdot = new JButton(".");
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bequals.addActionListener(this);
		bclear.addActionListener(this);
		bmul.addActionListener(this);
		bdif.addActionListener(this);
		bdiv.addActionListener(this);
		bdot.addActionListener(this);
		badd.addActionListener(this);
		
		gc.fill = GridBagConstraints.HORIZONTAL;
		gc.gridwidth = 3;
		gc.gridx = 0; gc.gridy = 0; f.add(ibox,gc);
		gc.gridx = 3; gc.gridy =0; f.add(bequals.gc);
		gc.gridwidth = 1;
		gc.gridx = 0; gc.gridy = 1; f.add(b1,gc);
		gc.gridx = 1; gc.gridy = 1; f.add(b2,gc);
		gc.gridx = 2; gc.gridy = 1; f.add(b3,gc);
		gc.gridx = 3; gc.gridy = 1; f.add(badd,gc);
		gc.gridx = 0; gc.gridy = 2; f.add(b4,gc);
		gc.gridx = 1; gc.gridy = 2; f.add(b5,gc);
		gc.gridx = 2; gc.gridy = 2; f.add(b6,gc);
		gc.gridx = 3; gc.gridy = 2; f.add(bdif,gc);
		gc.gridx = 0; gc.gridy = 3; f.add(b7,gc);
		gc.gridx = 1; gc.gridy = 3; f.add(b8,gc);
		gc.gridx = 2; gc.gridy = 3; f.add(b9,gc);
		gc.gridx = 3; gc.gridy = 3; f.add(bdiv,gc);
		gc.gridx = 0; gc.gridy = 4; f.add(bdot,gc);
		gc.gridx = 1; gc.gridy = 4; f.add(b0,gc);
		gc.gridx = 2; gc.gridy = 4; f.add(bclear,gc);
		gc.gridx = 3; gc.gridy = 4; f.add(bmul,gc);
		f.setSize(270,270);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String temp = ae.getActionCommand();
		double val1 =0 , val2 =  0 , result = 0;
		StringBuffer y = new StringBuffer();
		StringBuffer z = new StringBuffer();
		char operand = ' ';
		ibox.setText(ibox.getText()+temp);
		if(temp == "C")
		{
			ibox.setText("");
			operand = ' ';
		}
		else if(temp == "=")
		{
			String x = ibox.getText();
			for(int i =0 ; i<x.length()-1; i++)
			{
				char ch = x.charAt(i);
				if(ch == '+'||ch == '-'|| ch== '*'||ch == '/')
					operand = ch;
				else
					if(operand == ' ')
						y.append(ch);
					else
						z.append(ch);
			}	
			String l = y.toString();
			String h = z.toString();
			val1 = Float.parseFloat(l);
			val2 = Float.parseFloat(h);
			try
			{
				switch (operand)
				{
					case '+' : result = val1 + val2; break;
					case '-' : result = val1 - val2;break;
					case 'x' : result = val1 * val2;break;
					case '/' : result = val1 / val2;break;
				}
				ibox.setText(x+result);
				catch (ArithmeticException e)
				{
                System.out.println("Cannot Divide by Zero...");
				}
				catch (Exception e)
				{
                System.out.println("Other Exception : " + e);
				}
			}
		}
	}
	public static void main(String []args)
	{
		SwingUtilities.invokeLater(new Runnable() 
		{
			public void run()
			{
				new Calculator();
			}
		});
	}
}
