package com.divitngoc;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 * 
 * For Quarkus applications, this class is actually not needed as Quarkus
 * generates it's main method when compiling Eg. mvn compile quarkus:dev.
 * 
 * The main method in this class basically helps us to be able to run it with
 * ease on an IDE and also helps with debugging purposes.
 *
 * <pre>
 * Note: Logic must be avoided in this class
 * </pre>
 * 
 */
@QuarkusMain
public class QuarkusApplication {

    public static void main(String[] args) {
        Quarkus.run(args);
    }

}
