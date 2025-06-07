package lk.ac.vau.fas.ict.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.fas.ict.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

     //Q1
	@Query("Select p.name from Categorey c join c.products p where c.id=?1")
	public List<String> filterbycategorey(int id);
	
}
