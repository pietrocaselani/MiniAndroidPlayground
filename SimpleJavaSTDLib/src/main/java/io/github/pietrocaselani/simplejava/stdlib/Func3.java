package io.github.pietrocaselani.simplejava.stdlib;

/**
 * Created by Pietro Caselani
 * On 03/09/14
 * newjava
 */
public interface Func3<T1, T2, T3, R> extends Function {
	R call(T1 t1, T2 t2, T3 t3);
}