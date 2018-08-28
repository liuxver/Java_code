package ����;

import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.awt.event.*;

public class TestBrowser {
	public static void main(String[] args) {
		JEditorPane editPane = null;
		try {
			//File file = new File("docs/JEditorPane_1.php");
			String str = "http://www.liuxv.cn/index/html";// ȡ���ļ�λ�õľ���·��
			//str = "file:" + str;// ������·���ϳ�һ�����������ַ���

			/*
			 * ����setPage()�������ַ�����·����ָ���ļ�����JEditorPane.
			 * ��setPage()�����У������������String���͵��ַ���
			 * ����ʵ�����Ĺ��췽ʽ��ͬ������JEditorPane����һ�����캯��JEditorPane(String
			 * str)�����졣���������ǽ��������г����д�����У� editPane=new JEditorPane(str);
			 * ��õ���ͬ��Ч�����������ǾͲ��ٶԴ��ֹ��췽ʽ�ٶ��˵��.
			 */
			editPane = new JEditorPane();// ����һ���յ�JEditorPane
			editPane.setPage(str);
		} catch (IOException ioe) {
			ioe.printStackTrace(System.err);
			System.exit(0);
		}
		/*
		 * ����setEditable()������JEditorPane��Ϊ���ɱ༭.��ע�⣬�������൱��Ҫ�ģ��������ǽ����������Ϊtrue,���ǽ���
		 * ʧȥHTML�ļ���������ԣ��糬�����ӵĹ��ܵȵȡ����������ʹ������JEditorPane2������ʱ��һ�㶼�Ὣ�༭�Ĺ���ȡ
		 * ��(����false).Ŀǰ����������ӹ��ܲ�û�����ã��ⲿ�ݽ���JEditorPane���¼������н���.
		 */
		editPane.setEditable(false);
		JFrame f = new JFrame("JEditorPane1");
		f.setContentPane(new JScrollPane(editPane));
		f.setSize(200, 200);
	//	f.show();
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}