/*
 * Kangeyan Passoubady
 * (c) Kavin School -2015
 */

package com.kavinschool.shape;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The Interface About.
 */
@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface About {

    /**
     * Author.
     *
     * @return the string
     */
    String author() default "";

    /**
     * Created date.
     *
     * @return the string
     */
    String createdDate() default "1/1/2015";

    /**
     * Description.
     *
     * @return the string
     */
    String description() default "";

    /**
     * Current version.
     *
     * @return the int
     */
    int currentVersion() default 1;

    /**
     * Last modified date.
     *
     * @return the string
     */
    String lastModifiedDate() default "N/A";

    /**
     * Last modified by.
     *
     * @return the string
     */
    String lastModifiedBy() default "N/A";
}
