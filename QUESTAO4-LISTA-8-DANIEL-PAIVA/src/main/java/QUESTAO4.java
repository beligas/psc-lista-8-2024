// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  import java.util.Scanner;
  public class QUESTAO4 {

      public static char posNeg(int num){
          if(num>0){
              return 'P';
          }
          else{
              return 'N';
          }
      }
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int num;
          char retNum;

          System.out.println("Digite o número");
          num = scanner.nextInt();

          retNum = posNeg(num);

          System.out.println("O seu número é: " + retNum);

          scanner.close();
      }

  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}