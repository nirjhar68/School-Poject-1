import java.util.*;
public class Location {
    public int row, col;
    public double maxValue;

    //Default cons
    /*Location(){

    }*/
    //Assigning the parameters to the variables of the constructor
    Location(int ro, int co, double maxV){
        this.row = ro;
        this.col = co;
        maxValue = maxV;
    }


    //Method to get the lergest number and the its location
    public static Location locateLargest(double[][] a){
        int r = 0;
        int c = 0;
        double maxValue = a[r][c];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(maxValue<a[i][j]){
                    r = i;
                    c = j;
                    maxValue = a[i][j];
                }
            }
        }
        //Returning the Location object
        return new Location(r, c, maxValue);
    }



    public static void main(String[] args){
        int row = 0;
        int col = 0;
        //double maxValue;
        Scanner input = new Scanner(System.in);
        //System.out.print("Enter the number of row and column: ");
        /*boolean flag = false;
        System.out.print("Enter the number of row and column: ");
        do{
            //System.out.print("Enter the number of row and column: ");
            try{
                int row = Integer.parseInt(input.next());
                int  col = Integer.parseInt(input.next());
                if(row >=1 && row <= 100 && col >=1 && col<=100){
                    flag = true;
                }else{
                    System.out.print("Enter only valid Numner!\n");
                }
            }catch (InputMismatchException e) {
                System.out.println("Not a valid number.");
                input.next();

            }
        }while(!(flag));*/

        boolean isInt;
        do {
            System.out.print("Enter the number of rows and columns in arrays:");
            if(input.hasNextInt()) {

                row = input.nextInt();

                if(input.hasNextInt()) {
                    col = input.nextInt();
                    isInt = true;
                }
                else {
                    System.out.println("Enter only Integer numbers: ");
                    isInt = false;
                    System.out.println();
                    input.nextLine();

                }
            }else {
                System.out.println("Please enter only positive whole number: ");
                isInt = false;
                System.out.println();
                input.nextLine();

            }

        }while(!(isInt));

        //int row = Integer.parseInt(input.next());
        //int  col = Integer.parseInt(input.next());
        double[][] arr = new double[row][col];
        //System.out.print("the number of row is "+arr.length + " ");
        //System.out.print("The number of column is "+arr[0].length);
        System.out.print("Enter the array: \n");
        for (int i = 0; i < row; i++){
            for (int j =0; j < col; j++){
                ;
                arr[i][j] = input.nextDouble();
            }
        }
        Location l = locateLargest(arr);
        System.out.print("The location of the largest element is " + l.maxValue+ " at (" + l.row + " , "+ l.col + ")");

    }

}
