// Un-upTown Leopard Rock: Lea Kwok, Raven (Ruiwen) Tang
// APCS pd7
// L03 -- Get Empirical
// 2021-12-20
// time spent: 02.0 hours

public class SearchDriver{
		
	public static void main(String[] args){

		//System.out.println(System.currentTimeMillis());

// ============================================================================
		// testing Array size 100
		System.out.println("Testing Array size 100:");
		int[] test1 = new int[100];
		for(int i = 0; i < test1.length; i++){
			test1[i] = i;
		}

				
		int target = test1.length-1;
		
		//"trash" code to get past lag 
		
		for(int i = 0; i < 10000000; i++){
			BinSearch.binSearch(test1, target);
		}
		
		//beginning of "counted"/recorded cases
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){		
			BinSearch.binSearch(test1, target);
		}
		long endTime = System.currentTimeMillis();
		long difference = endTime - startTime;
		System.out.println("BinSearch difference for 10000 iterations: " + difference + " ms");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){		
			LinSearch.linSearch(test1, target);
		}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("LinSearch difference for 10000 iterations: " + difference + " ms");
		

// ============================================================================
		// testing Array size 1000
		System.out.println("Testing Array size 1000:");
		int[] test2 = new int[1000];
		for(int i = 0; i < test2.length; i++){
			test2[i] = i;
		}

		target = test2.length-1;
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			BinSearch.binSearch(test2, target);
		}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("BinSearch difference for 10000 iterations: " + difference + " ms");

		startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			LinSearch.linSearch(test2, target);
		}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("LinSearch difference for 10000 iterations: " + difference + " ms");

// ============================================================================
		// testing Array size 1_000_000
		System.out.println("Testing Array size 1_000_000:");
		int[] test3 = new int[1_000_000];
		for(int i = 0; i < test3.length; i++){
			test3[i] = i;
		}

		target = test3.length-1;
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			BinSearch.binSearch(test3, target);
		}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("BinSearch difference for 10000 iterations: " + difference + " ms");

		startTime = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++){
			LinSearch.linSearch(test3, target);
		}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("LinSearch difference for 10000 iterations: " + difference + " ms");

// ============================================================================
		// testing Array size 2^29
		System.out.println("Testing Array size 2^29:");
		int[] test5 = new int[(int)Math.pow(2,29)];
		for(int i = 0; i < test5.length; i++){
			test5[i] = i;
		}

		target = test5.length-1;
		startTime = System.currentTimeMillis();
		//for(int i = 0; i < 10000; i++){
			BinSearch.binSearch(test5, target);
		//}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("BinSearch difference for 1 iteration: " + difference + " ms");

		startTime = System.currentTimeMillis();
		//for(int i = 0; i < 10000; i++){
			LinSearch.linSearch(test5, target);
		//}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("LinSearch difference for 1 iteration: " + difference + " ms"); 	

// ============================================================================
		// testing Array size 1_000_000_000
		System.out.println("Testing Array size 1_000_000_000:");
		int[] test4 = new int[1_000_000_000];
		for(int i = 0; i < test4.length; i++){
			test4[i] = i;
		}

		target = test4.length-1;
		startTime = System.currentTimeMillis();
		//for(int i = 0; i < 10000; i++){
			BinSearch.binSearch(test4, target);
		//}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("BinSearch difference for 1 iteration: " + difference + " ms");

		startTime = System.currentTimeMillis();
		//for(int i = 0; i < 10000; i++){
			LinSearch.linSearch(test4, target);
		//}
		endTime = System.currentTimeMillis();
		difference = endTime - startTime;
		System.out.println("LinSearch difference for 1 iteration: " + difference + " ms"); 
		
/* 
		*/
	}
}
