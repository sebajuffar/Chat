package interfaces.cliente;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ClienteConversacion extends JFrame {

	private static final long serialVersionUID = 5267263456354525306L;

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public ClienteConversacion() {
		setTitle("Conversaci\u00F3n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 506, 460, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(483, 505, 89, 23);
		contentPane.add(btnNewButton);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setText("<Aqui iran los mensajes>");
		textArea.setRows(1);
		textArea.setColumns(1);
		textArea.setBounds(10, 136, 460, 359);
		contentPane.add(textArea);

		ImageIcon imagen = new ImageIcon(
				"C:\\Users\\Jorge Nicolas\\Desktop\\icono_Fran.jpg");
		JLabel lblNewLabel = new JLabel(imagen);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 148, 114);
		contentPane.add(lblNewLabel);

		JLabel lblNombreDeUsuario = new JLabel("NOMBRE DE USUARIO");
		lblNombreDeUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreDeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNombreDeUsuario.setBounds(168, 11, 302, 68);
		contentPane.add(lblNombreDeUsuario);

	}
}
