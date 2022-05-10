package searchEngine.pojo;

import com.alibaba.fastjson2.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @Author: yumo
 * @Description: 执行查询操作时请求的json字段
 * @DateTime: 2022/5/9 17:51
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class QueryRequestBody {
    /**
     * 查询的关键词
     */
    @JSONField(name = "query")
    private String query;

    /**
     * 当前页码，默认为1
     */
    @JSONField(name = "page")
    private Integer page;

    /**
     * 返回的文档数量，默认为100
     */
    @JSONField(name = "limit")
    private Integer limit;

    /**
     * 排序方式，取值asc和desc，默认为desc，按id排序，然后根据结果得分排序
     */
    @JSONField(name = "order")
    private String order;

    /**
     * 关键字高亮，相对text字段中的文本
     */
    private HighLight highLight;

}
