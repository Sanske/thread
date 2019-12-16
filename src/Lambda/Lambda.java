package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
 * 测试list编程map的编程
 *
 * @author sanske
 * @since 2019-11-29
 */
public class Lambda {
    public static void main(String[] args) {
        List<Dto> dtoList = new ArrayList<Dto>();
        for (int i = 0; i < 3; i++) {
          Dto dto = new Dto("id"+i, "name"+i, "age"+i);
          dtoList.add(dto);
        }
        Dto dto1 = new Dto("id2", "name3", "age3");
        dtoList.add(dto1);
        /**
         * 分组
         */
        Map<String, List<Dto>> test1 = dtoList.stream().collect(Collectors.groupingBy(Dto::getId));

        /**
         * 当有重复的id 后面的dto会替代前面的dto
         */
        Map<String ,Dto> test2 = dtoList.stream().collect(Collectors.toMap(Dto::getId, Function.identity(), (key1,
                key2)-> key2));
        Map<String, Dto> test = dtoList.stream().collect(Collectors.toMap(Dto::getId, dto->dto));

        System.out.println(test.toString());
    }
}