/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package ru.profi1c.samples.order.db;

import java.util.List;

import ru.profi1c.engine.meta.Catalog;
import ru.profi1c.engine.meta.MetadataObject;
import ru.profi1c.engine.meta.TablePart;

import com.j256.ormlite.table.DatabaseTable;

/**
 * Справочник 'Типы цен номенклатуры'
 *
 * @author ООО "Сфера" (support@sfera.ru)
 */
@DatabaseTable(tableName = CatalogTipiCenNomenklaturi.TABLE_NAME, daoClass = CatalogTipiCenNomenklaturiDao.class)
@MetadataObject(type = MetadataObject.TYPE_CATALOG, name = CatalogTipiCenNomenklaturi.META_NAME)
public class CatalogTipiCenNomenklaturi extends Catalog {

    /**
     * Имя таблицы в базе данных
     */
    public static final String TABLE_NAME = "CatalogTipiCenNomenklaturi";

    /**
     * Имя метаданных объекта в 1С (не изменять)
     */
    public static final String META_NAME = "ТипыЦенНоменклатуры";

    private static final long serialVersionUID = 1L;


    @Override
    public Catalog getOwner() {
        return null;
    }

    @Override
    public void setOwner(Catalog catalogRef) {

    }

    @Override
    public List<Class<? extends TablePart>> getTabularSections() {
        return null;
    }

    @Override
    public String getMetaName() {
        return META_NAME;
    }

    @Override
    public String getPresentation() {
        return getDescription();
    }
}
