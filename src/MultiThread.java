import singletonThreadExecution.Gateway;
import singletonThreadExecution.User;

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
 * 多线程测试
 *
 * @author sanske
 * @since 2019-11-22
 */
public class MultiThread {
    public static void main(String[] args) {
//        MyThread t = new MyThread();
//        t.start();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("主线程:" + i);
//        }

        Gateway gate = new Gateway();
        new User(gate, "Alice", "Alaska").start();
        new User(gate, "Bobby", "Brazil").start();
        new User(gate, "Chris", "Canada").start();
    }
}

