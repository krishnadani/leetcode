import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = record.pop();
                int newScore = top + record.peek();
                record.push(top);      
                record.push(newScore);  
            } else if (op.equals("D")) {
                record.push(2 * record.peek()); 
            } else if (op.equals("C")) {
                record.pop(); 
            } else {
                record.push(Integer.parseInt(op)); 
            }
        }

        int totalSum = 0;
        for (int score : record) {
            totalSum += score;
        }

        return totalSum;
    }
}