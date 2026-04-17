public class Cliente {
	private String nome;
	private float cred;
	private int id;
	public static int idAux;
	
	public Cliente(String nome, float cred) {
		this.nome = nome;
		this.cred = cred;
		idAux++;
		this.id = idAux;
	}
	
	public Cliente(String nome) {
		this(nome,0.0f);
	}
	
	public Cliente(float cred) {
		this("indefinido",cred);
	}
	public Cliente() {
		this("indefinido",0.0f);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setCred(float cred) {
		this.cred = cred;
	}
	
	public float getCred() {
		return this.cred;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		String r;
		r = "\nNome: "+this.nome+"\nCredito: "+this.cred+"\nIndentificador: "+this.id;
		return r;
	}
}
