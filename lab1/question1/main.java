public class Lab1 {

    public static void main(String[] args) {
      
      WaterBill wb = new WaterBill(12345,100.00);
      wb.calcWaterBill(0.30);
      System.out.println(wb);

    }
}
