import java.util.ArrayList;

public class SortColumns {
    //finds columns index to determine when sorted
    public ArrayList<Integer> minDeletionSize(String [] A){
        ArrayList<Integer> retArr = new ArrayList<Integer>();
        int check = A[0].length();
        for (int i = 1; i < A.length; i++) {
            if (check!=A[i].length()){
                retArr.add(-1);
                return retArr;
            }
        }
        for (int i = 0; i < A[0].length(); i++) {
            char prevChar = 'a';
            for (int j = 0; j < A.length; j++) {
                //System.out.println(prevChar +" | "+ A[j].charAt(i));
                if (prevChar>A[j].charAt(i)){
                    //checks for duplicates
                    if(!retArr.contains(i)) {
                        retArr.add(i);
                    }
                }
                prevChar = A[j].charAt(i);
            }
        }
        return retArr;
    }
    public static void main(String args[]){
        String[] A = {"Captain","Marvel","saved", "the", "Avengers"};
        SortColumns test = new SortColumns();
        System.out.println(test.minDeletionSize(A));

    }
}
