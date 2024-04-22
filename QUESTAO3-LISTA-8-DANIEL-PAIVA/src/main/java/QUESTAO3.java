// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  import java.util.Scanner;
  public class QUESTAO3 {
      public static int somaNum (int n1, int n2, int n3){
          return n1+n2+n3;
      }
      public static void main(String[] args) {
          Scanner enterScanner = new Scanner(System.in);

          int n1, n2, n3, soma;

          System.out.println("Digite o valor do número 1: ");
          n1 = enterScanner.nextInt();
          System.out.println("Digite o valor do número 2: ");
          n2 = enterScanner.nextInt();
          System.out.println("Digite o valor do número 3: ");
          n3 = enterScanner.nextInt();

          soma = somaNum(n1, n2, n3);

          System.out.printf("A soma de %d + %d + %d é: %d", n1, n2, n3, soma);


          enterScanner.close();
      }

  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}