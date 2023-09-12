import java.util.Scanner;

public class AlgoritmoReservaRestaurante_FOR {
    public static void main(String[] args) {
        String[] dias = {"segunda", "terca", "quarta", "quinta", "sexta", "sabado", "domingo"};
        String diaEscolhido;
        int horarioEscolhido;
        String nomeEmpresa;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o dia da semana que você quer reservar: ");
        diaEscolhido = scanner.nextLine().toLowerCase(); // Transforma o input em minúsculas
        System.out.print("Digite o horário que você quer reservar: ");
        horarioEscolhido = scanner.nextInt();

        for (int i = 0; i < 7; i++) {
            if (dias[i].equals(diaEscolhido) && i < 5) {
                if (horarioEscolhido >= 7 && horarioEscolhido <= 23) {
                    System.out.print("Digite o nome da empresa: ");
                    scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
                    nomeEmpresa = scanner.nextLine();
                    System.out.println("Horário reservado para a empresa " + nomeEmpresa + ": " + diaEscolhido + " às " + horarioEscolhido + " horas");
                } else {
                    System.out.println("Restaurante indisponível!");
                }
            } else if (dias[i].equals(diaEscolhido) && i > 4) {
                if (horarioEscolhido >= 7 && horarioEscolhido <= 15) {
                    System.out.print("Digite o nome da empresa: ");
                    scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
                    nomeEmpresa = scanner.nextLine();
                    System.out.println("Horário reservado para a empresa " + nomeEmpresa + ": " + diaEscolhido + " às " + horarioEscolhido + " horas");
                } else {
                    System.out.println("Restaurante indisponível!");
                }
            }
        }
    }
}