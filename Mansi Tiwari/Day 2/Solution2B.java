

public class Solution2B {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /* if(m==0)
         { 
             for(int i=0;i<=m;i++)
             System.out.println(nums2[i]);
         }
         else if(n==0)
           {
               for(int i=0;i<m;i++)
                 System.out.println(nums1[i]);
           }
           else{}*/
            int c=0;
            for(int i=m;i<(m+n);i++)
            {
             if(nums1[i]==0)
             nums1[i]=nums2[c];
              c++;
            }
         Arrays.sort(nums1);
         for(int i=0;i<m+n;i++)
         {
             System.out.println(nums1[i]);
         }
        } 
}
