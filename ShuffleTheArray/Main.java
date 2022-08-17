class Main {
    private static int[] shuffle(int[] nums, int n) {
        for(int i=n;i<2*n;i++){
            nums[i] = nums[i]<<10;
            nums[i] |= nums[i-n];
        }
        int z = n;
        for(int i=0;i<2*n;i+=2){
            nums[i] = nums[z] & 1023;
            nums[i+1] = nums[z++] >> 10;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] input = {2,5,1,3,4,7};
        int n = 3;
        int[] output = shuffle(input, n);
        for(int i=0;i<2*n;i++)
            System.out.print(output[i]+" ");
    }
}