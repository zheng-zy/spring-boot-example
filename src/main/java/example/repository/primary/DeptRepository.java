package example.repository.primary;

import example.domain.primary.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
public interface DeptRepository extends JpaRepository<Dept, Long> {
    Dept findById(Long id);
}