package sword.refers.to.offer;



public class No06 {
	/**
	 * ����ĳ��������ǰ���������������Ľ���������¹�����ö�������
	 * ���������ǰ���������������Ľ���в������ظ������֡�
	 * ���������ǰ���������Ϊ��1��2��4��7��3��5��6��8��
	 * ���������Ϊ{4,7,2,1,5,3,6,8},���ؽ������������������ͷ���
	 */
 	
	public static void main(String[] args) {
			String preOrder="12473568";
			String midOrder="47215386";
			BiTree tree=new BiTree(preOrder, midOrder, preOrder.length());
			tree.postRootTraverse(tree.root);
	}

}

class BiTree{
	TreeNode root;
	public BiTree(String preOrder,String midOrder,int count){
		if(count<=0){
			return;
		}
		char c=preOrder.charAt(0);
		int i=0;
		for(;i<count;i++){
			if(midOrder.charAt(i)==c)
				break;
		}
		
		root=new TreeNode(c);
		root.setLchild(new BiTree(preOrder.substring(1,i+1), midOrder.substring(0,i), i).root);
		root.setRchild(new BiTree(preOrder.substring(i+1), midOrder.substring(i+1), count-i-1).root);	
	}
	
	
	public void postRootTraverse(TreeNode root) {
		if(root!=null){
			postRootTraverse(root.getLchild());	
			postRootTraverse(root.getRchild());
			System.out.print(root.getData());
		}		
	}
}
class TreeNode{
	char data;
	TreeNode Lchild;
	TreeNode Rchild;
	
	public TreeNode(char data) {
		super();
		this.data = data;
	}

	public TreeNode(char data, TreeNode lchild, TreeNode rchild) {
		super();
		this.data = data;
		Lchild = lchild;
		Rchild = rchild;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public TreeNode getLchild() {
		return Lchild;
	}

	public void setLchild(TreeNode lchild) {
		Lchild = lchild;
	}

	public TreeNode getRchild() {
		return Rchild;
	}

	public void setRchild(TreeNode rchild) {
		Rchild = rchild;
	}
	
	
}