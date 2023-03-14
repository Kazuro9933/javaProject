package methodOverLoading;

public class IsPrime {
    /*
    create a method that accepts one number and return
    true if its prime, else false user must be able to give:
    int
    short
    long
     */
    public boolean isPrime(int number){
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (long a = 2; a <= n; a++) {
            if (n % a == 0) {
                return false;
            }
        }
        return true;
    }

}
