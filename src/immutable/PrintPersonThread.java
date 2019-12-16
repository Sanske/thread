package immutable;

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
 * 打印人信息的多线程
 * think
 * 只有get方法，没有set方法，这样多线程就不会改变对象的属性
 * 适用于频繁获取数据的
 * @author sanske
 * @since 2019-11-27
 */
public class PrintPersonThread  extends Thread{
    private Person person;
    public PrintPersonThread(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
     while (true) {
         System.out.println(Thread.currentThread().getName()  + "print:" + person);
     }
    }
}