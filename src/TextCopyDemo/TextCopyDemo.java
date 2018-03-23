package TextCopyDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextCopyDemo extends JFrame implements ActionListener{

	JLabel jl1,jl2;
	JButton Clear,Copy,Close;
	JTextField Source,Target;
	TextCopyDemo()
	{
		jl1 = new JLabel("Source");
		jl2 = new JLabel("Target");
		Source = new JTextField(20);
		Target = new JTextField(20);
		Clear = new JButton("Clear");
		Clear.addActionListener(this);
		Copy = new JButton("Copy");
		Copy.addActionListener(this);
		Close = new JButton("Close");
		Close.addActionListener(this);
		this.setSize(300,400);
		this.setLayout(new FlowLayout());
		add(jl1);
		add(Source);
		add(jl2);
		add(Target);
		add(Clear);
		add(Copy);
		add(Close);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == Copy)
		{
			Target.setText(Source.getText());
		}
		if (e.getSource() == Clear)
		{
			Target.setText("");
			Source.setText("");
		}
		if (e.getSource() == Close)
		{
			this.dispose();
		}
	}
	public static void main(String args[])
	{
		TextCopyDemo t = new TextCopyDemo();
		t.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
