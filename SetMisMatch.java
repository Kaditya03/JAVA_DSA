public class SetMisMatch {
    int i =0;while(i<nums.length){
        int correct=nums[i]-1;
        if(nums[i]!=nums[correct]){
            swap(nums, i , correct);
        }else{
            i++;
        }
        for(int index=o;index<nums.length;index++){
            if(nums[index]!=nums[i]+1){
                
                return new int []{arr[index],index+1};
            }
        }
      return  new int[]{-1,-1};
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
