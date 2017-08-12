package sword.refers.to.offer;
import java.util.Stack;


public class No07 {

	/**
	 * 用两个栈实现一个队列。队列的声明如下，
	 * 请实现它的两个函数appendTail和deletedHead,
	 * 分别完成在队列尾部插入节点和在队列头部删除节点的功能
	 */
	private Stack s1=new Stack();
	private Stack s2=new Stack();
	
	public void offer(Object x){
		s1.push(x);
		
	}
	public void poll(){
		if(s1.size()==0&&s2.size()==0){
			try {
				throw new Exception("队列为空");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		else{
			if(s2.size()!=0){
				System.out.println(s2.peek().toString());
				s2.pop();
			}
			else{
				while(s1.size()>0){
					s2.push(s1.pop());
				}
				System.out.println(s2.peek().toString());
				s2.pop();
			}
		}
		
	}
	public static void main(String[] args) {
		
		No07 queue=new No07();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();			
	}

}
