public class DRoot {
  public static int digital_root(int n) {
    int sum = 0, temp = n;
    while(n>0 || sum>9){
      sum = sum + n % 10;
      n = n/10;
      if(n==0 && sum>9){
        n = sum;
        sum = 0;
      }
    }
    return sum;
  }
}
