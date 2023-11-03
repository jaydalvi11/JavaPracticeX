public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {1, -1, -2, 2, 3, -3, 4};
        System.out.println(findUnique(arr));
    }

    public static int findUnique(int[] array){
        int unique = 0;
        for(int n : array){
            unique ^= n;
        }
        return unique;
    }

}
