/* Write a method switchPairs that takes a stack of integers as a parameter 
 * and that switches successive pairs of numbers starting at the bottom of the 
 * stack. If there are an odd number of values in the stack, the value at the 
 * top of the stack is not moved. Use one queue as auxiliary storage.
 */
public void switchPairs(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();
        
    int lastElement = 0;
    int firstSize = s.size();
    if(firstSize % 2 != 0) last = s.pop();
    
    while(!s.isEmpty()) q.add(s.pop());
    
    while(!q.isEmpty()){
        int n = q.size() - 2;
        for(int i = 0; i < n; i++)
            q.add(q.remove());
        
        s.push(q.remove());
        s.push(q.remove());
    }

    if(firstSize % 2 != 0) s.push(last);
}
