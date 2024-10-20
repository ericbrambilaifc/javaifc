package br.edu.ifcvideira.Lista15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ex2Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfModelo;
	private JTextField tfValorAno;
	private JTextField tfAno;
	private JTextField tfCapacidade;
	JComboBox cbAlternativa = new JComboBox();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex2Principal frame = new Ex2Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ex2Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione o Tipo de Veiculo");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblNewLabel.setBounds(137, 25, 196, 14);
		contentPane.add(lblNewLabel);
		
		
		cbAlternativa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cbAlternativa.getSelectedIndex() == 0) {
					tfCapacidade.setEnabled(true);				//Caminhao
										
				}else if  (cbAlternativa.getSelectedIndex() == 1) {
					tfCapacidade.setEnabled(false);												// Moto
				} else if  (cbAlternativa.getSelectedIndex() == 2) {
					
					tfCapacidade.setEnabled(false);						//AUtomovel
				}	
 
			}
		});
		cbAlternativa.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		cbAlternativa.setModel(new DefaultComboBoxModel(new String[] {"Caminhão", "Moto ", "Automovel"}));
		cbAlternativa.setToolTipText("");
		cbAlternativa.setBounds(178, 50, 93, 22);
		contentPane.add(cbAlternativa);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ano;
				String modelo;
				double valor;
				double capacidade;
				
				ano = Integer.parseInt(tfAno.getText());
				modelo = String.valueOf(tfModelo.getText());
				valor = Double.parseDouble(tfValorAno.getText());
			
				
				
				
				if(cbAlternativa.getSelectedIndex()==0) {
					Ex2Caminhao ca = new Ex2Caminhao();
					
					capacidade = Double.parseDouble(tfCapacidade.getText());					
					ca.setAno(ano);
					ca.setModelo(modelo);
					ca.setValor(valor);
					ca.setCapacidadeToneladas(capacidade);
					
					ca.imprimir();
					
					
				}
				
				if(cbAlternativa.getSelectedIndex()==1) {
					Ex2Moto mo = new Ex2Moto();
					
					mo.setAno(ano);
					mo.setModelo(modelo);
					mo.setValor(valor);
					
					mo.imprimir();
					
					
				}
				
				if(cbAlternativa.getSelectedIndex()==2) {
					Ex2Automovel au = new Ex2Automovel();
					
					au.setAno(ano);
					au.setModelo(modelo);
					au.setValor(valor);
					
					au.imprimir();
					
					
				}

				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 15));
		btnNewButton.setBounds(178, 232, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(39, 89, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		tfModelo = new JTextField();
		tfModelo.setBounds(118, 88, 86, 20);
		contentPane.add(tfModelo);
		tfModelo.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor Ano\r\n");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(39, 123, 78, 14);
		contentPane.add(lblNewLabel_1_1);
		
		tfValorAno = new JTextField();
		tfValorAno.setColumns(10);
		tfValorAno.setBounds(118, 122, 86, 20);
		contentPane.add(tfValorAno);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ano\r\n");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(39, 156, 78, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		tfAno = new JTextField();
		tfAno.setColumns(10);
		tfAno.setBounds(118, 155, 86, 20);
		contentPane.add(tfAno);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Capacidade\r\n");
		lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(39, 187, 78, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		tfCapacidade = new JTextField();
		tfCapacidade.setColumns(10);
		tfCapacidade.setBounds(119, 186, 86, 20);
		contentPane.add(tfCapacidade);
	}
}
