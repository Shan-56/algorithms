public class QuickFindUF{
    
    /**
    * Index represents object, ID represents connectivity.
    * If two indexes share ID it means they are connected
    */
    private int[] id;
    
    /**
    * Creates the array, and sets the ID values for each element of the array.
    * The ID of each element of the array is equal to its index.
    */
    public QuickFindUF(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }
    
    /**
    * Checks if two objects are connected.
    * @param p An object.
    * @param q An object.
    * @return True if objects are connected, false if they aren't.
    */
    public boolean connected(int p, int q){
        return id[p] == id[q];
    }
    
    /**
    * Connects two objects.
    * Changes the ID of the q object and all the objects that share ID with q to the
    * ID of the p object.
    * @param p The object that will be connected to the q object.
    * @param q The object that will be connected to the p object.
    */
    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid){
                id[i] = qid;
            }
        }
    }
}