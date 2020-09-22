package demo01;

//属性：品牌、价格、颜色
//功能：打电话
public class Phone {

  //成员变量
  String brand;
  double price;
  String color;

  //成员方法
  public void call(String who){
      System.out.println("给" + who + "打电话");
  }

  public void  sendMessage(String who){
      System.out.println("给" + who + "发短信");
  }
}
