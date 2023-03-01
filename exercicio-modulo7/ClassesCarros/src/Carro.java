/**
 * @author Victor.Bruno
 */
public class Carro {
    /**
     *
     * @version 0.1
     */

     public static void main (String args[]) {
     Montadora montadora = new Montadora();
     montadora.cadastrarNome("Ford");
     montadora.setConcessionaria(15);
     montadora.setMecanicaAutorizada(8);
     System.out.println(montadora.getNome());
     System.out.println(montadora.getConcessionaria());
     System.out.println(montadora.getMecanicaAutorizada());

     Modelo modelo = new Modelo();
     modelo.cadastrarModelo("Focus");
     modelo.setAno(2023);
     modelo.setVersao("ST");
     System.out.println(modelo.getModelo());
     System.out.println(modelo.getAno());
     System.out.println(modelo.getVersao());

     Motor motor = new Motor();
     motor.cadastrarMotor("2.3 EcoBoost 280cv");
     motor.setCombustivel("Gasolina");
     motor.setAceleracao("5,7 seg.");
     motor.setCambio("Manual");

     Cor cor = new Cor();
     //cor.cadastarCor("Vermelho Fantastic");
     cor.cadastarCor("Verde Mean");
     System.out.println(cor.getCor());
     }
 }