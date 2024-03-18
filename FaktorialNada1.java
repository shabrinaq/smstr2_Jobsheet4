/**
 * FaktorialNada1
 */
public class FaktorialNada1 {

    public int nilai;

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
           fakto = fakto * i; 
        }
        return fakto;
    }

    public int faktorialBFWhile(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
            fakto = fakto * 1;
            i++;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        }
        else
        {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}