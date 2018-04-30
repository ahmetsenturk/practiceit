/* Write a method called alternate that accepts two Lists of integers as its 
 * parameters and returns a new List containing alternating elements from the 
 * two lists. If the lists do not contain the same number of elements, the 
 * remaining elements from the longer list should be placed consecutively at 
 * the end. Do not modify the parameter lists passed in.
 */
public List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
    
    List<Integer> result = new ArrayList<>();
    
    for(int i = 0; i < Math.max(list1.size(), list2.size()); i++){
        if(i >= list1.size() && i < list2.size()){
            result.add(list2.get(i));
        }else if(i < list1.size() && i >= list2.size()){
            result.add(list1.get(i));
        }else{
            result.add(list1.get(i));
            result.add(list2.get(i));
        }
    }
    
    return result;
}
