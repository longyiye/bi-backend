package com.yiye.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author longyiye
 * @link <a href="https://github.com/longyiye/bi-backend"></a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}