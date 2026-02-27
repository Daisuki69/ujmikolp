package com.paymaya.mayaui.merchant.view.fragment.impl;

import D8.C0214w;
import N5.C0453g;
import O5.a;
import S5.c;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaDynamicMerchantActivity;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import o9.InterfaceC1971b;
import p9.InterfaceC2018c;

/* JADX INFO: loaded from: classes4.dex */
public class MayaDynamicMerchantPaymentFragment extends MayaBaseFragment implements InterfaceC1971b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f12864U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12865V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f12866W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MayaInputLayout f12867X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0214w f12868Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC2018c f12869Z;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12868Y = new C0214w(aVar.B(), (d) aVar.f4748y.get());
        this.f12869Z = (InterfaceC2018c) getActivity();
        C0214w c0214w = this.f12868Y;
        if (c0214w != null) {
            c0214w.h(this);
        } else {
            j.n("mDynamicMerchantPaymentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        C0453g c0453gA = C0453g.a(inflater, viewGroup);
        this.f12864U = c0453gA;
        return (ConstraintLayout) c0453gA.f4094b;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0214w c0214w = this.f12868Y;
        if (c0214w == null) {
            j.n("mDynamicMerchantPaymentPresenter");
            throw null;
        }
        c0214w.i();
        super.onDestroy();
        this.f12864U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2018c interfaceC2018c = this.f12869Z;
        if (interfaceC2018c != null) {
            ((MayaDynamicMerchantActivity) interfaceC2018c).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f12864U;
        j.d(c0453g);
        this.f12865V = (TextView) c0453g.f4095d;
        C0453g c0453g2 = this.f12864U;
        j.d(c0453g2);
        this.f12866W = (Button) c0453g2.e;
        C0453g c0453g3 = this.f12864U;
        j.d(c0453g3);
        this.f12867X = (MayaInputLayout) c0453g3.c;
        C0214w c0214w = this.f12868Y;
        if (c0214w == null) {
            j.n("mDynamicMerchantPaymentPresenter");
            throw null;
        }
        c0214w.j();
        Button button = this.f12866W;
        if (button == null) {
            j.n("mContinueButton");
            throw null;
        }
        button.setEnabled(true);
        Button button2 = this.f12866W;
        if (button2 != null) {
            button2.setOnClickListener(new ViewOnClickListenerC1479a(this, 23));
        } else {
            j.n("mContinueButton");
            throw null;
        }
    }
}
