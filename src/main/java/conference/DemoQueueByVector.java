package conference;

/**
 * https://www.cnblogs.com/qingzhuyuan/p/13546754.html
 */
public class DemoQueueByVector {
    public final static int QUEUELENTH = 3;
    public int[] queue = new int[QUEUELENTH];

    int front = 0;
    int rear = 0;

    public void push(int num) {
        if (isFull()) {
            queue[front] = num;
            return;
        }
        queue[rear] = num;
        rear = (rear + 1) % QUEUELENTH;
    }

    public int pop() {
        // 判断是否为空
        if (isEmpty()) {
            return -1;
        }
        int ans = queue[front];
        front = (front + 1) % QUEUELENTH;
        return ans;
    }

    public boolean isFull() {
        return (rear + 1) % QUEUELENTH == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public static void main(String[] args) {
        DemoQueueByVector demo = new DemoQueueByVector();
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        demo.push(5);
        demo.push(6);
        int ans = 0;
        ans = demo.pop();
        ans = demo.pop();
        ans = demo.pop();
        ans = demo.pop();
        demo.push(7);
        demo.push(8);
        demo.push(9);
        demo.push(10);
        demo.push(11);
        ans = demo.pop();
        ans = demo.pop();
        ans = demo.pop();
        ans = demo.pop();
        ans = demo.pop();
        System.out.println(demo);

    }
}
