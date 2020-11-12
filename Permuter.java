
// ?�열, 경우????
public class Permuter extends AppCompatActivity {
    char[] ch = {'1','2','3','4','5'};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        permute(ch.length,ch);

    }
    private static void permute(int n, char[] a){
        if(n==0)
            System.out.println(String.valueOf(a));
        else
            for(int i=0;i<=n;i++) {
                permute(n - 1, a);
                swap(a, ((n % 2) == 0) ? i : 0, n);
            }
    }

    private static void swap(char[] a,int i, int j){
        char saved= a[i];
        a[i] = a[j];
        a[j] = saved;
    }
}