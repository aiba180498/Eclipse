/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package ru.profi1c.samples.fba_perfomance.db;

import java.sql.SQLException;

import ru.profi1c.engine.meta.TableInfRegDao;
import ru.profi1c.engine.meta.TableInfRegPeriodicDao;

import com.j256.ormlite.support.ConnectionSource;

/**
 * Менеджер для работы c записями периодического регистра сведений 'Цены номенклатуры' (создание, удаление, поиск)
 * @author ООО “Мобильные решения” (support@profi1c.ru)
 *
 */
public class RegCeniNomenklaturiDao extends TableInfRegPeriodicDao<RegCeniNomenklaturi> {

	public RegCeniNomenklaturiDao(ConnectionSource connectionSource)
			throws SQLException {
		super(connectionSource, RegCeniNomenklaturi.class);
	}

}