package com.paymaya.mayaui.banktransfer.view.fragment.impl;

import Ah.p;
import Lh.d;
import M8.A0;
import N5.H;
import We.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.BankTransferV3Recipient;
import com.paymaya.domain.model.FavoriteStatus;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.Q;
import com.paymaya.domain.store.V0;
import com.paymaya.mayaui.banktransfer.view.activity.impl.MayaBankTransferActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import com.squareup.wire.internal.a;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import n6.InterfaceC1930a;
import o6.C1967a;
import o6.C1968b;
import o6.c;
import okhttp3.RequestBody;
import q6.C2164a;
import q6.C2165b;
import s6.InterfaceC2240a;
import t6.InterfaceC2270a;
import y5.AbstractC2509a;
import y5.f;
import zh.b;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankTransferConfirmationFragment extends MayaBaseFragment implements InterfaceC2240a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public H f11536U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f11537V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11538W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11539X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f11540Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f11541Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f11542a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f11543b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public TextView f11544c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Button f11545d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public c f11546e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public InterfaceC2270a f11547f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public a f11548g0;

    public static final void I1(MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment) {
        String account;
        String str;
        int i = 2;
        int i4 = 1;
        int i6 = 0;
        if (mayaBankTransferConfirmationFragment.t1().e().isAppEventV2BankTransferEnabled()) {
            InterfaceC2270a interfaceC2270a = mayaBankTransferConfirmationFragment.f11547f0;
            if (interfaceC2270a == null || (str = ((MayaBankTransferActivity) interfaceC2270a).f11535r) == null) {
                str = "Bank Transfer Form Screen";
            }
            C1220i c1220iO1 = mayaBankTransferConfirmationFragment.o1();
            C1219h c1219hE = C1219h.e("BANK_TRANSFER_CONFIRMATION_" + EnumC1212a.BUTTON + Global.UNDERSCORE + AbstractC1173g.G(18));
            HashMap map = c1219hE.j;
            map.put("source_page", str);
            map.put("button", "Transfer now");
            map.put("destination_page", "OTP Screen");
            c1220iO1.b(c1219hE);
        } else {
            C1220i c1220iO12 = mayaBankTransferConfirmationFragment.o1();
            FragmentActivity activity = mayaBankTransferConfirmationFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaBankTransferConfirmationFragment.u1());
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.SEND);
            c1220iO12.c(activity, c1219hD);
        }
        c cVar = (c) mayaBankTransferConfirmationFragment.G1();
        Bundle arguments = ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).getArguments();
        BankTransferV3CreateResponse bankTransfer = arguments != null ? (BankTransferV3CreateResponse) arguments.getParcelable("bank_transfer_create") : null;
        ((MayaBaseFragment) ((InterfaceC2240a) cVar.c.get())).E1();
        String authChallengeId = bankTransfer != null ? bankTransfer.getAuthChallengeId() : null;
        if (authChallengeId == null) {
            V0 v02 = cVar.f18786d;
            Bundle arguments2 = ((MayaBankTransferConfirmationFragment) ((InterfaceC2240a) cVar.c.get())).getArguments();
            BankTransferV3CreateResponse bankTransferV3CreateResponse = arguments2 != null ? (BankTransferV3CreateResponse) arguments2.getParcelable("bank_transfer_create") : null;
            p<BankTransferV3> pVarExecuteBankTransferV3 = v02.f11400b.executeBankTransferV3(bankTransferV3CreateResponse != null ? bankTransferV3CreateResponse.getId() : null);
            cVar.e(new d(new d(AbstractC1331a.l(pVarExecuteBankTransferV3, pVarExecuteBankTransferV3, b.a()), new C1967a(cVar, i6), i), new M(cVar, 22), i6).e());
            return;
        }
        j.g(bankTransfer, "bankTransfer");
        BankTransferV3Recipient recipient = bankTransfer.getBankTransfer().getRecipient();
        String strF0 = (recipient == null || (account = recipient.getAccount()) == null) ? null : C2578C.f0(4, account);
        Amount amount = bankTransfer.getBankTransfer().getAmount();
        HashMap mapQ = androidx.media3.datasource.cache.c.q("last_four_digits", strF0, "amount", amount != null ? amount.getCurrencyFormattedValue() : null);
        C1278p0 c1278p0 = cVar.e;
        c1278p0.getClass();
        p<MFAChallengeInformation> pVarStartMFAChallenge = c1278p0.f11471b.startMFAChallenge("instapay", authChallengeId, RequestBody.create(f.f21063a, A0.h(null, mapQ)));
        cVar.e(new d(new d(AbstractC1331a.l(pVarStartMFAChallenge, pVarStartMFAChallenge, b.a()), new C1968b(cVar, bankTransfer, i6), i), new C1968b(cVar, bankTransfer, i4), i6).e());
    }

    public final InterfaceC1930a G1() {
        c cVar = this.f11546e0;
        if (cVar != null) {
            return cVar;
        }
        j.n("mBankTransferConfirmationFragmentPresenter");
        throw null;
    }

    public final void H1(PayMayaError payMayaError, String str) {
        String str2;
        InterfaceC2270a interfaceC2270a = this.f11547f0;
        if (interfaceC2270a == null || (str2 = ((MayaBankTransferActivity) interfaceC2270a).f11535r) == null) {
            str2 = "Bank Transfer Form Screen";
        }
        C1220i c1220iO1 = o1();
        StringBuilder sbV = s.v(str, Global.UNDERSCORE);
        sbV.append(AbstractC1173g.G(27));
        C1219h c1219hE = C1219h.e(sbV.toString());
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hE.j;
        map.put("source_page", str2);
        map.put("error_reason", payMayaError.mSpiel());
        map.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError.mErrorCode()));
        c1220iO1.b(c1219hE);
    }

    public final void J1(BankTransferV3 transfer, boolean z4, boolean z5) {
        int i = 0;
        j.g(transfer, "transfer");
        InterfaceC2270a interfaceC2270a = this.f11547f0;
        if (interfaceC2270a != null) {
            MayaBankTransferActivity mayaBankTransferActivity = (MayaBankTransferActivity) interfaceC2270a;
            if (mayaBankTransferActivity.p1().e().isAppEventV2BankTransferEnabled()) {
                C1220i c1220iK1 = mayaBankTransferActivity.k1();
                C1219h c1219hE = C1219h.e("BANK_TRANSFER_PROCESSING_".concat(AbstractC1173g.G(2)));
                EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                c1219hE.j.put("source_page", "Bank Transfer Confirmation Screen");
                c1220iK1.b(c1219hE);
            }
            String string = mayaBankTransferActivity.getString(R.string.maya_label_youre_almost_there);
            j.f(string, "getString(...)");
            MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragmentC = N4.d.c(R.drawable.maya_ic_processing_white, string, mayaBankTransferActivity.getString(R.string.maya_format_bank_transfer_processing_description, transfer.getLastFourDigitAccount()), mayaBankTransferActivity.getString(R.string.maya_label_done), mayaBankTransferActivity.getString(R.string.maya_label_view_receipt), !z4 ? FavoriteStatus.FAVORITE_NOT_CREATED : z5 ? FavoriteStatus.FAVORITE_UPDATE_SUCCESS : FavoriteStatus.FAVORITE_UPDATE_FAILURE);
            mayaPostTransactionBottomSheetDialogFragmentC.f11880e0 = new C2164a(mayaBankTransferActivity, i);
            mayaPostTransactionBottomSheetDialogFragmentC.f11881f0 = new C2165b(mayaBankTransferActivity, transfer, i);
            EnumC1215d enumC1215d = EnumC1215d.BANK_TRANSFER;
            mayaPostTransactionBottomSheetDialogFragmentC.f11877b0 = true;
            mayaPostTransactionBottomSheetDialogFragmentC.f11878c0 = enumC1215d;
            mayaPostTransactionBottomSheetDialogFragmentC.f11879d0 = EnumC1216e.PROCESSING;
            mayaBankTransferActivity.f11534q = mayaPostTransactionBottomSheetDialogFragmentC;
            mayaPostTransactionBottomSheetDialogFragmentC.show(mayaBankTransferActivity.getSupportFragmentManager(), "success_dialog");
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11547f0 = (InterfaceC2270a) getActivity();
        O5.a aVar = W4.a.e().h().f4753a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        V0 v0T = aVar.T();
        C1278p0 c1278p0E = aVar.E();
        Q q9 = aVar.q();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f11546e0 = new c(v0T, c1278p0E, q9, preference, sessionSubject);
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_bank_transfer_confirmation, viewGroup, false);
        int i = R.id.barrier_destination;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_destination)) != null) {
            i = R.id.barrier_purpose;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_purpose)) != null) {
                i = R.id.barrier_source;
                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_source)) != null) {
                    i = R.id.barrier_transfer_amount;
                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_transfer_amount)) != null) {
                        i = R.id.barrier_transfer_fee;
                        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_transfer_fee)) != null) {
                            i = R.id.button_transfer_now;
                            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_transfer_now);
                            if (button != null) {
                                i = R.id.guideline_labels;
                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_labels)) != null) {
                                    i = R.id.labels_content_bottom_space_view;
                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.labels_content_bottom_space_view);
                                    if (viewFindChildViewById != null) {
                                        i = R.id.scroll_view_bank_transfer_confirmation;
                                        if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_bank_transfer_confirmation)) != null) {
                                            i = R.id.text_view_amount;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount);
                                            if (textView != null) {
                                                i = R.id.text_view_confirm_transaction;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirm_transaction)) != null) {
                                                    i = R.id.text_view_destination_account_name;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_account_name);
                                                    if (textView2 != null) {
                                                        i = R.id.text_view_destination_account_number;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_account_number);
                                                        if (textView3 != null) {
                                                            i = R.id.text_view_destination_bank_name;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_bank_name);
                                                            if (textView4 != null) {
                                                                i = R.id.text_view_destination_label;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_label)) != null) {
                                                                    i = R.id.text_view_purpose_label;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_purpose_label)) != null) {
                                                                        i = R.id.text_view_purpose_value;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_purpose_value);
                                                                        if (textView5 != null) {
                                                                            i = R.id.text_view_source_label;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_label)) != null) {
                                                                                i = R.id.text_view_source_number;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_number);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.text_view_source_value;
                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_value)) != null) {
                                                                                        i = R.id.text_view_transfer_amount;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_amount)) != null) {
                                                                                            i = R.id.text_view_transfer_amount_value;
                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_amount_value);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.text_view_transfer_fee;
                                                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_fee)) != null) {
                                                                                                    i = R.id.text_view_transfer_fee_value;
                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_fee_value);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.text_view_transfer_note;
                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_note)) != null) {
                                                                                                            i = R.id.text_view_transfer_note_header;
                                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transfer_note_header)) != null) {
                                                                                                                i = R.id.view_divider_destination;
                                                                                                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_destination);
                                                                                                                if (viewFindChildViewById2 != null) {
                                                                                                                    i = R.id.view_divider_source;
                                                                                                                    View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_source);
                                                                                                                    if (viewFindChildViewById3 != null) {
                                                                                                                        i = R.id.view_divider_transfer_amount;
                                                                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_transfer_amount);
                                                                                                                        if (viewFindChildViewById4 != null) {
                                                                                                                            i = R.id.view_divider_transfer_fee;
                                                                                                                            View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_divider_transfer_fee);
                                                                                                                            if (viewFindChildViewById5 != null) {
                                                                                                                                i = R.id.view_information_background;
                                                                                                                                View viewFindChildViewById6 = ViewBindings.findChildViewById(viewInflate, R.id.view_information_background);
                                                                                                                                if (viewFindChildViewById6 != null) {
                                                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                                    this.f11536U = new H(constraintLayout, button, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5, viewFindChildViewById6);
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
        this.f11536U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        String string;
        String str;
        BankTransferV3 bankTransfer;
        BankTransferV3Recipient recipient;
        super.onResume();
        InterfaceC2270a interfaceC2270a = this.f11547f0;
        if (interfaceC2270a != null) {
            ((MayaBankTransferActivity) interfaceC2270a).Q(this);
        }
        a aVar = this.f11548g0;
        if (aVar != null) {
            aVar.invoke(this);
        }
        this.f11548g0 = null;
        if (t1().e().isAppEventV2BankTransferEnabled()) {
            Bundle arguments = getArguments();
            BankTransferV3CreateResponse bankTransferV3CreateResponse = arguments != null ? (BankTransferV3CreateResponse) arguments.getParcelable("bank_transfer_create") : null;
            if (bankTransferV3CreateResponse == null || (bankTransfer = bankTransferV3CreateResponse.getBankTransfer()) == null || (recipient = bankTransfer.getRecipient()) == null || (string = recipient.getInstitutionCode()) == null) {
                TextView textView = this.f11540Y;
                if (textView == null) {
                    j.n("mTextViewBankName");
                    throw null;
                }
                string = textView.getText().toString();
            }
            InterfaceC2270a interfaceC2270a2 = this.f11547f0;
            if (interfaceC2270a2 == null || (str = ((MayaBankTransferActivity) interfaceC2270a2).f11535r) == null) {
                str = "Bank Transfer Form Screen";
            }
            C1220i c1220iO1 = o1();
            C1219h c1219h = new C1219h();
            HashMap map = c1219h.j;
            c1219h.p(EnumC1215d.BANK_TRANSFER_CONFIRMATION);
            c1219h.n(2);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            map.put("source_page", str);
            TextView textView2 = this.f11544c0;
            if (textView2 == null) {
                j.n("mTextViewSource");
                throw null;
            }
            map.put("source_account", AbstractC1213b.M("\\s+", textView2.getText().toString(), ""));
            map.put("target_bank", string);
            TextView textView3 = this.f11538W;
            if (textView3 == null) {
                j.n("mTextViewTransferAmount");
                throw null;
            }
            map.put("amount", textView3.getText().toString());
            TextView textView4 = this.f11539X;
            if (textView4 == null) {
                j.n("mTextViewTransferFee");
                throw null;
            }
            map.put("fee", textView4.getText().toString());
            TextView textView5 = this.f11543b0;
            if (textView5 == null) {
                j.n("mTextViewPurpose");
                throw null;
            }
            map.put("purpose", textView5.getText().toString());
            c1220iO1.b(c1219h);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String formattedValue;
        String formattedValue2;
        Double valueAsDouble;
        Double valueAsDouble2;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        H h = this.f11536U;
        j.d(h);
        this.f11537V = h.c;
        H h6 = this.f11536U;
        j.d(h6);
        this.f11538W = (TextView) h6.f3640p;
        H h7 = this.f11536U;
        j.d(h7);
        this.f11539X = (TextView) h7.f3641q;
        H h8 = this.f11536U;
        j.d(h8);
        this.f11540Y = (TextView) h8.j;
        H h10 = this.f11536U;
        j.d(h10);
        this.f11541Z = h10.f3635g;
        H h11 = this.f11536U;
        j.d(h11);
        this.f11542a0 = h11.f;
        H h12 = this.f11536U;
        j.d(h12);
        this.f11543b0 = (TextView) h12.f3636k;
        H h13 = this.f11536U;
        j.d(h13);
        this.f11544c0 = (TextView) h13.f3639o;
        H h14 = this.f11536U;
        j.d(h14);
        this.f11545d0 = (Button) h14.f3634d;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            BankTransferV3CreateResponse bankTransferV3CreateResponse = arguments != null ? (BankTransferV3CreateResponse) arguments.getParcelable("bank_transfer_create") : null;
            c cVar = (c) G1();
            cVar.j();
            InterfaceC2240a interfaceC2240a = (InterfaceC2240a) cVar.c.get();
            String strP = C.p(cVar.f18787g.r());
            TextView textView = ((MayaBankTransferConfirmationFragment) interfaceC2240a).f11544c0;
            if (textView == null) {
                j.n("mTextViewSource");
                throw null;
            }
            textView.setText(strP);
            if (bankTransferV3CreateResponse != null) {
                BankTransferV3Recipient recipient = bankTransferV3CreateResponse.getBankTransfer().getRecipient();
                if (recipient != null) {
                    InterfaceC2240a interfaceC2240a2 = (InterfaceC2240a) cVar.c.get();
                    String accountName = recipient.getAccountName();
                    TextView textView2 = ((MayaBankTransferConfirmationFragment) interfaceC2240a2).f11542a0;
                    if (textView2 == null) {
                        j.n("mTextViewAccountName");
                        throw null;
                    }
                    textView2.setText(accountName);
                    InterfaceC2240a interfaceC2240a3 = (InterfaceC2240a) cVar.c.get();
                    String bankName = recipient.getBankName();
                    TextView textView3 = ((MayaBankTransferConfirmationFragment) interfaceC2240a3).f11540Y;
                    if (textView3 == null) {
                        j.n("mTextViewBankName");
                        throw null;
                    }
                    textView3.setText(bankName);
                    InterfaceC2240a interfaceC2240a4 = (InterfaceC2240a) cVar.c.get();
                    String account = recipient.getAccount();
                    TextView textView4 = ((MayaBankTransferConfirmationFragment) interfaceC2240a4).f11541Z;
                    if (textView4 == null) {
                        j.n("mTextViewAccountNumber");
                        throw null;
                    }
                    textView4.setText(account);
                }
                InterfaceC2240a interfaceC2240a5 = (InterfaceC2240a) cVar.c.get();
                String purpose = bankTransferV3CreateResponse.getBankTransfer().getPurpose();
                TextView textView5 = ((MayaBankTransferConfirmationFragment) interfaceC2240a5).f11543b0;
                if (textView5 == null) {
                    j.n("mTextViewPurpose");
                    throw null;
                }
                textView5.setText(purpose);
                Amount amount = bankTransferV3CreateResponse.getBankTransfer().getAmount();
                double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
                double dDoubleValue2 = (amount == null || (valueAsDouble2 = amount.getValueAsDouble()) == null) ? 0.0d : valueAsDouble2.doubleValue();
                Amount fees = bankTransferV3CreateResponse.getFees();
                if (fees != null && (valueAsDouble = fees.getValueAsDouble()) != null) {
                    dDoubleValue = valueAsDouble.doubleValue();
                }
                String strU = C.u(Double.valueOf(dDoubleValue2 + dDoubleValue));
                InterfaceC2240a interfaceC2240a6 = (InterfaceC2240a) cVar.c.get();
                String strH = AbstractC1414e.h("₱", strU);
                TextView textView6 = ((MayaBankTransferConfirmationFragment) interfaceC2240a6).f11537V;
                if (textView6 == null) {
                    j.n("mTextViewAmount");
                    throw null;
                }
                textView6.setText(strH);
                InterfaceC2240a interfaceC2240a7 = (InterfaceC2240a) cVar.c.get();
                Amount amount2 = bankTransferV3CreateResponse.getBankTransfer().getAmount();
                String str = "";
                if (amount2 == null || (formattedValue = amount2.getFormattedValue()) == null) {
                    formattedValue = "";
                }
                String strConcat = "₱".concat(formattedValue);
                TextView textView7 = ((MayaBankTransferConfirmationFragment) interfaceC2240a7).f11538W;
                if (textView7 == null) {
                    j.n("mTextViewTransferAmount");
                    throw null;
                }
                textView7.setText(strConcat);
                InterfaceC2240a interfaceC2240a8 = (InterfaceC2240a) cVar.c.get();
                Amount fees2 = bankTransferV3CreateResponse.getFees();
                if (fees2 != null && (formattedValue2 = fees2.getFormattedValue()) != null) {
                    str = formattedValue2;
                }
                String strConcat2 = "₱".concat(str);
                TextView textView8 = ((MayaBankTransferConfirmationFragment) interfaceC2240a8).f11539X;
                if (textView8 == null) {
                    j.n("mTextViewTransferFee");
                    throw null;
                }
                textView8.setText(strConcat2);
            }
        }
        Button button = this.f11545d0;
        if (button != null) {
            button.setOnClickListener(new qf.d(this, 2));
        } else {
            j.n("mButtonTransfer");
            throw null;
        }
    }
}
