/* Write a method split that rearranges the elements of a list so that all of 
 * the negative values appear before all of the non-negatives.
 */
public void split() {
    ListNode current = front;
    
    while(current != null){
        if(current.data >= 0){
            
            ListNode front = current;
            
            while(front.next != null){
               
                front = front.next;
                int n = front.data;
                
                if(n < 0) {
                    int temp = current.data;
                    current.data = front.data;
                    front.data = temp;
                    break;
                }
            }
        }
        current = current.next;
    }
}
