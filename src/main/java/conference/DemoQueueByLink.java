package conference;

public class DemoQueueByLink {
    public final static int QUEUELENTH = 3;
    public Node first = null;
    public Node last = first;
    static class Node{
        private int val = 0;
        private Node nextNode = null;
        public Node(int num){
            val = num;
        }
    }
    public void push(int num){
        if (first == null) {
            first = new Node(num);
            last = first;
            return;
        }
        if(getSize() == QUEUELENTH){
            first.val = num;
            return;
        }
        Node tmp = new Node(num);
        last.nextNode = tmp;
        last = last.nextNode;
    }
    public int pop(){
        if(first == null){
            return -1;
        }
        int ans = first.val;
        first = first.nextNode;
        if(first == null){
            last = first;
        }
        return ans;
    }
    public int getSize(){
        int len = 0;
        Node tmp = first;
        while(tmp != null){
            tmp = tmp.nextNode;
            len ++;
        }
        return len;
    }

    public static void main(String[] args) {
        DemoQueueByLink demoQueueByLink = new DemoQueueByLink();
        demoQueueByLink.push(1);
        demoQueueByLink.push(2);
        demoQueueByLink.push(3);
        demoQueueByLink.push(4);
        demoQueueByLink.push(5);
        demoQueueByLink.push(6);
        int ans = 0;
        ans = demoQueueByLink.pop();
        ans = demoQueueByLink.pop();
        ans = demoQueueByLink.pop();
        ans = demoQueueByLink.pop();
        demoQueueByLink.push(7);
        demoQueueByLink.push(8);
        demoQueueByLink.push(9);
        ans = demoQueueByLink.pop();
        ans = demoQueueByLink.pop();
        ans = demoQueueByLink.pop();
        ans = demoQueueByLink.pop();
        ans = demoQueueByLink.pop();
        System.out.println(demoQueueByLink);

    }
}
