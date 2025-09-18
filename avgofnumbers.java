class avgofnumbers{
  public static void main(string[]args){
    Scanner scanner = new Scanner(system.in);
    int count = 0;
    int count1 = 0;

    while(true){
      int value = scanner.nextInt();
      if(value==0){
        break;
      }
      //no need for else 
      else{
        count1++
        count = count+value;
      }
      double avg = (double)count/count1; 
      system.out.println("average of numbers" + avg);

    }
    scanner.close();
    
  }
}
