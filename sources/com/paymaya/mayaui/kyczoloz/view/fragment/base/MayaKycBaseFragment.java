package com.paymaya.mayaui.kyczoloz.view.fragment.base;

import Ag.k;
import H8.b;
import L8.c;
import L8.d;
import M8.T2;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBinding;
import cj.M;
import com.paymaya.common.base.MayaBaseBindingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.D;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaKycBaseFragment<T extends ViewBinding> extends MayaBaseBindingFragment<T> implements d, c {
    @Override // L8.c
    public final void A(String str, String str2, Map map) {
        T2.M(this, str, str2, map);
    }

    @Override // L8.c
    public boolean D() {
        return false;
    }

    public final void H1() {
        Object systemService = requireContext().getSystemService("input_method");
        j.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public final void I1(String str, String str2) {
        T2.L(this, str, str2, false);
    }

    public final void J1(String reason, String str, boolean z4) {
        j.g(reason, "reason");
        EnumC1216e enumC1216eU = U();
        if (enumC1216eU != null) {
            D.c(new D(), enumC1216eU, 38, M.h(new Pair(EnumC1212a.IS_SUCCESS, z4 ? "T" : "F"), new Pair(EnumC1212a.REASON, reason), new Pair(EnumC1212a.VENDOR, "Tencent"), new Pair(EnumC1212a.SDK_VERSION, str)), null, new k(this, 24), new Ag.d(this, 22), 24);
        }
    }

    @Override // L8.c
    public final D O() {
        return new D();
    }

    @Override // L8.c
    public final b Q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return (b) componentRequireActivity;
    }

    @Override // L8.c
    public final void g0(String str, String str2, Map map) {
        T2.P(this, str, str2, map, false);
    }

    @Override // L8.d
    public final void j1() {
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.PRESUBMISSION_ID);
        c1219hD.n(35);
        c1219hD.i();
        z1(c1219hD);
    }

    @Override // L8.d
    public void q() {
    }

    @Override // L8.c
    public final String r() {
        return T2.y(this);
    }

    @Override // L8.c
    public final String s() {
        return T2.j(this);
    }

    @Override // L8.c
    public final void v(String str, String str2, Map map) {
        T2.J(this, str, str2, map);
    }

    @Override // L8.c
    public final void z(Map map) {
        T2.G(this, map, false);
    }
}
