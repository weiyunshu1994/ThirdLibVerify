package leetcode;

import javafx.util.Pair;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{73,74,75,71,69,72,76,73};
        int[] ans = dailyTemperatures(arr);
        System.out.println(ans[0]);
    }

    public static int rearrangeCharacters(String s, String target) {
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            int tmp = s.charAt(i) - 'a';
            arr[tmp] = (arr[tmp] == 0) ? 1 : arr[tmp]+1;
        }
        int ans = 0;
        boolean flag = true;
        while(flag){
            for(int i = 0;i<target.length();i++){
                int tmp = target.charAt(i) - 'a';
                if(arr[tmp] == 0){
                    flag = false;
                    break;
                }else{
                    arr[tmp]--;
                }
            }
            if(flag) ans++;
        }
        return ans;
    }
    public static String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for(int i = 0;i<knowledge.size();i++){
            map.put("(" + knowledge.get(i).get(0) +")",knowledge.get(i).get(1));
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                queue.add(i);
                flag = true;
            }
            if(s.charAt(i) == ')' && flag){
                queue.add(i);
                flag = false;
            }
        }
        String sOri = String.valueOf(s);
        while(!queue.isEmpty()){
            String st = sOri.substring(queue.poll(),queue.poll()+1);
            if(map.containsKey(st)){
                s = s.replace(st, map.get(st));
            } else {
                s = s.replace(st,"?");
            }
        }
        return s;
    }

    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int deepNum = 0;
        if (root != null) {
            queue.add(root);
        }

        TreeNode tempNode;
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                tempNode = queue.poll();
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }
            deepNum++;
        }
        return deepNum;
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Stack<Pair<Integer,Integer>> stack = new Stack();
        for(int i = 0;i<len;i++){
            if(stack.isEmpty()){
                stack.add(new Pair<>(i, temperatures[i]));
            } else{
                while(!stack.isEmpty()){
                    if(temperatures[i]> stack.peek().getValue()){
                        ans[stack.peek().getKey()] = i - stack.peek().getKey();
                        stack.pop();
                    } else {
                        break;
                    }
                }
                stack.add(new Pair<>(i, temperatures[i]));
            }

        }
        return ans;
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        boolean flag = false;
        while(head.next != null && !flag){
            set.add(head);
            if(set.contains(head)){
                flag = true;
            }
            head = head.next;
        }
        return flag;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

}
