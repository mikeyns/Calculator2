public class Calculator2 {
   public double tax = .05;
   public double tip =.15; //Change tax and tip if you prefer different values I
   public double originalPrice = 0;
   
     public void findTotal () {
     //Calculate an individual's total after tax and tip
     double total = originalPrice * (1+ tax +tip);
    
     //Print this value
     System.out.println("Preco total com a taxa RS" + total);
}
         public static void main(String[] args) {
         Calculator2 calculator = new Calculator2();
         calculator.originalPrice = 10; //valor de uma das pessoas
         calculator.findTotal();
}
}