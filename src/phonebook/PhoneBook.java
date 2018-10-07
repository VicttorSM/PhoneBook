package phonebook;

/**
 * Classe PhoneBook que guarda o nome e o telefone de uma pessoa
 * @author Victtor da Silva Mendes - RA: 22.217.024-3
 */
public class PhoneBook {

    /**
     * Construtor da classe
     * @param nome nome da pessoa
     * @param telefone telefone da pessoa
     */
    public PhoneBook(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     * Printa a pessoa e seu telefone
     */
    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
    }

    /**
     * Getter nome
     * @return nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Getter telefone
     * @return telefone da pessoa
     */
    public String getTelefone() {
        return telefone;
    }
    private String nome;
    private String telefone;
}
