import model.Emprestimo;
import model.Livro;
import model.Usuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Danilo", "danilo@email.com");

        Livro livro = new Livro("Nunca é Hora de Parar", "David Goggins", 3.99);

        Emprestimo emprestimo = new Emprestimo(usuario, livro, 3, 3.99, livro.getValorMulta());
        System.out.println(emprestimo.getCalcularMulta());

        System.out.println( emprestimo.getResumo());
        System.out.println(usuario.getResumo());
        System.out.println(livro.getResumo());

    }
}