import java.util.Arrays;

public class day2 {
    public int singleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
       /* for(int num:nums){
            System.out.println(num+" ");
        }*/
        if(nums.length==1)
        return nums[0];
        else{
     for(int i=0;i<nums.length-1;i+=2) 
    {
            if(nums[i]!=nums[i+1])
               return nums[i];
    }
     return nums[nums.length-1]; 
    }}
}
