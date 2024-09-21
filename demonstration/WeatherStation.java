package demonstration;
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(float temperature, float humidity, float pressure);
}

class WeatherData {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}

class PhoneDisplay implements Observer {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Phone Display: Temp=" + temperature + " Humidity=" + humidity + " Pressure=" + pressure);
    }
}

class DesktopDisplay implements Observer {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Desktop Display: Temp=" + temperature + " Humidity=" + humidity + " Pressure=" + pressure);
    }
}

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer phoneDisplay = new PhoneDisplay();
        Observer desktopDisplay = new DesktopDisplay();
        
        weatherData.registerObserver(phoneDisplay);
        weatherData.registerObserver(desktopDisplay);
        
        weatherData.setMeasurements(25.5f, 65.0f, 1012.0f);
        weatherData.setMeasurements(27.3f, 70.0f, 1013.0f);
    }
}