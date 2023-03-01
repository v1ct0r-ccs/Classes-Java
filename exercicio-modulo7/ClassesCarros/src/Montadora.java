public class Montadora {
    private String nome;
    private int concessionaria;
    private int mecanicaAutorizada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(int concessionaria) {
        this.concessionaria = concessionaria;
    }

    public int getMecanicaAutorizada() {
        return mecanicaAutorizada;
    }

    public void setMecanicaAutorizada(int mecanicaAutorizada) {
        this.mecanicaAutorizada = mecanicaAutorizada;
    }
    public void cadastrarNome(String nome) {
        setNome(nome);
    }
}

