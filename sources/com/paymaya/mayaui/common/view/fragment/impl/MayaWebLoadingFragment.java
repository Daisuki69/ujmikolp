package com.paymaya.mayaui.common.view.fragment.impl;

import Bb.f;
import O5.a;
import S5.c;
import Uh.d;
import X6.j;
import Y6.r;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.activity.impl.MayaWebActivity;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWebLoadingFragment extends MayaBaseLoadingFragment implements j {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public r f11972o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public f f11973p0;

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_web_loading, viewGroup, false);
        if (viewInflate != null) {
            return (ConstraintLayout) viewInflate;
        }
        throw new NullPointerException("rootView");
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_reusable_error, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        kotlin.jvm.internal.j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final f P1() {
        f fVar = this.f11973p0;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.j.n("mMayaWebLoadingFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11972o0 = (r) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f11973p0 = new f(aVar.Z(), (d) aVar.f4748y.get(), 10);
        P1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        P1().i();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        kotlin.jvm.internal.j.f(layoutInflaterOnGetLayoutInflater, "onGetLayoutInflater(...)");
        LayoutInflater layoutInflaterCloneInContext = layoutInflaterOnGetLayoutInflater.cloneInContext(new ContextThemeWrapper(requireContext(), R.style.MayaThemeLight));
        kotlin.jvm.internal.j.f(layoutInflaterCloneInContext, "cloneInContext(...)");
        return layoutInflaterCloneInContext;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        r rVar = this.f11972o0;
        if (rVar != null) {
            ((MayaWebActivity) rVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        P1().j();
    }
}
