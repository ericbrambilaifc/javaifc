package br.edu.ifcvideira.Lista15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.PopupMenuListener;
import javax.swing.event.PopupMenuEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class teste extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rdSoma = new JRadioButton("Soma");
	JRadioButton rdSubtracao = new JRadioButton("Subtração");
	JRadioButton rdMultiplicacao = new JRadioButton("Multiplicação");
	JRadioButton rdDivisao = new JRadioButton("Divisão");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					teste frame = new teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 634);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_2);
		
		JMenu mnNewMenu_3 = new JMenu("New menu");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbOperacao = new JComboBox();
		cbOperacao.addPopupMenuListener(new PopupMenuListener() {
			public void popupMenuCanceled(PopupMenuEvent e) {
			}
			public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				if (cbOperacao.getSelectedIndex()==0) {
					total = n1 + n2;
				} else if (cbOperacao.getSelectedIndex()==1) {
					total = n1 - n2;
				} else if (cbOperacao.getSelectedIndex()==2) {
					total = n1 * n2;
				} else {
					total = n1 / n2;
				}
				
				tfResult.setText("" +total);
				
				
			}
			public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
			}
		});
		cbOperacao.setModel(new DefaultComboBoxModel(new String[] {"Soma", "Subtração", "Multiplicação", "Divisão"}));
		cbOperacao.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		cbOperacao.setBounds(229, 165, 125, 22);
		contentPane.add(cbOperacao);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setForeground(new Color(64, 128, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 22));
		lblNewLabel.setBounds(168, 11, 125, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lbNome = new JLabel("Número 1:");
		lbNome.setForeground(new Color(64, 128, 128));
		lbNome.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lbNome.setBackground(Color.WHITE);
		lbNome.setBounds(143, 50, 80, 14);
		contentPane.add(lbNome);
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		tfNum1.setBounds(231, 48, 87, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNmero2 = new JLabel("Número 2:");
		lblNmero2.setForeground(new Color(64, 128, 128));
		lblNmero2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNmero2.setBackground(Color.WHITE);
		lblNmero2.setBounds(143, 77, 80, 14);
		contentPane.add(lblNmero2);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		tfNum2.setColumns(10);
		tfNum2.setBounds(231, 75, 87, 20);
		contentPane.add(tfNum2);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(new Color(64, 128, 128));
		lblResultado.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblResultado.setBackground(Color.BLACK);
		lblResultado.setBounds(143, 346, 80, 14);
		contentPane.add(lblResultado);
		
		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		tfResult.setColumns(10);
		tfResult.setBounds(231, 344, 87, 20);
		contentPane.add(tfResult);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 + n2;
				
				tfResult.setText(" " + total);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1.setBounds(120, 108, 47, 46);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 - n2;
				
				tfResult.setText(" " + total);
				
				
			
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_2.setBounds(177, 108, 47, 46);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("*");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 * n2;
				
				tfResult.setText(" " + total);
				
				
			
			}
		});
		btnNewButton_2_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_2_1.setBounds(232, 108, 47, 46);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("/");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 / n2;
				
				tfResult.setText(" " + total);
				
				
			
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_2_1_1.setBounds(286, 106, 47, 46);
		contentPane.add(btnNewButton_2_1_1);
		
		JLabel lblOperao = new JLabel("Operação");
		lblOperao.setForeground(new Color(64, 128, 128));
		lblOperao.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblOperao.setBackground(Color.BLACK);
		lblOperao.setBounds(143, 171, 80, 14);
		contentPane.add(lblOperao);
		
		JButton btnNewButton_1_1 = new JButton("Calcular");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				if (rdSoma.isSelected()) {
					total = n1 + n2;
				} else if (rdSubtracao.isSelected()) {
					total = n1 - n2;
				} else if (rdMultiplicacao.isSelected()) {
					total = n1 * n2;
				} else if (rdDivisao.isSelected()) {
					total = n1 / n2;
				}
				
				tfResult.setText("" +total);
				
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(240, 226, 125, 46);
		contentPane.add(btnNewButton_1_1);
		rdSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 + n2;
				
				tfResult.setText("" +total);
			}
		});
		
		
		rdSoma.setSelected(true);
		buttonGroup.add(rdSoma);
		rdSoma.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		rdSoma.setBounds(104, 214, 109, 23);
		contentPane.add(rdSoma);
		
		
		buttonGroup.add(rdSubtracao);
		rdSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 - n2;
				
				tfResult.setText("" +total);
				
			}
		});
		rdSubtracao.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		rdSubtracao.setBounds(104, 240, 109, 23);
		contentPane.add(rdSubtracao);
		
		
		buttonGroup.add(rdMultiplicacao);
		rdMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 * n2;
				
				tfResult.setText("" +total);
				
			}
		});
		rdMultiplicacao.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		rdMultiplicacao.setBounds(104, 266, 109, 23);
		contentPane.add(rdMultiplicacao);
		
		buttonGroup.add(rdDivisao);
		rdDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n1;
				double n2;
				double total = 0;
				
				n1 = Double.parseDouble(tfNum1.getText());
				n2 = Double.parseDouble(tfNum2.getText());
				
				total = n1 / n2;
				
				tfResult.setText("" +total);
				
			}
		});
		rdDivisao.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		rdDivisao.setBounds(104, 289, 109, 23);
		contentPane.add(rdDivisao);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(104, 384, 261, 90);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
