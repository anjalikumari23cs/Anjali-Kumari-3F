package Leetcode;

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class iftwostringareequivalent {
   public iftwostringareequivalent() {
   }
   public static void main(String[] var0) {
      String[] word1 = {"ab", "c"};
      String[] word2 = {"a", "bc"};
      StringBuilder res1 = new StringBuilder();
      StringBuilder res2 = new StringBuilder();
      for(int i = 0; i < word1.length; i++) {
         res1.append(word1[i]);
      }

      for(int i = 0; i < word2.length; i++) {
         res2.append(word2[i]);
      }

      System.out.println(res1);
      System.out.println(res2);
      if (res1.toString().equals(res2.toString())) {
         System.out.println(true);
      } else {
         System.out.println(false);
      }

   }
}
