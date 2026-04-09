public class Arraymax{
public static void main(String[] args){
int[] hri = {2,5,3,9,7,5,0,6};

int max = hri[0];
for(int i=1; i<hri.length; i++){if (max < hri[i]){max = hri[i];}}
System.out.println("Max=" + max);
}
}
