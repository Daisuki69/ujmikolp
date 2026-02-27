package com.paymaya.mayaui.vouchers.view.fragment.impl;

import Ac.e;
import Ae.a;
import Fc.c;
import N5.H0;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import kotlin.jvm.internal.j;
import y5.g;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVouchersCollectionFragment extends MayaBaseFragment implements c {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public H0 f14307U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a f14308V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public g f14309W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e f14310X;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f14309W = (g) getActivity();
        O5.a aVar = W4.a.e().C().f4756a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        a aVar2 = new a((d) aVar.f4748y.get());
        this.f14308V = aVar2;
        aVar2.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_vouchers_collection_fragment, viewGroup, false);
        int i = R.id.vouchers_collection_tab_layout;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(viewInflate, R.id.vouchers_collection_tab_layout);
        if (tabLayout != null) {
            i = R.id.vouchers_collection_view_pager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(viewInflate, R.id.vouchers_collection_view_pager);
            if (viewPager != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.f14307U = new H0(linearLayout, tabLayout, viewPager);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14307U = null;
        a aVar = this.f14308V;
        if (aVar == null) {
            j.n("mVouchersCollectionFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        g gVar = this.f14309W;
        if (gVar != null) {
            gVar.Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = this.f14308V;
        if (aVar != null) {
            aVar.j();
        } else {
            j.n("mVouchersCollectionFragmentPresenter");
            throw null;
        }
    }
}
