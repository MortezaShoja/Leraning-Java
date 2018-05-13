/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mysortdemo;

/**
 *
 * @author Ramezani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]test=new int[3];
        /*
        test[0]=7;
        test[1]=10;
        test[2]=5;
         *
         */
        test[0]=5;
        test[1]=6;
        test[2]=7;
        MySort(test);
        for(int ip:test)
        {
            System.out.println(ip);
        }
    }

    static void MySort(int[]ia)
    {
        for(int i=0;i<ia.length;i++)
        {
            System.out.println("Time : "+String.valueOf(i+1));
            boolean exchanged=false;
            for(int j=0;j<ia.length-1;j++)
            {
                if(ia[j]>ia[j+1])
                {
                    System.out.println(String.format("ia[%d]<-ia[%d]", j,j+1));
                    int k=ia[j];
                    ia[j]=ia[j+1];
                    ia[j+1]=k;
                    exchanged=true;
                }
            }
            for(int ip:ia)
                System.out.println(ip);
            System.out.println("-------------");
            if(exchanged==false)
                break;
        }
    }

}
