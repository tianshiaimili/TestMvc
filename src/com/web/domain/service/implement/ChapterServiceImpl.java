package com.web.domain.service.implement;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.web.domain.dao.ChapterDAO;
import com.web.domain.entity.Chapter;
import com.web.domain.service.dao.ChapterServiceDAO;

@Transactional
@Service("chapterService")
public class ChapterServiceImpl implements ChapterServiceDAO {

	@Autowired
	private ChapterDAO chapterDAO;
	
	@Override
	public List<Chapter> listAll() {
		return chapterDAO.listAll(Chapter.class);
	}

	@Override
	public Chapter findById(int objectID) {
		return chapterDAO.findById(Chapter.class,objectID);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Create(Chapter object) {
		return chapterDAO.Create(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Update(Chapter object) {
		return chapterDAO.Update(object);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean Delete(int objectID) {
		return chapterDAO.Delete(Chapter.class,objectID);
	}
}
