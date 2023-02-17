package leetcode;

import javafx.util.Pair;

import javax.swing.plaf.IconUIResource;
import java.util.*;

import static java.util.Arrays.sort;

public class hello {

    public Stack<Integer> stack = new Stack<>();

//        int t = 20;
//        Deque<Integer> deque = new LinkedList<>();
//        deque.add(t);
//        while(t - deque.peek()<3000){
//            deque.poll();
//        }
//        int ans =  deque.size();
//
//
//        int a[] = {1, 3, 4, 5, 7, 3, 6, 4};
//        System.out.println(a.length);
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (a[j] > a[i]) {
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

    //    public static boolean isValid(String s) {
//        Deque<Character> deque = new LinkedList<>();
//        for(int i = 0;i<s.length();i++){
//
//        }
//    }
    public int prefixCount(String[] words, String pref) {
        int sum = 0;
        for (String str : words) {
            if (pref.length() > str.length()) {
                continue;
            }
            boolean flag = true;
            for (int i = 0; i < pref.length(); i++) {
                if (pref.charAt(i) != str.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) sum++;
        }
        return sum;
    }

    private static Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('{', '}');
        put('(', ')');
        put('[', ']');
        put('?', '?');
    }};

    public boolean isValid(String s) {
        Deque<Character> deque = new LinkedList<>();
        deque.push('?');
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                deque.push(s.charAt(i));
            } else {
                if (map.get(deque.poll()) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return deque.size() == 1;
    }


    // 冒泡排序
    public static void BubbleSort(int R[]) {
        int i, j, tmp;
        boolean flag;
        for (i = R.length - 1; i > 0; i--) {
            flag = false;
            for (j = 0; j < i; j++) {
                if (R[j] > R[j + 1]) {
                    tmp = R[j];
                    R[j] = R[j + 1];
                    R[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    // 插入排序
    public static void InsertSort(int R[]) {
        int i, j, tmp;
        for (i = 1; i < R.length; i++) {
            for (j = i - 1; j >= 0; j--) {
                if (R[j] < R[j + 1]) {
                    tmp = R[j];
                    R[j] = R[j + 1];
                    R[j + 1] = tmp;
                } else {
                    break;
                }
            }
        }
    }

    // 选择排序
    public static void SelectSort(int R[]) {
        int i, j, tmp;
        for (i = 0; i < R.length; i++) {
            for (j = i + 1; j < R.length; j++) {
                if (R[i] < R[j]) {
                    tmp = R[i];
                    R[i] = R[j];
                    R[j] = tmp;
                }
            }
        }
    }

    // 堆排序

    // 快速排序

    // 归并排序

    // 希尔排序

    //岛屿数量
    public int numIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    BFS(grid, i, j);
                    sum++;
                }
            }
        }
        return sum;
    }

    public static void BFS(char[][] grid, int i, int j) {
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.add(new Pair<>(i, j));
        Pair<Integer, Integer> pair;
        while (!queue.isEmpty()) {
            pair = queue.poll();
            int k = pair.getKey();
            int v = pair.getValue();
            if (k >= 0 && k < grid.length && v >= 0 && v < grid[0].length && grid[k][v] == '1') {
                grid[k][v] = '0';
                queue.add(new Pair<>(k - 1, v));
                queue.add(new Pair<>(k + 1, v));
                queue.add(new Pair<>(k, v - 1));
                queue.add(new Pair<>(k, v + 1));
            }
        }
    }

    public static void DFS(char[][] grid, int i, int j) {
        if (i < 0 && i >= grid.length && j < 0 && j > grid[0].length && grid[i][j] == '0') return;
        grid[i][j] = '0';
        DFS(grid, i - 1, j);
        DFS(grid, i + 1, j);
        DFS(grid, i, j - 1);
        DFS(grid, i, j + 1);
    }

    public int reinitializePermutation(int n) {
        // 模拟法
        int[] perm = new int[n];
        int[] targets = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i;
            targets[i] = i;
        }
        int count = 0;
        while (true) {
            int[] change = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    change[i] = targets[i / 2];
                } else {
                    change[i] = targets[n / 2 + (i - 1) / 2];
                }
            }
            count++;
            if (isSameArrays(change, perm)) {
                break;
            }
            targets = change;

        }
        return count;
    }

    public static boolean isSameArrays(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static String removeKdigits(String num, int k) {
        if(num.length() == k)
            return "0";
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < num.length(); i++) {
            while(!deque.isEmpty() && deque.peek()>num.charAt(i) && k>0){
                deque.poll();
                k--;
            }

            if(deque.isEmpty() && num.charAt(i)=='0') continue;
            deque.push(num.charAt(i));
        }
        if(deque.isEmpty()){
            return "0";
        }
        while(k!=0){
            deque.pop();
            k--;
        }
        StringBuffer ans = new StringBuffer();
        while(!deque.isEmpty()){
            ans.append(deque.poll());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(areSentencesSimilar("a", "a aa a"));
    }
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.equals(sentence2)){
            return true;
        }
        String[] str1 = sentence1.split(" ");
        String[] str2 = sentence2.split(" ");
        String[] strMax = str1.length >= str2.length ? str1 : str2;
        String[] strMin = str1.length < str2.length ? str1 : str2;
        int left = 0;
        int right = 0;
        for(int i = 0;i<strMin.length;i++){
            if(strMax[i].equals(strMin[i])){
                left++;
            }else{
                break;
            }
        }
        for(int i = 0;i<strMin.length;i++){
            if(strMax[strMax.length - 1 - i].equals(strMin[strMin.length - 1 - i])){
                right++;
            }else{
                break;
            }
        }
        if(left + right == strMin.length){
            return true;
        }else{
            return false;
        }
    }
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 0;i<=len;i++){
            sum ^= i;
        }
        for(int i= 0;i< len ;i++){
            if((sum ^ nums[i]) == 0 ){
                return i;
            }
        }
        return 0;
    }


    public boolean hasAlternatingBits(int n) {
//        boolean flag = false;
//        for(int i = 31;i>0;i--){
//            if(n & (1<<i) == 1){
//                flag = true;
//            }
//            if(flag && ( (n & (1<<i)) ^ (n & (1<<(i-1))) == 0)){
//                return false;
//            }
//        }
        return true;
    }


}

