package Vector;

import java.util.HashSet;
import java.util.Scanner;



class Account
{
private int aid;
private String aname;
public Account(int aid, String aname) {
super();
this.aid = aid;
this.aname = aname;
}
public Account() {
super();
// TODO Auto-generated constructor stub
}
public int getAid() {
return aid;
}
public String getAname() {
return aname;
}

}



public class HashSetDemo1 {



public static void main(String[] args) {
// TODO Auto-generated method stub
Account acc=new Account(100,"Savings");
Account acc1=new Account(101,"Current");
Account acc2=new Account(102,"Savings");
HashSet<Account> hs=new HashSet<>();
hs.add(acc);
hs.add(acc1);
hs.add(acc2);
Scanner sc=new Scanner(System.in);
System.out.println("Enter Account Number");
int accno=sc.nextInt();
int k=0;
for(Account account : hs)
{
if(account.getAid()==accno)
{
System.out.println(account.getAid()+"\t"+account.getAname()+"\t");
++k;
}

}
if(k==0)
System.out.println("Account Not Found");



}



}