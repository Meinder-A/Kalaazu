package com.manulaiko.kalaazu.persistence.database.entities.news.generated;

import com.manulaiko.kalaazu.persistence.database.entities.news.News;
import com.speedment.common.annotation.GeneratedCode;
import com.manulaiko.kalaazu.persistence.database.entities.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.manulaiko.kalaazu.persistence.database.entities.news.News} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 *
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedNewsManager extends Manager<News> {

    List<Field<News>> FIELDS = unmodifiableList(asList(
            News.ID,
            News.DATE,
            News.IMAGE,
            News.TITLE,
            News.TEASER,
            News.TEXT
    ));

    @Override
    default Class<News> getEntityClass() {
        return News.class;
    }
}