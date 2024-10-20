package br.edu.ifcvideira.Lista15;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;


public class Ex1Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JComboBox cbPlacaVideo = new JComboBox();
	JCheckBox chEstabilizador = new JCheckBox("Estabilizador\r\n 100,00");
	JCheckBox chTeclado = new JCheckBox("Teclado - 100,00");
	JCheckBox chMonitor = new JCheckBox("Monitor - 500,00");
	JCheckBox chPasta = new JCheckBox("Pasta 200,00");
	JCheckBox chCarregador = new JCheckBox("Carregador - 200,00");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1Principal frame = new Ex1Principal();
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
	public Ex1Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 711);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha seu Computador");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNewLabel.setBounds(182, 11, 174, 28);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbDesktop = new JRadioButton("Desktop");
		rbDesktop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbDesktop.isSelected()) {
					chEstabilizador.setEnabled(true);
					chTeclado.setEnabled(true);
					chMonitor.setEnabled(true);
					chCarregador.setEnabled(false);
					chPasta.setEnabled(false);
					
				}
			}
		});
		buttonGroup.add(rbDesktop);
		rbDesktop.setSelected(true);
		rbDesktop.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		rbDesktop.setBounds(82, 77, 70, 23);
		contentPane.add(rbDesktop);
		
		JRadioButton rbNotebook = new JRadioButton("Notebook");
		rbNotebook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbNotebook.isSelected()) {
					chCarregador.setEnabled(true);
					chPasta.setEnabled(true);
					chEstabilizador.setEnabled(false);
					chMonitor.setEnabled(false);
					chTeclado.setEnabled(false);
					
				}
				
			}
		});
		buttonGroup.add(rbNotebook);
		rbNotebook.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 11));
		rbNotebook.setBounds(417, 78, 88, 23);
		contentPane.add(rbNotebook);
		
		JLabel lblPorocesssador = new JLabel("Processador");
		lblPorocesssador.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblPorocesssador.setBounds(48, 121, 174, 28);
		contentPane.add(lblPorocesssador);
		
		JComboBox cbProcessador = new JComboBox();
		cbProcessador.setModel(new DefaultComboBoxModel(new String[] {"Xeon - 80,00", "Ryzen 5 2600 - 400,00", "Ryzen 5 5800x - 900.00"}));
		cbProcessador.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		cbProcessador.setBounds(261, 126, 245, 22);
		contentPane.add(cbProcessador);
		
		JComboBox cbPlacaMae = new JComboBox();
		cbPlacaMae.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - 600,00", "Modelo 2 - 800,00", "Modelo 3 - 1000,00"}));
		cbPlacaMae.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		cbPlacaMae.setBounds(260, 165, 245, 22);
		contentPane.add(cbPlacaMae);
		
		JLabel lblPlacaMe = new JLabel("Placa Mãe");
		lblPlacaMe.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblPlacaMe.setBounds(47, 160, 174, 28);
		contentPane.add(lblPlacaMe);
		
		JLabel lblMemoria = new JLabel("Memoria\r\n");
		lblMemoria.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblMemoria.setBounds(48, 198, 174, 28);
		contentPane.add(lblMemoria);
		
		JComboBox cbMemoria = new JComboBox();
		cbMemoria.setModel(new DefaultComboBoxModel(new String[] {"4 Gb - 100,00", "8 Gb - 200,00", "16 Gb - 400,00"}));
		cbMemoria.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		cbMemoria.setBounds(261, 203, 245, 22);
		contentPane.add(cbMemoria);
		
		JLabel lblHd = new JLabel("HD");
		lblHd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		lblHd.setBounds(48, 237, 174, 28);
		contentPane.add(lblHd);
		
		JComboBox cbHd = new JComboBox();
		cbHd.setModel(new DefaultComboBoxModel(new String[] {"250Gb - 200,00", "500Gb - 400,00", "1Tb - 600,00"}));
		cbHd.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		cbHd.setBounds(260, 242, 245, 22);
		contentPane.add(cbHd);
		
		JCheckBox chPlacaVideo = new JCheckBox("Placa Vídeo Off-Board");
		chPlacaVideo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chPlacaVideo.isSelected()) {
					cbPlacaVideo.setEnabled(true);
				}
				else {
					cbPlacaVideo.setEnabled(false);
				}
			}
		});
		chPlacaVideo.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		chPlacaVideo.setBounds(48, 295, 151, 23);
		contentPane.add(chPlacaVideo);
		
		
		cbPlacaVideo.setEnabled(false);
		cbPlacaVideo.setModel(new DefaultComboBoxModel(new String[] {"Modelo 1 - 800,00", "Modelo 2 - 1200,00", "Modelo 3 - 1600,00"}));
		cbPlacaVideo.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		cbPlacaVideo.setBounds(260, 296, 245, 22);
		contentPane.add(cbPlacaVideo);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 401, 457, 14);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(270, 401, 2, 95);
		contentPane.add(separator_1);
		
		
		chEstabilizador.setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		chEstabilizador.setBounds(48, 422, 151, 23);
		contentPane.add(chEstabilizador);
		
		
		chTeclado.setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		chTeclado.setBounds(48, 455, 151, 23);
		contentPane.add(chTeclado);
		
		
		chMonitor.setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		chMonitor.setBounds(47, 488, 151, 23);
		contentPane.add(chMonitor);
		
	
		chPasta.setEnabled(false);
		chPasta.setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		chPasta.setBounds(286, 455, 151, 23);
		contentPane.add(chPasta);
		
	
		chCarregador.setEnabled(false);
		chCarregador.setFont(new Font("Segoe UI Historic", Font.ITALIC, 13));
		chCarregador.setBounds(286, 422, 151, 23);
		contentPane.add(chCarregador);
		
		JCheckBox chGarantia = new JCheckBox("Garantia Estendida");
		chGarantia.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		chGarantia.setBounds(200, 530, 142, 23);
		contentPane.add(chGarantia);
		
		JButton btnNewButton = new JButton("Finalizar Compra");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				if(rbDesktop.isSelected()) {
					Ex1Desktop de = new Ex1Desktop();
					
					de.setConfig("");
					
					if (cbProcessador.getSelectedIndex() == 0) {
						de.setProcessador(80);
						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						de.setProcessador(400);
							
					} else if (cbProcessador.getSelectedIndex() == 2) {
						de.setProcessador(900);
					
					}
					
					de.setConfig(de.getConfig()+"Processador: " + cbProcessador.getSelectedItem()+"\n");
					
					
					//placa mae
					if (cbPlacaMae.getSelectedIndex() == 0) {
						de.setPlacaMae(600);
						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						de.setPlacaMae(800);
							
					} else if (cbProcessador.getSelectedIndex() == 2) {
						de.setPlacaMae(1000);
					
					}
					
					de.setConfig(de.getConfig()+"Placa Mae: " + cbPlacaMae.getSelectedItem()+"\n");
					
					// memoria 
					if (cbMemoria.getSelectedIndex() == 0) {
						de.setPlacaMae(100);
						
					} else if (cbMemoria.getSelectedIndex() == 1) {
						de.setPlacaMae(200);
							
					} else if (cbMemoria.getSelectedIndex() == 2) {
						de.setPlacaMae(400);
					
					}
					
					de.setConfig(de.getConfig()+"Memoria: " + cbMemoria.getSelectedItem()+"\n");
					
					
					
					// HD 
					if (cbHd.getSelectedIndex() == 0) {
						de.setPlacaMae(200);
						
					} else if (cbHd.getSelectedIndex() == 1) {
						de.setPlacaMae(400);
							
					} else if (cbHd.getSelectedIndex() == 2) {
						de.setPlacaMae(600);
					
					}
					
					de.setConfig(de.getConfig()+"HD: " + cbHd.getSelectedItem()+"\n");

					
					if(chPlacaVideo.isSelected()) {
						if (cbPlacaVideo.getSelectedIndex() == 0) {
							de.setPlacaMae(800);
							
						} else if (cbPlacaVideo.getSelectedIndex() == 1) {
							de.setPlacaMae(1200);
								
						} else if (cbPlacaVideo.getSelectedIndex() == 2) {
							de.setPlacaMae(1600);
						
						}
						
						de.setConfig(de.getConfig()+"Placa de Video: " + cbPlacaVideo.getSelectedItem()+"\n");
					}
		          
					
					//ESTABILIZADOR
					if(chEstabilizador.isSelected()) {
						de.setEstabilizador(100);
						de.setConfig(de.getConfig()+chEstabilizador.getText()+"\n");
					}
					
					//TECLADO
					if(chTeclado.isSelected()) {
						de.setTeclado(100);
						de.setConfig(de.getConfig()+chTeclado.getText()+"\n");
					}
					 
					
					//MONITOR
					if(chMonitor.isSelected()) {
						de.setMonitor(100);
						de.setConfig(de.getConfig()+chMonitor.getText()+"\n");
					}
					
					de.setVolumes(4);
					de.setConfig(de.getConfig()+"Volumes: "+de.getVolumes()+"\n");
					
					if(chGarantia.isSelected()) {
						de.imprimeGarantia();
						
					}else {
						de.imprime();
					}
		        
				
				} //desktop
				
				else if (rbNotebook.isSelected()) {
					Ex1Notebook no = new Ex1Notebook();
					
					no.setConfig("");
					
					if (cbProcessador.getSelectedIndex() == 0) {
						no.setProcessador(80);
						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						no.setProcessador(400);
							
					} else if (cbProcessador.getSelectedIndex() == 2) {
						no.setProcessador(900);
					
					}
					
					no.setConfig(no.getConfig()+"Processador: " + cbProcessador.getSelectedItem()+"\n");
					
					
					//placa mae
					if (cbPlacaMae.getSelectedIndex() == 0) {
						no.setPlacaMae(600);
						
					} else if (cbProcessador.getSelectedIndex() == 1) {
						no.setPlacaMae(800);
							
					} else if (cbProcessador.getSelectedIndex() == 2) {
						no.setPlacaMae(1000);
					
					}
					
					no.setConfig(no.getConfig()+"Placa Mae: " + cbPlacaMae.getSelectedItem()+"\n");
					
					// memoria 
					if (cbMemoria.getSelectedIndex() == 0) {
						no.setPlacaMae(100);
						
					} else if (cbMemoria.getSelectedIndex() == 1) {
						no.setPlacaMae(200);
							
					} else if (cbMemoria.getSelectedIndex() == 2) {
						no.setPlacaMae(400);
					
					}
					
					no.setConfig(no.getConfig()+"Memoria: " + cbMemoria.getSelectedItem()+"\n");
					
					
					
					// HD 
					if (cbHd.getSelectedIndex() == 0) {
						no.setPlacaMae(200);
						
					} else if (cbHd.getSelectedIndex() == 1) {
						no.setPlacaMae(400);
							
					} else if (cbHd.getSelectedIndex() == 2) {
						no.setPlacaMae(600);
					
					}
					
					no.setConfig(no.getConfig()+"HD: " + cbHd.getSelectedItem()+"\n");

					
					if(chPlacaVideo.isSelected()) {
						if (cbPlacaVideo.getSelectedIndex() == 0) {
							no.setPlacaMae(800);
							
						} else if (cbPlacaVideo.getSelectedIndex() == 1) {
							no.setPlacaMae(1200);
								
						} else if (cbPlacaVideo.getSelectedIndex() == 2) {
							no.setPlacaMae(1600);
						
						}
						
						no.setConfig(no.getConfig()+"Placa de Video: " + cbPlacaVideo.getSelectedItem()+"\n");
					}
		          
					
					//CARREGADOR
					if(chCarregador.isSelected()) {
						no.setCarregador(200);
						no.setConfig(no.getConfig()+chCarregador.getText()+"\n");
					}
					
					//TECLADO
					if(chPasta.isSelected()) {
						no.setPasta(200);
						no.setConfig(no.getConfig()+chPasta.getText()+"\n");
					}
					 
					
					no.setVolumes(1);
					no.setConfig(no.getConfig()+"Volumes: "+no.getVolumes()+"\n");
					
					if(chGarantia.isSelected()) {
						no.imprimeGarantia();
						
					}else {
						no.imprime();
					}
				}
		    }
		});
		btnNewButton.setBounds(208, 576, 131, 23);
		contentPane.add(btnNewButton);
	 }
	} 
	
