package com.web.domain.implement;

import org.springframework.stereotype.Repository;

import com.web.domain.dao.ChapterDAO;
import com.web.domain.entity.Chapter;


@Repository("chapterDAO")
public class ChapterDAOImpl extends BaseDAOImplement<Chapter> implements ChapterDAO{

}
