package com.ibtec.vsctest.core.utilities.entities;

public interface BaseEntity<IdType> {

    IdType getId();

    void setId(IdType id);

}