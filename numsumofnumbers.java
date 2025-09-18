class numsumofnumbers{
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
      system.out.println("number of numbers" + count1);
      system.out.println("sum of negatives" + count);

    }
    scanner.close();
    
  }
}
