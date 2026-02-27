package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Ae.a;
import Fa.c;
import H8.b;
import K8.P;
import M8.C0332a;
import M8.U2;
import N5.C0483v;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBindingBottomSheetDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycRule;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import kotlin.jvm.internal.j;
import kotlin.text.MatchResult;
import yj.h;
import yj.i;
import zj.o;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycValidationRulesBottomSheetDialogFragment extends MayaBaseBindingBottomSheetDialogFragment<C0483v> implements P {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12647U;

    public MayaKycValidationRulesBottomSheetDialogFragment() {
        super(U2.f3233a);
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return EnumC1216e.PERSONAL_INFORMATION_NAME_RULES;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        this.f10325B = (C1220i) ((O5.a) W4.a.e().f().c).f4716g.get();
        a aVar = new a(20);
        this.f12647U = aVar;
        aVar.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.setOnShowListener(new c(this, 10));
        return dialogOnCreateDialog;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f12647U;
        if (aVar == null) {
            j.n("mPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        KycCmsContentData data;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = this.f12647U;
        KycRule rule = null;
        if (aVar == null) {
            j.n("mPresenter");
            throw null;
        }
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        KycCmsContent kycCmsContent = ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f;
        if (kycCmsContent != null && (data = kycCmsContent.getData()) != null) {
            rule = data.getRule();
        }
        aVar.j();
        if (rule != null) {
            P p10 = (P) aVar.c.get();
            String header = rule.getHeader();
            if (header == null) {
                header = "";
            }
            MayaKycValidationRulesBottomSheetDialogFragment mayaKycValidationRulesBottomSheetDialogFragment = (MayaKycValidationRulesBottomSheetDialogFragment) p10;
            mayaKycValidationRulesBottomSheetDialogFragment.getClass();
            ((C0483v) mayaKycValidationRulesBottomSheetDialogFragment.s1()).c.setText(header);
            P p11 = (P) aVar.c.get();
            String value = rule.getValue();
            String str = value != null ? value : "";
            MayaKycValidationRulesBottomSheetDialogFragment mayaKycValidationRulesBottomSheetDialogFragment2 = (MayaKycValidationRulesBottomSheetDialogFragment) p11;
            mayaKycValidationRulesBottomSheetDialogFragment2.getClass();
            i iVarC = o.c(str, new o("\n\n.*\n"));
            TextView textView = ((C0483v) mayaKycValidationRulesBottomSheetDialogFragment2.s1()).f4232d;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            h hVar = new h(iVarC);
            while (hVar.hasNext()) {
                MatchResult matchResult = (MatchResult) hVar.next();
                spannableStringBuilder.setSpan(new StyleSpan(1), matchResult.b().f18201a, matchResult.b().f18202b, 18);
            }
            textView.setText(spannableStringBuilder);
        }
        C.r0(((C0483v) s1()).f4231b, new C0332a(this, 14));
    }
}
