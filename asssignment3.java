public class Exercise {
    public static void main(String[] args) throws Exception {
  
       int[][] mdArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15 ,16}};
    
       // PATTERN 1
       System.out.println("1. SUM OF PATTERN 1");
       int row_sum = 0;  
       for (int rows = 0; rows < 4; rows++) {
         for (int columns = 0; columns < 4; columns++) {
             if (rows == 0) {
               row_sum += mdArray[rows][columns];
             }
         }  
       }

       System.out.println(row_sum);

        // PATTERN 2
        System.out.println("");
        System.out.println("2. SUM OF PATTERN 2");
        int column_sum = 0;  
       for (int rows = 0; rows < 4; rows++) {
         for (int columns = 0; columns < 4; columns++) {
             if (columns == 0) {
               column_sum += mdArray[rows][columns];
             }
            }
          }
        System.out.println(column_sum);

        
        // PATTERN 3
        System.out.println("");
        System.out.println("3. SUM OF PATTERN 3");
        int L_sum = 0;  
       for (int rows = 0; rows < 4; rows++) {
         for (int columns = 0; columns < 4; columns++) {
             if (columns == 0 || rows == 0) {
               L_sum += mdArray[rows][columns];
             }
            }
          }
        System.out.println(L_sum);


        // PATTERN 4
        System.out.println("");
        System.out.println("4. SUM OF PATTERN 4");
        int edge_sum = 0;  
        for (int rows = 0; rows < 4; rows++) {
          for (int columns = 0; columns < 4; columns++) {
              if ((rows == 0 && columns== 0) || (rows == 0 && columns == 3) || (rows == 3 && columns == 0) || (rows == 3 && columns == 3)){
                edge_sum += mdArray[rows][columns];
            }
          }  
        }
        System.out.println(edge_sum);
        
        // PATTERN 5
        System.out.println("");
        System.out.println("5. SUM OF PATTERN 5");
        int mid_sum = 0;  
        for (int rows = 0; rows < 4; rows++) {
          for (int columns = 0; columns < 4; columns++) {
              if ((rows == 1 && columns== 1) || (rows == 1 && columns == 2) || (rows == 2 && columns == 1) || (rows == 2 && columns == 2)){
                mid_sum += mdArray[rows][columns];
            }
          }  
        }
        System.out.println(mid_sum);
      
        // PATTERN 6
        System.out.println("");
        System.out.println("6. SUM OF PATTERN 6");
        int combi_sum = 0;  
        for (int rows = 0; rows < 4; rows++) {
          for (int columns = 0; columns < 4; columns++) {
              if ((rows == 0 && columns== 0) || (rows == 0 && columns == 3) || (rows == 3 && columns == 0) || (rows == 3 && columns == 3) || (rows == 1 && columns== 1) || (rows == 1 && columns == 2) || (rows == 2 && columns == 1) || (rows == 2 && columns == 2)){
                combi_sum += mdArray[rows][columns];
            }
          }  
        }
        System.out.println(combi_sum);
    }
  }
