package com.fenght.moduledemo;

import com.fenght.moduledemo.build.Customer;
import com.fenght.moduledemo.build.PisaBuilder;
import com.fenght.moduledemo.build.Product;
import com.fenght.moduledemo.menu.Meal;
import com.fenght.moduledemo.menu.MealBuilder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import androidx.test.espresso.core.internal.deps.guava.primitives.Ints;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {


    @Test
    public void addition_isCorrect() {
//        ArrayList<TreeNode> arrayList = new ArrayList<>();
//        TreeNode treeNode = new TreeNode(3,null,null);
//        TreeNode treeNode1 = new TreeNode(7,null,null);
//        TreeNode treeNode2 = new TreeNode(18,null,null);
//        TreeNode treeNode3 = new TreeNode(5,treeNode,treeNode1);
//        TreeNode treeNode4 = new TreeNode(15,null,treeNode2);
//        TreeNode treeNode5 = new TreeNode(10,treeNode3,treeNode4);
//        arrayList = getAllNode(treeNode5,arrayList);
//        System.out.println(Arrays.toString(arrayList.toArray()));
//        e(61);
        int[] nums = {5,3,4,5};
//        int count = removeDuplicates(nums);
//        System.out.println("count = " + count + "; nums = " + Arrays.toString(nums));
        stoneGame(nums);
    }

    private int[] a(int[] nums,int[] index){
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] ints = new int[index.length];
        for (int i = 0;i<index.length ;i++) {
            int id = index[i];
            linkedList.add(id,nums[i]);
        }
        for (int i = 0;i<linkedList.size() ;i++) {
            ints[i] = linkedList.get(i);
        }
        linkedList.toArray();
        System.out.println(Arrays.toString(linkedList.toArray()));
        return ints;
    }

    private int b(int[] nums){
        int sums = 0;
        for (int i = 0; i<nums.length;i++) {
            int count = 0;
            int sum = 0;
            for (int j=1;j<= Math.sqrt(nums[i]);j++) {
                if (nums[i]%j == 0) {
                    int gen = nums[i]/j;
                    if (j != gen) {
                        count += 2;
                        sum += j + gen;
                    }else{
                        sum += j;
                        count ++;
                    }
                }
            }
            if (count == 4) {
                sums += sum;
            }
        }
        return sums;
    }

    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int res = 0;
            int count = 0;
            //求因子
            for (int j = 1; j <= Math.sqrt(nums[i]); j++) {
                if (nums[i] % j == 0) {
                    int other = nums[i] / j;
                    if (other != j) {
                        count += 2;
                        res += other + j;
                    } else {
                        count += 1;
                        res += j;
                    }
                }
            }
            if (count == 4) {
                ans += res;
            }
        }
        System.out.println("sumFourDivisors:" + ans);
        return ans;
    }

    private char findTheDifference(String s, String t){
        int ss=0;
        int st = 0;
        for (char ca:s.toCharArray()) {
            ss += ca;
        }

        for (char ca:t.toCharArray()) {
            st += ca;
        }
        return (char)(st - ss);
    }


    private ArrayList<TreeNode> getAllNode(TreeNode root,ArrayList arrayList){
        if (root != null) {
            arrayList.add(root);
        }
        if (root.left != null) {
            getAllNode(root.left,arrayList);
        }
        if (root.right != null) {
            getAllNode(root.right,arrayList);
        }
        return arrayList;
    }

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low,high);
    }

    private void e(int c){
//        int[] s = new int[2];
        for (int i=0;i<= c;i++) {
            if (i % Math.sqrt(i) == 0) {
                int b = c - i;
                if (b % Math.sqrt(b) == 0) {
//                    s[0] = (int)Math.sqrt(i);
//                    s[1] = (int)Math.sqrt(b);
                    System.out.println("a = " + (int)Math.sqrt(i) +
                            "; b = " + (int)Math.sqrt(b) + "; c = " + c);
                }
            }
        }
    }

    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public String generateTheString(int n) {
//        char[] s = new char[n];
//        for (int i=0;i<s.length;i++) {
//            s[i] = 'a';
//        }
//        if (s.length%2==0) {
//            s[0] = 'b';
//        }
//        return new String(s);
        String s = "";
        if (n%2==0) {
            n = n -1;
            s = "b";
        }
        for (int i=0;i<n;i++){
            s += "a";
        }
        return s;
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            if(i>0 && (nums[i] == nums[i-1])){
                res[i] = nums[i-1];
            }else{
                for(int j=0;j<nums.length;j++){
                    if(nums[j]<nums[i]){
                        count ++;
                    }
                }
                res[i] = count;
            }
        }
        return res;
    }




    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head.next != null && root.left == null && root.right == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        if (root.left != null) {
            isSubPath(head.next,root.left);
        }
        if (root.right != null) {
            isSubPath(head.next,root.right);
        }
        return false;
    }


    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int count = 1;
        for(int i=1;i<len-1;i++){
            if(nums[i] == nums[i-1]){
                nums[count]=nums[i + 1];
                count ++;
            }
        }
        return count;
    }


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        if(root1 != null){
            dns(root1,list1);
        }
        if(root1 != null){
            dns(root2,list2);
        }
        return list1.equals(list2);
    }

    private void dns(TreeNode root,ArrayList<Integer> list){
        if (root.left == null && root.right == null) {
            list.add(root.val);
        }
        if (root.left != null) {
            dns(root.left,list);
        }
        if (root.right != null) {
            dns(root.right,list);
        }
    }

    public int lenLongestFibSubseq(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for (int i=0;i<arr.length-3;i++) {
            int j = i;
            int k = i + 1;
            while (k < arr.length-2) {
                if (arr[j] + arr[j+1] == arr[k+1]) {
                    list.add(arr[j]);
                    if (count ==0) {
                        count += 2;
                        list.add(k);
                        list.add(k+1);
                    }else{
                        count++;
                    }
                    j = k;
                }
                k++;
            }
        }
        return count;
    }


    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int l = 1000000000;
        while (i<l){
            int mid = (i+l)/2;
            if(timeLen(piles,h,mid)){
                i = mid + 1;
            }else{
                l = mid;
            }
        }
        return i;
    }

    private boolean timeLen(int[] piles, int h ,int mid){
        int time = 0;
        for (int p:piles) {
            time += p/mid;
            if (p%mid !=0) {
                time++;
            }
            if(time > h){
                break;
            }
        }
        return time > h;
    }

    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode node = head;
        while (node.next !=null){
            size++;
            node = node.next;
        }
        if(size%2 == 0){
            size = size/2 + 2;

        }else{
            size = size/2;
        }
        System.out.println("size = " + size);
        for (int i = 0;i < size + 1;i++) {
            if (head.next != null) {
                head = head.next;
            }
            System.out.println("i = " + i);
            System.out.println("head = " + head.val);
        }
        return head;
    }

    private void addNodes(ListNode node,ArrayList<ListNode> listNodes){
        listNodes.add(node);
        if (node.next != null) {
            addNodes(node,listNodes);
        }
    }

    public boolean stoneGame(int[] piles) {
        int ylks = 0;
        int li = 0;
        int i=0;
        int j = piles.length - 1;
        while (i<j){
            if ((j-i)%2 != 0) {
                ylks += Math.max(piles[i], piles[j]);
            }else{
                li += Math.max(piles[i], piles[j]);
            }
            if (piles[i] > piles[j]) {
                i++;
            }else{
                j--;
            }
        }
        return ylks > li;
    }

    private int compare(int i,int j){
        if (i > j) {
            return i;
        }
        return Math.max(i, j);
    }

    public String decodeAtIndex(String s, int k) {
        char[] b = s.toCharArray();
        long len = 0;
        for (int i=0;i<b.length;i++) {
            if (Character.isDigit(b[i])) {
                int num = Character.getNumericValue(b[i]);
                len *= b[i] - '0';
            }else{
                len++;
            }
        }

        for (int j=s.length()-1;j>=0;--j) {
            k %= len;
            if (k == 0 && Character.isLetter(b[j])) {
                return String.valueOf(b[j]);
            }
            if (Character.isDigit(b[j])) {
                len /= b[j] - '0';
            }else{
                len--;
            }
        }
        return "-1";
    }

    public String intToRoman(int num) {
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] loma = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<nums.length;i++) {
            while (num > nums[i]){
                num -= nums[i];
                sb.append(loma[i]);
            }
        }
        return sb.toString();
    }

    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int num = 0;
        int temp = map.get(s.charAt(0));
        for (int i=1;i<s.length();i++) {
            int c = map.get(s.charAt(i));
            if (temp<c) {
                num -= temp;
            }else{
                num += temp;
            }
            temp = c;
        }
        num += temp;
        return num;
    }

    public String longestCommonPrefix(String[] strs) {
        String s = "";
        for (int i=1;i<strs[0].length();i++) {
            s = strs[0].substring(0,i);
            if (!ssss(strs,s)) {
                s = s.substring(0,i-1);
            }
        }
        return s;
    }

    private boolean ssss(String[] strs,String s){
        boolean flag = true;
        for (int j=1;j<strs.length;j++) {
            if (!strs[j].startsWith(s)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}