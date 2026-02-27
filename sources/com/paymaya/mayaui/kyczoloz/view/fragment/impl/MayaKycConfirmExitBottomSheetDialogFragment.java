package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import E8.o;
import E8.p;
import K8.InterfaceC0285j;
import Ke.b;
import M8.C0361h0;
import M8.C0415v;
import N5.C0472p;
import Xh.i;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycConfirmExitBottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycConfirmExitBottomSheetDialogFragment extends MayaKycBaseBottomSheetDialogFragment<C0472p> implements InterfaceC0285j {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f12502X;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12503U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f12504V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final J5.a f12505W;

    static {
        r rVar = new r(MayaKycConfirmExitBottomSheetDialogFragment.class, "args", "getArgs()Lcom/paymaya/mayaui/kyczoloz/utils/extension/DynamicArgs;", 0);
        z.f18196a.getClass();
        f12502X = new KProperty[]{rVar};
    }

    public MayaKycConfirmExitBottomSheetDialogFragment() {
        super(C0361h0.f3309a);
        this.f12505W = new J5.a(25);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.ID_CHANGE_YOUR_MIND;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) ((O5.a) W4.a.e().f().c).f4716g.get();
        this.f12503U = new a(8);
        Unit unit = Unit.f18162a;
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        t1().h(this);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new o(dialogOnCreateDialog, this));
        return dialogOnCreateDialog;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        i.G(this, Boolean.valueOf(this.f12504V));
        t1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Button button = ((C0472p) s1()).c;
        KProperty[] kPropertyArr = f12502X;
        KProperty kProperty = kPropertyArr[0];
        J5.a aVar = this.f12505W;
        String str = "";
        Bundle bundle2 = ((F8.a) aVar.getValue(this, kProperty)).f1551a;
        String str2 = (bundle2 == null || (string2 = bundle2.getString("destinationScreenName")) == null) ? "" : string2;
        final int i = 0;
        b.b(button, new p(new Function0(this) { // from class: M8.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycConfirmExitBottomSheetDialogFragment f3304b;

            {
                this.f3304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycConfirmExitBottomSheetDialogFragment mayaKycConfirmExitBottomSheetDialogFragment = this.f3304b;
                        KProperty[] kPropertyArr2 = MayaKycConfirmExitBottomSheetDialogFragment.f12502X;
                        Ae.a aVarT1 = mayaKycConfirmExitBottomSheetDialogFragment.t1();
                        ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT1.c.get())).f12504V = true;
                        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT1.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
                        break;
                    default:
                        MayaKycConfirmExitBottomSheetDialogFragment mayaKycConfirmExitBottomSheetDialogFragment2 = this.f3304b;
                        KProperty[] kPropertyArr3 = MayaKycConfirmExitBottomSheetDialogFragment.f12502X;
                        Ae.a aVarT12 = mayaKycConfirmExitBottomSheetDialogFragment2.t1();
                        ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT12.c.get())).f12504V = false;
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT12.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).i2(true);
                        break;
                }
                return Unit.f18162a;
            }
        }, button, new C0415v(2, this, MayaKycConfirmExitBottomSheetDialogFragment.class, "triggerTappedEvent", "triggerTappedEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", 0, 1), str2, 0));
        Button button2 = ((C0472p) s1()).f4174b;
        Bundle bundle3 = ((F8.a) aVar.getValue(this, kPropertyArr[0])).f1551a;
        if (bundle3 != null && (string = bundle3.getString("destinationScreenName")) != null) {
            str = string;
        }
        final int i4 = 1;
        b.b(button2, new p(new Function0(this) { // from class: M8.g0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycConfirmExitBottomSheetDialogFragment f3304b;

            {
                this.f3304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycConfirmExitBottomSheetDialogFragment mayaKycConfirmExitBottomSheetDialogFragment = this.f3304b;
                        KProperty[] kPropertyArr2 = MayaKycConfirmExitBottomSheetDialogFragment.f12502X;
                        Ae.a aVarT1 = mayaKycConfirmExitBottomSheetDialogFragment.t1();
                        ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT1.c.get())).f12504V = true;
                        KeyEventDispatcher.Component componentRequireActivity = ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT1.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity)).i2(true);
                        break;
                    default:
                        MayaKycConfirmExitBottomSheetDialogFragment mayaKycConfirmExitBottomSheetDialogFragment2 = this.f3304b;
                        KProperty[] kPropertyArr3 = MayaKycConfirmExitBottomSheetDialogFragment.f12502X;
                        Ae.a aVarT12 = mayaKycConfirmExitBottomSheetDialogFragment2.t1();
                        ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT12.c.get())).f12504V = false;
                        KeyEventDispatcher.Component componentRequireActivity2 = ((MayaKycConfirmExitBottomSheetDialogFragment) ((InterfaceC0285j) aVarT12.c.get())).requireActivity();
                        kotlin.jvm.internal.j.e(componentRequireActivity2, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
                        ((MayaKycActivity) ((H8.b) componentRequireActivity2)).i2(true);
                        break;
                }
                return Unit.f18162a;
            }
        }, button2, new C0415v(2, this, MayaKycConfirmExitBottomSheetDialogFragment.class, "triggerTappedEvent", "triggerTappedEvent(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", 0, 2), str, 0));
        t1().j();
    }

    public final a t1() {
        a aVar = this.f12503U;
        if (aVar != null) {
            return aVar;
        }
        j.n("mPresenter");
        throw null;
    }
}
