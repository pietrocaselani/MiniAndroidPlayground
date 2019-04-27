package io.github.pietrocaselani.simplejava.stdlib;

/**
 * Created by Pietro Caselani
 * On 03/09/14
 * newjava
 */
public interface Func2<T1, T2, R> extends Function {
	R call(T1 t1, T2 t2);
}