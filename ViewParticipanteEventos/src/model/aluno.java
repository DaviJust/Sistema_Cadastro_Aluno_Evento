package model;
/**
 * Classe que representa um aluno.
 * Esta classe contém informações sobre o aluno, como nome, matrícula, curso e evento.
 * 
 * @author Davi Justino
 * @since 26/12/2020
 */
public class aluno {
	
	private int index;
	private String nome;
	private String matricula;
	private String curso;
	private String evento;

	/**
	 * Retorna o nome do aluno.
	 * @return nome do aluno
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome do aluno.
	 * @param nome nome do aluno a ser definido
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a matrícula do aluno.
	 * @return matrícula do aluno
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Define a matrícula do aluno.
	 * @param matricula matrícula do aluno a ser definida, em formato String
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Retorna o curso do aluno.
	 * @return curso do aluno
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Define o curso do aluno.
	 * @param curso curso do aluno a ser definido
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * Retorna o evento em que o aluno está inscrito.
	 * @return evento do aluno
	 */
	public String getEvento() {
		return evento;
	}

	/**
	 * Define o evento em que o aluno está inscrito.
	 * @param evento evento do aluno a ser definido
	 */
	public void setEvento(String evento) {
		this.evento = evento;
	}

	/**
	 * Retorna o índice do aluno.
	 * @return índice do aluno
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Define o índice do aluno.
	 * @param index índice do aluno a ser definido, representando a posição no arraylist
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Construtor completo
	 * @param index esse código pode definir o número do usuário, como se fosse uma planilha e também fala em qual posição está no arraylist
	 * @param nome nome do aluno
	 * @param matricula matricula do aluno, está em String devido ao tratamento que é usado dentro do pacote view
	 * @param curso curso do aluno
	 * @param evento qual evento o aluno está inscrito
	 * 
	 */
	public aluno(int index, String nome, String matricula, String curso, String evento) {
		super();
		this.index = index;
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.evento = evento;
	}
}