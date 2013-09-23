package com.injection.fire.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1458441632;

    private static final PathInits INITS = PathInits.DIRECT;

    public static final QUser user = new QUser("user");

    public final NumberPath<Integer> birthDay = createNumber("birthDay", Integer.class);

    public final NumberPath<Integer> birthMonth = createNumber("birthMonth", Integer.class);

    public final NumberPath<Integer> birthYear = createNumber("birthYear", Integer.class);

    public final StringPath bloodType = createString("bloodType");

    public final BooleanPath enabled = createBoolean("enabled");

    public final SetPath<User, QUser> familyMembers = this.<User, QUser>createSet("familyMembers", User.class, QUser.class, PathInits.DIRECT);

    public final StringPath gender = createString("gender");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath mobileNumber = createString("mobileNumber");

    public final StringPath name = createString("name");

    public final QUser parent;

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    @SuppressWarnings("all")
    public QUser(Path<? extends User> path) {
        this((Class)path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUser(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUser(PathMetadata<?> metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QUser(forProperty("parent"), inits.get("parent")) : null;
    }

}

