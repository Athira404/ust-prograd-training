public class Kata {
    public static String lastSurvivor(String letters, int[] coords) {
      StringBuilder stringBuilder = new StringBuilder(letters);
      for(int i = 0; i < coords.length; i++){
        stringBuilder.deleteCharAt(coords[i]);
      }
        return stringBuilder.toString();
    }
}