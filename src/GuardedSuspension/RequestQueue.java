package GuardedSuspension;

import java.util.LinkedList;
import java.util.List;

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
 * 请求队列
 *
 * @author sanske
 * @since 2019-11-27
 */
public class RequestQueue {
    private List<Request> queue = new LinkedList<>();

    public synchronized Request getRequest() {
      while(queue.size() <0) {
          try {
              wait();
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
      return queue.remove(0);
    }

    public synchronized  void putRequest(Request request) {
        queue.add(request);
        notifyAll();
    }

}