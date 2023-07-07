public class GuessingGame {

    public static void main(String[] args) {
        int guess = 10;
        int secretNumber = 10;
        String result; // null
//some comments here
        if(guess == secretNumber){
            result = "Yayy, that's correct";
        } else {
                     // boolean value     ?      value if true      :       value if false
            result = guess > secretNumber ? "Too high, guess lower" : "Too low, guess higher!";
        }

        System.out.println(result);
    }

}
