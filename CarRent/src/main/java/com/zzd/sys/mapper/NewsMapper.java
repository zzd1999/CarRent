package com.zzd.sys.mapper;

import com.zzd.sys.domain.News;

import java.util.List;

/**
 *
 */
public interface NewsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    /**
     * 查询
     * @param news
     * @return
     */
    List<News> queryAllNews(News news);
}
