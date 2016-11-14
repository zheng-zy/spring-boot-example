package example.web;

import example.domain.secondary.Company;
import example.repository.secondary.CompanyDao;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>公司api</p>
 * Created by zhezhiyong@163.com on 2016/11/14.
 */
@RestController
@RequestMapping("/company")
@Api(value = "公司服务", description = "提供RESTful风格API的公司的增删改查服务")
public class CompanyController {

    @Resource
    private CompanyDao companyDao;

    @PostMapping
    public boolean add(@RequestBody Company company) {
        companyDao.save(company);
        return true;
    }

}
