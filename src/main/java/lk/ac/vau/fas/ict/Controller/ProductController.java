package lk.ac.vau.fas.ict.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.Model.Product;
import lk.ac.vau.fas.ict.Service.ProductService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
   
	@GetMapping("/categorey/{id}")
	public List<String> GetcategorybyId(@PathVariable int id){
		return service.getProductByCategorey(id);
	}
	
	@GetMapping("/district/{name}")
	public List<String> SearchByDistrict(@PathVariable String name) {
		return service.productByDistrict(name);
	}
	
	
	
}
