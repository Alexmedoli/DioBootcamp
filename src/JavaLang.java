package src;

public class JavaLang {
    
public static void main (String [] args){
    System.out.println("Hello world!");

    String primeiroNome,segundoNome;
    primeiroNome = "Alexandre";
    segundoNome = "Medeiros";

    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}
}
