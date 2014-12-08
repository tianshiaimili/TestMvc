package com.web.domain.service.dao;

import java.util.List;
import com.web.domain.entity.Chapter;

public interface ChapterServiceDAO {
    List<Chapter> listAll();
    Chapter findById(int objectID);
    boolean Create(Chapter object);
    boolean Update(Chapter object);
    boolean Delete(int objectID);
}
