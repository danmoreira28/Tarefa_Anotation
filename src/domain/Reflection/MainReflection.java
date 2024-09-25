package domain.Reflection;

import java.lang.annotation.Annotation;

public class MainReflection {
    public static void main(String[] args) {
        TabelaReflection tabela = new TabelaReflection();
        Annotation[] annotations = tabela.getClass().getAnnotations();
        for (Annotation anotacao : annotations) {
            System.out.println(anotacao);
        }
    }
}
