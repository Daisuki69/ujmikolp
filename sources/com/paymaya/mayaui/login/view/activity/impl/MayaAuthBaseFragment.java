package com.paymaya.mayaui.login.view.activity.impl;

import Ya.a;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1229s;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaAuthBaseFragment extends MayaBaseFragment {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C1229s f12720U;

    public final a G1() {
        KeyEventDispatcher.Component activity = getActivity();
        a aVar = activity instanceof a ? (a) activity : null;
        return aVar == null ? new Za.a() : aVar;
    }

    public final C1229s H1() {
        C1229s c1229s = this.f12720U;
        if (c1229s != null) {
            return c1229s;
        }
        j.n("authAnalyticsUtils");
        throw null;
    }

    public final String s() {
        return G1().s().toString();
    }
}
