package org.acme.sheduler;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.client.CarClient;
import org.acme.client.StatisticClient;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@ApplicationScoped
public class CarsSheduler {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    SimpleDateFormat format = new SimpleDateFormat("dd-MM_HH:mm:ss");
    FileHandler fh = new FileHandler("logs/cars/car_list" + format.format(Calendar.getInstance().getTime()) + ".log");
    @RestClient
    CarClient carClient;

    public CarsSheduler() throws IOException {
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);
    }


    @Scheduled(every = "20s")
    public void logStatistic(){
        logger.info("Get car list: " + carClient.getCars());
    }
}
