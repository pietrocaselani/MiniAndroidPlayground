package io.github.pietrocaselani.simplejava.stdlib;

/**
 * Created by Pietro Caselani
 * On 03/09/14
 * newjava
 */
public interface Action1<T1> extends Action {
	void call(T1 t1);
}