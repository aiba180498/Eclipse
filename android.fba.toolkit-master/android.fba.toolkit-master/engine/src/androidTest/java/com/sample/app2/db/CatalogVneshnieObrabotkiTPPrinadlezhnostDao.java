/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package com.sample.app2.db;

import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

import ru.profi1c.engine.meta.TablePartDao;

/**
 * Менеджер для работы со строками табличной части 'Принадлежность' справочника 'Внешние обработки'
 * (создание, удаление, поиск)
 * @author Сидоров Сидор Петрович (sidor_sidoroff@mail.ru)
 * 
 */
public class CatalogVneshnieObrabotkiTPPrinadlezhnostDao extends TablePartDao<CatalogVneshnieObrabotkiTPPrinadlezhnost> {

	public CatalogVneshnieObrabotkiTPPrinadlezhnostDao(ConnectionSource connectionSource)
			throws SQLException {
		super(connectionSource, CatalogVneshnieObrabotkiTPPrinadlezhnost.class);
	}

}
