/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vivamethod;

public class Q2 {
    
    public static void main(String[] args) {
        
        double[]Array1={5.2,2.1,17.2};
        double[]Array2={1.3,2.4,2.1,11.1};
        double[]Array3={2.5,1.2,3.3,4.7};
        double[]Array4={10.3,4.2,6.6,2.1};
        
        double median1=unsortedArray(Array1,Array2);
        double median2=unsortedArray(Array3,Array4);
        
        System.out.print("Median for array1 and array 2:");
        System.out.printf("%.3f\n",median1);
        System.out.print("Median for array3 and array 4:");
        System.out.printf("%.3f\n",median2);
    }
    public static double unsortedArray(double[]a , double[]b){
        double[]mergedArray=new double[a.length+b.length];
        
        for(int i=0;i<a.length;i++)
            mergedArray[i]=a[i];
        
        for(int i=0;i<b.length;i++)
            mergedArray[a.length+i]=b[i];
        
        double[]x=sortedArray(mergedArray);
        double median=getMedian(x);
        
        return median;
        
    }
    
    public static double[]sortedArray(double[] m){
        for(int pass=1;pass<m.length;pass++){
            for(int i=0;i<m.length-1;i++){
                if(m[i]>m[i+1]){
                    double temp=m[i];
                    m[i]=m[i+1];
                    m[i+1]=temp;
                }
            }
        }
        return m;
    }
    public static double getMedian(double[]a){
        double median=0;
        int n=a.length-1;
        if(n%2==0){
            median=(a[n/2]+a[(n/2+1)])/2.0;
        }
        else{
            median=a[n/2+1];
        }
        return median;
        
    }
    }


    
