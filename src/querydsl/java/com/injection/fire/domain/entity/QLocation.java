package com.injection.fire.domain.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QLocation is a Querydsl query type for Location
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLocation extends EntityPathBase<Location> {

    private static final long serialVersionUID = -1855237174;

    public static final QLocation location = new QLocation("location");

    public final StringPath address = createString("address");

    public final StringPath buildingAddress = createString("buildingAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> lat = createNumber("lat", Double.class);

    public final NumberPath<Double> lng = createNumber("lng", Double.class);

    public final StringPath localName_1 = createString("localName_1");

    public final StringPath localName_2 = createString("localName_2");

    public final StringPath localName_3 = createString("localName_3");

    public final StringPath mainAddress = createString("mainAddress");

    public final StringPath newAddress = createString("newAddress");

    public final StringPath point_wx = createString("point_wx");

    public final StringPath point_wy = createString("point_wy");

    public final NumberPath<Double> point_x = createNumber("point_x", Double.class);

    public final NumberPath<Double> point_y = createNumber("point_y", Double.class);

    public final DateTimePath<java.util.Date> registTime = createDateTime("registTime", java.util.Date.class);

    public final StringPath subAddress = createString("subAddress");

    public final DateTimePath<java.util.Date> updatedTime = createDateTime("updatedTime", java.util.Date.class);

    public QLocation(String variable) {
        super(Location.class, forVariable(variable));
    }

    @SuppressWarnings("all")
    public QLocation(Path<? extends Location> path) {
        super((Class)path.getType(), path.getMetadata());
    }

    public QLocation(PathMetadata<?> metadata) {
        super(Location.class, metadata);
    }

}

