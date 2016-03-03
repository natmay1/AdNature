
package com.adnature.domain.profile.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import com.adnature.domain.profile.entity.Profile;
import com.adnature.domain.profile.criteria.ProfileCriteria;
import com.adnature.framework.dao.DynamicQuerySqlBuilder;


/**
 * ProfileRepository定义.
 * <p>
 * 数据访问层<投资客户表>的组件 : 供业务逻辑层调用的基本数据持久化类
 * 
 */
public interface ProfileRepository {

    /**
     * 按主键进行查询，返回唯一一条记录
     * <p>
     * @param  String id
     * @return Profile
     */
	public Profile findOne(String id);

	/**
     * 无条件检索，返回实体集合
     * <p>
     * @return List<Profile>
     */
	public Profile findProfileByUserId(String userId);

    /**
     * 无条件检索，返回实体集合
     * <p>
     * @return List<Profile>
     */
	public List<Profile> findAll();
	
    /**
     * 无条件分页检索，返回实体集合
     * <p>
     * @param  ProfileSearchCriteria 检索Page信息
     * @return List<EventName>
     */
	public List<Profile> findPageAll(ProfileCriteria criteria);

    /**
     * 按条件动态检索，返回实体集合
     * <p>
     * @param  ProfileSearchCriteria 检索条件
     * @return List<Profile>
     */
    @SelectProvider(type=DynamicQuerySqlBuilder.class,method="findByCriteriaSql")
	public List<Profile> findByCriteria(ProfileCriteria criteria);
    
    /**
     * 按条件动态翻页检索，返回实体集合
     * <p>
     * @param  ProfileSearchCriteria 检索条件
     * @return List<Profile>
     */
    @SelectProvider(type=DynamicQuerySqlBuilder.class,method="findByCriteriaSql")
	public List<Profile> findPageByCriteria(ProfileCriteria criteria);
	
	/**
     * 插入一条新纪录，正确插入时返回值为 1
     * <p>
     * @param  Profile Profile
     * @return 插入成功标志
     */
	public int insert(Profile profile);

    /**
     * 按主键进行动态更新，对Input数据对需要更新的字段进行设值
     * <p>
     * @param  Profile Profile
     * @return 更新成功标志
     */
	public int dynamicUpdate(Profile profile);

    /**
     * 按主键进行更新，根据实体的实际属性值进行更新
     * <p>
     * @param  Profile Profile
     * @return 更新成功标志
     */
	public int update(Profile profile);

    /**
     * 按主键把记录的删除flag设置为true，进行假删除
     * <p>
     * @param id
     * @return 假删除成功标志
     */
	public int suspend(@Param("id") String id);

    /**
     * 按主键进行删除，删除成功返回 1
     * <p>
     * @param id
     * @return 删除成功标志
     */
	public int delete(@Param("id") String id);

}

