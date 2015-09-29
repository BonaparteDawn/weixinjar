package control.interfaces;

import java.util.List;

import bean.WX_ReturnCode;
/**
 * 
 * 数据操作接口
 * @author YanFuzhong
 * @date 2015-9-28 上午11:13:37
 * @version 1.0
 * @param <E> 操作的数据类型
 */
public interface WX_DataOperate<E> {
	/**
	 * 添加一个数据
	 * @param e 
	 * @return boolean该方法的操作结果
	 */
	public WX_ReturnCode add(E e);
	/**
	 * 添加一组数据
	 * @param list
	 * @return boolean该方法的操作结果
	 */
	public WX_ReturnCode add(List<E> list);
	/**
	 * 删除所有数据
	 * @return boolean该方法的操作结果
	 */
	public WX_ReturnCode delete();
	/**
	 * 删除一个数据
	 * @param e
	 * @return boolean该方法的操作结果
	 */
	public WX_ReturnCode delete(E e);
	/**
	 * 修改一个数据
	 * @param e 
	 * @return boolean该方法的操作结果
	 */
	public WX_ReturnCode modify(E e);
	/**
	 * 修改一组数据
	 * @param list
	 * @return boolean该方法的操作结果
	 */
	public WX_ReturnCode modify(List<E> list);
	/**
	 * 获得指定的数据
	 * @param e
	 * @return E
	 */
	public E get(E e);
	/**
	 * 获得所有的数据
	 * @return List<E>
	 */
	public List<E> getAll();
}
