/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package ru.profi1c.samples.audit.salespoint.db;

import ru.profi1c.engine.meta.DBOpenHelper;
import android.content.Context;

/**
 * Помощник для работы с базой данных Sqlite (создание, обновление, открытие, чтение данных и т.п.)
 * @author ООО "Сфера" (support@sfera.ru)
 *
 */
public class DBHelper extends DBOpenHelper {

	/*
	 * Имя файла вашей базы данных
	 */
	protected static final String DATABASE_NAME = "database.db";
	
	/*
	 * Номер версии вашей базы данных, если вы вносите изменения в объекты базы
	 * данных, вам, возможно, так же придется увеличить версию базы данных.
	 */
	protected static final int DATABASE_VERSION = 1;
	
	public DBHelper(Context context) {
		super(context,DATABASE_NAME,DATABASE_VERSION);
	}
	
}
