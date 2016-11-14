package example.domain.primary;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>用户类</p>
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@Entity
@Table(name = "tbl_dept")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private static final long serialVersionUID = -5451740152235826540L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @NotNull
    @Column(length = 20)
    private String name;
    @NotNull
    @Column
    private Date createTime;

}
