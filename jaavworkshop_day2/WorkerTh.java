package jaavworkshop_day2;   
class WorkerTh implements Runnable
{
    private int row;
    private int col;
    private int A[][];
    private int B[][];
    private int C[][];
    
    public WorkerTh(int row, int col, int A[][], int B[][], int C[][] )
    {
        this.row = row;
        this.col = col;
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    @Override
    public void run()
    {
       
       
            for(int k = 0; k < B.length; k++)
            {
             C[row][col] += A[row][k] * B[k][col];
            }
                     
    }
   
}