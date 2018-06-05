package formularios;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;


public class FormPrincipal {
	private JTextField txtNomeJogador;
	
	public FormPrincipal() {
		
	URL url = FormPrincipal.class.getResource("/img/bg.gif");
	ImageIcon imageIcon = new ImageIcon(url);
	
		
	JFrame frmPrincipal = new JFrame("QUIZ");
	frmPrincipal.setSize(600, 400);
	frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frmPrincipal.setLocationRelativeTo(null);
	frmPrincipal.getContentPane().setLayout(null);
	
	
	JButton btnPlay = new JButton("(IMAGEM)");
	btnPlay.setBounds(354, 285, 86, 23);
	frmPrincipal.getContentPane().add(btnPlay);
	
	JComboBox comboTema = new JComboBox();
	comboTema.setBounds(89, 286, 114, 20);
	frmPrincipal.getContentPane().add(comboTema);
	
	txtNomeJogador = new JTextField();
	txtNomeJogador.setText("JOGADOR");
	txtNomeJogador.setBounds(86, 42, 228, 20);
	frmPrincipal.getContentPane().add(txtNomeJogador);
	txtNomeJogador.setColumns(10);
	
	
	
	//ADD BACKGROUND
	JLabel label = new JLabel(imageIcon);
	frmPrincipal.getContentPane().add(label);
	label.setSize(600, 400);
	

	
	
	//FRM SET VISIBLE
	frmPrincipal.setVisible(true);
	
	
	}
}
