package com.injection.fire.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QHealthCenter is a Querydsl query type for HealthCenter
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QHealthCenter extends EntityPathBase<HealthCenter> {

    private static final long serialVersionUID = -2029377690;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QHealthCenter healthCenter = new QHealthCenter("healthCenter");

    public final StringPath homePageLink = createString("homePageLink");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath injectionRoomPhone = createString("injectionRoomPhone");

    public final QLocation location;

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public QHealthCenter(String variable) {
        this(HealthCenter.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QHealthCenter(Path<? extends HealthCenter> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHealthCenter(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QHealthCenter(PathMetadata<?> metadata, PathInits inits) {
        this(HealthCenter.class, metadata, inits);
    }

    public QHealthCenter(Class<? extends HealthCenter> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.location = inits.isInitialized("location") ? new QLocation(forProperty("location")) : null;
    }

}

