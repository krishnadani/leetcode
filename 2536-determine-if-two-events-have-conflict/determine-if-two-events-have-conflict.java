class Solution {

    static int convertToMinutes(String time){
        String[] parts = time.split(":");

        int hrs = Integer.parseInt(parts[0]);
        int mins = Integer.parseInt(parts[1]);

        return hrs*60 + mins; 
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        
       String start1 = event1[0];
       String end1 = event1[1];

       String start2 = event2[0];
       String end2 = event2[1];

       int s1 = convertToMinutes(start1);
       int e1 = convertToMinutes(end1);
       int s2 = convertToMinutes(start2);
       int e2 = convertToMinutes(end2);

       if( e1<s2 || e2<s1){
        return false;
       }
       else{
        return true;
       }

    }
}