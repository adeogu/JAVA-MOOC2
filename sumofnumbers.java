class sumofnumbers{
  public static void main(string[]args){
    Scanner scanner = new Scanner(system.in);
    int count = 0;
    while(true){
      int value = scanner.nextInt();
      if(value==0){
        break;
      }
      //no need for else it can just be count+=value
      else{
        count = count+value;
        //or count += value
      }
      system.out.println("sum of numbers" + count);
    }
    scanner.close();
    
  }
}
