package Dados;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Endereco {

    private static List<String> endereco = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    
    public static List<String> getEndereco() {
        return endereco;
    }


    public static void setEndereco(String... MeuEndereco) {
        Endereco.endereco = Arrays.asList(MeuEndereco);
    }


    public static void setEndereco() {
        System.out.println("Digite seu endereço: ");
        Endereco.endereco.add(scan.nextLine());
        
    }


}
