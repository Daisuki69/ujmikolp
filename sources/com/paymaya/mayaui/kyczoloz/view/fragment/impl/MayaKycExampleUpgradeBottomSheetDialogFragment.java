package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import Fa.c;
import M8.C0332a;
import M8.U0;
import N5.C0481u;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBindingBottomSheetDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycExampleUpgradeBottomSheetDialogFragment extends MayaBaseBindingBottomSheetDialogFragment<C0481u> {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12536U;

    public MayaKycExampleUpgradeBottomSheetDialogFragment() {
        super(U0.f3231a);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10325B = (C1220i) ((O5.a) W4.a.e().f().c).f4716g.get();
        a aVar = new a(14);
        this.f12536U = aVar;
        aVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new c(this, 9));
        return dialogOnCreateDialog;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f12536U;
        if (aVar == null) {
            j.n("mKycExampleUpgradeBottomSheetDialogFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C.r0(((C0481u) s1()).f4219b, new C0332a(this, 5));
    }
}
