package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneticAlgorithmService {

    @Autowired
    private ElectricBusService electricBusService;

    @Autowired
    private ChargingStationService chargingStationService;



}
