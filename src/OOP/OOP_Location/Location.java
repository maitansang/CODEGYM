package OOP.OOP_Location;

public class Location {
    public int row,column;
    public double maxValue;
    public static Location locateLargest(double  [][]a){
        Location location = new Location();
        double max = a[0][0];
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]>max){
                    max=a[i][j];
                }
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]==max){
                    location.row=i;
                    location.column=j;
                }
            }
        }
        location.maxValue=max;
    return location;
    }
}
