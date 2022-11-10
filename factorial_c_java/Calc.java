public class Calc {
	public static void main(String[] args) {
		    long sum = 0;
            long difftime = 0;
            long startTime = System.currentTimeMillis();
            
			System.out.println("Before Calc");
            for(int i=1; i<=500000000; i++) {
                sum += i;
            }
            System.out.println("After Calc sum : "+ sum);
            long endTime = System.currentTimeMillis();
            difftime = endTime-startTime;

            System.out.println("time : "+difftime);

	}
}
