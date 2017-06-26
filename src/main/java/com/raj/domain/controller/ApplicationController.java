/**
 * 
 */
package com.raj.domain.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.raj.domain.model.MedicineStore;

@RestController
public class ApplicationController {

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
}
