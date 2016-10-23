public class A{
public static void main(String[ ] args){
try{
int x = 2 / 0;
System.out.println(x);
}catch(Exception e){
System.out.println(“程序报错啦！”);
}finally{
System.out.println(“进入finally了”);
}
}
}