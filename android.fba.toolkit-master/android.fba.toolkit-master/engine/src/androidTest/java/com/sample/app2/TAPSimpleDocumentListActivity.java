package com.sample.app2;

import com.sample.app2.test_action.ITestAction;
import com.sample.app2.test_action.ITestActionProvider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TAPSimpleDocumentListActivity implements ITestActionProvider {

    @Override
    public List<ITestAction> getActions() {
        List<ITestAction> lst = new ArrayList<>();
        lst.add(new TASimpleDocumentVnutrenniiZakazListActivity.TestActionShow());
        lst.add(new TASimpleDocumentVozvratTovarovOtPokupatelyaListActivity.TestActionShow());
        return Collections.unmodifiableList(lst);
    }

    @Override
    public String getDescription() {
        return "SimpleDocumentListActivity";
    }
}