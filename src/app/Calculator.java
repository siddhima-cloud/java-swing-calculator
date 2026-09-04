package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//
 class Calculator implements ActionListener{

	 double input, result;
	 String cal;
	 
	 JFrame frame;
	 JLabel label = new JLabel();
	 JTextField textView= new JTextField();
	 
	 JButton symClr = new JButton("CLR");
	 JButton symDel = new JButton("DEL");
	 JButton symMul = new JButton("*");
	 JButton symDiv = new JButton("/");
	 
	 JButton button7 = new JButton("7");
	 JButton button8 = new JButton("8");
	 JButton button9 = new JButton("9");
	 JButton symSub = new JButton("-");
	 
	 JButton button4 = new JButton("4");
	 JButton button5 = new JButton("5");
	 JButton button6  = new JButton("6");
	 JButton symAdd = new JButton("+");
	 
	 JButton button1 = new JButton("1");
	 JButton button2 = new JButton("2");
	 JButton button3  = new JButton("3");
	 JButton symEqual = new JButton("=");
	 
	 JButton button0  = new JButton("0");
	 JButton symDot = new JButton(".");
	 
	 Calculator()
	 {
		 createInterface();
		 InterfaceComponents();
		 AddInterfaceEventListener();
	 }
	 
	 public void createInterface() {
		 frame = new JFrame();
		 frame.setTitle("Java Calc ");
		 frame.getContentPane().setLayout(null);
		 frame.setLocationRelativeTo(null);
		 frame.setResizable(false);
		 frame.setSize(300,400);
//		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	 }
	 public void InterfaceComponents()
	 {
		 
//		 output row
		 label.setBounds(244,0,40,40);
		 frame.add(label);
		 
		 textView.setBounds(10,40,265,50);
		 textView.setEditable(false);
		 textView.setHorizontalAlignment(SwingConstants.RIGHT);
		 frame.add(textView);
		 
		 
//		 1st row
		 symClr.setBounds(10,110,60,40);
		 frame.add(symClr);
		 symDel.setBounds(80,110,60,40);
		 frame.add(symDel);
		 symMul.setBounds(150,110,60,40);
		 frame.add(symMul);
		 symDiv.setBounds(220,110,60,40);
		 frame.add(symDiv);
		 
		 
//		 2nd row		
		 button7.setBounds(10,160,60,40);
		 frame.add(button7);
		 button8.setBounds(80,160,60,40);
		 frame.add(button8);
		 button9.setBounds(150,160,60,40);
		 frame.add(button9);
		 symSub.setBounds(220,160,60,40);
		 frame.add(symSub);
		 
//		 3rd row
		 button4.setBounds(10,210,60,40);
		 frame.add(button4);
		 button5.setBounds(80,210,60,40);
		 frame.add(button5);
		 button6.setBounds(150,210,60,40);
		 frame.add(button6);
		 symAdd.setBounds(220,210,60,40);
		 frame.add(symAdd);
		
		 
//		 4th row
		 button1.setBounds(10,260,60,40);
		 frame.add(button1);
		 button2.setBounds(80,260,60,40);
		 frame.add(button2);
		 button3.setBounds(150,260,60,40);
		 frame.add(button3);
		 symEqual.setBounds(220,260,60,90);
		 frame.add(symEqual);
		 
		 
//		 5th row
		 button0.setBounds(10,310,130,40);
		 frame.add(button0);
		 symDot.setBounds(150,310,60,40);
		 frame.add(symDot);
		 
		 frame.setVisible(true);
	 }
	 
	 public void AddInterfaceEventListener()
	 {
//		  1st Row
		 symClr.addActionListener(this);
		 symDel.addActionListener(this);
		 symMul.addActionListener(this);
		 symDiv.addActionListener(this);
		 
//		2nd Row
		 
		 button7.addActionListener(this);
		 button8.addActionListener(this);
		 button9.addActionListener(this);
		 symSub.addActionListener(this);
		 
//		  3rd Row
		 
		 button4.addActionListener(this);
		 button5.addActionListener(this);
		 button6.addActionListener(this);
		 symAdd.addActionListener(this);
		 
//		 4th Row
		 
		 button1.addActionListener(this);
		 button2.addActionListener(this);
		 button3.addActionListener(this);
		 symEqual.addActionListener(this);
		 
//		 5th Row
		 
		 button0.addActionListener(this);
		 symDot.addActionListener(this);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object event = e.getSource();
		
		
//		Input values
		if(event== button1)
		{
			textView.setText(textView.getText()+"1");
		}
		else if(event== button2)
		{
			textView.setText(textView.getText()+"2");
		}
		else if(event== button3)
		{
			textView.setText(textView.getText()+"3");
		}
		else if(event== button4)
		{
			textView.setText(textView.getText()+"4");
		}
		else if(event== button5)
		{
			textView.setText(textView.getText()+"5");
		}
		else if(event== button6)
		{
			textView.setText(textView.getText()+"6");
		}
		else if(event== button7)
		{
			textView.setText(textView.getText()+"7");
		}
		else if(event== button8)
		{
			textView.setText(textView.getText()+"8");
		}
		else if(event== button9)
		{
			textView.setText(textView.getText()+"9");
		}
		else if(event== button0)
		{
			if(textView.getText().equals("0"))
			{
				return;
			}else
			{
				textView.setText(textView.getText()+"0");
			}
		}else if(event== symDot)
		{
			if(textView.getText().contains("."))
			{
				return;
			}else
			{
				textView.setText(textView.getText()+".");
			}
		}
		else if(event== symClr)
		{
			label.setText("");
			textView.setText("");
		
		}
		else if(event == symDel)
		{
			int length = textView.getText().length();
			int position = length-1;
			if(length>0)
			{
				StringBuilder numString = new StringBuilder(textView.getText());
				numString.deleteCharAt(position);
				textView.setText(numString.toString());
			}
			if(textView.getText().endsWith(""))
			{

				label.setText("");
			}
		}
		else if(event == symMul)
		{
			if(textView.getText().isEmpty())
		    {
		        return;
		    }
			String presentInput = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentInput+ "*");
			cal= "x";
			
		}else if(event == symDiv)
		{
			if(textView.getText().isEmpty())
		    {
		        return;
		    }
			String presentInput = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentInput+ "/");
			cal= "/";
			
		}
		else if(event == symSub)
		{
			if(textView.getText().isEmpty())
		    {
		        return;
		    }
			String presentInput = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentInput+ "-");
			cal= "-";
			
		}
		else if(event == symAdd)
		{
			if(textView.getText().isEmpty())
		    {
		        return;
		    }
			String presentInput = textView.getText();
			input = Double.parseDouble(textView.getText());
			textView.setText("");
			label.setText(presentInput+ "+");
			cal= "+";
			
		}
		else if(event == symEqual)
		{
			 if(textView.getText().isEmpty())
			    {
			        return;
			    }
			switch(cal) {
			case "x":
				     result= input * (Double.parseDouble(textView.getText()));
				     if(Double.toString(result).endsWith(".")) {
				    	 textView.setText(Double.toString(result).replace(".", ""));
				     } else
				     {
				    	 textView.setText(Double.toString(result));
				     }
				     label.setText("");
				     break;
			
			case "+":
					result= input + (Double.parseDouble(textView.getText()));
				     if(Double.toString(result).endsWith(".")) {
				    	 textView.setText(Double.toString(result).replace(".", ""));
				     } else
				     {
				    	 textView.setText(Double.toString(result));
				     }
				     label.setText("");
				     break;
			
					
			case "-":
					result= input - (Double.parseDouble(textView.getText()));
				     if(Double.toString(result).endsWith(".")) {
				    	 textView.setText(Double.toString(result).replace(".", ""));
				     } else
				     {
				    	 textView.setText(Double.toString(result));
				     }
				     label.setText("");
				     break;
			
					
				case "/":
					result= input / (Double.parseDouble(textView.getText()));
				     if(Double.toString(result).endsWith(".")) {
				    	 textView.setText(Double.toString(result).replace(".", ""));
				     } else
				     {
				    	 textView.setText(Double.toString(result));
				     }
				     label.setText("");
				     break;
			
			}
		}
	}


	

}
