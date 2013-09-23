package com.injection.fire.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QDisease is a Querydsl query type for Disease
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QDisease extends EntityPathBase<Disease> {

    private static final long serialVersionUID = 1273161415;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QDisease disease = new QDisease("disease");

    public final StringPath cure = createString("cure");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath infectionRoot = createString("infectionRoot");

    public final StringPath link = createString("link");

    public final StringPath name = createString("name");

    public final StringPath prevention = createString("prevention");

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final StringPath sideEffect = createString("sideEffect");

    public final StringPath symptom = createString("symptom");

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public final QVaccine vaccine;

    public QDisease(String variable) {
        this(Disease.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QDisease(Path<? extends Disease> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDisease(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QDisease(PathMetadata<?> metadata, PathInits inits) {
        this(Disease.class, metadata, inits);
    }

    public QDisease(Class<? extends Disease> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.vaccine = inits.isInitialized("vaccine") ? new QVaccine(forProperty("vaccine")) : null;
    }

}

