import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)
    {
        Pessoa pessoa = new Pessoa();
        List<Pessoa> listaPessoas = new ArrayList<>();
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o nome e o CPF: ");
        pessoa.Pessoas(read.next(), read.nextFloat());

        System.out.println("Digite a Rua, Bairro e Número: ");
        pessoa.addEndereco(read.next(),read.next(), read.nextInt());

        listaPessoas.add(pessoa);
    }
}
