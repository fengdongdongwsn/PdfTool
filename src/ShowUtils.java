package GUI;

import javax.swing.JOptionPane;

/**
 * 提示框
 * 
 * @author yangle
 */
public class ShowUtils {

	/**
	 * 消息提示
	 * 
	 * @param message
	 *            消息内容
	 */
	public static void message(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	/**
	 * 警告消息提示
	 * 
	 * @param message
	 *            消息内容
	 */
	public static void warningMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "警告",
				JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * 错误消息提示
	 * 
	 * @param message
	 *            消息内容
	 */
	public static void errorMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "错误",
				JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * 自定义的消息提示
	 * 
	 * @param title
	 *            标题
	 * @param message
	 *            消息内容
	 */
	public static void plainMessage(String title, String message) {
		JOptionPane.showMessageDialog(null, message, title,
				JOptionPane.PLAIN_MESSAGE);
	}

	/**
	 * 带有选择功能的提示
	 * 
	 * @param title
	 *            标题
	 * @param message
	 *            消息内容
	 * @return 是/否 0/1
	 */
	public static boolean selectMessage(String title, String message) {
		int isConfirm = JOptionPane.showConfirmDialog(null, message, title,
				JOptionPane.YES_NO_OPTION);
		if (0 == isConfirm) {
			return true;
		}
		return false;
	}
}
