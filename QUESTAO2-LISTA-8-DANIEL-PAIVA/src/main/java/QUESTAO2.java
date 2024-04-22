// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  import java.util.Scanner;
  public class QUESTAO2 {

      public static void imprirTriangulo(int n){
          int i,j;
          for(i=1;i<=n;i++){
              for(j=1; j<=i;j++){
                  System.out.print(j + " ");
              }
              System.out.println();
          }
      }
      public static void main(String[] args) {
          int vezes;
          Scanner enterScanner = new Scanner(System.in);
          System.out.println("Digite o número de vezes:");
          vezes = enterScanner.nextInt();
          System.out.println();

          imprirTriangulo(vezes);

          enterScanner.close();
      }

  
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}