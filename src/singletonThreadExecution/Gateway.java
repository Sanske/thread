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
 * 门
 *
 * @author sanske
 * @since 2019-11-27
 */
public class Gateway {
    private int count = 0;
    private String name = "Bob";
    private String address = "BobAddress";

    public synchronized void pass(String name, String address) {
        count++;
        this.name = name;
        this.address = address;
        check();
    }

    public void check() {
      if(name.charAt(0) != address.charAt(0)) {
        printInfo();
      }
    }

    public void printInfo() {
        System.out.println("No:" + count + " name:" + name + " address: " + address);
    }

}