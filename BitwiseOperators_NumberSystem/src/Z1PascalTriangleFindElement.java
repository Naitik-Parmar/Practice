public class Z1PascalTriangleFindElement {
    public static void main(String[] args) {
        int row=6;
        int col=3;
        int element=pascalElement(row,col);
        System.out.println(element);
    }

    private static int pascalElement(int row, int col) {
        int element=0;
        element=(int)nCr(row-1,col-1);
        return element;
    }

    private static long nCr(int n, int r) {
        long res=1;
        for (int i = 0; i < r; i++) {
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}
