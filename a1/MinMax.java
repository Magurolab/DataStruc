import java.util.ArrayList;


public class MinMax
{

    public static double minMaxAverage(ArrayList<Integer>numbers)//calculate the acr of min and max
    {
        ArrayList<Integer>winner = new ArrayList<>(); //an arraylist for the higher numbers
        ArrayList<Integer>loser = new ArrayList<>();  // an arraylist for the lower nu,bers
        ArrayList<ArrayList<Integer>>box = new ArrayList<>();// want to do something like box = [[],[]]
        ArrayList<ArrayList<Integer>> ans;

        int c =0;//


        // The first part is trying to pair everynumber in the arrlist up
        // and find the winner and loser of each pairs

        if(numbers.size()%2 != 0){ // this id will handele the case where there is a number that doesn't have a pair.

            if(numbers.get(0)>numbers.get(1)){
                c+=1;
                winner.add(numbers.get(0));
                numbers.remove(0);
            }
            else{
                c+=1;
                loser.add(numbers.get(0));
                numbers.remove(0);
            }
        }

        for (int i = 0; i < numbers.size(); i+=2) {//here we compare 
            if(numbers.get(i) > numbers.get(i+1)){
                c+=1;
                winner.add(numbers.get(i));
                loser.add(numbers.get(i+1));
            }
            else{
                c+=1;
                loser.add(numbers.get(i));
                winner.add(numbers.get(i+1));
            }
        }
        // right now winner is containing  the higher number and loser is containing the lower numbers
        box.add(winner);// pack to the box
        box.add(loser);
        
        System.out.println("This is c from the first time"+c);

        ans = findMinMax(box);// pass the box to the find the highest and lowest.


        int myMax = ans.get(0).get(0);// arraylist of interger
        int myMin = ans.get(1).get(0);


        return (myMin + myMax)/2.0;
    }

    public static ArrayList findMinMax(ArrayList<ArrayList<Integer>> box) {

        ArrayList<Integer> winner = box.get(0);//unpack winner
        ArrayList<Integer> loser = box.get(1);//unpack loser

        ArrayList<Integer> New_winner = new ArrayList<>(); //prepare new winner, loser and box
        ArrayList<Integer> New_loser = new ArrayList<>();
        ArrayList<ArrayList<Integer>> New_box = new ArrayList<>();
        int n;// will be the number of how many loops
        int c = 0;

        if (winner.size() == 1 && loser.size() == 1) {// base case where there is only one number left in both winner and loser

            return box;
        }
        else if (winner.size() % 2 != 0) { // same as before, this will handle the case where there is a number that doesn't have pair in winner.

            if (winner.get(0) > winner.get(1)) { //eliminate the loser number
                c+=1;
                winner.remove(winner.get(1));
            } else {
                c+=1;
                winner.remove(winner.get(0));
            }
        }

        else if (loser.size() % 2 != 0) { // same as before, this will handle the case where there is a number that doesn't have pair in winner.

            if (loser.get(0) < loser.get(1)) {// eliminate the higher number
                c+=1;
                loser.remove(loser.get(1));
            } else {
                c+=1;
                loser.remove(loser.get(0));
            }
        }

        n = winner.size();// set up how many loops (at this point the length of both winner and loser will be the same )
        for (int i = 0; i < n ; i+=2) {

            if (winner.get(i)>winner.get(i+1)){// add the new higher number to the new_winner
                c+=1;
                New_winner.add(winner.get(i));
            }
            else{
                c+=1;
                New_winner.add(winner.get(i+1));
            }
            if(loser.get(i)<loser.get(i+1)){// add the new lower number to the new_lower
                c+=1;
                New_loser.add(loser.get(i));
            }
            else{
                c+=1;
                New_loser.add(loser.get(i+1));
            }

        }
        // pack them in to the new_box
        New_box.add(New_winner);
        New_box.add(New_loser);
        System.out.println("This is c form recursion"+c);

        return findMinMax(New_box);// recursive call the new box and do it over again until we get the last number

    }






}
