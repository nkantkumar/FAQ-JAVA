package com.gs;

public class Permutation{
    public static void main(String []args){
       Permutation p = new Permutation();
       String str = "1234";
       int n = str.length();
       p.permute(str, 0 ,n-1);

    }

    public static void permute(String str, int l, int r){
        if(l==r){
            System.out.println(str);
        }

        for(int i=l;i<=r;i++){
            str = swap(str,i,l);
            permute(str, l+1, r);
            str = swap(str,i,l);
        }
    }


    public static String swap(String str, int i, int l){
            char[] charArr = str.toCharArray();
            char t = charArr[i];
            charArr[i] = charArr[l];
            charArr[l] = t;
            return (String.valueOf(charArr));
        }

}