import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MaxMinSwing extends JFrame implements ItemListener
{
		JLabel l1,l2,l3;
		JTextField t1,t2,t3;
		JRadioButton r1,r2;
		ButtonGroup bg;
		MaxMinSwing()
		{
				Font f = new Font("verdana",Font.BOLD,25);
				l1 = new JLabel("No1 : ");
				l2 = new JLabel("No2 : ");
				l3 = new JLabel("Ans : ");
				t1 = new JTextField();
				t2 = new JTextField();
				t3 = new JTextField();
				bg = new ButtonGroup();
				r1 = new JRadioButton("Max");
				r2 = new JRadioButton("Min");
				bg.add(r1);
				bg.add(r2);
				setLayout(new GridLayout(4,2));
				add(l1);
				add(t1);
				add(l2);
				add(t2);
				add(l3);
				add(t3);
				add(r1);
				add(r2);
				l1.setFont(f);
				l2.setFont(f);
				l3.setFont(f);
				t1.setFont(f);
				t2.setFont(f);
				t3.setFont(f);
				r1.setFont(f);
				r2.setFont(f);
				r1.addItemListener(this);
				r2.addItemListener(this);
		}
			
		public void itemStateChanged(ItemEvent e)
		{
				int a,b;
				if(e.getSource() == r1)
				{
						a = Integer.parseInt(t1.getText());
						b = Integer.parseInt(t2.getText());
						if(a>b)
						{
								t3.setText(a+"");
						}
						else
						{
								t3.setText(b+"");							
						}
				}
				else
				{
						a = Integer.parseInt(t1.getText());
						b = Integer.parseInt(t2.getText());
						if(a<b)
						{
								t3.setText(a+"");
						}
						else
						{
								t3.setText(b+"");							
						}
				}
		}	
		
		public static void main(String ar[])
		{
				MaxMinSwing x = new MaxMinSwing();
				x.setVisible(true);
				x.setSize(400,400);
				
		}
}