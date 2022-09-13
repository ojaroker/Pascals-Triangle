// My solution to the LeetCode Easy 'Pascal's Triangle' challenge
// https://leetcode.com/problems/pascals-triangle/
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {

      //cannot have row length 0
      if(numRows == 0){
        return null;
      }
      
      List<List<Integer>> lists = new ArrayList<List<Integer>>();
      ArrayList<Integer> al1 = new ArrayList<Integer>();
      al1.add(1);
      lists.add(al1);
     
      
      //positions j-1 and j of the previous row added together make position i+1 of the current row
      for(int i=1;i<numRows;i++){
        List<Integer> prevRow = new ArrayList<>();
        List<Integer> currRow = new ArrayList<>();
        prevRow = lists.get(i-1);
        currRow.add(1); //all rows start and end with 1s
        for(int j=1;j<i;j++){
          currRow.add(prevRow.get(j-1) + prevRow.get(j)); //adds all numbers in between 1s
        }
        currRow.add(1);
        lists.add(currRow);
      }      
        return lists;
    }
}