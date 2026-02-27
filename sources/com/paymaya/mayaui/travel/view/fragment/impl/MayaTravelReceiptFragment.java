package com.paymaya.mayaui.travel.view.fragment.impl;

import D.C0187u;
import Dc.e;
import N5.C0447e;
import O5.a;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.Z;
import com.paymaya.common.utility.h0;
import com.paymaya.mayaui.common.view.widget.MayaExpandableContainerView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueReviewInfoItem;
import com.paymaya.mayaui.travel.view.activity.impl.MayaTravelActivity;
import de.m;
import java.util.Arrays;
import jc.d;
import kotlin.jvm.internal.j;
import y5.InterfaceC2511c;
import y5.n;
import y5.u;

/* JADX INFO: loaded from: classes4.dex */
public class MayaTravelReceiptFragment extends MayaAbstractBaseReceiptFragmentImpl implements d, InterfaceC2511c {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public MayaLabelValueReviewInfoItem f14207A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public MayaLabelValueReviewInfoItem f14208B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public MayaLabelValueReviewInfoItem f14209C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public MayaExpandableContainerView f14210D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public MayaExpandableContainerView f14211E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public ImageView f14212F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public TextView f14213G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public e f14214H0;
    public kc.e I0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public C0447e f14215v0;
    public MayaLabelValueReviewInfoItem w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public MayaLabelValueReviewInfoItem f14216x0;
    public MayaLabelValueReviewInfoItem y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public MayaLabelValueReviewInfoItem f14217z0;

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final n H1() {
        return this.I0;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final u I1() {
        e eVar = this.f14214H0;
        if (eVar != null) {
            return eVar;
        }
        j.n("mMayaTravelReceiptFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final View J1(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_travel_receipt, (ViewGroup) null, false);
        int i = R.id.expandable_container_view_fare;
        MayaExpandableContainerView mayaExpandableContainerView = (MayaExpandableContainerView) ViewBindings.findChildViewById(viewInflate, R.id.expandable_container_view_fare);
        if (mayaExpandableContainerView != null) {
            i = R.id.expandable_container_view_routes;
            MayaExpandableContainerView mayaExpandableContainerView2 = (MayaExpandableContainerView) ViewBindings.findChildViewById(viewInflate, R.id.expandable_container_view_routes);
            if (mayaExpandableContainerView2 != null) {
                i = R.id.image_view_qr;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_qr);
                if (imageView != null) {
                    i = R.id.info_item_reference;
                    MayaLabelValueReviewInfoItem mayaLabelValueReviewInfoItem = (MayaLabelValueReviewInfoItem) ViewBindings.findChildViewById(viewInflate, R.id.info_item_reference);
                    if (mayaLabelValueReviewInfoItem != null) {
                        i = R.id.linear_layout_qr;
                        if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.linear_layout_qr)) != null) {
                            i = R.id.text_view_qr_message;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_qr_message)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f14215v0 = new C0447e(constraintLayout, mayaExpandableContainerView, mayaExpandableContainerView2, imageView, mayaLabelValueReviewInfoItem, 23);
                                j.f(constraintLayout, "getRoot(...)");
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void V1() {
        kc.e eVar = this.I0;
        if (eVar != null) {
            ((MayaTravelActivity) eVar).finish();
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void W1() {
        kc.e eVar = this.I0;
        if (eVar != null) {
            MayaTravelActivity mayaTravelActivity = (MayaTravelActivity) eVar;
            mayaTravelActivity.n1().u(mayaTravelActivity, "https://support.maya.ph/s/article/Guide-for-your-Transaction-Concerns", mayaTravelActivity.getString(R.string.pma_label_help));
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl
    public final void Y1() {
        String str = String.format("receipt_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        Q1().setVisibility(4);
        MayaExpandableContainerView mayaExpandableContainerView = this.f14211E0;
        if (mayaExpandableContainerView == null) {
            j.n("mExpandableContainerRoute");
            throw null;
        }
        mayaExpandableContainerView.c();
        h0 h0VarD = h0.d(M1(), new m(this, 28));
        ImageView imageViewN1 = N1();
        TextView textViewK1 = K1();
        CardView cardViewL1 = L1();
        MayaExpandableContainerView mayaExpandableContainerView2 = this.f14210D0;
        if (mayaExpandableContainerView2 == null) {
            j.n("mExpandableContainerFare");
            throw null;
        }
        TextView textView = this.f14213G0;
        if (textView == null) {
            j.n("mRouteTitleTwo");
            throw null;
        }
        ImageView imageView = this.f14212F0;
        if (imageView == null) {
            j.n("mRouteExpandableIcon");
            throw null;
        }
        h0VarD.f(imageViewN1, textViewK1, cardViewL1, mayaExpandableContainerView2, textView, imageView);
        h0VarD.b(str);
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        kc.e eVar = this.I0;
        if (eVar == null) {
            return true;
        }
        ((MayaTravelActivity) eVar).finish();
        return true;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        m1().i();
        this.I0 = (kc.e) getActivity();
        a aVar = W4.a.e().A().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.u0 = (C0187u) aVar.f.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        j.g(flagConfigurationService, "flagConfigurationService");
        e eVar = new e(flagConfigurationService, 0, 2);
        this.f14214H0 = eVar;
        eVar.h(this);
        Z.a(getActivity(), 1.0f);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        kc.e eVar = this.I0;
        if (eVar != null) {
            ((MayaTravelActivity) eVar).Q(this);
        }
        Z1("transport");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0273  */
    @Override // com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r31, android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.travel.view.fragment.impl.MayaTravelReceiptFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
