package ja;

import L9.C0323a;
import N5.r1;
import Q6.n;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BillerCategory;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import ea.j;
import fa.ViewOnClickListenerC1479a;
import ga.InterfaceC1514a;
import java.util.HashMap;

/* JADX INFO: renamed from: ja.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1672a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f17719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f17720b;
    public final TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f17721d;
    public final n e;
    public BillerCategory f;

    public C1672a(r1 r1Var, j jVar) {
        super((ConstraintLayout) r1Var.c);
        this.f17719a = jVar;
        this.f17720b = (ImageView) r1Var.e;
        this.c = (TextView) r1Var.f4198b;
        FrameLayout frameLayout = (FrameLayout) r1Var.f4199d;
        this.f17721d = frameLayout;
        this.e = new n(this, 22);
        frameLayout.setOnClickListener(new ViewOnClickListenerC1479a(this, 7));
    }

    public static final void D(C1672a c1672a) {
        BillerCategory billerCategory = c1672a.f;
        if (billerCategory != null) {
            j jVar = c1672a.f17719a;
            jVar.getClass();
            MayaBillersCategoryFragment mayaBillersCategoryFragment = jVar.f16618a;
            mayaBillersCategoryFragment.getClass();
            C0323a c0323aP1 = mayaBillersCategoryFragment.P1();
            if (((com.paymaya.data.preference.a) c0323aP1.i).e().isBillsPayEventsV2Enabled()) {
                MayaBillersCategoryFragment mayaBillersCategoryFragment2 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
                mayaBillersCategoryFragment2.getClass();
                C1219h c1219hE = C1219h.e(AbstractC1173g.a(3));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                String strMSlug = billerCategory.mSlug();
                HashMap map = c1219hE.j;
                map.put("category_slug", strMSlug);
                map.put("category_name", billerCategory.mName());
                mayaBillersCategoryFragment2.o1().b(c1219hE);
            } else {
                InterfaceC1514a interfaceC1514a = (InterfaceC1514a) c0323aP1.c.get();
                String strMName = billerCategory.mName();
                kotlin.jvm.internal.j.f(strMName, "mName(...)");
                MayaBillersCategoryFragment mayaBillersCategoryFragment3 = (MayaBillersCategoryFragment) interfaceC1514a;
                mayaBillersCategoryFragment3.getClass();
                C1219h c1219h = new C1219h();
                c1219h.n(17);
                c1219h.t(EnumC1217f.CATEGORY);
                EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
                c1219h.j.put(SessionDescription.ATTR_TYPE, strMName);
                mayaBillersCategoryFragment3.A1(c1219h);
            }
            ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get())).Y1(billerCategory);
        }
    }
}
