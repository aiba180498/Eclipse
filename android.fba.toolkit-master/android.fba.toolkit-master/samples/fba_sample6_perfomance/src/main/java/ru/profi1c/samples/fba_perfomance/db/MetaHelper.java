/*
 * This text is generated automatically, do not delete it. 'FBA Toolkit', www.profi1c.ru
 */
package ru.profi1c.samples.fba_perfomance.db;

import java.util.ArrayList;
import java.util.List;

import ru.profi1c.engine.meta.Catalog;
import ru.profi1c.engine.meta.ConstTable;
import ru.profi1c.engine.meta.Document;
import ru.profi1c.engine.meta.MetadataHelper;
import ru.profi1c.engine.meta.Table;
import ru.profi1c.engine.meta.TableInfReg;

/**
 * Класс-помощник для работы с метаданными объектов (соответствие объектов 1С и классов Java)
 * @author ООО “Мобильные решения” (support@profi1c.ru)
 *
 */
public class MetaHelper extends MetadataHelper {

	//Singleton variant: Double Checked Locking & volatile 
	private static volatile MetaHelper instance;

	private static Class<? extends ConstTable> constTableClass;
	private static List<Class<? extends Catalog>> lstCatalogClasses;
	private static List<Class<? extends Document>> lstDocumentClasses;
	private static List<Class<? extends TableInfReg>> lstRegClasses;
	private static List<Class<? extends Table>> lstExtTableClasses;
	
	static{
		//константы
		constTableClass = null;
		
		//справочники
		lstCatalogClasses = new ArrayList<Class<? extends Catalog>>();
		lstCatalogClasses.add(CatalogNomenklatura.class);
				
		//документы
		lstDocumentClasses = new ArrayList<Class<? extends Document>>();
		lstDocumentClasses.add(DocumentPrihod.class);
		lstDocumentClasses.add(DocumentUstanovkaCen.class);
		
		//регистры сведений
		lstRegClasses = new ArrayList<Class<? extends TableInfReg>>();
		lstRegClasses.add(RegShtrihkod.class);
		lstRegClasses.add(RegCeniNomenklaturi.class);
		
		//внешние таблицы
		lstExtTableClasses = null;
		
	}
	
	private MetaHelper(){}
	
	public static MetaHelper getInstance() {
		MetaHelper localInstance = instance;
		
		if (localInstance == null) {
			synchronized (MetaHelper.class) {
				localInstance = instance;
				if (localInstance == null) {
					instance = localInstance = new MetaHelper();
				}
			}
		}
		
		return localInstance;
	}

	@Override
	public Class<? extends ConstTable> getConstClass() {
		return constTableClass;
	}

	@Override
	public List<Class<? extends Catalog>> getCatalogClasses() {
		return lstCatalogClasses;
	}

	@Override
	public List<Class<? extends Document>> getDocumentClasses() {
		return lstDocumentClasses;
	}

	@Override
	public List<Class<? extends TableInfReg>> getRegClasses() {
		return lstRegClasses;
	}

	@Override
	public List<Class<? extends Table>> getExtTableClasses() {
		return lstExtTableClasses;
	}
}