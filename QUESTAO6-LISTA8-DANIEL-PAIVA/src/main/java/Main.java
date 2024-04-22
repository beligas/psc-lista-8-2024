// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

  import java.util.Scanner;
  public class Main {
      public static String conversao(int hrs, int min){
          char formato;
          if (hrs > 12){
              hrs-=12;
              formato = 'P';
          }
          else if (hrs==12) {
              formato = 'P';
          }
          else{
              formato = 'A';
          }
          return String.format("%02d:%02d %s", hrs, min, formato); 
      }
      public static void result(String horaFinal){
          System.out.println("A hora convertida é: " + horaFinal);
      }
      public static void main(String[] args) {
          Scanner enterScanner = new Scanner(System.in);


          int hora, minutos, sair;

          do{
              System.out.println("Digite as horas:");
              hora = enterScanner.nextInt();
              System.out.println("Digite os minutos:");
              minutos = enterScanner.nextInt();

              result(conversao(hora, minutos));

              System.out.println("Digite 0 para sair ou 1 para continuar");
              sair = enterScanner.nextInt();
          }while(sair != 0 );
          enterScanner.close();
      }

  

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}