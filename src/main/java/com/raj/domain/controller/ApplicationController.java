/**
 * 
 */
package com.raj.domain.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.util.IOUtils;
import com.raj.domain.model.MedicineStore;
import com.raj.domain.service.MessageService;

@RestController
public class ApplicationController {

	@Autowired
	private MessageService messageService; 

	@RequestMapping(value="/getAllMedicine", method=RequestMethod.GET)
	public ResponseEntity<List<MedicineStore>> getAllMedicine( ) {
		List<MedicineStore > medicineStores= null; //medicineStroreService.findAllMedicine();

		return new ResponseEntity<List<MedicineStore>>(medicineStores, HttpStatus.OK);
	}

	@RequestMapping(value="/getFilterMedicine", method=RequestMethod.GET)
	public ResponseEntity<List<MedicineStore>> getFilterMedicine(@RequestParam(value="manfList" ,required=false) List<Integer> mafList,
			@RequestParam(value="catList",required=false) List<Integer> catList ) {
		List<MedicineStore> medicineStoreDtos = new ArrayList<>();
		return new ResponseEntity<List<MedicineStore>>(medicineStoreDtos,HttpStatus.OK);
	}

	@RequestMapping(value = "/write",method = RequestMethod.POST)
	public void write(HttpServletRequest servletRequest,HttpServletResponse servletResponse) throws IOException {
		InputStream inputStream = servletRequest.getInputStream();
		String message = IOUtils.toString(inputStream);
		messageService.sendMessage(message);
	}
}
