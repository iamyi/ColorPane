package Test;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Test extends JFrame implements ActionListener{
	JTextArea jl;
	JButton jb1,jb2;
	Test()
	{
		jl = new JTextArea("JAVA≤‚ ‘",5,10);
		jb1 = new JButton("…Ë÷√«∞æ∞");
		jb2 = new JButton("…Ë÷√±≥æ∞");
		setLayout(new FlowLayout());
		add(jl);
		add(jb1);
		add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		Test t = new Test();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jb1)
			jl.setForeground(Color.red);
		else
			jl.setBackground(Color.blue);
	}
}
