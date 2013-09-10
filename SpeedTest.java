public class SpeedTest{
private static String[] s = new String[9001];
private static long startTime, endTime;
private static long[] fe = new long[100];
private static long[] tf = new long[100];
private static long fea, tfa;

public static long speedTF(){

for(int x = 0; x < s.length; x++)
s[x] = null;



startTime = System.nanoTime();

for(int x = 0; x < s.length; x++)
s[x] = "Hello";

endTime = System.nanoTime();
return endTime - startTime;

}


public static long speedFE(){

for(String f : s)
f = null;


startTime = System.nanoTime();

for(String f : s)
f = "Hello";
//532865

endTime = System.nanoTime();
return endTime - startTime;

}

public static void main(String[] args)
{



for(int x = 0; x < fe.length; x++)
fe[x] = speedFE();

for(int x = 0; x < tf.length; x++)
tf[x] = speedTF();

for(int x = 0; x < fe.length; x++)
fea += fe[x];
double ffea = (double)fea/fe.length;

for(int x = 0; x < tf.length; x++)
tfa += tf[x];
double ftfa = (double)tfa/tf.length;

System.out.println("Traditional average time: " + ftfa + " nanoseconds.\nFor-each average time: " + ffea + " nanoseconds.");

}

}