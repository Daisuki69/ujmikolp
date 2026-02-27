package com.paymaya.mayaui.kyczoloz.view.fragment.base;

import H8.b;
import L8.c;
import M8.T2;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBinding;
import com.paymaya.common.base.MayaBaseBindingBottomSheetDialogFragment;
import com.paymaya.common.utility.D;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MayaKycBaseBottomSheetDialogFragment<T extends ViewBinding> extends MayaBaseBindingBottomSheetDialogFragment<T> implements c {
    @Override // L8.c
    public final void A(String str, String str2, Map map) {
        T2.M(this, str, str2, map);
    }

    @Override // L8.c
    public final boolean D() {
        return false;
    }

    @Override // L8.c
    public final D O() {
        return new D();
    }

    @Override // L8.c
    public b Q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return (b) componentRequireActivity;
    }

    @Override // L8.c
    public final void g0(String str, String str2, Map map) {
        T2.P(this, str, str2, map, false);
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
