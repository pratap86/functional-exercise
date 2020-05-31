package com.pratap.functional.hof;
/**
 * 
 * @author 835698
 * 
 * Factory does the produce & configure an item of type T.
 * @param <T>
 */
@FunctionalInterface
public interface IFactory<T> {

	T create();
}
