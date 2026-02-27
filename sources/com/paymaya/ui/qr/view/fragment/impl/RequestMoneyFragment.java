package com.paymaya.ui.qr.view.fragment.impl;

import G5.C0256f;
import Y6.o;
import Zd.g;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.video.AudioStats;
import butterknife.BindView;
import butterknife.OnClick;
import ce.f;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.TransferAppLink;
import com.paymaya.ui.common.view.dialog.impl.ErrorDialogFragment;
import com.paymaya.ui.qr.view.activity.impl.RequestMoneyActivity;
import de.t;
import io.flutter.plugins.firebase.crashlytics.Constants;
import v.AbstractC2329d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class RequestMoneyFragment extends BaseFragment implements f {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public g f14713S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public t f14714T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0256f f14715U;

    @BindView(R.id.continue_button_pma_fragment_request_money)
    Button mButtonContinue;

    @BindView(R.id.amount_edit_text_pma_fragment_request_money)
    EditText mEditTextAmount;

    @BindView(R.id.message_edit_text_pma_fragment_request_money)
    EditText mEditTextMessage;

    @BindView(R.id.amount_text_input_layout_pma_fragment_request_money)
    TextInputLayout mTextInputLayoutAmount;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.FORM;
    }

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        String strS1;
        g gVar = this.f14713S;
        String strR1 = ((RequestMoneyFragment) ((f) gVar.c.get())).r1();
        if ((strR1 == null || C2576A.H(strR1)) && ((strS1 = ((RequestMoneyFragment) ((f) gVar.c.get())).s1()) == null || C2576A.H(strS1))) {
            return false;
        }
        RequestMoneyFragment requestMoneyFragment = (RequestMoneyFragment) ((f) gVar.c.get());
        AlertDialog.Builder builder = new AlertDialog.Builder(requestMoneyFragment.getActivity());
        View viewInflate = LayoutInflater.from(requestMoneyFragment.getContext()).inflate(R.layout.pma_dialog_leaving_warning, (ViewGroup) null);
        builder.setView(viewInflate);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        View viewFindViewById = viewInflate.findViewById(R.id.no_text_view_pma_dialog_leaving_warning);
        View viewFindViewById2 = viewInflate.findViewById(R.id.yes_text_view_pma_dialog_leaving_warning);
        viewFindViewById.setOnClickListener(new Na.a(alertDialogCreate, 3));
        viewFindViewById2.setOnClickListener(new o(requestMoneyFragment, 26));
        alertDialogCreate.show();
        return true;
    }

    @OnClick({R.id.continue_button_pma_fragment_request_money})
    public void onContinueClicked() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.CONTINUE);
        o1(c1219hH);
        this.f14715U.a();
        g gVar = this.f14713S;
        String strR1 = ((RequestMoneyFragment) ((f) gVar.c.get())).r1();
        Double dF = C.F(strR1);
        String strS1 = ((RequestMoneyFragment) ((f) gVar.c.get())).s1();
        if (strR1 == null || C2576A.H(strR1)) {
            RequestMoneyFragment requestMoneyFragment = (RequestMoneyFragment) ((f) gVar.c.get());
            String string = requestMoneyFragment.getString(R.string.pma_toast_error_enter_amount);
            C1219h c1219hH2 = AbstractC2329d.h(12);
            c1219hH2.t(EnumC1217f.SHARE);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH2.j.put(Constants.REASON, string);
            requestMoneyFragment.o1(c1219hH2);
            requestMoneyFragment.t1(requestMoneyFragment.getString(R.string.pma_toast_error_title_request_money_error), string);
            return;
        }
        if (dF.doubleValue() <= AudioStats.AUDIO_AMPLITUDE_NONE) {
            RequestMoneyFragment requestMoneyFragment2 = (RequestMoneyFragment) ((f) gVar.c.get());
            String string2 = requestMoneyFragment2.getString(R.string.pma_toast_error_enter_amount);
            C1219h c1219hH3 = AbstractC2329d.h(12);
            c1219hH3.t(EnumC1217f.SHARE);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            c1219hH3.j.put(Constants.REASON, string2);
            requestMoneyFragment2.o1(c1219hH3);
            requestMoneyFragment2.t1(requestMoneyFragment2.getString(R.string.pma_toast_error_title_request_money_error), string2);
            return;
        }
        TransferAppLink.Builder builderMRecipient = TransferAppLink.sBuilder().mAmount(dF.toString()).mCurrency("PHP").mAccountType("PAYMAYA").mRecipient(gVar.f6930d.r());
        if (strS1 != null && !C2576A.H(strS1)) {
            builderMRecipient.mMessage(strS1);
        }
        f fVar = (f) gVar.c.get();
        TransferAppLink transferAppLinkBuild = builderMRecipient.build();
        RequestMoneyActivity requestMoneyActivity = (RequestMoneyActivity) ((RequestMoneyFragment) fVar).f14714T;
        requestMoneyActivity.getClass();
        RequestMoneySuccessFragment requestMoneySuccessFragment = new RequestMoneySuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("transfer_app_link", transferAppLinkBuild);
        requestMoneySuccessFragment.setArguments(bundle);
        AbstractC1236z.h(requestMoneyActivity, R.id.pma_activity_request_money_fragment_container, requestMoneySuccessFragment);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        O5.a aVar = (O5.a) W4.a.e().E().c;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14713S = new g((com.paymaya.data.preference.a) aVar.e.get());
        this.f14714T = (t) getActivity();
        this.f14713S.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_request_money, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((RequestMoneyActivity) this.f14714T).Q(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f14713S.j();
        C0256f c0256f = new C0256f(this.mEditTextAmount, AudioStats.AUDIO_AMPLITUDE_NONE, 50000.0d);
        this.f14715U = c0256f;
        c0256f.m = new b(this);
        this.mEditTextAmount.addTextChangedListener(c0256f);
    }

    public final String r1() {
        return this.mEditTextAmount.getText().toString().trim();
    }

    public final String s1() {
        return this.mEditTextMessage.getText().toString().trim();
    }

    public final void t1(String str, String str2) {
        RequestMoneyActivity requestMoneyActivity = (RequestMoneyActivity) this.f14714T;
        requestMoneyActivity.getClass();
        ErrorDialogFragment errorDialogFragment = new ErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putString("message", str2);
        errorDialogFragment.setArguments(bundle);
        errorDialogFragment.show(requestMoneyActivity.getSupportFragmentManager(), "error_dialog");
    }
}
