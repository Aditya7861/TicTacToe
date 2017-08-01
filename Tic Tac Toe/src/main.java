import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class main implements ActionListener {
	
	JFrame f1;
	Container c;
	String s[]=new String[2];
	public JButton b[]=new JButton[9];
	int player=0;
	/*
	Icon x=new ImageIcon(getClass().getResource("/Assets/x1-final.png"));
	Icon o=new ImageIcon(getClass().getResource("/Assets/o4final.png"));
	5-5-2017
	above line of code is used to set an image for the buttons of the game
	*/
	main()
	{
		name();	
		f1=new JFrame("Tic_Tac_Toe -Aditya");
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setBounds(200, 200, 350, 350);
		f1.setLayout(new GridLayout(3, 3));
		c=f1.getContentPane();
		for(int i=0;i<9;i++)
		{
			b[i]=new JButton("");
			c.add(b[i]);
			b[i].addActionListener(this);
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		Font f=new Font("Consolos",18,80);
		if(player%2==0)
		{
			if(e.getSource()==b[0])
			{
				b[0].setText("X");
				b[0].setFont(f);
				b[0].setEnabled(false);
				b[0].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[1])
			{
				b[1].setText("X");
				b[1].setFont(f);
				b[1].setEnabled(false);
				b[1].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[2])
			{
				b[2].setText("X");
				b[2].setFont(f);
				b[2].setEnabled(false);
				b[2].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			if(e.getSource()==b[3])
			{
				b[3].setText("X");
				b[3].setEnabled(false);
				b[3].setFont(f);
				b[3].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[4])
			{
				b[4].setText("X");
				b[4].setFont(f);
				b[4].setEnabled(false);
				b[4].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[5])
			{
				b[5].setText("X");
				b[5].setFont(f);
				b[5].setEnabled(false);
				b[5].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[6])
			{
				b[6].setText("X");
				b[6].setFont(f);
				b[6].setEnabled(false);
				b[6].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[7])
			{
				b[7].setText("X");
				b[7].setFont(f);
				b[7].setEnabled(false);
				b[7].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[8])
			{
				b[8].setText("X");
				b[8].setFont(f);
				b[8].setEnabled(false);
				b[8].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
		}
		else
		{
			if(e.getSource()==b[0])
			{
				b[0].setText("O");
				b[0].setFont(f);
				b[0].setEnabled(false);
				b[0].setFont(f);
				b[0].setBackground(Color.CYAN);
				player++;

				win_Check();
			}
			else if(e.getSource()==b[1])
			{
				b[1].setText("O");
				b[1].setFont(f);
				b[1].setEnabled(false);
				b[1].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[2])
			{
				b[2].setText("O");
				b[2].setFont(f);
				b[2].setEnabled(false);
				b[2].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			if(e.getSource()==b[3])
			{
				b[3].setText("O");
				b[3].setFont(f);
				b[3].setEnabled(false);
				b[3].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[4])
			{
				b[4].setText("O");
				b[4].setFont(f);
				b[4].setEnabled(false);
				b[4].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[5])
			{
				b[5].setText("O");
				b[5].setFont(f);
				b[5].setEnabled(false);
				b[5].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[6])
			{
				b[6].setText("O");
				b[6].setFont(f);
				b[6].setEnabled(false);
				b[6].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[7])
			{
				b[7].setText("O");
				b[7].setFont(f);
				b[7].setEnabled(false);
				b[7].setBackground(Color.CYAN);
				player++;
				win_Check();
			}
			else if(e.getSource()==b[8])
			{
				b[8].setText("O");
				b[8].setFont(f);
				b[8].setEnabled(false);
				b[8].setBackground(Color.CYAN);
				player++;
				win_Check();
				
			}
		}
	}
	void win_Check()
	{
			int count=0;
			if(count==0)
			{
				draw();
	
			}
			if((b[0].getText()=="X")&&(b[4].getText()=="X")&&(b[8].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
				count++;
			}	
			else if((b[2].getText()=="X")&&(b[4].getText()=="X")&&(b[6].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
				count++;
			}
			else if((b[0].getText()=="X")&&(b[3].getText()=="X")&&(b[6].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
				count++;
			}
			else if((b[1].getText()=="X")&&(b[4].getText()=="X")&&(b[7].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
			}
			else if((b[2].getText()=="X")&&(b[5].getText()=="X")&&(b[8].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
				count++;
			}
			else if((b[0].getText()=="X")&&(b[1].getText()=="X")&&(b[2].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
				count++;
			}	
			else if((b[3].getText()=="X")&&(b[4].getText()=="X")&&(b[5].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
				count++;
			}	
			else if((b[6].getText()=="X")&&(b[7].getText()=="X")&&(b[8].getText()=="X"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[0]+" won");
				count++;
			}			
			else if((b[0].getText()=="O")&&(b[4].getText()=="O")&&(b[8].getText()=="O"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			else if((b[2].getText()=="O")&&(b[4].getText()=="O")&&(b[6].getText()=="O"))
			{	
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			else if((b[0].getText()=="O")&&(b[3].getText()=="O")&&(b[6].getText()=="O"))
			{	
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			else if((b[1].getText()=="O")&&(b[4].getText()=="O")&&(b[7].getText()=="O"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			else if((b[2].getText()=="O")&&(b[5].getText()=="O")&&(b[8].getText()=="O"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			else if((b[0].getText()=="O")&&(b[1].getText()=="O")&&(b[2].getText()=="O"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			else if((b[3].getText()=="O")&&(b[4].getText()=="O")&&(b[5].getText()=="O"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			else if((b[6].getText()=="O")&&(b[7].getText()=="O")&&(b[8].getText()=="O"))
			{
				JOptionPane.showMessageDialog(f1,"Player "+s[1]+" won");
				count++;
			}
			
				
	
	}
	void name()
	{
		//JOptionPane.showMessageDialog(f1, "Saloni is cute");
		s[0]=JOptionPane.showInputDialog("Enter First Player name");
		//JOptionPane.showMessageDialog(f1, "First Player name is "+s[0]);
		s[1]=JOptionPane.showInputDialog("Enter Second Player name");
	//	JOptionPane.showMessageDialog(f1, "Second Player name is "+s[1]);
		
	}

	void draw()
	{
		int count=0;
		for(int i=0;i<9;i++)
		{
			if(!b[i].isEnabled())
			{
				count++;
			}
		}
		if(count==9)
		{
			JOptionPane.showMessageDialog(f1, "Match Draw");
			
		}
	}
	public static void main(String[] args) 
	{
		main a1=new main();
		
	}
}
