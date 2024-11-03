package models;

//Importação das bibliotecas
import javax.swing.*;
import java.awt.BorderLayout; 
import java.awt.FlowLayout;

public class AWTTestSwing {

	public static void main(String[] args) {
		
		// Cria uma Janela
		JFrame frame = new JFrame("AWT Test"); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setSize(600, 200); 
		frame.setLayout(new BorderLayout()); 
		
		JLabel label1 = new JLabel("Label1"); 
		JTextField textField1 = new JTextField(15); 
		
		JPanel topPanel = new JPanel(); 
		topPanel.setLayout(new FlowLayout()); 
		topPanel.add(label1);
		topPanel.add(textField1); 
		
		//Criando botões
		JButton button1 = new JButton("Button 1"); 
		JButton button2 = new JButton("Button 2"); 
		JButton button3 = new JButton("Button 3"); 
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout()); 
		buttonPanel.add(button1); 
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(buttonPanel, BorderLayout.CENTER); 
		
		frame.setVisible(true);
	}

}
