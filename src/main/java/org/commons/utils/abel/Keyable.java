package org.commons.utils.abel;

/**
 * 具有主键性质的接口，类似<code>DB</code>表中的<code>id</code>
 * @author  wjj
 * @date 2019/5/28 14:52
 */
public interface Keyable<T> {
	public T getId();
}
