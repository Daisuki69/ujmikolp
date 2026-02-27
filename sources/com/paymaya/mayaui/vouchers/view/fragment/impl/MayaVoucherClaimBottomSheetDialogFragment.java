package com.paymaya.mayaui.vouchers.view.fragment.impl;

import Ah.p;
import Bb.f;
import D8.C0214w;
import Dc.c;
import Fc.a;
import Gc.b;
import Je.d;
import N5.C0462k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseBottomSheetDialogFragment;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.J;
import com.paymaya.domain.model.Voucher;
import com.paymaya.domain.model.VoucherDenomination;
import com.paymaya.domain.model.VoucherRedeemTransaction;
import com.paymaya.domain.store.c1;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherClaimBottomSheetDialogFragment;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.nio.charset.Charset;
import kotlin.jvm.internal.j;
import org.json.JSONException;
import org.json.JSONObject;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaVoucherClaimBottomSheetDialogFragment extends BaseBottomSheetDialogFragment implements a {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0462k f14277Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public f f14278R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ConstraintLayout f14279S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Button f14280T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Button f14281U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f14282V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f14283W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f14284X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Group f14285Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public b f14286Z;

    public static final void o1(MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment) {
        mayaVoucherClaimBottomSheetDialogFragment.dismiss();
        f fVar = mayaVoucherClaimBottomSheetDialogFragment.f14278R;
        if (fVar == null) {
            j.n("mMayaVerifiedSellerSheetDialogFragmentPresenter");
            throw null;
        }
        a aVar = (a) fVar.c.get();
        Voucher voucher = (Voucher) fVar.e;
        if (voucher == null) {
            j.n("voucher");
            throw null;
        }
        MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment2 = (MayaVoucherClaimBottomSheetDialogFragment) aVar;
        mayaVoucherClaimBottomSheetDialogFragment2.getClass();
        b bVar = mayaVoucherClaimBottomSheetDialogFragment2.f14286Z;
        if (bVar != null) {
            C0214w c0214wP1 = ((MayaVoucherDetailsFragment) bVar).P1();
            ((MayaBaseFragment) ((Fc.b) c0214wP1.c.get())).E1();
            c1 c1Var = (c1) c0214wP1.f;
            String strMCode = voucher.mCode();
            c1Var.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", strMCode);
            } catch (JSONException unused) {
                yk.a.e();
            }
            p<VoucherRedeemTransaction> pVarCreateRedeemVoucher = c1Var.f11431b.createRedeemVoucher(d.a(jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
            new Lh.d(new Lh.d(new Lh.d(AbstractC1331a.l(pVarCreateRedeemVoucher, pVarCreateRedeemVoucher, zh.b.a()), new Dc.a(c0214wP1, 1), 2), new Dc.b(c0214wP1, 1), 0), new c(c0214wP1, 1), 1).e();
        }
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment
    public final EnumC1215d l1() {
        return EnumC1215d.VOUCHER;
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10239K.i();
        this.f10240P = true;
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
        this.f10238B = (C1220i) W4.a.e().C().f4756a.f4716g.get();
        this.f14278R = new f(2);
        this.f14286Z = (b) getParentFragment();
        f fVar = this.f14278R;
        if (fVar != null) {
            fVar.h(this);
        } else {
            j.n("mMayaVerifiedSellerSheetDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new Fa.c(this, 5));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_claim_confirm, viewGroup, false);
        int i = R.id.claim_confirm_amount_group;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_amount_group);
        if (group != null) {
            i = R.id.claim_confirm_amount_label;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_amount_label)) != null) {
                i = R.id.claim_confirm_divider1;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_divider1);
                if (viewFindChildViewById != null) {
                    i = R.id.claim_confirm_divider2;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_divider2);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.claim_confirm_name_label;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_name_label)) != null) {
                            i = R.id.claim_confirm_ref_label;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_ref_label)) != null) {
                                i = R.id.claim_confirm_title_text_view;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_title_text_view)) != null) {
                                    i = R.id.claim_confirm_voucher_amount_text_view;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_voucher_amount_text_view);
                                    if (textView != null) {
                                        i = R.id.claim_confirm_voucher_cancel_button;
                                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_voucher_cancel_button);
                                        if (button != null) {
                                            i = R.id.claim_confirm_voucher_confirm_button;
                                            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_voucher_confirm_button);
                                            if (button2 != null) {
                                                i = R.id.claim_confirm_voucher_confirm_buttons_guideline;
                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_voucher_confirm_buttons_guideline)) != null) {
                                                    i = R.id.claim_confirm_voucher_name_text_view;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_voucher_name_text_view);
                                                    if (textView2 != null) {
                                                        i = R.id.claim_confirm_voucher_ref_text_view;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.claim_confirm_voucher_ref_text_view);
                                                        if (textView3 != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                            i = R.id.voucher_claim_container;
                                                            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.voucher_claim_container)) != null) {
                                                                i = R.id.voucher_half_guideline;
                                                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.voucher_half_guideline)) != null) {
                                                                    this.f14277Q = new C0462k(constraintLayout, group, viewFindChildViewById, viewFindChildViewById2, textView, button, button2, textView2, textView3, constraintLayout);
                                                                    j.f(constraintLayout, "getRoot(...)");
                                                                    return constraintLayout;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f14278R;
        if (fVar == null) {
            j.n("mMayaVerifiedSellerSheetDialogFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Voucher voucher;
        String strMStringValue;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0462k c0462k = this.f14277Q;
        j.d(c0462k);
        this.f14279S = (ConstraintLayout) c0462k.f;
        C0462k c0462k2 = this.f14277Q;
        j.d(c0462k2);
        this.f14280T = (Button) c0462k2.j;
        C0462k c0462k3 = this.f14277Q;
        j.d(c0462k3);
        this.f14281U = (Button) c0462k3.f4134k;
        C0462k c0462k4 = this.f14277Q;
        j.d(c0462k4);
        this.f14282V = (TextView) c0462k4.f4132d;
        C0462k c0462k5 = this.f14277Q;
        j.d(c0462k5);
        this.f14283W = (TextView) c0462k5.c;
        C0462k c0462k6 = this.f14277Q;
        j.d(c0462k6);
        this.f14284X = (TextView) c0462k6.e;
        C0462k c0462k7 = this.f14277Q;
        j.d(c0462k7);
        this.f14285Y = (Group) c0462k7.f4133g;
        Button button = this.f14280T;
        if (button == null) {
            j.n("mButtonCancel");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: Gc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaVoucherClaimBottomSheetDialogFragment f1958b;

            {
                this.f1958b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment = this.f1958b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaVoucherClaimBottomSheetDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment2 = this.f1958b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaVoucherClaimBottomSheetDialogFragment.o1(mayaVoucherClaimBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f14281U;
        if (button2 == null) {
            j.n("mButtonConfirm");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: Gc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaVoucherClaimBottomSheetDialogFragment f1958b;

            {
                this.f1958b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment = this.f1958b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaVoucherClaimBottomSheetDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        MayaVoucherClaimBottomSheetDialogFragment mayaVoucherClaimBottomSheetDialogFragment2 = this.f1958b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaVoucherClaimBottomSheetDialogFragment.o1(mayaVoucherClaimBottomSheetDialogFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (voucher = (Voucher) arguments.getParcelable("voucher")) == null) {
            return;
        }
        f fVar = this.f14278R;
        if (fVar == null) {
            j.n("mMayaVerifiedSellerSheetDialogFragmentPresenter");
            throw null;
        }
        fVar.j();
        fVar.e = voucher;
        VoucherDenomination voucherDenominationMDenomination = voucher.mDenomination();
        if (voucherDenominationMDenomination != null && (((strMStringValue = voucherDenominationMDenomination.mStringValue()) != null && !C2576A.H(strMStringValue)) || "AMOUNT".equalsIgnoreCase(voucherDenominationMDenomination.mType()))) {
            a aVar = (a) fVar.c.get();
            String strH = AbstractC1414e.h("₱", J.f10420a.format(voucherDenominationMDenomination.mValue()));
            TextView textView = ((MayaVoucherClaimBottomSheetDialogFragment) aVar).f14283W;
            if (textView == null) {
                j.n("mTextAmount");
                throw null;
            }
            textView.setText(strH);
            Group group = ((MayaVoucherClaimBottomSheetDialogFragment) ((a) fVar.c.get())).f14285Y;
            if (group == null) {
                j.n("mAmountGroup");
                throw null;
            }
            group.setVisibility(0);
        }
        a aVar2 = (a) fVar.c.get();
        String strMCampaignName = voucher.mCampaignName();
        TextView textView2 = ((MayaVoucherClaimBottomSheetDialogFragment) aVar2).f14282V;
        if (textView2 == null) {
            j.n("mTextName");
            throw null;
        }
        textView2.setText(strMCampaignName);
        a aVar3 = (a) fVar.c.get();
        String strMCode = voucher.mCode();
        TextView textView3 = ((MayaVoucherClaimBottomSheetDialogFragment) aVar3).f14284X;
        if (textView3 != null) {
            textView3.setText(strMCode);
        } else {
            j.n("mTextRef");
            throw null;
        }
    }
}
