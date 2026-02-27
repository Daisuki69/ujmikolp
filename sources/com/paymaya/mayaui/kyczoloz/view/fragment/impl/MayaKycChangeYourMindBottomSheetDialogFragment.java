package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import Fa.c;
import K8.InterfaceC0281f;
import M8.C0376l;
import M8.E;
import M8.F;
import N5.C0470o;
import Xh.i;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycChangeYourMindBottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycChangeYourMindBottomSheetDialogFragment extends MayaKycBaseBottomSheetDialogFragment<C0470o> implements InterfaceC0281f {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12482U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f12483V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final NavArgsLazy f12484W;

    public MayaKycChangeYourMindBottomSheetDialogFragment() {
        super(E.f3154a);
        this.f12484W = new NavArgsLazy(z.a(F.class), new C0376l(this, 2));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.ID_CHANGE_YOUR_MIND;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) ((O5.a) W4.a.e().f().c).f4716g.get();
        a aVar = new a(7);
        this.f12482U = aVar;
        aVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new c(this, 6));
        return dialogOnCreateDialog;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        i.G(this, Boolean.valueOf(this.f12483V));
        a aVar = this.f12482U;
        if (aVar == null) {
            j.n("mPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        final int i = 0;
        C.r0(((C0470o) s1()).c, new Function0(this) { // from class: M8.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycChangeYourMindBottomSheetDialogFragment f3148b;

            {
                this.f3148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycChangeYourMindBottomSheetDialogFragment mayaKycChangeYourMindBottomSheetDialogFragment = this.f3148b;
                        Ae.a aVar = mayaKycChangeYourMindBottomSheetDialogFragment.f12482U;
                        if (aVar == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar.c.get())).f12483V = true;
                        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
                        String string = ((C0470o) mayaKycChangeYourMindBottomSheetDialogFragment.s1()).c.getText().toString();
                        String strA = ((F) mayaKycChangeYourMindBottomSheetDialogFragment.f12484W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA, "getDestinationScreenName(...)");
                        T2.Q(mayaKycChangeYourMindBottomSheetDialogFragment, string, strA, null, 12);
                        return Unit.f18162a;
                    default:
                        MayaKycChangeYourMindBottomSheetDialogFragment mayaKycChangeYourMindBottomSheetDialogFragment2 = this.f3148b;
                        Ae.a aVar2 = mayaKycChangeYourMindBottomSheetDialogFragment2.f12482U;
                        if (aVar2 == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar2.c.get())).f12483V = false;
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar2.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).i2(true);
                        String string2 = ((C0470o) mayaKycChangeYourMindBottomSheetDialogFragment2.s1()).f4167b.getText().toString();
                        String strA2 = ((F) mayaKycChangeYourMindBottomSheetDialogFragment2.f12484W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA2, "getDestinationScreenName(...)");
                        T2.Q(mayaKycChangeYourMindBottomSheetDialogFragment2, string2, strA2, null, 12);
                        return Unit.f18162a;
                }
            }
        });
        final int i4 = 1;
        C.r0(((C0470o) s1()).f4167b, new Function0(this) { // from class: M8.D

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycChangeYourMindBottomSheetDialogFragment f3148b;

            {
                this.f3148b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycChangeYourMindBottomSheetDialogFragment mayaKycChangeYourMindBottomSheetDialogFragment = this.f3148b;
                        Ae.a aVar = mayaKycChangeYourMindBottomSheetDialogFragment.f12482U;
                        if (aVar == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar.c.get())).f12483V = true;
                        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
                        String string = ((C0470o) mayaKycChangeYourMindBottomSheetDialogFragment.s1()).c.getText().toString();
                        String strA = ((F) mayaKycChangeYourMindBottomSheetDialogFragment.f12484W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA, "getDestinationScreenName(...)");
                        T2.Q(mayaKycChangeYourMindBottomSheetDialogFragment, string, strA, null, 12);
                        return Unit.f18162a;
                    default:
                        MayaKycChangeYourMindBottomSheetDialogFragment mayaKycChangeYourMindBottomSheetDialogFragment2 = this.f3148b;
                        Ae.a aVar2 = mayaKycChangeYourMindBottomSheetDialogFragment2.f12482U;
                        if (aVar2 == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar2.c.get())).f12483V = false;
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycChangeYourMindBottomSheetDialogFragment) ((InterfaceC0281f) aVar2.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).i2(true);
                        String string2 = ((C0470o) mayaKycChangeYourMindBottomSheetDialogFragment2.s1()).f4167b.getText().toString();
                        String strA2 = ((F) mayaKycChangeYourMindBottomSheetDialogFragment2.f12484W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA2, "getDestinationScreenName(...)");
                        T2.Q(mayaKycChangeYourMindBottomSheetDialogFragment2, string2, strA2, null, 12);
                        return Unit.f18162a;
                }
            }
        });
    }
}
