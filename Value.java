public class Value {
    public static void main(String[] args) {
        int[] list={2,5,9,8,4};
        int min=list[0];
        int max=list[0];


        for (int i:list){
            if(i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
        }
        System.out.println(max+" "+min);

        int nearestMax=max-min;
        int nearestMin=min-max;
        int nearestForMax=list[0];
        int nearestForMin=list[0];

        for (int i=0;i<list.length;i++){
            if(max-list[i]<nearestMax){
                if(max-list[i]!=0){
                    nearestMax=max-list[i];
                    nearestForMax=list[i];
                }

            }
            if(min-list[i]>nearestMin){
                if(min-list[i]!=0){
                    nearestMin=min-list[i];
                    nearestForMin=list[i];
                }
            }

        }
        System.out.println(nearestForMax);
        System.out.println(nearestForMin);
    }
}
