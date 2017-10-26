package ListaDoblementeEnlazada;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textid;
	private JTextField textgenero;
	private JTextField textartista;
	private JTextField textcancion;
	private JTextField textalbum;
	private JTextArea textlista;
	private ListaDE LD=new ListaDE();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblqueOperacionDeseas = new JLabel("\u00BFQue operacion deseas realizar?");
		lblqueOperacionDeseas.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblqueOperacionDeseas.setBounds(106, 331, 228, 24);
		contentPane.add(lblqueOperacionDeseas);
		
		
		JComboBox<String> opciones = new JComboBox<String>();
		opciones.setBounds(124, 366, 188, 20);
		contentPane.add(opciones);
		opciones.addItem("1.Insertar nodo adelante");
		opciones.addItem("2.Insertar nodo atrás");
		opciones.addItem("3.Eliminar primer nodo");
		opciones.addItem("4.Eliminar último nodo");
		opciones.addItem("5.Imprimir Lista adelante");
		opciones.addItem("6.Imprimir Lista atras");
		
		JLabel lblid = new JLabel("Id");
		lblid.setBounds(64, 29, 46, 14);
		contentPane.add(lblid);
		
		textid = new JTextField();
		textid.setBounds(138, 26, 196, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		JLabel lblgenero = new JLabel("Genero");
		lblgenero.setBounds(64, 71, 46, 14);
		contentPane.add(lblgenero);
		
		textgenero = new JTextField();
		textgenero.setBounds(138, 68, 196, 20);
		contentPane.add(textgenero);
		textgenero.setColumns(10);
		
		JLabel lblartista = new JLabel("Artista");
		lblartista.setBounds(64, 117, 46, 14);
		contentPane.add(lblartista);
		
		textartista = new JTextField();
		textartista.setBounds(138, 114, 196, 20);
		contentPane.add(textartista);
		textartista.setColumns(10);
		
		JLabel lblcancion = new JLabel("Cancion");
		lblcancion.setBounds(64, 164, 46, 14);
		contentPane.add(lblcancion);
		
		textcancion = new JTextField();
		textcancion.setBounds(140, 161, 194, 20);
		contentPane.add(textcancion);
		textcancion.setColumns(10);
		
		JLabel lblalbum = new JLabel("Album");
		lblalbum.setBounds(64, 213, 46, 14);
		contentPane.add(lblalbum);
		
		textalbum = new JTextField();
		textalbum.setBounds(137, 210, 196, 20);
		contentPane.add(textalbum);
		textalbum.setColumns(10);
		
		textlista = new JTextArea();
		textlista.setBounds(64, 263, 321, 73);
		contentPane.add(textlista);
		textlista.setColumns(10);
		
		JLabel lblLista = new JLabel("Lista");
		lblLista.setFont(new Font("Swis721 WGL4 BT", Font.PLAIN, 14));
		lblLista.setBounds(186, 241, 46, 14);
		contentPane.add(lblLista);
		opciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Opciones.setOpc(opciones.getSelectedItem().toString());
				
				if(Opciones.getOpc().equals("1.Insertar nodo adelante"))
				{
					ListaDE mandar=new ListaDE();
					Musica insertar=new Musica();
					insertar.setId(Integer.parseInt(textid.getText()));
					insertar.setGenero(textid.getText());
					insertar.setCancion(textcancion.getText());
					insertar.setArtista(textartista.getText());
					insertar.setAlbum(textalbum.getText());
					mandar.insertarPrincipio(insertar);
					
				}
				if(Opciones.getOpc().equals("2.Insertar nodo atrás"))
				{
					ListaDE mandar=new ListaDE();
					Musica insertar=new Musica();
					insertar.setId(Integer.parseInt(textid.getText()));
					insertar.setGenero(textid.getText());
					insertar.setCancion(textcancion.getText());
					insertar.setArtista(textartista.getText());
					insertar.setAlbum(textalbum.getText());
					mandar.insertarFinal(insertar);
				}
				if(Opciones.getOpc().equals("3.Eliminar primer nodo"))
				{
					ListaDE eliminar=new ListaDE();
					eliminar.eliminarprimer();

				}
				if(Opciones.getOpc().equals("4.Eliminar último nodo"))
				{
					ListaDE eliminar=new ListaDE();
					eliminar.eliminarultimo();
				}
				if(Opciones.getOpc().equals("5.Imprimir Lista adelante"))
				{
					 textlista.append(LD.imprimiradelante().toString());
				}
				if(Opciones.getOpc().equals("6.Imprimir Lista atras"))
				{
					textlista.append(LD.imprimiratras().toString());
				}
				
				
				}
		});
		
	}
}
