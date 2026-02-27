package G5;

import com.google.android.material.tabs.TabLayout;
import com.paymaya.common.widget.MayaResizingTabLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MayaResizingTabLayout f1716a;

    public B(MayaResizingTabLayout mayaResizingTabLayout) {
        this.f1716a = mayaResizingTabLayout;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        kotlin.jvm.internal.j.g(tab, "tab");
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        kotlin.jvm.internal.j.g(tab, "tab");
        TabLayout.TabView view = tab.view;
        kotlin.jvm.internal.j.f(view, "view");
        int i = this.f1716a.f11286b;
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        kotlin.jvm.internal.j.g(tab, "tab");
        TabLayout.TabView view = tab.view;
        kotlin.jvm.internal.j.f(view, "view");
        int i = this.f1716a.f11285a;
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }
}
