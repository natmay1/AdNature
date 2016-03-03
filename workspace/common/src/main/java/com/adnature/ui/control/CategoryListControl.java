package com.adnature.ui.control;

import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.adnature.contentmanagent.service.ArticleService;
import com.adnature.contentmanagent.service.CategoryService;
import com.adnature.domain.cms.criteria.ArticleCriteria;
import com.adnature.domain.cms.criteria.CategoryCriteria;
import com.adnature.domain.cms.criteria.ArticleCriteria.OrderField;
import com.adnature.domain.cms.entity.Article;
import com.adnature.domain.cms.entity.Category;
import com.adnature.framework.dao.BaseCriteria.Operator;
import com.adnature.framework.dao.BaseCriteria.SortType;
import com.adnature.framework.enumpack.RoleStateEnum;
import com.adnature.framework.util.DirectiveUtils;
import com.adnature.framework.util.StringUtils;
import freemarker.core.Environment;
import freemarker.template.TemplateDirectiveBody;
import freemarker.template.TemplateDirectiveModel;
import freemarker.template.TemplateException;
import freemarker.template.TemplateModel;

/**
 * 根据栏目编号获取文章列表UI组件
 * 
 * @author 
 *
 */
public class CategoryListControl implements TemplateDirectiveModel {
    /** 文章管理Service */
    @Autowired
    private ArticleService articleService;

    /** 栏目Service */
    @Autowired
    private CategoryService categoryService;

    @Override
    public void execute(Environment env, Map params, TemplateModel[] loopVars, TemplateDirectiveBody body)
            throws TemplateException, IOException {

        String categoryCode = DirectiveUtils.getString("categoryCode", params);
        if (StringUtils.isNotEmpty(categoryCode)) {
            Integer pageSize = 4;
            try {
                pageSize =DirectiveUtils.getInt("pageSize", params);
                if(pageSize==null){
                    pageSize=4;
                }
            } catch (Exception e) {
                pageSize = 4;
            }
            String updateTimeOrder = DirectiveUtils.getString("updateTimeOrder", params);
            // 媒体报道
            CategoryCriteria categoryCriteria = new CategoryCriteria();
            categoryCriteria.setCategoryCode(categoryCode, Operator.equal);
            // 根据栏目编码获取当前栏目
            List<Category> categoryList = categoryService.getCategoryByCriteria(categoryCriteria);
            Category category = null;
            if (categoryList != null && !categoryList.isEmpty()) {
                // 当前栏目存在则根据栏目ID查询文章列表
                ArticleCriteria criteria = new ArticleCriteria();
                category = categoryList.get(0);
                // 由于栏目编码不可重复，所以默认取第一条数据
                criteria.setCategory(category.getId(), Operator.equal);
                criteria.setStatus(RoleStateEnum.ROLE_STATE_1.getCode(), Operator.equal);
                criteria.setSortFields(OrderField.orderNum, SortType.ASC);
                criteria.setSortFields(OrderField.postAt, SortType.DESC);
                if ("1".equals(updateTimeOrder)) {
                    criteria.setSortFields(OrderField.updateTime, SortType.DESC);
                }
                criteria.getPage().setDefalutPageRows(pageSize);
                List<Article> articles = articleService.getPageByCriteria(criteria);
                env.setVariable("category", DEFAULT_WRAPPER.wrap(category));
                env.setVariable("articles", DEFAULT_WRAPPER.wrap(articles));
                body.render(env.getOut());
            }
        }
    }

}
