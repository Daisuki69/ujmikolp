package ud;

import D7.d;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import java.util.ArrayList;

/* JADX INFO: renamed from: ud.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2308a extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EDDActivity f20281a;

    public C2308a(EDDActivity eDDActivity) {
        this.f20281a = eDDActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageScrolled(int i, float f, int i4) {
        super.onPageScrolled(i, f, i4);
        EDDActivity eDDActivity = this.f20281a;
        d dVar = eDDActivity.f14495k;
        eDDActivity.Q(dVar != null ? (Fragment) ((ArrayList) dVar.f992b).get(i) : null);
    }
}
