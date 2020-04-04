package com.hms.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.hms.model.Shipment;

@RestController
public class TestController {

	@RequestMapping(value = "/shipment", method = RequestMethod.GET)
	public Shipment firstPage() {

		Shipment shipment = new Shipment();
		shipment.setShipmentId("ST23456");
		shipment.setShipmentName("VANTL");
		shipment.setTransportMode("TL");
		

		return shipment;
	}

}
