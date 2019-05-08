package com.alberto.soto.xslt.spring.data;

/**
 * com.alberto.soto.xslt.spring.data
 * Class Book
 * 07/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class Book {

    private String name;
    private Integer id;
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
