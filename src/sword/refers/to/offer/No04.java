package sword.refers.to.offer;

public class No04 {

	/**
	 * ��ʵ��һ�����������ַ����е�ÿ���ո��滻�ɡ�%20����
	 * �������롰We are happy"
	 * ���������We%20are%20happy".
	 */
	public static void main(String[] args) {
			String str="We are happy";
			char[] charArray = str.toCharArray();			
			System.out.println(change(charArray));
	}

	private static String change(char[] charArray) {
		int n=charArray.length;
		
		int count=0;
		for(int i=0;i<charArray.length;i++){
			if(charArray[i]==' '){
				count++;
			}
		}
		if(count==0){
			return null;
		}
		char[] temp=new char[n+2*count];
		
		int j=n+2*count-1;
		int i=n-1;
		while(i>=0){
			if(charArray[i]==' '){
				temp[j]='0';
				temp[j-1]='2';
				temp[j-2]='%';
				j=j-3;
				
			}else{
				temp[j]=charArray[i];
				j--;
			}
			i--;
		}
		
		return new String(temp);
		
	}

}
