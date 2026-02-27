package com.paymaya.mayaui.mfa.view.fragment.impl;

import Bb.f;
import O5.a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import kotlin.jvm.internal.j;
import x9.b;
import y9.c;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMultiTypeMfaInitialFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public f f12940U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public c f12941V;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        j.g(context, "context");
        a aVar = W4.a.e().r().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f12940U = new f(aVar.C(), 25);
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.mfa.view.fragment.impl.MayaMultiTypeMfaInitialFragment.MayaMultiTypeMfaInitialFragmentListener");
        this.f12941V = (c) componentRequireActivity;
        f fVar = this.f12940U;
        if (fVar != null) {
            fVar.h(this);
        } else {
            j.n("mMayaMultiTypeMfaInitialFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_mfa_initial_loading, viewGroup, false);
        if (viewInflate != null) {
            return (ConstraintLayout) viewInflate;
        }
        throw new NullPointerException("rootView");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f12940U;
        if (fVar == null) {
            j.n("mMayaMultiTypeMfaInitialFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        f fVar = this.f12940U;
        if (fVar != null) {
            fVar.j();
        } else {
            j.n("mMayaMultiTypeMfaInitialFragmentPresenter");
            throw null;
        }
    }
}
