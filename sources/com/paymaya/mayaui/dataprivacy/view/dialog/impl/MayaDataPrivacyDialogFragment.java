package com.paymaya.mayaui.dataprivacy.view.dialog.impl;

import E8.D;
import Ke.d;
import M7.c;
import P7.a;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.store.C1284t;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaDataPrivacyDialogFragment extends MayaBaseDialogFragment implements a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Q7.a f12266R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f12267S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public c f12268T;

    public final String n1() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("source") : null;
        return string == null ? "" : string;
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().l().f4755a;
        this.f10330B = (C1220i) aVar.f4716g.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1284t c1284tJ = aVar.j();
        j.g(preference, "preference");
        this.f12268T = new c(preference, c1284tJ, 0);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.dataprivacy.view.dialog.impl.MayaDataPrivacyDialogFragment.MayaDataPrivacyDialogFragmentListener");
        this.f12266R = (Q7.a) activity;
        c cVar = this.f12268T;
        if (cVar == null) {
            j.n("mPresenter");
            throw null;
        }
        cVar.h(this);
        c cVar2 = this.f12268T;
        if (cVar2 != null) {
            cVar2.j();
        } else {
            j.n("mPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(requireContext()).setTitle(this.f12267S).setMessage(getString(R.string.maya_label_data_privacy_and_terms_of_service_update_spiel)).setPositiveButton(getString(R.string.maya_label_view_terms_and_conditions), new D(this, 1)).create();
        j.f(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        C1220i c1220iL1 = l1();
        FragmentActivity activity = getActivity();
        C1219h c1219hE = C1219h.e("LOGIN_DATA_PRIVACY_DIALOG_APPEARED");
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = C2576A.b0(d.a(n1())).toString();
        HashMap map = c1219hE.j;
        map.put("page_name", string);
        map.put("modal", "Data privacy");
        c1219hE.i();
        c1220iL1.c(activity, c1219hE);
    }
}
