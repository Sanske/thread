package balk;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

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
 * 数据的修改与保存
 *
 * @author sanske
 * @since 2019-11-27
 */
public class Data {
    private String filename;
    private String content;
    private boolean changed = false;

    public Data(String filename, String content){
        this.filename = filename;
        this.content = content;
        this.changed = true;
    }

    public synchronized void change(String content) {
        this.content = content;
        this.changed = true;
    }

    public void save() throws IOException {
        if (!changed) {
            System.out.println(Thread.currentThread().getName() + "balk");
            return;
        }
        doSave();
        changed = false;
    }

    public synchronized void doSave() throws IOException{
        System.out.println(Thread.currentThread().getName() + ":" + content);
        Writer writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

}