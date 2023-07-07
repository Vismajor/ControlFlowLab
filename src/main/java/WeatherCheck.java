public class WeatherCheck {

    public static void main(String[] args) {
        int temperature = -1;
        boolean currentlyRaining = true;

                 //   true          true
        if(temperature > 30 && currentlyRaining == false){
            System.out.println("Wear sunscreen, it's boiling");
        } else if (temperature > 30 && currentlyRaining){
            System.out.println("Stay inside, enjoy the sound of the rain");
        } else if (temperature < 0 && currentlyRaining){
            System.out.println("Winter coat, and snowshoes");
        }



    }

}
