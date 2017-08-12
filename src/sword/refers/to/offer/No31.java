package sword.refers.to.offer;

public class No31 {

	/**
	 * ����һ���������飬��������������Ҳ�и�����
	 * ������һ���������Ķ���������һ�������顣
	 * ������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n��
	 */
	public static void main(String[] args) {
		int[] arr={1,-2,3,10,-4,7,2,-5};
		System.out.println(maxSub(arr));
	}

	private static int maxSub(int[] arr) {
		int max=0;
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
			if(sum>max)
				max=sum;
			else if(sum<0)
				sum=0;
		}
		return max;
		
	}

}