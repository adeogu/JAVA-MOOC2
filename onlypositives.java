class onlyposiives{
  public static void main(string[]args){
    system.out.println("input a number")
    Scanner scanner = new scannr(system.in)
    while (true){
      int num1= scanner.nextInt();

      if(num1 > 0 ){
        continue;
      }
      else if(num1 == 0){
        break
      }
      else{
        system.out.println(num1*num1);
      }
    }
    scanner.close();
  }
}
