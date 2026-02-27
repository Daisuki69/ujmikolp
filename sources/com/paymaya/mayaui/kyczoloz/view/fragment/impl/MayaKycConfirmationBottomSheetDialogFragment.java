package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import Fa.c;
import K8.InterfaceC0286k;
import M8.C0369j0;
import M8.C0373k0;
import M8.C0376l;
import N5.C0474q;
import Xh.i;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.Navigation;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycConfirmationBottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycConfirmationBottomSheetDialogFragment extends MayaKycBaseBottomSheetDialogFragment<C0474q> implements InterfaceC0286k {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12506U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f12507V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final NavArgsLazy f12508W;

    public MayaKycConfirmationBottomSheetDialogFragment() {
        super(C0369j0.f3320a);
        this.f12508W = new NavArgsLazy(z.a(C0373k0.class), new C0376l(this, 3));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONFIRM_SUBMISSION;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        this.f10325B = (C1220i) ((O5.a) W4.a.e().f().c).f4716g.get();
        a aVar = new a(9);
        this.f12506U = aVar;
        aVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new c(this, 7));
        return dialogOnCreateDialog;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        i.G(this, Boolean.valueOf(this.f12507V));
        a aVar = this.f12506U;
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
        C.r0(((C0474q) s1()).c, new Function0(this) { // from class: M8.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycConfirmationBottomSheetDialogFragment f3314b;

            {
                this.f3314b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MayaKycConfirmationBottomSheetDialogFragment mayaKycConfirmationBottomSheetDialogFragment = this.f3314b;
                        Ae.a aVar = mayaKycConfirmationBottomSheetDialogFragment.f12506U;
                        if (aVar == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar.c.get())).f12507V = true;
                        FragmentActivity fragmentActivityRequireActivity = ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar.c.get())).requireActivity();
                        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                        Navigation.findNavController(fragmentActivityRequireActivity, R.id.maya_kyc_nav_host_fragment).popBackStack();
                        String string = ((C0474q) mayaKycConfirmationBottomSheetDialogFragment.s1()).c.getText().toString();
                        String strA = ((C0373k0) mayaKycConfirmationBottomSheetDialogFragment.f12508W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA, "getDestinationScreenName(...)");
                        T2.Q(mayaKycConfirmationBottomSheetDialogFragment, string, strA, null, 12);
                        return Unit.f18162a;
                    default:
                        MayaKycConfirmationBottomSheetDialogFragment mayaKycConfirmationBottomSheetDialogFragment2 = this.f3314b;
                        Ae.a aVar2 = mayaKycConfirmationBottomSheetDialogFragment2.f12506U;
                        if (aVar2 == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar2.c.get())).f12507V = false;
                        FragmentActivity fragmentActivityRequireActivity2 = ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar2.c.get())).requireActivity();
                        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
                        Navigation.findNavController(fragmentActivityRequireActivity2, R.id.maya_kyc_nav_host_fragment).popBackStack();
                        String string2 = ((C0474q) mayaKycConfirmationBottomSheetDialogFragment2.s1()).f4182b.getText().toString();
                        String strA2 = ((C0373k0) mayaKycConfirmationBottomSheetDialogFragment2.f12508W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA2, "getDestinationScreenName(...)");
                        T2.Q(mayaKycConfirmationBottomSheetDialogFragment2, string2, strA2, null, 12);
                        return Unit.f18162a;
                }
            }
        });
        final int i4 = 1;
        C.r0(((C0474q) s1()).f4182b, new Function0(this) { // from class: M8.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycConfirmationBottomSheetDialogFragment f3314b;

            {
                this.f3314b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        MayaKycConfirmationBottomSheetDialogFragment mayaKycConfirmationBottomSheetDialogFragment = this.f3314b;
                        Ae.a aVar = mayaKycConfirmationBottomSheetDialogFragment.f12506U;
                        if (aVar == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar.c.get())).f12507V = true;
                        FragmentActivity fragmentActivityRequireActivity = ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar.c.get())).requireActivity();
                        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity, "requireActivity(...)");
                        Navigation.findNavController(fragmentActivityRequireActivity, R.id.maya_kyc_nav_host_fragment).popBackStack();
                        String string = ((C0474q) mayaKycConfirmationBottomSheetDialogFragment.s1()).c.getText().toString();
                        String strA = ((C0373k0) mayaKycConfirmationBottomSheetDialogFragment.f12508W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA, "getDestinationScreenName(...)");
                        T2.Q(mayaKycConfirmationBottomSheetDialogFragment, string, strA, null, 12);
                        return Unit.f18162a;
                    default:
                        MayaKycConfirmationBottomSheetDialogFragment mayaKycConfirmationBottomSheetDialogFragment2 = this.f3314b;
                        Ae.a aVar2 = mayaKycConfirmationBottomSheetDialogFragment2.f12506U;
                        if (aVar2 == null) {
                            kotlin.jvm.internal.j.n("mPresenter");
                            throw null;
                        }
                        ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar2.c.get())).f12507V = false;
                        FragmentActivity fragmentActivityRequireActivity2 = ((MayaKycConfirmationBottomSheetDialogFragment) ((InterfaceC0286k) aVar2.c.get())).requireActivity();
                        kotlin.jvm.internal.j.f(fragmentActivityRequireActivity2, "requireActivity(...)");
                        Navigation.findNavController(fragmentActivityRequireActivity2, R.id.maya_kyc_nav_host_fragment).popBackStack();
                        String string2 = ((C0474q) mayaKycConfirmationBottomSheetDialogFragment2.s1()).f4182b.getText().toString();
                        String strA2 = ((C0373k0) mayaKycConfirmationBottomSheetDialogFragment2.f12508W.getValue()).a();
                        kotlin.jvm.internal.j.f(strA2, "getDestinationScreenName(...)");
                        T2.Q(mayaKycConfirmationBottomSheetDialogFragment2, string2, strA2, null, 12);
                        return Unit.f18162a;
                }
            }
        });
    }
}
