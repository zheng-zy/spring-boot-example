package example.repository.secondary;

import example.domain.secondary.Company;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/11/14.
 */
@Transactional
public interface CompanyDao extends PagingAndSortingRepository<Company, Long> {

}
