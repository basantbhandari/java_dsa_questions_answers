package com.basant.github.miu;

public class ClusterCompression {

    /**
     * Compresses the given array into its cluster representation.
     *
     * @param a the array to be compressed
     * @return an array representing the cluster compression of the input array
     */
    public static int[] clusterCompression(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0]; // Return an empty array if the input is null or empty
        }

        // First, count the number of clusters
        int numClusters = 1; // At least one cluster exists
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                numClusters++;
            }
        }

        // Allocate an array for the compressed result
        int[] result = new int[numClusters];
        int clusterIndex = 0;

        // Fill the result array with the values of the clusters
        result[clusterIndex] = a[0]; // The first cluster
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                clusterIndex++;
                result[clusterIndex] = a[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int[] exampleArray = {3, 3, 3, 4, 4, 3, 2, 2, 2, 2, 4};
        int[] compressed = clusterCompression(exampleArray);

        // Print the compressed array
        for (int num : compressed) {
            System.out.print(num + " ");
        }
    }
}
