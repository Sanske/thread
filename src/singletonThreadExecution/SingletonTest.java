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
 * 多线程单例问题人过门
 * singleton thread execution 模式
 * 一个线程只能被一个对象所使用，通过锁来实现,
 * 防止被多个线程所使用
 * @author sanske
 * @since 2019-11-27
 */
public class SingletonTest {
    public static void main(String[] args) {
        Gateway gate = new Gateway();
        new User(gate, "Alice", "Alaska").start();
        new User(gate, "Bobby", "Brazil").start();
        new User(gate, "Chris", "Canada").start();
    }
}