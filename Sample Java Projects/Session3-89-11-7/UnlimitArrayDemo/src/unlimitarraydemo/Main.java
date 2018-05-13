/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package unlimitarraydemo;


import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //araye tarif shode, null yani hich ozvi nadarad
        String[]Members=null;
        //String[]Members=new String[0];
        //ta abad kar anjam bede
        while(true)
        {
            //az voroodi ozve jadid begir
            String NewMember=JOptionPane.showInputDialog("New Member : ");
            //agar khali vared shod khoruj az while
            if(NewMember.length()==0)
                break;
            //agar dar araye ozv nadarim
            if(Members==null)
            {
                //araye new shavad va 1 ozvi
                Members=new String[1];
                //dar tanha khaneye araye ozve jadid zakhire shavad
                Members[0]=NewMember;
            }
            //agar araye ozv dasht
            else
            {
                //barresi tekrar ba foreach
                /*
                Boolean Find=false;
                for(String sp:Members)
                {
                    if(sp.equals(NewMember))
                    {
                        JOptionPane.showMessageDialog(null, "Exists !");
                        Find=true;
                        break;
                    }
                }
                if(Find)
                    continue;
                 */

                //barresi tekrar ba for
                int j=0;
                for(j=0;j<Members.length;j++)
                {
                    if(Members[j].equals(NewMember))
                        break;
                }
                if(j==Members.length)
                {

                    //yek araye 1 vahed bozorgtar az araye ghabli besaz
                    String[]NewArray=new String[Members.length+1];
                    //azaye araye ghabli copy be araye jadid
                    for(int i=0;i<Members.length;i++)
                    {
                        NewArray[i]=Members[i];
                    }
                    //khaneye akhare araye jadid ba ozve jadid por shavad
                    NewArray[NewArray.length-1]=NewMember;
                    //araye jadid bejaye araye ghabli
                    Members=NewArray;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Exists !");
                }

            }
            System.out.println("-----------");
            //azaye araye dar khoruji
            for(String sp:Members)
            {
                System.out.println(sp);
            }            
        }
    }

}
