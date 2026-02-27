package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import E8.o;
import E8.p;
import H8.b;
import K8.B;
import M8.C0376l;
import M8.I1;
import M8.J1;
import M8.T;
import N5.C0477s;
import Xh.i;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavArgsLazy;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseBottomSheetDialogFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycRestartBottomSheetDialogFragment;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycRestartBottomSheetDialogFragment extends MayaKycBaseBottomSheetDialogFragment<C0477s> implements B {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12582U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public com.paymaya.data.preference.a f12583V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f12584W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final NavArgsLazy f12585X;

    public MayaKycRestartBottomSheetDialogFragment() {
        super(I1.f3177a);
        this.f12585X = new NavArgsLazy(z.a(J1.class), new C0376l(this, 10));
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseBottomSheetDialogFragment, L8.c
    public final b Q() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return (b) componentRequireActivity;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f12582U = new a(16);
        this.f12583V = (com.paymaya.data.preference.a) aVar.e.get();
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
        i.G(this, Boolean.valueOf(this.f12584W));
        t1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220iN1 = n1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(p1());
        c1219hD.s(v1());
        c1219hD.n(3);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strU1 = u1();
        HashMap map = c1219hD.j;
        map.put("page_name", strU1);
        map.put("path", "TOFU 1.0");
        com.paymaya.data.preference.a aVar = this.f12583V;
        if (aVar == null) {
            j.n("mPreference");
            throw null;
        }
        map.put("kyc_status", aVar.l());
        c1219hD.i();
        c1220iN1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Button button = ((C0477s) s1()).f4201b;
        String string = getString(R.string.maya_kyc_amlc_page_name_label);
        j.f(string, "getString(...)");
        final int i = 0;
        Ke.b.b(button, new p(new Function0(this) { // from class: M8.H1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycRestartBottomSheetDialogFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        this.f3174b.t1().k(false);
                        break;
                    default:
                        this.f3174b.t1().k(true);
                        break;
                }
                return Unit.f18162a;
            }
        }, button, new T(2, this, MayaKycRestartBottomSheetDialogFragment.class, "sendTappedEvent", "sendTappedEvent(Ljava/lang/String;Ljava/lang/String;)V", 0, 14), string, 0));
        Button button2 = ((C0477s) s1()).c;
        String string2 = getString(R.string.maya_kyc_complete_your_maya_experience_fragment_screen_label);
        j.f(string2, "getString(...)");
        final int i4 = 1;
        Ke.b.b(button2, new p(new Function0(this) { // from class: M8.H1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycRestartBottomSheetDialogFragment f3174b;

            {
                this.f3174b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        this.f3174b.t1().k(false);
                        break;
                    default:
                        this.f3174b.t1().k(true);
                        break;
                }
                return Unit.f18162a;
            }
        }, button2, new T(2, this, MayaKycRestartBottomSheetDialogFragment.class, "sendTappedEvent", "sendTappedEvent(Ljava/lang/String;Ljava/lang/String;)V", 0, 15), string2, 0));
        t1().j();
    }

    public final a t1() {
        a aVar = this.f12582U;
        if (aVar != null) {
            return aVar;
        }
        j.n("mPresenter");
        throw null;
    }

    public final String u1() {
        String strA = ((J1) this.f12585X.getValue()).a();
        j.f(strA, "getSourceKey(...)");
        if (strA.equals("AMLC")) {
            String string = getString(R.string.maya_kyc_amlc_page_name_label);
            j.f(string, "getString(...)");
            return string;
        }
        if (strA.equals("SSNE")) {
            String string2 = getString(R.string.maya_kyc_ssne_page_name_label);
            j.f(string2, "getString(...)");
            return string2;
        }
        String string3 = getString(R.string.maya_kyc_amlc_page_name_label);
        j.f(string3, "getString(...)");
        return string3;
    }

    public final String v1() {
        String strA = ((J1) this.f12585X.getValue()).a();
        j.f(strA, "getSourceKey(...)");
        if (strA.equals("AMLC")) {
            return "AMLC_RESTART";
        }
        if (strA.equals("SSNE")) {
            return "SSNE_RESTART";
        }
        String string = getString(R.string.maya_kyc_amlc_page_name_label);
        j.f(string, "getString(...)");
        return string;
    }

    public final void w1(String action, String destination) {
        String string;
        j.g(action, "action");
        j.g(destination, "destination");
        C1220i c1220iN1 = n1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(p1());
        c1219hD.s(v1());
        c1219hD.n(18);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String strU1 = u1();
        HashMap map = c1219hD.j;
        map.put("page_name", strU1);
        map.put("button", action);
        String strA = ((J1) this.f12585X.getValue()).a();
        j.f(strA, "getSourceKey(...)");
        if (strA.equals("AMLC")) {
            string = getString(R.string.maya_kyc_amlc_page_name_label);
            j.f(string, "getString(...)");
        } else if (strA.equals("SSNE")) {
            string = getString(R.string.maya_kyc_ssne_page_name_label);
            j.f(string, "getString(...)");
        } else {
            string = getString(R.string.maya_kyc_amlc_page_name_label);
            j.f(string, "getString(...)");
        }
        map.put("destination_page", string);
        map.put("path", "TOFU 1.0");
        com.paymaya.data.preference.a aVar = this.f12583V;
        if (aVar == null) {
            j.n("mPreference");
            throw null;
        }
        map.put("kyc_status", aVar.l());
        c1219hD.i();
        c1220iN1.c(activity, c1219hD);
    }
}
