package example.domain.secondary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <p>公司</p>
 * Created by zhezhiyong@163.com on 2016/11/14.
 */
@Entity
@Table(name = "tbl_company")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @NotNull
    @Column(length = 40)
    private String name;
    @NotNull
    @Column(length = 100)
    private String address;
    @NotNull
    @Column
    private Date createTime;
}
