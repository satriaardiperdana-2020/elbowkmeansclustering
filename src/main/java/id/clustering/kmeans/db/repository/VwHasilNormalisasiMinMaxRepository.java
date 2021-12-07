package id.clustering.kmeans.db.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//import id.alfadigital.syncpas.v1.db.postgresql.model.VwMasterPromotionJoinInvoice;
import id.clustering.kmeans.db.model.VwHasilNormalisasiMinMaxModel;

@Repository
public interface VwHasilNormalisasiMinMaxRepository extends JpaRepository<VwHasilNormalisasiMinMaxModel, String>{
	//@Query(value = "select tbmpro_no_juklak, tbmpro_seller_name, tbmproi_original_faktur, tbmproi_invoice_number, tbmproi_juklak_number, asal_data from vw_master_promotion_join_invoice where tbmproi_promo_type in (:promotionTYpe) order by tbmpro_seller_name asc", nativeQuery = true)
	
	//List<VwMasterPromotionJoinInvoice> fetchFaktur(List<String> promotionTYpe);
	@Query(value="select * from vw_hasil_normalisasi_min_max_latihan limit 10", nativeQuery = true)
	List<VwHasilNormalisasiMinMaxModel> fetchData(); 

}
