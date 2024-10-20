package br.edu.ifcvideira.Lista15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Ex3AzPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final JLabel TfComprimentoParede = null;
	protected static final JLabel TfAlturaAzulejo = null;
	private JPanel contentPane;
	private JTextField tfComprimentoParede;
	private JTextField tfAlturaParede;
	private JTextField tfComprimentoAzulejo;
	private JTextField tfAlturaAzulejo;
	private JTextField tfQuantidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex3AzPrincipal frame = new Ex3AzPrincipal();
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
	public Ex3AzPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CALCULADORA");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(185, 11, 91, 25);
		contentPane.add(lblNewLabel);
		
		JComboBox cbAlternativa = new JComboBox();
		
		cbAlternativa.setModel(new DefaultComboBoxModel(new String[] {"Quadrado", "Retangular", "Triangular de Lados Iguais", "Triangular de Lados Diferentes"}));
		cbAlternativa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cbAlternativa.setBounds(139, 59, 180, 22);
		contentPane.add(cbAlternativa);
		
		JLabel lblrea = new JLabel("Comprimento da Parede");
		lblrea.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblrea.setBounds(68, 122, 147, 25);
		contentPane.add(lblrea);
		
		tfComprimentoParede = new JTextField();
		tfComprimentoParede.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfComprimentoParede.setBounds(225, 123, 86, 20);
		contentPane.add(tfComprimentoParede);
		tfComprimentoParede.setColumns(10);
		
		JLabel lblComprimento = new JLabel("Altura da Parede");
		lblComprimento.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblComprimento.setBounds(68, 158, 117, 25);
		contentPane.add(lblComprimento);
		
		tfAlturaParede = new JTextField();
		tfAlturaParede.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfAlturaParede.setColumns(10);
		tfAlturaParede.setBounds(225, 159, 86, 20);
		contentPane.add(tfAlturaParede);
		
		JLabel lblComprimentoDoAzulo = new JLabel("Comprimento do Azulejo");
		lblComprimentoDoAzulo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblComprimentoDoAzulo.setBounds(68, 198, 147, 25);
		contentPane.add(lblComprimentoDoAzulo);
		
		tfComprimentoAzulejo = new JTextField();
		tfComprimentoAzulejo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfComprimentoAzulejo.setColumns(10);
		tfComprimentoAzulejo.setBounds(225, 199, 86, 20);
		contentPane.add(tfComprimentoAzulejo);
		
		JLabel lblAlturaDoAzulejo = new JLabel("Altura do Azulejo");
		lblAlturaDoAzulejo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblAlturaDoAzulejo.setBounds(68, 234, 117, 25);
		contentPane.add(lblAlturaDoAzulejo);
		
		tfAlturaAzulejo = new JTextField();
		tfAlturaAzulejo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfAlturaAzulejo.setColumns(10);
		tfAlturaAzulejo.setBounds(225, 235, 86, 20);
		contentPane.add(tfAlturaAzulejo);
		
		JButton btnNewButton = new JButton("CALCULAR\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				double altParede = 0;
				double largParede = 0;
				double altAzulejo = 0;
				double largAzulejo = 0;
				
				Ex3Calculadora ca = new Ex3Calculadora();
				
				altParede = Double.parseDouble(tfAlturaParede.getText());
				largParede = Double.parseDouble(tfComprimentoParede.getText());
				altAzulejo = Double.parseDouble(tfAlturaAzulejo.getText());
				largAzulejo = Double.parseDouble(tfComprimentoAzulejo.getText());
				
				
				
				ca.setAlturaParede(altParede);
				ca.setLarguraParede(largParede);
				ca.setAlturaAzulejo(altAzulejo);
				ca.setLarguraAzulejo(largAzulejo);
				
				
				if (cbAlternativa.getSelectedIndex() == 0) {
				
					tfQuantidade.setText(""+ca.calculaQuadrado());
					
				
				}else if  (cbAlternativa.getSelectedIndex() == 1) {
					
					tfQuantidade.setText(""+ca.retangular());
					
				} else if  (cbAlternativa.getSelectedIndex() == 2) {
					
					tfQuantidade.setText(""+ca.ladosDiferentes());
					
				} else if  (cbAlternativa.getSelectedIndex() == 3) {
					
					tfQuantidade.setText(""+ca.ladosIguais());
					
				} 	
			}
				
				
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnNewButton.setBounds(159, 270, 135, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblAlturaDoAzulejo_1 = new JLabel("Resultado");
		lblAlturaDoAzulejo_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblAlturaDoAzulejo_1.setBounds(159, 337, 69, 25);
		contentPane.add(lblAlturaDoAzulejo_1);
		
		tfQuantidade = new JTextField();
		tfQuantidade.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		tfQuantidade.setColumns(10);
		tfQuantidade.setBounds(225, 338, 86, 20);
		contentPane.add(tfQuantidade);
		
}
}
