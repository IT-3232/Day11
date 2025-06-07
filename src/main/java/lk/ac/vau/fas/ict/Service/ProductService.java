package lk.ac.vau.fas.ict.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.fas.ict.Model.Product;
import lk.ac.vau.fas.ict.Repo.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo repo;

	public List<String> getProductByCategorey(int id){
		return repo.filterbycategorey(id);
	}
	
	
}
