package readwriter;

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
 * 读写线程锁定
 * 通过记录读写操作数量判断
 * 1 读的时候: 有写操作
 * 2 写的时候: 判断写或读的操作
 * @author sanske
 * @since 2019-11-28
 */
public class ReadWriteLock {
    /**
     * 正在读取线程的数量
     */
    private int readingReaders = 0;
    /**
     *     正在写入线程的数量
     */
    private int writingWriters = 0;
    public synchronized void readLock() throws InterruptedException {
        while (writingWriters > 0 ) {
            wait();
        }
        readingReaders++;
    }
    public synchronized void readUnlock() {
        readingReaders--;
        notifyAll();
    }
    public synchronized void writeLock() throws InterruptedException {
        while (readingReaders > 0 || writingWriters > 0) {
            wait();
        }
        writingWriters++;
    }
    public synchronized void writeUnlock() {
        writingWriters--;
        notifyAll();
    }
}