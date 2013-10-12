package com.injection.fire.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QVaccine is a Querydsl query type for Vaccine
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QVaccine extends EntityPathBase<Vaccine> {

    private static final long serialVersionUID = -175503104;

    public static final QVaccine vaccine = new QVaccine("vaccine");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final BooleanPath baby = createBoolean("baby");

    public final BooleanPath cycle = createBoolean("cycle");

    public final ListPath<Disease, QDisease> diseases = this.<Disease, QDisease>createList("diseases", Disease.class, QDisease.class, PathInits.DIRECT);

    public final NumberPath<Integer> endPeriod = createNumber("endPeriod", Integer.class);

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final BooleanPath optional = createBoolean("optional");

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final NumberPath<Integer> startPeriod = createNumber("startPeriod", Integer.class);

    public final NumberPath<Integer> totalNumber = createNumber("totalNumber", Integer.class);

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public QVaccine(String variable) {
        super(Vaccine.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QVaccine(Path<? extends Vaccine> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QVaccine(PathMetadata<?> metadata) {
        super(Vaccine.class, metadata);
    }

}

