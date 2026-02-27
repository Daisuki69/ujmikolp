package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import K9.a;
import L9.C0325c;
import M8.C0332a;
import N5.I;
import P9.b;
import Q9.InterfaceC0574d;
import S5.c;
import Uh.d;
import We.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.CreditDisbursementCalculatedFees;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import defpackage.AbstractC1414e;
import java.text.DecimalFormat;
import kotlin.jvm.internal.j;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCreditConfirmTransferFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public I f13099U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f13100V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13101W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13102X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f13103Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13104Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13105a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f13106b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f13107c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Button f13108d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0325c f13109e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public InterfaceC0574d f13110f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final boolean f13111g0 = true;

    public final a G1() {
        C0325c c0325c = this.f13109e0;
        if (c0325c != null) {
            return c0325c;
        }
        j.n("mMayaCreditConfirmTransferFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        c flagConfigurationService = (c) aVar.f4724k.get();
        C1264i0 c1264i0A = aVar.A();
        d sessionPublishSubject = (d) aVar.f4748y.get();
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(sessionPublishSubject, "sessionPublishSubject");
        this.f13109e0 = new C0325c(flagConfigurationService, c1264i0A, sessionPublishSubject);
        this.f13110f0 = (InterfaceC0574d) getActivity();
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_credit_confirm_transfer_enhance, viewGroup, false);
        int i = R.id.confirm_transfer_label_text_view;
        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.confirm_transfer_label_text_view)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.destination_constraint_layout;
            if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.destination_constraint_layout)) != null) {
                i = R.id.destination_vertical_guideline;
                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.destination_vertical_guideline)) != null) {
                    i = R.id.divider_view;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.divider_view);
                    if (viewFindChildViewById != null) {
                        i = R.id.dst_label_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.dst_label_text_view)) != null) {
                            i = R.id.dst_value_text_view;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.dst_value_text_view);
                            if (textView != null) {
                                i = R.id.service_fee_label_text_view;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.service_fee_label_text_view);
                                if (textView2 != null) {
                                    i = R.id.service_fee_value_text_view;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.service_fee_value_text_view);
                                    if (textView3 != null) {
                                        i = R.id.source_constraint_layout;
                                        if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.source_constraint_layout)) != null) {
                                            i = R.id.total_credit_amount_label_text_view;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.total_credit_amount_label_text_view)) != null) {
                                                i = R.id.total_credit_amount_value_text_view;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.total_credit_amount_value_text_view);
                                                if (textView4 != null) {
                                                    i = R.id.transaction_amount_value_text_view;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_amount_value_text_view);
                                                    if (textView5 != null) {
                                                        i = R.id.transaction_destination_id_text_view;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_destination_id_text_view);
                                                        if (textView6 != null) {
                                                            i = R.id.transaction_destination_label_text_view;
                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_destination_label_text_view)) != null) {
                                                                i = R.id.transaction_destination_value_text_view;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_destination_value_text_view)) != null) {
                                                                    i = R.id.transaction_source_id_text_view;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_source_id_text_view);
                                                                    if (textView7 != null) {
                                                                        i = R.id.transaction_source_label_text_view;
                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_source_label_text_view)) != null) {
                                                                            i = R.id.transaction_source_value_text_view;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transaction_source_value_text_view)) != null) {
                                                                                i = R.id.transfer_amount_label_text_view;
                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transfer_amount_label_text_view)) != null) {
                                                                                    i = R.id.transfer_amount_value_text_view;
                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transfer_amount_value_text_view);
                                                                                    if (textView8 != null) {
                                                                                        i = R.id.transfer_now_button;
                                                                                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.transfer_now_button);
                                                                                        if (button != null) {
                                                                                            i = R.id.vertical_guideline;
                                                                                            if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.vertical_guideline)) != null) {
                                                                                                this.f13099U = new I(constraintLayout, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, button, 1);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
        this.f13099U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC0574d interfaceC0574d = this.f13110f0;
        if (interfaceC0574d != null) {
            ((NewMayaCreditActivity) interfaceC0574d).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        I i = this.f13099U;
        j.d(i);
        this.f13100V = (TextView) i.j;
        I i4 = this.f13099U;
        j.d(i4);
        this.f13101W = (TextView) i4.h;
        I i6 = this.f13099U;
        j.d(i6);
        this.f13102X = (TextView) i6.f3649k;
        I i10 = this.f13099U;
        j.d(i10);
        this.f13103Y = (TextView) i10.f3647d;
        I i11 = this.f13099U;
        j.d(i11);
        this.f13104Z = (TextView) i11.c;
        I i12 = this.f13099U;
        j.d(i12);
        this.f13105a0 = i12.f3646b;
        I i13 = this.f13099U;
        j.d(i13);
        this.f13106b0 = (TextView) i13.f3648g;
        I i14 = this.f13099U;
        j.d(i14);
        this.f13107c0 = (TextView) i14.i;
        I i15 = this.f13099U;
        j.d(i15);
        this.f13108d0 = (Button) i15.f3650l;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("wallet_id");
            String string2 = arguments.getString("activity_id");
            String string3 = arguments.getString("loan_id");
            String string4 = arguments.getString("promissory_note_number");
            CreditDisbursementCalculatedFees creditDisbursementCalculatedFees = (CreditDisbursementCalculatedFees) arguments.getParcelable("calculated_fees");
            String string5 = arguments.getString("recipient");
            if (creditDisbursementCalculatedFees != null) {
                C0325c c0325c = (C0325c) G1();
                c0325c.j();
                c0325c.f = string;
                c0325c.f2882g = string2;
                c0325c.h = string3;
                c0325c.i = creditDisbursementCalculatedFees.getCurrencyCode();
                c0325c.j = creditDisbursementCalculatedFees.getPrincipal();
                TextView textView = ((MayaCreditConfirmTransferFragment) ((b) c0325c.c.get())).f13100V;
                if (textView == null) {
                    j.n("mSourceId");
                    throw null;
                }
                textView.setText(string4);
                b bVar = (b) c0325c.c.get();
                Double principal = creditDisbursementCalculatedFees.getPrincipal();
                Double serviceFee = creditDisbursementCalculatedFees.getServiceFee();
                Double feeRate = creditDisbursementCalculatedFees.getFeeRate();
                Double dst = creditDisbursementCalculatedFees.getDst();
                Double total = creditDisbursementCalculatedFees.getTotal();
                MayaCreditConfirmTransferFragment mayaCreditConfirmTransferFragment = (MayaCreditConfirmTransferFragment) bVar;
                String string6 = mayaCreditConfirmTransferFragment.getString(R.string.maya_php_currency);
                j.f(string6, "getString(...)");
                String strI = s.i(string6, C.u(principal));
                String strI2 = s.i(string6, C.u(serviceFee));
                Double dValueOf = Double.valueOf(feeRate != null ? feeRate.doubleValue() * 100.0d : AudioStats.AUDIO_AMPLITUDE_NONE);
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String str = decimalFormat.format(dValueOf);
                if (!str.contains(".")) {
                    decimalFormat.applyPattern("#");
                    str = decimalFormat.format(dValueOf);
                }
                String string7 = mayaCreditConfirmTransferFragment.getString(R.string.maya_label_transfer_to_wallet_service_fee, str);
                j.f(string7, "getString(...)");
                String strI3 = s.i(string6, C.u(dst));
                String strI4 = s.i(string6, C.u(total));
                TextView textView2 = mayaCreditConfirmTransferFragment.f13101W;
                if (textView2 == null) {
                    j.n("mTransactionAmountLabel");
                    throw null;
                }
                textView2.setText(strI);
                TextView textView3 = mayaCreditConfirmTransferFragment.f13102X;
                if (textView3 == null) {
                    j.n("mAmountToBeTransferredValue");
                    throw null;
                }
                textView3.setText(strI);
                TextView textView4 = mayaCreditConfirmTransferFragment.f13103Y;
                if (textView4 == null) {
                    j.n("mServiceFeeValue");
                    throw null;
                }
                textView4.setText(strI2);
                TextView textView5 = mayaCreditConfirmTransferFragment.f13104Z;
                if (textView5 == null) {
                    j.n("mFeeRateLabel");
                    throw null;
                }
                textView5.setText(string7);
                TextView textView6 = mayaCreditConfirmTransferFragment.f13105a0;
                if (textView6 == null) {
                    j.n("mDocumentStampTaxValue");
                    throw null;
                }
                textView6.setText(strI3);
                TextView textView7 = mayaCreditConfirmTransferFragment.f13106b0;
                if (textView7 == null) {
                    j.n("mTotalCreditDueValue");
                    throw null;
                }
                textView7.setText(strI4);
                TextView textView8 = ((MayaCreditConfirmTransferFragment) ((b) c0325c.c.get())).f13107c0;
                if (textView8 == null) {
                    j.n("mDestinationId");
                    throw null;
                }
                textView8.setText(C.p(string5));
            }
        }
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        AbstractC1414e.m(c1219hD, EnumC1216e.TRANSFER_CONFIRMATION, 21);
        c1220iO1.c(activity, c1219hD);
        Button button = this.f13108d0;
        if (button != null) {
            Ke.b.b(button, new C0332a(this, 23));
        } else {
            j.n("mTransferNowButton");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13111g0;
    }
}
