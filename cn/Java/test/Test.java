package test;
import _17_Letter_Combinations_of_a_Phone_Number.*;
import algm.*;
import java.util.List;
public class Test {
    public static void main(String[] args){
        String str="[[\"\\\"23\\\"\"],[\"\\\"\\\"\"],[\"\\\"2\\\"\"]]";
        String[][] arr = Util.parseStringArrArr(str);
      
        for(int i=0;i<arr.length;i++){
            String[] unitArgs=arr[i];
            Solution s=new Solution();
            String arg0 = Util.parseString(unitArgs[0]);
            List<String> result=s.letterCombinations(arg0);
            String resultabc =Util.serializeStringList(result);
            System.out.print("resultabc"+Integer.toString(i)+":"+resultabc+"resultend");
        }
    }
}