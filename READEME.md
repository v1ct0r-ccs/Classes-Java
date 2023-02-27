# Classes Java

## Modificadores de acesso

- Mesma Classe
    - SIM | private, default, protected, public

- Mesmo Pacote
    - SIM | default, protected, public
    - NÃO | private

- Pacotes Diferentes (subclasses)
    - SIM | protected, public
    - NÃO | private, default

- Pacotes Diferentes (sem subclasses)
    - SIM | public
    - NÃO | private, default, protected

## Palavras Reservadas
- (A) abstract, assert
- (B) boolean, break, byte
- (C) case, catch, char, class, const, continue
- (D) default, do, double
- (E) else, enum, extends
- (F) final, finally, float, for
- (G) goto
- (I) if, implements, import, instanceof, int, interface
- (L) long
- (N) native, new
- (P) package, private, protected, public
- (R) return
- (S) short, static, strictfp, super, switch, synchronized
- (T) this, throw, throws, transient, try,
- (V) void, volatile
- (W) while

## Comentários
// comenta somente uma ilinha

/*
 *comenta um bloco
*/

/**
*Javadoc, serve para criar a documentaçãoautomática do sistema.
**/

### Comentários javadoc
- @author | Especifica o autor da classe ou do método em questão.
- @deprecated | Identifica classes ou métodos obsoletos. É interessante informar nessa tag, quais métodos ou classes podem ser usadas como alternativa ao método obsoleto.
- @link | Possibilita a definição de um link para um outro documento local ou remoto através de uma URL.
- @parem | Mostra um parâmetro que será passado a um método.
- @return | Mostra qual o tipo de retorno de um método.
- @see | Possibilita a definição referênte de classes ou métodos, que podem ser consultadas para melhor compreenção da idea daquilo que está sendo comentada.
- @since | Indica desde quando um classe ou método foi adicionado na aplicação.
- @throws | Indoca os tipos de exceções que podem ser lançadas por um método.
- @version | informa a versão da classe.