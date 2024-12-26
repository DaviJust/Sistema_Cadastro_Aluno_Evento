package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import model.aluno;
public class ParticipanteGUI extends JFrame {


	private static final long serialVersionUID = 1L;
	public JFrame frame;
	private DefaultTableModel model;
	private JTable table;
	private JScrollPane barraScroll;
	private JButton adicionar;
	private JTextField name;
	private JTextField matricula;
	private JTextField curso;
    int index = 0;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ParticipanteGUI painelCadastro = new ParticipanteGUI();
					painelCadastro .frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ParticipanteGUI() {
        frame = new JFrame("JTable Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(755, 475);

        String[] columnNames = {"Index","Nome","Matricula","Curso","Evento"};
        Object[][] data = {
       
        };

        model = new DefaultTableModel(data, columnNames);
        frame.getContentPane().setLayout(null);

        barraScroll = new JScrollPane();
        barraScroll.setBounds(374, 66, 343, 362);
        frame.getContentPane().add(barraScroll);
        table = new JTable(model);
        barraScroll.setViewportView(table);
        
       
        
        JLabel cadastroLabel = new JLabel("Cadastro");
        cadastroLabel.setBounds(109, 10, 105, 35);
        cadastroLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
        frame.getContentPane().add(cadastroLabel);
        
        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setBounds(10, 54, 64, 28);
        nomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
        frame.getContentPane().add(nomeLabel);
        
        name = new JTextField();
        name.setBounds(10, 91, 312, 28);
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setColumns(10);
        frame.getContentPane().add(name);
        
        JLabel matriculaLabel = new JLabel("Matricula");
        matriculaLabel.setBounds(10, 129, 83, 28);
        matriculaLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
        frame.getContentPane().add(matriculaLabel);
        
        matricula = new JTextField();
        matricula.setBounds(10, 167, 312, 28);
        matricula.setFont(new Font("Arial", Font.PLAIN, 16));
        matricula.setColumns(10);
        frame.getContentPane().add(matricula);
        
        JLabel cursoLabel = new JLabel("Curso");
        cursoLabel.setBounds(10, 205, 83, 28);
        cursoLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
        frame.getContentPane().add(cursoLabel);
        
        curso = new JTextField();
        curso.setBounds(10, 243, 312, 28);
        curso.setFont(new Font("Arial", Font.PLAIN, 16));
        curso.setColumns(10);
        frame.getContentPane().add(curso);
        
        JLabel eventoDesejado = new JLabel("Evento Desejado");
        eventoDesejado.setBounds(10, 281, 204, 28);
        eventoDesejado.setFont(new Font("Times New Roman", Font.BOLD, 19));
        frame.getContentPane().add(eventoDesejado);
        
        String[] opcoesDoEventos = { "Semana do IME", "SEMIC", "Semanas de Extensão", "Palestra de IA e seus desafios" };
        JComboBox<String> eventoOpcoes = new JComboBox<>(opcoesDoEventos );
        eventoOpcoes.setBounds(10, 313, 312, 35);
        eventoOpcoes.setFont(new Font("Arial", Font.PLAIN, 16));

		frame.getContentPane().add(eventoOpcoes);
        
        JButton limpar = new JButton("Limpar");
        limpar.setBounds(10, 388, 146, 40);
        limpar.setFont(new Font("SansSerif", Font.BOLD, 19));
        frame.getContentPane().add(limpar);
     
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	name.setText("");
            	matricula.setText("");
            	curso.setText("");
            	}
            });
  
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 2, 2);
        frame.getContentPane().add(scrollPane);
        
        JLabel cadastradosLabel = new JLabel("Cadastrados");
        cadastradosLabel.setBounds(467, 10, 146, 35);
        cadastradosLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
        frame.getContentPane().add(cadastradosLabel);
        
        JSeparator separator = new JSeparator();
        separator.setBounds(351, 10, 2, 428);
        separator.setOrientation(SwingConstants.VERTICAL);
        separator.setForeground(new Color(0, 0, 0));
        separator.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(separator);
        adicionar = new JButton("Adicionar");
        adicionar.setBounds(183, 388, 146, 40);
        adicionar.setFont(new Font("SansSerif", Font.BOLD, 19));
      
        adicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ArrayList<aluno> alunos = new ArrayList<aluno>();
                String eventos = eventoOpcoes.getSelectedItem().toString();
                String nomes = name.getText().trim();
                String matriculas = matricula.getText().trim();
                String cursos = curso.getText().trim();
                aluno novoAluno = new aluno(index, nomes, matriculas, cursos, eventos);
                if (!nomes.matches("[a-zA-Z\\s]+") || nomes.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "O nome digitado: " + nomes + "\nNão é válido. O nome deve conter apenas letras e não pode ser vazio.",
                        "Erro no Nome",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                if (!matriculas.matches("\\d{3,}")) {
                    JOptionPane.showMessageDialog(
                        null,
                        "A matrícula digitada: " + matriculas + "\nNão é válida. A matrícula deve conter apenas números e no mínimo 3 dígitos.",
                        "Erro na Matrícula",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                if (!cursos.matches("[a-zA-Z\\s]+") || cursos.isEmpty()) {
                    JOptionPane.showMessageDialog(
                        null,
                        "O curso digitado: " + cursos + "\nNão é válido. O curso deve conter apenas letras e não pode ser vazio.",
                        "Erro no Curso",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                index +=1;
                alunos.add(novoAluno);                
                Object[] dados = {alunos.get(0).getIndex(),alunos.get(0).getNome(), alunos.get(0).getMatricula(),alunos.get(0).getCurso(), alunos.get(0).getEvento()};
                model.addRow(dados);

                JOptionPane.showMessageDialog(
                    null,
                    "DADOS CADASTRADOS COM SUCESSO!",
                    "Sucesso",
                    JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        frame.getContentPane().add(adicionar);
        frame.setVisible(true);
    }

  
}
