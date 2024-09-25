package domain.Anotation;

@Tabela(nome = "Tabela")
public class NewTabela {
    public static void main(String[] args) {
        Class<?> classe = NewTabela.class;

        if (classe.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = classe.getAnnotation(Tabela.class);
            String nomeTabela = tabela.nome();
            System.out.println("Nome da tabela: " + nomeTabela);
        }
    }
}