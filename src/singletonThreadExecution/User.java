package singletonThreadExecution;

/**
 * 若练此功 必先自宫
 * <p>
 * ┏┛ ┻━━━━━┛ ┻┓
 * ┃　　　　　　 ┃
 * ┃　　　━　　　┃
 * ┃　┳┛　  ┗┳　┃
 * ┃　　　　　　 ┃
 * ┃　　　┻　　　┃
 * ┃　　　　　　 ┃
 * ┗━┓　　　┏━━━┛
 * ┃　　　┃   神兽保佑
 * ┃　　　┃   代码无BUG！
 * ┃　　　┗━━━━━━━━━┓
 * ┃　　　　　　　    ┣┓
 * ┃　　　　         ┏┛
 * ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * ┃ ┫ ┫   ┃ ┫ ┫
 * ┗━┻━┛   ┗━┻━┛
 * 人
 *
 * @author sanske
 * @since 2019-11-27
 */
public class User extends Thread{
   private String name ;
   private String address;
   private Gateway gateway;

    public User(Gateway gateway,  String name, String address) {
        this.name = name;
        this.address = address;
        this.gateway = gateway;
    }

    @Override
    public void run() {
      System.out.println(name + "name");
      while(true) {
        gateway.pass(name, address);
      }
    }

}