package g6;

import G5.t;
import N5.C0443c1;
import N5.C0450f;
import Q6.r;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.accountlimits.view.activity.impl.MayaAccountLimitsActivity;
import com.paymaya.mayaui.accountlimits.view.fragment.impl.MayaAccountLimitsPageFragment;
import f6.InterfaceC1467c;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: renamed from: g6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1502a extends RecyclerView.ViewHolder implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HtmlTextView f16791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0443c1 f16792b;
    public final r c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MayaAccountLimitsPageFragment f16793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502a(C0450f c0450f, MayaAccountLimitsPageFragment listener) {
        super((ConstraintLayout) c0450f.c);
        j.g(listener, "listener");
        HtmlTextView htmlTextView = (HtmlTextView) c0450f.f4088d;
        this.f16791a = htmlTextView;
        C0443c1 c0443c1 = (C0443c1) c0450f.f4087b;
        this.f16792b = c0443c1;
        TextView textView = c0443c1.c;
        this.c = new r(this, 22);
        this.f16793d = listener;
        textView.setOnClickListener(new ViewOnClickListenerC1479a(this, 1));
        htmlTextView.setOnLinkClickListener(this);
    }

    public static final void D(C1502a c1502a) {
        b6.b bVar = (b6.b) c1502a.f16793d.G1();
        String strL = bVar.f8541d.l();
        j.f(strL, "getKYCStatus(...)");
        if (strL.equals("kyc0")) {
            s sVar = (e6.b) bVar.c.get();
            C1219h c1219hH = AbstractC2329d.h(17);
            c1219hH.t(EnumC1217f.UPGRADE);
            ((MayaBaseFragment) sVar).A1(c1219hH);
        } else {
            s sVar2 = (e6.b) bVar.c.get();
            C1219h c1219hH2 = AbstractC2329d.h(17);
            c1219hH2.t(EnumC1217f.REVIEW);
            ((MayaBaseFragment) sVar2).A1(c1219hH2);
        }
        InterfaceC1467c interfaceC1467c = ((MayaAccountLimitsPageFragment) ((e6.b) bVar.c.get())).f11523X;
        if (interfaceC1467c != null) {
            MayaAccountLimitsActivity mayaAccountLimitsActivity = (MayaAccountLimitsActivity) interfaceC1467c;
            mayaAccountLimitsActivity.n1().s(mayaAccountLimitsActivity, true);
        }
    }

    @Override // G5.t
    public final void m(String str, View view) {
        MayaAccountLimitsPageFragment mayaAccountLimitsPageFragment = this.f16793d;
        mayaAccountLimitsPageFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(17);
        c1219h.t(EnumC1217f.LEARN);
        mayaAccountLimitsPageFragment.A1(c1219h);
        InterfaceC1467c interfaceC1467c = mayaAccountLimitsPageFragment.f11523X;
        if (interfaceC1467c != null) {
            MayaAccountLimitsActivity mayaAccountLimitsActivity = (MayaAccountLimitsActivity) interfaceC1467c;
            mayaAccountLimitsActivity.n1().w(mayaAccountLimitsActivity, "https://support.maya.ph/s/global-search/account%20limits");
        }
    }
}
