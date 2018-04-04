package Practice.Practice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicate obj=new RemoveDuplicate(); 
		int[] nums={1,2,2};
		int length;
		length=obj.removeDuplicates(nums);
		
		for(int i=0;i<length;i++){
			System.out.print(nums[i]);
		}
		System.out.println("\n"+ "New length of array is " +length);
	}
	
	public int removeDuplicates(int[] nums){
		int len=nums.length;
		if (len==0)
			return 0;
		int temp[]=new int[len];
		int count=0;
		for(int i=0;i<len-1;i++){
			if(nums[i]!=nums[i+1]){
				temp[count++]=nums[i];
			}
		}
		temp[count++]=nums[len-1];
		//modify original array
		for(int i=0;i<count;i++){
			nums[i]=temp[i];
		}
		return count;
		
	}
}
