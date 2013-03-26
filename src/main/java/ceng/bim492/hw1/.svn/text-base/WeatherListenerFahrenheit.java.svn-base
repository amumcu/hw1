package ceng.bim492.hw1;

import com.codometer.homework.bim460.homework2.interfaces.IObservee;
import com.codometer.homework.bim460.homework2.interfaces.IObserver;

/**
 * User: ali
 * Date: 3/23/13
 * Time: 7:45 PM
 */

public class WeatherListenerFahrenheit implements IObserver{

    private IObservee weatherBroadcaster ;

    private float temprature   = -10;



    @Override
    public void RegisterToWeatherBroadCaster(IObservee iObservee){

        this.weatherBroadcaster = iObservee;       // register that listener to a  WeatherBroadcaster.

        weatherBroadcaster.AddWeatherListener(this);
    }

    @Override
    public float DisplayTemperature(){

        return getTemprature() ;      //  return the temperature in Fahrenheit.
    }

    @Override
    public void Update(float v){

        float fahrenheit ;
        fahrenheit = (float) ((v * 1.8) + 32);
        setTemprature(fahrenheit);  // set weather in Fahrenheit

    }


    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }

    public float getTemprature() {

        return temprature;
    }

}
