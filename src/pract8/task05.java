package pract8;

class calcSumOfNums{
    public static void main(String[] args){
        int n = 2;
        calcSumOfNumsReqursive(n, 0);
    }

    public static void calcSumOfNumsReqursive(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        calcSumOfNumsReqursive(n/10, sum+n%10);
    }
}