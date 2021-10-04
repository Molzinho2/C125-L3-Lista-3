public class Pessoa
{

    String nome;
    float cpf;
    Endereco endereco;

    void Pessoas(String nome, float cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    void addEndereco(String Rua,String Bairro,int num)
    {
        endereco.Enderecos(Rua,Bairro,num);
        System.out.println("Foi adicionado com Sucesso!!");
    }

}
