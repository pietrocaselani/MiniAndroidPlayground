package io.github.pietrocaselani.simplejava.stdlib;

import java.util.concurrent.Callable;

/**
 * Created by Pietro Caselani
 * On 03/09/14
 * newjava
 */
public interface Func0<R> extends Function, Callable<R> {
    @Override R call();
}