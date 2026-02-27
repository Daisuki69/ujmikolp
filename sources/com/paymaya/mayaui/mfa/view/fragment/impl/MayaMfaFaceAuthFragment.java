package com.paymaya.mayaui.mfa.view.fragment.impl;

import A7.j;
import N5.G0;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.domain.model.MfaMeta;
import com.paymaya.mayaui.mfa.view.activity.impl.MayaMfaActivity;
import com.paymaya.mayaui.tencent.view.fragment.impl.MayaTencentBaseFragment;
import x9.a;
import y9.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaMfaFaceAuthFragment extends MayaTencentBaseFragment<G0> implements a {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public b f12936X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f12937Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public j f12938Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public C1229s f12939a0;

    public MayaMfaFaceAuthFragment() {
        super(y9.a.f21081a);
        this.f12937Y = true;
    }

    public final j L1() {
        j jVar = this.f12938Z;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mMayaMfaFaceAuthFragmentPresenter");
        throw null;
    }

    public final MfaMeta M1() {
        b bVar = this.f12936X;
        if (bVar != null) {
            return ((MayaMfaActivity) bVar).f12930q;
        }
        return null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.j.g(context, "context");
        O5.a aVar = W4.a.e().r().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        int i = 24;
        this.f12938Z = new j(i, aVar.C(), aVar.E());
        this.f12939a0 = (C1229s) aVar.f4684R.get();
        super.onAttach(context);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12936X = (b) requireActivity();
        L1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        L1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.f12936X;
        if (bVar != null) {
            ((MayaMfaActivity) bVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        L1().j();
    }
}
