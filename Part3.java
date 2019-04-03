package ua.nure.serdsov.task1;

public class Part3 {
  public static void main(String[] args) {
    System.out.println(nod(18, 12));
    System.out.println(nok(18, 12));
  }
  public static int nod(int a, int b){
    int i;
    int res = 0;
    for(i = 1; i <= a && i <= b; i++){
      if(a % i == 0 && b % i == 0)
        res = i;
    }
    return res;
  }
  public static int nok(int a, int b){
    int i;
    int res = 0;
    for(i = a * b; i > 0; i--){
      if(i % a == 0 && i % b == 0)
        res = i;
    }
    return res;
  }
}
