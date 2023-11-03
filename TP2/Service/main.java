package Service;
 import java.util.Scanner;
 public class main {
public static void main (String[] args)
{
   BanqueService ser =new BanqueService ();
   Scanner scan =new Scanner (System.in);
   System.out.println ("donner un MOntant: \n");
 double TND =scan.nextDouble ();
   System.out.println ("le montant avant le conversion ="+TND);
 double Euro =ser.conversion (TND);
   System.out.println ("\nle montant aprés le conversion ="+Euro); 
   ser.addCompte (new Compte (100,5000.0, "15/10/2023"));
   ser.addCompte (new Compte (101,6000.0, "15/10/2023"));
   ser.addCompte (new Compte (102,1000.0, "15/10/2023"));
//System.out.println(ser.getCompte (1));
   ser.getComptes ();
}
}