package com.paymaya.domain.model.flagconfig;

import Q5.a;
import cj.C1132s;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import com.paymaya.common.utility.A;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DashboardContentConfigDetails {
    private static final String SERIALIZED_NAME_TABS = "tabs";

    @InterfaceC1497a
    @InterfaceC1498b(SERIALIZED_NAME_TABS)
    private final List<DashboardTabConfig> tabsList;
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_WALLET_TAB_NAME = "Wallet";
    private static final String DEFAULT_WALLET_TAB_ID = "wallet";
    private static final String DEFAULT_SAVINGS_TAB_NAME = "Savings";
    private static final String DEFAULT_SAVINGS_TAB_ID = "savings";
    private static final String DEFAULT_CREDIT_TAB_NAME = "Credit";
    private static final String DEFAULT_CREDIT_TAB_ID = "credit";
    private static final String DEFAULT_LOANS_TAB_NAME = "Loans";
    private static final String DEFAULT_LOANS_TAB_ID = "loans";
    private static final String DEFAULT_CARDS_TAB_NAME = "Cards";
    private static final String DEFAULT_CARDS_TAB_ID = "cards";
    private static final List<DashboardTabConfig> DEFAULT_DASHBOARD_TABS = C1132s.g(new DashboardTabConfig(DEFAULT_WALLET_TAB_NAME, DEFAULT_WALLET_TAB_ID), new DashboardTabConfig(DEFAULT_SAVINGS_TAB_NAME, DEFAULT_SAVINGS_TAB_ID), new DashboardTabConfig(DEFAULT_CREDIT_TAB_NAME, DEFAULT_CREDIT_TAB_ID), new DashboardTabConfig(DEFAULT_LOANS_TAB_NAME, DEFAULT_LOANS_TAB_ID), new DashboardTabConfig(DEFAULT_CARDS_TAB_NAME, DEFAULT_CARDS_TAB_ID));
    private static final n deserializer = new a(0);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n getDeserializer() {
            return DashboardContentConfigDetails.deserializer;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardContentConfigDetails() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardContentConfigDetails copy$default(DashboardContentConfigDetails dashboardContentConfigDetails, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dashboardContentConfigDetails.tabsList;
        }
        return dashboardContentConfigDetails.copy(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DashboardContentConfigDetails deserializer$lambda$1(o oVar, Type type, m mVar) {
        if (oVar == null) {
            return null;
        }
        try {
            l lVar = (l) oVar.g().f10034a.get(SERIALIZED_NAME_TABS);
            j.f(lVar, "getAsJsonArray(...)");
            ArrayList arrayList = new ArrayList();
            Iterator it = lVar.f10032a.iterator();
            while (it.hasNext()) {
                DashboardTabConfig dashboardTabConfig = (DashboardTabConfig) A.f10366a.e(((o) it.next()).toString(), DashboardTabConfig.class);
                if (dashboardTabConfig != null) {
                    arrayList.add(dashboardTabConfig);
                }
            }
            return new DashboardContentConfigDetails(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final List<DashboardTabConfig> component1() {
        return this.tabsList;
    }

    public final DashboardContentConfigDetails copy(List<DashboardTabConfig> tabsList) {
        j.g(tabsList, "tabsList");
        return new DashboardContentConfigDetails(tabsList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DashboardContentConfigDetails) && j.b(this.tabsList, ((DashboardContentConfigDetails) obj).tabsList);
    }

    public final List<DashboardTabConfig> getTabsList() {
        return this.tabsList;
    }

    public int hashCode() {
        return this.tabsList.hashCode();
    }

    public String toString() {
        return "DashboardContentConfigDetails(tabsList=" + this.tabsList + ")";
    }

    public DashboardContentConfigDetails(List<DashboardTabConfig> tabsList) {
        j.g(tabsList, "tabsList");
        this.tabsList = tabsList;
    }

    public /* synthetic */ DashboardContentConfigDetails(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_DASHBOARD_TABS : list);
    }
}
