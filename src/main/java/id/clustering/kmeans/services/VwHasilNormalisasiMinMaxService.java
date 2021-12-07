package id.clustering.kmeans.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.clustering.kmeans.db.repository.VwHasilNormalisasiMinMaxRepository;
import id.clustering.kmeans.db.model.VwHasilNormalisasiMinMaxModel;

@Service
public class VwHasilNormalisasiMinMaxService {
	
	private Logger logService = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	VwHasilNormalisasiMinMaxRepository vwHasilNormalisasiMinMaxRepository;
	
	List<VwHasilNormalisasiMinMaxModel> data = new ArrayList<VwHasilNormalisasiMinMaxModel>();
	List<Cluster> clusters = new ArrayList<Cluster>();
	Map<Cluster, List<VwHasilNormalisasiMinMaxModel>> clusterRecords = new HashMap<Cluster, List<VwHasilNormalisasiMinMaxModel>>();
	
	List<Integer> nTbmmId = new ArrayList<>();
	List<Double> nFrekuensi = new ArrayList<>();
	List<Double> nTotal = new ArrayList<>();
	public void getAllDataMInMax() {
		List<VwHasilNormalisasiMinMaxModel> getData = vwHasilNormalisasiMinMaxRepository.fetchData();
		for(VwHasilNormalisasiMinMaxModel dataTemp : getData) {
			data.add(dataTemp);
		}//
		//logService.info("tbmmID==="+nTbmmId);
		//logService.info("frek"+nFrekuensi);
		//logService.info("toto"+nTotal);
		logService.info("=====LIHAT DATA======= data=="+data);
		int clusterNumber = 2;//k = cluster
		//initiateClusterAndCentroid(clusterNumber);
		//printRecordInformation();
		//printClusterInformation();
	}
	
	/*
	 * private void initiateClusterAndCentroid(int clusterNumber) { int counter = 1;
	 * Iterator<VwHasilNormalisasiMinMaxModel> iterator = data.iterator();
	 * VwHasilNormalisasiMinMaxModel vwHasilNormalisasiMinMaxModel = null;
	 * 
	 * while(iterator.hasNext()) { vwHasilNormalisasiMinMaxModel = iterator.next();
	 * if(counter <= clusterNumber) {
	 * vwHasilNormalisasiMinMaxModel.setClusterNumber(counter);
	 * initializeCluster(counter, vwHasilNormalisasiMinMaxModel); counter++; }else {
	 * System.out.println(vwHasilNormalisasiMinMaxModel);
	 * System.out.println("** Cluster Information **"); for(Cluster cluster :
	 * clusters) { System.out.println(cluster); }
	 * System.out.println("*********************"); double minDistance =
	 * Integer.MAX_VALUE; Cluster whichCluster = null;
	 * 
	 * for(Cluster cluster : clusters) { double distance =
	 * cluster.calculateDistance(vwHasilNormalisasiMinMaxModel);
	 * System.out.println(distance); if(minDistance > distance) { minDistance =
	 * distance; whichCluster = cluster;
	 * System.out.println("===keluarin whichClusterwhichCluster"+whichCluster); } }
	 * 
	 * vwHasilNormalisasiMinMaxModel.setClusterNumber(whichCluster.getClusterNumber(
	 * )); whichCluster.updateCentroid(vwHasilNormalisasiMinMaxModel);
	 * System.out.println("keluarin view untuk cek ===="
	 * +vwHasilNormalisasiMinMaxModel);
	 * System.out.println("===clusterRecordsclusterRecords=="+clusterRecords);
	 * clusterRecords.get(whichCluster).add(vwHasilNormalisasiMinMaxModel);
	 * 
	 * }
	 * 
	 * System.out.println("** Cluster Information **"); for(Cluster cluster :
	 * clusters) { System.out.println(cluster); }
	 * System.out.println("*********************");
	 * 
	 * 
	 * }
	 * 
	 * }
	 * 
	 * 
	 * //clusterNumber berasal dari counter private void initializeCluster(int
	 * clusterNumber, VwHasilNormalisasiMinMaxModel vwHasilNormalisasiMinMaxModel) {
	 * Cluster cluster = new Cluster(clusterNumber,
	 * vwHasilNormalisasiMinMaxModel.getNormalisasiFrekuensi(),
	 * vwHasilNormalisasiMinMaxModel.getNormalisasiTotal()); clusters.add(cluster);
	 * List<VwHasilNormalisasiMinMaxModel> clusterRecord = new
	 * ArrayList<VwHasilNormalisasiMinMaxModel>();
	 * clusterRecord.add(vwHasilNormalisasiMinMaxModel); clusterRecords.put(cluster,
	 * clusterRecord);
	 * 
	 * }
	 * 
	 * private void printRecordInformation() {
	 * System.out.println("****** Each Record INFORMATIN *********"); for
	 * (VwHasilNormalisasiMinMaxModel vwHasilNormalisasiMinMaxModel : data) {
	 * System.out.println(vwHasilNormalisasiMinMaxModel); } }
	 * 
	 * private void printClusterInformation() {
	 * System.out.println("****** FINAL CLUSTER INFORMATIN *********"); for
	 * (Map.Entry<Cluster, List<VwHasilNormalisasiMinMaxModel>> entry :
	 * clusterRecords.entrySet()) { System.out.println("Key = " + entry.getKey() +
	 * ", Value = " + entry.getValue()); } }
	 */

}
