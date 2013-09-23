package com.injection.fire.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHospital is a Querydsl query type for Hospital
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHospital extends EntityPathBase<Hospital> {

    private static final long serialVersionUID = 235057743;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QHospital hospital = new QHospital("hospital");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QLocation location;

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public QHospital(String variable) {
        this(Hospital.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QHospital(Path<? extends Hospital> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHospital(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHospital(PathMetadata<?> metadata, PathInits inits) {
        this(Hospital.class, metadata, inits);
    }

    public QHospital(Class<? extends Hospital> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.location = inits.isInitialized("location") ? new QLocation(forProperty("location")) : null;
    }

}

