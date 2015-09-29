package control.interfaces;

import java.util.List;

import bean.WX_ReturnCode;
/**
 * 
 * ���ݲ����ӿ�
 * @author YanFuzhong
 * @date 2015-9-28 ����11:13:37
 * @version 1.0
 * @param <E> ��������������
 */
public interface WX_DataOperate<E> {
	/**
	 * ���һ������
	 * @param e 
	 * @return boolean�÷����Ĳ������
	 */
	public WX_ReturnCode add(E e);
	/**
	 * ���һ������
	 * @param list
	 * @return boolean�÷����Ĳ������
	 */
	public WX_ReturnCode add(List<E> list);
	/**
	 * ɾ����������
	 * @return boolean�÷����Ĳ������
	 */
	public WX_ReturnCode delete();
	/**
	 * ɾ��һ������
	 * @param e
	 * @return boolean�÷����Ĳ������
	 */
	public WX_ReturnCode delete(E e);
	/**
	 * �޸�һ������
	 * @param e 
	 * @return boolean�÷����Ĳ������
	 */
	public WX_ReturnCode modify(E e);
	/**
	 * �޸�һ������
	 * @param list
	 * @return boolean�÷����Ĳ������
	 */
	public WX_ReturnCode modify(List<E> list);
	/**
	 * ���ָ��������
	 * @param e
	 * @return E
	 */
	public E get(E e);
	/**
	 * ������е�����
	 * @return List<E>
	 */
	public List<E> getAll();
}
