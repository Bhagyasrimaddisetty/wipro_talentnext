package java_fundamental;

public class Question16 {
public static void main(String[] args) {

for (int number = 10; number <= 99; number++) {
    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    if (isPrime) {
        System.out.print(number + " ");
		            }
		        }
		    }
		}

	


