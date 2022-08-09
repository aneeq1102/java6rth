import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
public class Frame1 extends JFrame{
	Frame1(){
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setSize(600,600);
		
		//
		
		JLabel name_lbl = new JLabel("name");
		name_lbl.setBounds(10,10,100,15);
		
		JTextField name_txt = new JTextField();
		name_txt.setBounds(120, 10, 100, 15);
		
		
		//
		
		JLabel usn_lbl = new JLabel("usn");
		usn_lbl.setBounds(10,30,100,15);
		
		JTextField usn_txt = new JTextField();
		usn_txt.setBounds(120, 30, 100, 15);
		
		//
		
		JLabel age_lbl = new JLabel("age");
		age_lbl.setBounds(10,50,100,15);
		
		JTextField age_txt = new JTextField();
		age_txt.setBounds(120, 50, 100, 15);
		
		//
		
		JTextArea area = new JTextArea();
		area.setBounds(150,150,200,200);
		
		//
		
		JLabel sgpa1_lbl = new JLabel("sgpa1");
		sgpa1_lbl.setBounds(10,90,100,15);
		
		JTextField sgpa1_txt = new JTextField();
		sgpa1_txt.setBounds(120, 90, 100, 15);
		
		//
		
		JLabel sgpa2_lbl = new JLabel("sgpa2");
		sgpa2_lbl.setBounds(10,110,100,15);
		
		JTextField sgpa2_txt = new JTextField();
		sgpa2_txt.setBounds(120, 110, 100, 15);
		
		JButton btn = new JButton("Cmopute");
		btn.setBounds(250,100,100,40);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String sgpa1 = sgpa1_txt.getText();
				String sgpa2 = sgpa2_txt.getText();
				
				if(sgpa1.equals("") || sgpa2.equals("")) {
					JOptionPane.showMessageDialog(null,"fields empty");
				}
				else {
					double cgpa = (Float.parseFloat(sgpa1) + Float.parseFloat(sgpa2))/2;
					JOptionPane.showMessageDialog(null, cgpa);
				}
				
				area.append("hello");
				area.append("goodbye");
				area.append("\n");
				area.append("hello");
				
			}
		});
		
		
		contentPane.add(name_lbl);
		contentPane.add(name_txt);
		contentPane.add(sgpa2_txt);
		contentPane.add(sgpa2_lbl);
		contentPane.add(sgpa1_lbl);
		contentPane.add(sgpa1_txt);
		contentPane.add(area);
		contentPane.add(age_txt);
		contentPane.add(age_lbl);
		contentPane.add(usn_txt);
		contentPane.add(usn_lbl);
		contentPane.add(btn);
		
	}
}
