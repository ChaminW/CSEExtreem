/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q4;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Chamin
 */
public class Q4 {

    public static void BuildListOfSubsets(int[] originalList, List<int[]> listOfSubsets, int sizeOfSubsetList, int currentLevel, Stack<Integer> currentList)
    {
        if (currentList.size() == sizeOfSubsetList)
        {
            Integer[] copy = new Integer[sizeOfSubsetList];
            currentList.copyInto(copy);
            listOfSubsets.add(copy);
        }
        else
            for (int ix = currentLevel; ix < originalList.length; ix++)
            {
                currentList.push(originalList[ix]);
                BuildListOfSubsets(originalList, listOfSubsets, sizeOfSubsetList, ix + 1, currentList);
                currentList.pop();
            }
    }
    static void Main(String[] args)
    {
        Integer[] originalList = new Integer[] { 1, 2, 3, 4 };
        Stack<Integer> currentList = new Stack<Integer>();
        LinkedList<Integer[]> listOfSubsets = new LinkedList<Integer[]>() {};

        BuildListOfSubsets(originalList, listOfSubsets, 3, 0, currentList);
    }

    
    
}
