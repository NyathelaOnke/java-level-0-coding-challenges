class Task7 {

    static double celsiusToFahrenheit(int tempInCelsius){
        return (tempInCelsius * 1.8) + 32;
    }
    static  double fahrenheitToCelsius(int tempInFahrenheit){
        return ((tempInFahrenheit - 32)*5)/9.0;
    }
    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(32));
        System.out.println(fahrenheitToCelsius(75));
	// write your code here
    }
}
