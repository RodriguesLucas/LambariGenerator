package br.com.unisc.project.frontend;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;

public class SecondInterface {

	private JFrame frmLambariGeneretor;
	private JTextField textInfo;
	private JTextArea textAreaLogin;
	private JTextArea textAreaPassword;
	private JButton btnGeneretor;
	private JLabel lblNewLabel;
	private JTextField textDate;
	private JLabel lblDate;
	private JTextField textSurname;
	private JLabel lblSurname;
	private JTextField textName;
	private JLabel lblName;
	private JLabel lblLogin;
	private JLabel lblPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecondInterface window = new SecondInterface();
					window.frmLambariGeneretor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SecondInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLambariGeneretor = new JFrame();
		frmLambariGeneretor.setResizable(false);
		frmLambariGeneretor.setIconImage(new ImageIcon(System.getProperty("user.dir") + "/br/com/unisc/project/frontend/assets/icon_app.png"));
		frmLambariGeneretor.setTitle("Lambari Generetor");
		frmLambariGeneretor.setBounds(100, 100, 663, 439);
		frmLambariGeneretor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLambariGeneretor.setVisible(true);
		frmLambariGeneretor.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		frmLambariGeneretor.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setSelectedIcon(new ImageIcon(System.getProperty("user.dir") + "/br/com/unisc/project/frontend/assets/question.png"));
		btnNewButton.setForeground(Color.LIGHT_GRAY);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setIcon(new ImageIcon(System.getProperty("user.dir") +"/br/com/unisc/project/frontend/assets/question.png"));
		btnNewButton.setBounds(608, 10, 31, 33);
		panel.add(btnNewButton);
		
		lblLogin = new JLabel("Logins Sugeridos");
		lblLogin.setFont(new Font("Dialog", Font.BOLD, 14));
		lblLogin.setBounds(288, 264, 145, 27);
		panel.add(lblLogin);
		
		lblPassword = new JLabel("Senhas Sugeridas");
		lblPassword.setFont(new Font("Dialog", Font.BOLD, 14));
		lblPassword.setBounds(470, 264, 145, 27);
		panel.add(lblPassword);
		
		textName = new JTextField();
		textName.setBackground(Color.GRAY);
		textName.setColumns(10);
		textName.setBounds(10, 59, 252, 38);
		panel.add(textName);
		
		textDate = new JTextField();
		textDate.setBackground(Color.GRAY);
		textDate.setColumns(10);
		textDate.setBounds(10, 204, 252, 38);
		panel.add(textDate);
		
		lblDate = new JLabel("Data de Nascimento");
		lblDate.setFont(new Font("Dialog", Font.BOLD, 16));
		lblDate.setBounds(10, 185, 252, 19);
		panel.add(lblDate);
		
		textSurname = new JTextField();
		textSurname.setBackground(Color.GRAY);
		textSurname.setColumns(10);
		textSurname.setBounds(10, 131, 252, 39);
		panel.add(textSurname);
		
		lblSurname = new JLabel("Sobrenome");
		lblSurname.setFont(new Font("Dialog", Font.BOLD, 16));
		lblSurname.setBounds(10, 112, 257, 19);
		panel.add(lblSurname);
		
		lblName = new JLabel("Nome");
		lblName.setFont(new Font("Dialog", Font.BOLD, 16));
		lblName.setBounds(10, 40, 252, 19);
		panel.add(lblName);
		
		JLabel lblInfo = new JLabel("Informação sobre o site ou setor:");
		lblInfo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblInfo.setBounds(10, 252, 268, 19);
		panel.add(lblInfo);
		
		btnGeneretor = new JButton("GERAR");
		btnGeneretor.setFont(new Font("Dialog", Font.BOLD, 18));
		btnGeneretor.setForeground(Color.DARK_GRAY);
		btnGeneretor.setBackground(Color.LIGHT_GRAY);
		btnGeneretor.setIcon(new ImageIcon(System.getProperty("user.dir") + "/br/com/unisc/project/frontend/assets/start.png"));
		btnGeneretor.setBounds(10, 318, 252, 74);
		panel.add(btnGeneretor);
		
		textAreaLogin = new JTextArea();
		textAreaLogin.setBackground(Color.GRAY);
		textAreaLogin.setBounds(286, 287, 166, 105);
		panel.add(textAreaLogin);
		
		textInfo = new JTextField();
		textInfo.setBackground(Color.GRAY);
		textInfo.setBounds(10, 270, 252, 38);
		panel.add(textInfo);
		textInfo.setColumns(10);
		
		textAreaPassword = new JTextArea();
		textAreaPassword.setBackground(Color.GRAY);
		textAreaPassword.setBounds(470, 287, 169, 105);
		panel.add(textAreaPassword);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 649, 427);
		lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "/br/com/unisc/project/frontend/assets/BackgroundScreen4.png"));
		panel.add(lblNewLabel);
	}
}
