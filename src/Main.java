import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Main extends JFrame implements ActionListener{
	JButton jb[];
	private String name[] = {"blue","cyan","green","magenta","orange","pink","red","white","yellow"};
	private Color color[] = {Color.blue,Color.cyan,Color.green,Color.magenta,Color.orange,Color.pink,Color.red,Color.white,Color.yellow};
	private Color de_color;
	Main()
	{
		setTitle("ColorPane");
		setSize(1200,1200);
		setLocation(550,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(3,3));
		jb = new JButton[9];
		Font font = new Font("一般",Font.ITALIC,30);
		for (int i = 0; i < 9; i++)
		{
			jb[i] = new JButton(name[i]);
			jb[i].setFont(font);
			jb[i].addActionListener(this);
			this.add(jb[i]);
		}
		de_color = jb[1].getBackground();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO 自动生成的方法存根
		for (int i = 0; i < 9; i++)
		{
			if (e.getSource() == jb[i])
			{
				if (jb[i].getBackground() == color[i])
					jb[i].setBackground(de_color);
				else
					jb[i].setBackground(color[i]);		
			}
		}
	}
	public static void main(String args[])
	{
		Main m = new Main();
	}
}
