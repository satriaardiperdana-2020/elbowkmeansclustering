package id.clustering.kmeans.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import id.clustering.kmeans.db.model.*;
import id.clustering.kmeans.services.*;

@RestController
public class VwHasilNormalisasiMinMaxController {
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private VwHasilNormalisasiMinMaxService vwHasilNormalisasiMinMaxService;
	
	@GetMapping("/loadDataMinmax")
	public List<VwHasilNormalisasiMinMaxModel> getAllDataMinMax(){
		try {
			vwHasilNormalisasiMinMaxService.getAllDataMInMax();
			log.info("cek hasil ke service");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	

	}

}
