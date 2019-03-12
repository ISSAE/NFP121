package question1.patron_strategie;
// https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return num1 + num2;
   }
}