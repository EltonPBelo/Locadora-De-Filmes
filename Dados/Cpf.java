package Dados;
import java.util.regex.Pattern;

public class Cpf {
    private static String Cpf;

    public static String getCpf() {
        return Cpf;
    }

    public static void setCpf(String cpf) {
        Cpf = cpf;
        formatarCpf(Cpf);
    }

    public static final String formatarCpf(String cpf) {
        Cpf = cpf;
        // Expressão regular para validar 11 dígitos numéricos
        String regex = "^\\d{11}$";
        Pattern pattern = Pattern.compile(regex);

        // Se a entrada não for válida, lança uma exceção
        if (!pattern.matcher(Cpf).matches()) {
            throw new IllegalArgumentException("O CPF deve conter exatamente 11 dígitos numéricos.");
        }

        // Formata o CPF para XXX.XXX.XXX-XX
        return cpf.substring(0, 3) + "." +
               cpf.substring(3, 6) + "." +
               cpf.substring(6, 9) + "-" +
               cpf.substring(9);
    }



}
