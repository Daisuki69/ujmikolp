package com.paymaya.ui.ekyc.view.fragment.impl;

import O5.a;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.data.database.repository.C1238b;
import com.paymaya.domain.model.AccountUsage;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.EDDUsage;
import com.paymaya.domain.store.C1255e;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import kotlin.jvm.internal.j;
import sd.C2253b;
import sd.C2254c;
import yd.InterfaceC2529b;
import zd.InterfaceC2560d;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class EDDAccountUsageFragment extends BaseFragment implements InterfaceC2529b {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C2253b f14513S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public InterfaceC2560d f14514T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public AlertDialog f14515U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f14516V;

    @BindView(R.id.pma_fragment_edd_account_usage_primary_use_edit_text)
    public TextInputEditText mPrimaryUseEditText;

    @BindView(R.id.pma_fragment_edd_account_usage_primary_use_other_edit_text)
    public TextInputEditText mPrimaryUseOtherEditText;

    @BindView(R.id.pma_fragment_edd_account_usage_primary_use_other_text_input_layout)
    public TextInputLayout mPrimaryUseOtherTextInputLayout;

    @BindView(R.id.pma_fragment_edd_account_usage_primary_use_text_input_layout)
    public TextInputLayout mPrimaryUseTextInputLayout;

    @BindView(R.id.pma_fragment_edd_account_usage_purpose_edit_text)
    public TextInputEditText mPurposeEditText;

    @BindView(R.id.pma_fragment_edd_account_usage_purpose_text_input_layout)
    public TextInputLayout mPurposeTextInputLayout;

    @BindView(R.id.pma_fragment_edd_account_usage_remittance_edit_text)
    public TextInputEditText mRemittanceEditText;

    @BindView(R.id.pma_fragment_edd_account_usage_remittance_group)
    public Group mRemittanceGroup;

    @BindView(R.id.pma_fragment_edd_account_usage_remittance_text_input_layout)
    public TextInputLayout mRemittanceTextInputLayout;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.PRIMARY_USAGE;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14514T = (InterfaceC2560d) getActivity();
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14513S = new C2253b(new C1255e((C1238b) aVar.f4654A0.get(), (PayMayaClientApi) aVar.f4745w.get(), (com.paymaya.data.preference.a) aVar.e.get()));
        r1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_account_usage, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        r1().i();
        super.onDestroy();
    }

    @OnClick({R.id.pma_fragment_edd_account_usage_next})
    public void onNextClicked() {
        boolean z4;
        this.f14516V = true;
        C2253b c2253bR1 = r1();
        TextInputEditText textInputEditText = ((EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get())).mPrimaryUseEditText;
        if (textInputEditText == null) {
            j.n("mPrimaryUseEditText");
            throw null;
        }
        if (C2576A.H(String.valueOf(textInputEditText.getText()))) {
            EDDAccountUsageFragment eDDAccountUsageFragment = (EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get());
            TextInputLayout textInputLayout = eDDAccountUsageFragment.mPrimaryUseTextInputLayout;
            if (textInputLayout == null) {
                j.n("mPrimaryUseTextInputLayout");
                throw null;
            }
            textInputLayout.setHintEnabled(false);
            TextInputLayout textInputLayout2 = eDDAccountUsageFragment.mPrimaryUseTextInputLayout;
            if (textInputLayout2 == null) {
                j.n("mPrimaryUseTextInputLayout");
                throw null;
            }
            textInputLayout2.setError(eDDAccountUsageFragment.getString(R.string.pma_error_missing_this_field_p));
            z4 = false;
        } else {
            z4 = true;
        }
        TextInputEditText textInputEditText2 = ((EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get())).mPrimaryUseOtherEditText;
        if (textInputEditText2 == null) {
            j.n("mPrimaryUseOtherEditText");
            throw null;
        }
        if (C2576A.H(String.valueOf(textInputEditText2.getText())) && c2253bR1.e) {
            EDDAccountUsageFragment eDDAccountUsageFragment2 = (EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get());
            eDDAccountUsageFragment2.s1().setHintEnabled(false);
            eDDAccountUsageFragment2.s1().setError(eDDAccountUsageFragment2.getString(R.string.pma_error_missing_this_field_p));
            z4 = false;
        }
        TextInputEditText textInputEditText3 = ((EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get())).mRemittanceEditText;
        if (textInputEditText3 == null) {
            j.n("mRemittanceEditText");
            throw null;
        }
        if (C2576A.H(String.valueOf(textInputEditText3.getText())) && c2253bR1.f) {
            EDDAccountUsageFragment eDDAccountUsageFragment3 = (EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get());
            TextInputLayout textInputLayout3 = eDDAccountUsageFragment3.mRemittanceTextInputLayout;
            if (textInputLayout3 == null) {
                j.n("mRemittanceTextInputLayout");
                throw null;
            }
            textInputLayout3.setHintEnabled(false);
            TextInputLayout textInputLayout4 = eDDAccountUsageFragment3.mRemittanceTextInputLayout;
            if (textInputLayout4 == null) {
                j.n("mRemittanceTextInputLayout");
                throw null;
            }
            textInputLayout4.setError(eDDAccountUsageFragment3.getString(R.string.pma_error_missing_this_field_p));
            z4 = false;
        }
        TextInputEditText textInputEditText4 = ((EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get())).mPurposeEditText;
        if (textInputEditText4 == null) {
            j.n("mPurposeEditText");
            throw null;
        }
        if (C2576A.H(String.valueOf(textInputEditText4.getText())) && c2253bR1.f) {
            EDDAccountUsageFragment eDDAccountUsageFragment4 = (EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get());
            TextInputLayout textInputLayout5 = eDDAccountUsageFragment4.mPurposeTextInputLayout;
            if (textInputLayout5 == null) {
                j.n("mPurposeTextInputLayout");
                throw null;
            }
            textInputLayout5.setHintEnabled(false);
            TextInputLayout textInputLayout6 = eDDAccountUsageFragment4.mPurposeTextInputLayout;
            if (textInputLayout6 == null) {
                j.n("mPurposeTextInputLayout");
                throw null;
            }
            textInputLayout6.setError(eDDAccountUsageFragment4.getString(R.string.pma_error_missing_this_field_p));
            z4 = false;
        }
        if (z4) {
            InterfaceC2560d interfaceC2560d = ((EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get())).f14514T;
            EDD edd = interfaceC2560d != null ? ((EDDActivity) interfaceC2560d).t1().i : null;
            if (edd != null) {
                edd.setUsage(c2253bR1.k());
            } else {
                edd = null;
            }
            InterfaceC2560d interfaceC2560d2 = ((EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get())).f14514T;
            if (interfaceC2560d2 != null) {
                C2254c c2254cT1 = ((EDDActivity) interfaceC2560d2).t1();
                if (edd != null) {
                    c2254cT1.i = edd;
                }
            }
            InterfaceC2560d interfaceC2560d3 = ((EDDAccountUsageFragment) ((InterfaceC2529b) c2253bR1.c.get())).f14514T;
            if (interfaceC2560d3 != null) {
                ((EDDActivity) interfaceC2560d3).w1();
            }
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        TextInputEditText textInputEditText5 = this.mPrimaryUseOtherEditText;
        if (textInputEditText5 == null) {
            j.n("mPrimaryUseOtherEditText");
            throw null;
        }
        TextInputEditText textInputEditText6 = this.mRemittanceEditText;
        if (textInputEditText6 == null) {
            j.n("mRemittanceEditText");
            throw null;
        }
        TextInputEditText textInputEditText7 = this.mPurposeEditText;
        if (textInputEditText7 == null) {
            j.n("mPurposeEditText");
            throw null;
        }
        View[] viewArr = {textInputEditText5, textInputEditText6, textInputEditText7};
        for (int i = 0; i < 3; i++) {
            C.Q(fragmentActivityRequireActivity, viewArr[i]);
        }
    }

    @OnClick({R.id.pma_fragment_edd_account_usage_primary_use_edit_text})
    public void onPrimaryUseClicked() {
        AlertDialog alertDialog = this.f14515U;
        if (alertDialog != null) {
            alertDialog.show();
        }
    }

    @OnFocusChange({R.id.pma_fragment_edd_account_usage_primary_use_edit_text})
    public void onPrimaryUseFocusChanged(View view, boolean z4) {
        AlertDialog alertDialog;
        j.g(view, "view");
        if (!z4 || (alertDialog = this.f14515U) == null) {
            return;
        }
        alertDialog.show();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2560d interfaceC2560d = this.f14514T;
        if (interfaceC2560d != null) {
            ((EDDActivity) interfaceC2560d).Q(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        j.g(outState, "outState");
        outState.putParcelable("account_usage", r1().f20037g);
        outState.putParcelable("edd_usage", r1().k());
        super.onSaveInstanceState(outState);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        r1().j();
        TextInputEditText textInputEditText = this.mPrimaryUseEditText;
        if (textInputEditText == null) {
            j.n("mPrimaryUseEditText");
            throw null;
        }
        textInputEditText.setInputType(0);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("account_usage");
            j.d(parcelable);
            Parcelable parcelable2 = bundle.getParcelable("edd_usage");
            j.d(parcelable2);
            EDDUsage eDDUsage = (EDDUsage) parcelable2;
            r1().m((AccountUsage) parcelable);
            C2253b c2253bR1 = r1();
            if (c2253bR1.e) {
                InterfaceC2529b interfaceC2529b = (InterfaceC2529b) c2253bR1.c.get();
                String name = eDDUsage.getName();
                TextInputEditText textInputEditText2 = ((EDDAccountUsageFragment) interfaceC2529b).mPrimaryUseOtherEditText;
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(name);
                    return;
                } else {
                    j.n("mPrimaryUseOtherEditText");
                    throw null;
                }
            }
            if (c2253bR1.f) {
                InterfaceC2529b interfaceC2529b2 = (InterfaceC2529b) c2253bR1.c.get();
                String remitTo = eDDUsage.getRemitTo();
                TextInputEditText textInputEditText3 = ((EDDAccountUsageFragment) interfaceC2529b2).mRemittanceEditText;
                if (textInputEditText3 == null) {
                    j.n("mRemittanceEditText");
                    throw null;
                }
                textInputEditText3.setText(remitTo);
                InterfaceC2529b interfaceC2529b3 = (InterfaceC2529b) c2253bR1.c.get();
                String purpose = eDDUsage.getPurpose();
                TextInputEditText textInputEditText4 = ((EDDAccountUsageFragment) interfaceC2529b3).mPurposeEditText;
                if (textInputEditText4 != null) {
                    textInputEditText4.setText(purpose);
                } else {
                    j.n("mPurposeEditText");
                    throw null;
                }
            }
        }
    }

    public final C2253b r1() {
        C2253b c2253b = this.f14513S;
        if (c2253b != null) {
            return c2253b;
        }
        j.n("mEDDAccountUsageFragmentPresenter");
        throw null;
    }

    public final TextInputLayout s1() {
        TextInputLayout textInputLayout = this.mPrimaryUseOtherTextInputLayout;
        if (textInputLayout != null) {
            return textInputLayout;
        }
        j.n("mPrimaryUseOtherTextInputLayout");
        throw null;
    }
}
