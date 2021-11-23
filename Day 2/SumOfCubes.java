public class Solution{
  public static long sumCubes(long n)
  {
    //put your code here :D
    int sum = 0;
    for (int i=1;i<=n;i++){
      int temp = i * i * i;
      sum = sum + temp;
    }
    return sum;
  }
}