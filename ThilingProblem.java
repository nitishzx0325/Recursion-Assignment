public class ThilingProblem{

    public static int ways_of_tiles(int n,int m){
        if(n<m){
            return 1;
        }
        // 1 horizontal n-m vertically
        return ways_of_tiles(n-1, m)+ways_of_tiles(n-m, m);
    }
    public static void main(String[] args) {
        System.out.println(ways_of_tiles(4, 3));
    }
}