class avgsumofpositivenumbers{
  public static void main(string[]args){
    Scanner scanner = new Scanner(system.in);
    int count = 0;
    int count1 = 0;

    while(true){
      int value = scanner.nextInt();
      if(value==0){
        break;
      }
      else if(value>0){
        count1++;
        count = count+value;
      }
    }
    if (count>0){
      double avg = (double)count/count1; 
      system.out.println("average of postive numbers" + avg);
    }else{
       System.out.println("cannot calc avf") 
    }
    scanner.close();
    
  }
}
