package ja;

import L9.C0323a;
import N5.C0466m;
import Q6.l;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Favorite;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import fa.ViewOnClickListenerC1479a;
import ga.InterfaceC1514a;
import ha.InterfaceC1549b;
import ia.InterfaceC1595a;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;

/* JADX INFO: renamed from: ja.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1673b extends RecyclerView.ViewHolder implements InterfaceC1595a {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaBillersCategoryFragment f17722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Group f17723b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f17724d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f17725g;
    public final l h;
    public Favorite i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673b(C0466m c0466m, MayaBillersCategoryFragment mListener) {
        super((ConstraintLayout) c0466m.f4150b);
        j.g(mListener, "mListener");
        this.f17722a = mListener;
        ConstraintLayout constraintLayoutContainer = (ConstraintLayout) c0466m.f4151d;
        j.f(constraintLayoutContainer, "constraintLayoutContainer");
        this.f17723b = (Group) c0466m.c;
        this.c = (ImageView) c0466m.e;
        this.f17724d = (ImageView) c0466m.f;
        this.e = (TextView) c0466m.i;
        this.f = (TextView) c0466m.f4152g;
        this.f17725g = (TextView) c0466m.h;
        l lVar = new l(24);
        this.h = lVar;
        lVar.h(this);
        constraintLayoutContainer.setOnClickListener(new ViewOnClickListenerC1479a(this, 8));
    }

    public static final void D(C1673b c1673b) {
        Favorite favorite = c1673b.i;
        if (favorite != null) {
            MayaBillersCategoryFragment mayaBillersCategoryFragment = c1673b.f17722a;
            mayaBillersCategoryFragment.getClass();
            if (mayaBillersCategoryFragment.t1().e().isBillsPayEventsV2Enabled()) {
                C1219h c1219hE = C1219h.e(AbstractC1173g.a(6));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hE.j.put("source_page", "Pay Bills");
                c1219hE.j.put("biller_slug", favorite.getContentPreviewMeta());
                c1219hE.j.put("biller_name", favorite.mAlias());
                mayaBillersCategoryFragment.o1().b(c1219hE);
            } else {
                C1219h c1219hH = AbstractC2329d.h(17);
                c1219hH.t(EnumC1217f.FAVORITE);
                mayaBillersCategoryFragment.A1(c1219hH);
            }
            C0323a c0323aP1 = mayaBillersCategoryFragment.P1();
            if (favorite.mContentPreview() == null) {
                return;
            }
            if ("BIR".equalsIgnoreCase(favorite.mContentPreview().mMeta())) {
                MayaBillersCategoryFragment mayaBillersCategoryFragment2 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
                mayaBillersCategoryFragment2.getClass();
                InterfaceC1549b interfaceC1549b = mayaBillersCategoryFragment2.f13360K0;
                if (interfaceC1549b != null) {
                    ((MayaPayBillsActivity) interfaceC1549b).b2(favorite);
                    return;
                }
                return;
            }
            MayaBillersCategoryFragment mayaBillersCategoryFragment3 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323aP1.c.get());
            mayaBillersCategoryFragment3.getClass();
            InterfaceC1549b interfaceC1549b2 = mayaBillersCategoryFragment3.f13360K0;
            if (interfaceC1549b2 != null) {
                ((MayaPayBillsActivity) interfaceC1549b2).e2(favorite);
            }
        }
    }
}
