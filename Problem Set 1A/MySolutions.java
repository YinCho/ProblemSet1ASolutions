
/**
 * Write a description of class MySolutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySolutions {
    
    public void celsiusToFahrenheit() {
        double temperatureCelsius = 10;
        double temperatureFahrenheit = temperatureCelsius * 9/5 + 32;
        System.out.println(temperatureCelsius + "°C = " + temperatureFahrenheit + "°F");
    }
    
    public void elapsedTime() {
        int hours = 10;
        int minutes = 30;
        int seconds = 40;
        double totalTime = hours * 3600 + minutes * 60 + seconds;
        System.out.println("The current time is " + hours + ":" + minutes + ":" + seconds +". It has been " + (hours * 3600 + minutes * 60 + seconds) + "s since the day began.");
        System.out.println("There are " + (86400-hours * 3600 + minutes * 60 + seconds) + " seconds left in the day.");
        System.out.println("The day is " + (totalTime/86400 * 100) + "% done.");
    }
    
    public void secondsToHMS() {
        int numberOfSeconds = 37840;
        int remainingMinutes = numberOfSeconds/60%60;
        int remainingHours = numberOfSeconds/60/60;
        int remainingSeconds = numberOfSeconds %60;
        System.out.println(numberOfSeconds + " seconds = " +remainingHours + " hours, " + remainingMinutes + " minutes, and " + remainingSeconds + " seconds.");
        
    }
}
