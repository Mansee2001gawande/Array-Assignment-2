public class Twodimensional {
    public static void main(String[] args) {   //(declare method to accept string as parame)
    int [][] mansi ={{1,2,3},{4,5,6},{7,8,9}};
    
    // use nested for loop to access rows and coloumns of the array
    //use outer loop iterates through each rows of the array

                for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){

    //use inner loop iterates through each coloumn of the array
    // print the value of the current elements to the console

    System.out.println("matrix[" +i+ "][" +j+ "] = " mansi[i][j]);
                }
                }
    }
}
