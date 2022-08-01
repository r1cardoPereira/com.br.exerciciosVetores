
import java.util.Scanner;

/*
 * PROPOSTA DO EXERCICIO, CRIAR UM VETOR (ARRAY) DE 5 POSIÇÕES E FAZER UMA COMPARAÇÃO SE OS NOMES INSERIDOS NOS MESMOS CONSTAM NA MEMORIA
 * CASO TENHA ESSE VALOR NA MEMORIA RETORNAR "USUARIO ENCONTRADO
 * CASO NAO RETORNAR "USUARIO NÃO ENCONTRADO!
 */
public class Ex01CadastroDeUsuarios {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] nomes = new String[5];
        String seach;
        boolean sucess = false;
        // 1* INSERINDO DADOS NO ARRAY
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = read.nextLine();
        }
        // 2* SOLICITANDO NOME DE USUARIO PARA PESQUISA
        System.out.println("Digite um nome de Usuario Cadastrado: ");
        seach = read.nextLine();
        // 3* COMPARANDO DADO INSERIDO NO PASSO 2 COM O PASSO 1
        for (String nome : nomes) {
            if (seach.equals(nome)) {
                sucess = true;
            }
        }
        // 4* SAIDA
        if (sucess != false) {
            System.out.printf("O Usuário %s foi encontrado com sucesso!", seach);
        } else {
            System.out.printf("O Usuário %s nao foi encontrado!", seach);
        }
    }


}
