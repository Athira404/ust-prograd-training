public class GenericPrintArray {
    public <T> void printArray(T[] array){
        for(int i= array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        GenericPrintArray arr = new GenericPrintArray();
        arr.printArray(new Integer[] {10,20,30});
        arr.printArray(new String[] {"language","programming","Java"});
    }
}
