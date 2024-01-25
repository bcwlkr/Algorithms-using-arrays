import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    double[] pollution = {0.0037, 0.0057, 0.0186, 0.0329, 0.0083, 0.0104, 
      0.0004, 0.0234, 0.0265, 0.0289, 0.0336, 0.0213, 0.0172, 0.0124, 
      0.0216, 0.016, 0.0336, 0.0228, 0.0166, 0.0088};

    for(int i = 0; i < pollution.length; i++){
      pollution[i] = (int) (pollution[i] * 1000)/1000.0; //rounds to 3 decimal places
    }
    
    for(int i = 0; i < pollution.length - 1; i++){
      pollution[i] = pollution[i + 1]; //shifts the array to the left
    }
    
    for(int i = 1; i <= pollution.length; i++){
      System.out.println("Location " + i + " " + pollution[i-1]); //tells you the location and the pollution level
    }
    System.out.println("\n\n");
    
    double highest = pollution[0];
    int location = 0;
    for(int i = 1; i < pollution.length; i++){ //finds the highest pollution level
      if(pollution[i] > highest){
        highest = pollution[i];
        location = i;
      }
    }
    System.out.println("The highest pollution level is: " + highest + " at location " + (location + 1));
    System.out.println("\n\n");
    
    double clusterjuan = 0;
    double clustertew = 0;
    double clusterthree = 0;
    double clusterphor = 0;
    double[] clusters = new double[4];
    
    for(int i = 0; i < pollution.length; i++ ){ //finds the average of each cluster
      
      while(i < 5){
        clusterjuan += pollution[i];
        i++;
      }
      while(i >= 5 && i < 10){
        clustertew += pollution[i];
        i++;
      }
      while(i >= 10 && i < 15){
        clusterthree += pollution[i];
        i++;
      }
      while(i >= 15 && i <= 19){
        clusterphor += pollution[i];
        i++;
      }
      clusters[0] = clusterjuan; //appends them to a new array
      clusters[1] = clustertew;
      clusters[2] = clusterthree;
      clusters[3] = clusterphor;

    }
    System.out.println(Arrays.toString(clusters));
}
}
