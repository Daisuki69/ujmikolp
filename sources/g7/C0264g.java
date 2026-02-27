package G7;

import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import java.util.HashMap;

/* JADX INFO: renamed from: G7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0264g implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1848a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaDashboardFragment f1849b;

    public C0264g(MayaDashboardFragment mayaDashboardFragment) {
        this.f1849b = mayaDashboardFragment;
    }

    public final void a(String str) {
        MayaDashboardFragment mayaDashboardFragment = this.f1849b;
        C1219h c1219hD = C1219h.d(EnumC1215d.DASHBOARD);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.TAB);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hD.j;
        map.put("tab", str);
        map.put("source_page", this.f1848a);
        mayaDashboardFragment.o1().b(c1219hD);
        S5.c cVarQ1 = mayaDashboardFragment.q1();
        String strC = c1219hD.c();
        kotlin.jvm.internal.j.f(strC, "getResolvedEvent(...)");
        cVarQ1.g(strC, W5.e.c, map);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        Object tag;
        String string;
        if (tab == null || (tag = tab.getTag()) == null || (string = tag.toString()) == null) {
            return;
        }
        this.f1848a = string;
        a(string);
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        String string;
        kotlin.jvm.internal.j.g(tab, "tab");
        Object tag = tab.getTag();
        if (tag != null && (string = tag.toString()) != null) {
            a(string);
        }
        CharSequence text = tab.getText();
        MayaDashboardFragment mayaDashboardFragment = this.f1849b;
        String string2 = mayaDashboardFragment.getString(R.string.pma_label_savings);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        if (!kotlin.jvm.internal.j.b(text, string2)) {
            CharSequence text2 = tab.getText();
            String string3 = mayaDashboardFragment.getString(R.string.maya_label_loans);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            if (kotlin.jvm.internal.j.b(text2, string3) && S5.c.b(mayaDashboardFragment.q1(), A5.b.f111j0)) {
                C0265h c0265h = mayaDashboardFragment.f12164d0;
                if (c0265h != null) {
                    c0265h.m(mayaDashboardFragment, s5.f.e);
                    return;
                } else {
                    kotlin.jvm.internal.j.n("loansFlutterScreen");
                    throw null;
                }
            }
            return;
        }
        n nVar = mayaDashboardFragment.f12163c0;
        if (nVar == null) {
            kotlin.jvm.internal.j.n("savingsFlutterScreen");
            throw null;
        }
        pg.u uVar = nVar.f1905H;
        if (uVar == null) {
            kotlin.jvm.internal.j.n("partialSavingsScreenFlowChannel");
            throw null;
        }
        uVar.a("reloadHome", null, null);
        n nVar2 = mayaDashboardFragment.f12163c0;
        if (nVar2 != null) {
            nVar2.m(mayaDashboardFragment, s5.f.c);
        } else {
            kotlin.jvm.internal.j.n("savingsFlutterScreen");
            throw null;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        String string;
        kotlin.jvm.internal.j.g(tab, "tab");
        Object tag = tab.getTag();
        if (tag != null && (string = tag.toString()) != null) {
            this.f1848a = string;
        }
        CharSequence text = tab.getText();
        MayaDashboardFragment mayaDashboardFragment = this.f1849b;
        String string2 = mayaDashboardFragment.getString(R.string.pma_label_savings);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        if (kotlin.jvm.internal.j.b(text, string2)) {
            n nVar = mayaDashboardFragment.f12163c0;
            if (nVar != null) {
                nVar.b();
                return;
            } else {
                kotlin.jvm.internal.j.n("savingsFlutterScreen");
                throw null;
            }
        }
        CharSequence text2 = tab.getText();
        String string3 = mayaDashboardFragment.getString(R.string.maya_label_loans);
        kotlin.jvm.internal.j.f(string3, "getString(...)");
        if (kotlin.jvm.internal.j.b(text2, string3) && S5.c.b(mayaDashboardFragment.q1(), A5.b.f111j0)) {
            C0265h c0265h = mayaDashboardFragment.f12164d0;
            if (c0265h != null) {
                c0265h.b();
            } else {
                kotlin.jvm.internal.j.n("loansFlutterScreen");
                throw null;
            }
        }
    }
}
