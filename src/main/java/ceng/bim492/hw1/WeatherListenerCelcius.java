package ceng.bim492.hw1;

import com.codometer.homework.bim460.homework2.interfaces.IObservee;
import com.codometer.homework.bim460.homework2.interfaces.IObserver;

/**
 * User: ali
 * Date: 3/23/13
 * Time: 7:45 PM
 */

public class WeatherListenerCelcius implements IObserver{


    private float temprature  = 120;

    private IObservee weatherBroadcaster ;


    @Override
    public void RegisterToWeatherBroadCaster(IObservee iObservee){

        this.weatherBroadcaster = iObservee; // register that listener to a  WeatherBroadcaster.

        weatherBroadcaster.AddWeatherListener(this);
    }

    @Override
    public float DisplayTemperature() {

        return getTemprature();  //  return the temperature in Celcius.
    }

    @Override
    public void Update(float v){

        setTemprature(v);  //  set weather
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }

    public float getTemprature() {
        return temprature;
    }

}
