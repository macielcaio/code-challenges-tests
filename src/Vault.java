import java.util.Objects;
import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;
    protected int senha;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

//    public boolean validarSenha(int tentativaSenha) {
//        boolean b = tentativaSenha != senha;
//        return false;
//    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

    public boolean validarAbertura() {
        if(Objects.equals(metodoAbertura, "fisico")){
           System.out.println("Cofre aberto!");
        }
        return true;
    }
}


public class Vault {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();


        if (tipoCofre.equalsIgnoreCase("digital")) {
//            System.out.println("Digite uma senha para o cofre digital:");
            int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);
//            System.out.println("Digite a senha do cofre digital:");
            int tentativaSenha = scanner.nextInt();

            if (tentativaSenha == senha) {
                cofreDigital.imprimirInformacoes();
                System.out.println("Cofre aberto!");
            } else {
                cofreDigital.imprimirInformacoes();
                System.out.println("Senha incorreta!");
            }

        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            CofreFisico cofreFisico = new CofreFisico();

            if (cofreFisico.validarAbertura()) {
                cofreFisico.imprimirInformacoes();
//                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Chave ou método de abertura inválido!");
            }
        } else {
            System.out.println("Tipo de cofre inválido!");
        }
    }
}
