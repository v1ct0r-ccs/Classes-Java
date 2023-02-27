package src.br.com.vbccs.pacote1;

/**
 * @author victor.bruno
 */
public class Classe2 {
    private String propriedadePrivada;
    public String propriedadePublica;
    String propriedadeDefaul;
    protected String propriedadeProtected;

    /**
     * comentário do que o método faz
     *
     * @param args asdasda
     */
    public static void main(String args[]) {
        Classe1 classe1 = new Classe1();
        classe1.getPropriedadePrivada();
    }
}
