package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Bb.f;
import Fa.c;
import K8.InterfaceC0288m;
import M8.C0332a;
import M8.C0376l;
import M8.C0381m0;
import M8.C0385n0;
import N5.r;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavArgsLazy;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBindingBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.e0;
import com.paymaya.data.preference.a;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycDnfbpWhyNeededBottomSheetDialogFragment extends MayaBaseBindingBottomSheetDialogFragment<r> implements InterfaceC0288m {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public f f12512U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a f12513V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final NavArgsLazy f12514W;

    public MayaKycDnfbpWhyNeededBottomSheetDialogFragment() {
        super(C0381m0.f3335a);
        this.f12514W = new NavArgsLazy(z.a(C0385n0.class), new C0376l(this, 4));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10325B = (C1220i) aVar.f4716g.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(resourceManager, "resourceManager");
        this.f12512U = new f(resourceManager, 1);
        this.f12513V = (a) aVar.e.get();
        f fVar = this.f12512U;
        if (fVar == null) {
            j.n("mKycDnfbpWhyNeededBottomSheetDialogFragmentPresenter");
            throw null;
        }
        fVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new c(this, 8));
        return dialogOnCreateDialog;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f12512U;
        if (fVar == null) {
            j.n("mKycDnfbpWhyNeededBottomSheetDialogFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220iN1 = n1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(p1());
        c1219hD.s((String) t1().f18160a);
        c1219hD.n(3);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String str = (String) t1().f18161b;
        HashMap map = c1219hD.j;
        map.put("page_name", str);
        map.put("path", "TOFU 1.0");
        a aVar = this.f12513V;
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
        ((r) s1()).f4191b.setOnClickListener(new Ke.a(0, new C0332a(this, 2)));
        f fVar = this.f12512U;
        if (fVar != null) {
            fVar.j();
        } else {
            j.n("mKycDnfbpWhyNeededBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }

    public final Pair t1() {
        String strA = ((C0385n0) this.f12514W.getValue()).a();
        j.f(strA, "getSourceKey(...)");
        return strA.equals("AMLC") ? new Pair("AMLC_TOOLTIP", getString(R.string.maya_kyc_amlc_page_name_label)) : strA.equals("SSNE") ? new Pair("SSNE_TOOLTIP", getString(R.string.maya_kyc_ssne_page_name_label)) : new Pair("AMLC_TOOLTIP", getString(R.string.maya_kyc_amlc_page_name_label));
    }
}
