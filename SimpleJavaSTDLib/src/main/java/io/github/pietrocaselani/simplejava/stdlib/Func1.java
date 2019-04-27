package io.github.pietrocaselani.simplejava.stdlib;

/**
 * Created by Pietro Caselani
 * On 03/09/14
 * newjava
 */
public interface Func1<T1, R> extends Function {
    R call(T1 t1);
}