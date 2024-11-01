package basicsofjava;

public class DatatypeDemo1 {
public static void main (String args[])
{
	byte bytemax=127;
	byte bytemin=-128;
	System.out.println("min range of byte is"+bytemin+"max range of byte"+bytemax);

//short-2bytes
short shortmax=32767;
short shortmin=-32768;
System.out.println("min range of short is"+shortmin+"max range of short"+shortmax);



//int-4bytes
int maxint=2147483647;
int minint=-2147483648;
System.out.println("min range of int is"+minint+"maxrange of int"+maxint);


//long-8byte
long maxlong=92312786789675345l;
long minlong=-92312786789675346l;
System.out.println("min range of long is"+minlong+"max range of long"+maxlong);
}
}