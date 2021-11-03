import java.util.Scanner;


class App {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

    
    System.out.print("Digite um número: ");
      int numero = scanner.nextInt();
  
      int repeticoes = 1;
      System.out.println("Os 5 primeiros multiplos são:");
        while (repeticoes <= 5){
          int  multiplos = repeticoes * numero;
          repeticoes++;
  
          System.out.println(multiplos);
        }
    }
  }