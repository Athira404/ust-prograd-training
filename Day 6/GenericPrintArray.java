class GenericPrintArray <T> {
    public void printArray(T[] array){
        for(int i= array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        Integer[] intArr = {10,20,30};
        String[] strArr = {"language", "programming", "Java"};
        GenericPrintArray<Integer> intarray = new GenericPrintArray<Integer>();
        GenericPrintArray<String> strarray = new GenericPrintArray<String>();
        intarray.printArray(intArr);
        strarray.printArray(strArr);
    }
}



