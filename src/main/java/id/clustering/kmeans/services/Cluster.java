package id.clustering.kmeans.services;

import id.clustering.kmeans.db.model.VwHasilNormalisasiMinMaxModel;
import lombok.Data;

@Data
public class Cluster {
	private Double normalisasiFrekuensiCentroid;
	private Double normalisasiTotalCentroid;
	private Integer clusterNumber;
	
	public Cluster(int clusterNumber, Double normalisasiFrekuensiCentroid, Double normalisasiTotalCentroid) {
		super();
		this.clusterNumber = clusterNumber;
		this.normalisasiFrekuensiCentroid = normalisasiFrekuensiCentroid;
		this.normalisasiTotalCentroid = normalisasiTotalCentroid;
		
	}

	@Override
	public String toString() {
		return "Cluster [normalisasiFrekuensiCentroid=" + normalisasiFrekuensiCentroid + ", normalisasiTotalCentroid="
				+ normalisasiTotalCentroid + ", clusterNumber=" + clusterNumber + "]";
	}
	
	// Euclidean distance calculation
	public double calculateDistance(VwHasilNormalisasiMinMaxModel vwHasilNormalisasiMinMaxModel) {
		return Math.sqrt(Math.pow((getNormalisasiFrekuensiCentroid() - vwHasilNormalisasiMinMaxModel.getNormalisasiFrekuensi()), 2) + Math.pow((getNormalisasiTotalCentroid() - vwHasilNormalisasiMinMaxModel.getNormalisasiTotal()),2));
    }

	// Binod Suman Academy YouTube Video on K-Mean Algorithm
	public void updateCentroid(VwHasilNormalisasiMinMaxModel vwHasilNormalisasiMinMaxModel) {
		setNormalisasiFrekuensiCentroid((getNormalisasiFrekuensiCentroid()+vwHasilNormalisasiMinMaxModel.getNormalisasiFrekuensi())/2);
		setNormalisasiTotalCentroid((getNormalisasiTotalCentroid()+vwHasilNormalisasiMinMaxModel.getNormalisasiTotal())/2);

	}
	
	
	
	
	
}
