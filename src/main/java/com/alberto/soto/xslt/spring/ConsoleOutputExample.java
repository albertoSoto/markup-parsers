package com.alberto.soto.xslt.spring;

import com.alberto.soto.xslt.spring.data.Book;

/**
 * com.alberto.soto.xslt.spring
 * Class ConsoleOutputExample
 * 07/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
public class ConsoleOutputExample {


    public static void main(String[] args){
        System.out.println("hola mundo!");
        Book book = new Book();
        book.setName("El quijote");
        System.out.println(book.getName());

    }
}
