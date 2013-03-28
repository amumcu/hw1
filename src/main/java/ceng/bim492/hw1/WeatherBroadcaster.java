package ceng.bim492.hw1;

import com.codometer.homework.bim460.homework2.interfaces.IObservee;
import com.codometer.homework.bim460.homework2.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * User: ali
 * Date: 3/23/13
 * Time: 7:44 PM
 */
public class WeatherBroadcaster implements IObservee{

    private float temprature = 10;  // temprature in celcius asa


    private List<IObserver> observerList ;


    public WeatherBroadcaster() {

        observerList = new ArrayList<IObserver>() ; //      observer List
    }


    @Override
    public void AddWeatherListener(IObserver iObserver){

        observerList.add(iObserver);    // add observers

        iObserver.Update(10);     // set its temperature to 10 Celcius
    }

    @Override
    public void BroadCastWeather() {

        for(IObserver observer:observerList){
            observer.Update(getTemprature());
        }

        float celcius = 10 + getTemprature() ;  // temperature must be raised by 10 (float) in celcius
        setTemprature(celcius);
    }


    public void setTemprature(float temprature) {
        this.temprature = temprature; // set temprature
    }

    public float getTemprature() {
        return temprature;          // get  temprature
    }
}
