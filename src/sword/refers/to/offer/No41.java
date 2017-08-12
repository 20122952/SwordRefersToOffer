package sword.refers.to.offer;

public class No41 {

	/**
	 * ����һ����������������һ������s��
	 * �������в�����������ʹ�����ǵĺ�������s��
	 * ����ж�����ֵĺ͵���s���������һ�Լ���
	 */
	public static void main(String[] args) {
		int[] data={1,2,4,7,11,15};
		System.out.println(findNumberWithSum(data, 15)); 
	}

	private static boolean findNumberWithSum(int[] data, int sum) {
		boolean found=false;
		if(data==null)
			return found;
		int num1=0;
		int num2=0;
		int start=0;
		int end=data.length-1;
		while(start<end){
			int curSum=data[start]+data[end];
			if(curSum==sum){
				num1=data[start];
				num2=data[end];
				found=true;
				break;
			}else if(curSum>sum)
				end--;
			 else 
				start++;	
		}
		System.out.println(num1);
		System.out.println(num2);
		
		return found;
	}

}