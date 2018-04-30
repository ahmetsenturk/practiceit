/* Write a method countCommon that takes two Lists of integers as parameters 
 * and returns the number of unique integers that occur in both lists. Use one 
 * or more Sets as storage to help you solve this problem.
 */
public int countCommon(List<Integer> list1, List<Integer> list2) {
    Set<Integer> set = new TreeSet<>();
    
    for(int i: list1) set.add(i);
    
    for(int j: list2) set.add(j);
    
    set.retainAll(list1);
    set.retainAll(list2);
    
    return set.size();
}
