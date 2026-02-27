package com.paymaya.mayaui.dashboard.view.fragment.impl;

import A7.p;
import F7.r;
import G7.D;
import Kh.I;
import Lh.c;
import N5.n1;
import W4.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.Z;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import kotlin.jvm.internal.j;
import sd.AbstractC2252a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaUserActivityTransportFragment extends MayaAbstractBaseUserActivityFragmentImpl implements r {
    public n1 u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public ConstraintLayout f12211v0;
    public ImageView w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public p f12212x0;

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final AbstractC2252a G1() {
        p pVar = this.f12212x0;
        if (pVar != null) {
            return pVar;
        }
        j.n("mTransportFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl
    public final void S1() {
        super.S1();
        U1(getString(R.string.maya_label_share_receipt), null);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = (D) getActivity();
        c cVarB = a.e().b();
        O5.a aVar = (O5.a) cVarB.c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        ((I) cVarB.f2990b).getClass();
        this.f12212x0 = new p(9);
        G1().h(this);
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_view_user_activity_qr_custom_view, viewGroup, false);
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_qr);
        if (imageView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.image_view_qr)));
        }
        this.u0 = new n1((ConstraintLayout) viewInflate, imageView, 1);
        return super.onCreateView(inflater, viewGroup, bundle);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f10297U = null;
        this.u0 = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Z.a(getActivity(), -1.0f);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Z.a(getActivity(), 1.0f);
        y5.p pVar = this.t0;
        if (pVar != null) {
            ((MayaTransactionsActivity) pVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaAbstractBaseUserActivityFragmentImpl, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        n1 n1Var = this.u0;
        j.d(n1Var);
        this.f12211v0 = n1Var.f4165b;
        n1 n1Var2 = this.u0;
        j.d(n1Var2);
        this.w0 = n1Var2.c;
        FrameLayout frameLayout = this.f10318q0;
        if (frameLayout == null) {
            j.n("mFrameLayoutCustomView");
            throw null;
        }
        ConstraintLayout constraintLayout = this.f12211v0;
        if (constraintLayout == null) {
            j.n("mConstraintLayoutCustomView");
            throw null;
        }
        frameLayout.addView(constraintLayout);
        ((p) G1()).j();
    }
}
