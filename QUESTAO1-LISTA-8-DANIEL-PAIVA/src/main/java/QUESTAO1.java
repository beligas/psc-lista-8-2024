// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class QUESTAO1 {
      public static void main(String[] args) {
          Scanner enterScanner = new Scanner(System.in);

          int vezes, i, j;

          System.out.println("Digite o valor de n:");
          vezes = enterScanner.nextInt();
          System.out.println();

          for (i=1; i<=vezes; i++){
              for(j=1; j<=i; j++){
                  System.out.print(i + " ");
              }
              System.out.println();
          }   


          enterScanner.close();
      }   

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}