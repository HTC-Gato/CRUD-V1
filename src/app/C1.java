package app;

public class C1 {

	    private String nome;
	    private String cpf;
	    private Sexo sexo;
	    private C2 c2;

	    public C1(String nome, String cpf, Sexo sexo, C2 c2) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.sexo = sexo;
	        this.c2 = c2;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public Sexo getSexo() {
	        return sexo;
	    }

	    public void setSexo(Sexo sexo) {
	        this.sexo = sexo;
	    }

	    public C2 getC2() {
	        return c2;
	    }

	    public void setC2(C2 c2) {
	        this.c2 = c2;
	    }

	    @Override
	    public String toString() {
	        return "Nome: " + nome +
	               ", CPF: " + cpf +
	               ", Sexo: " + sexo +
	               "\n    " + c2.toString();
	    }
	}


