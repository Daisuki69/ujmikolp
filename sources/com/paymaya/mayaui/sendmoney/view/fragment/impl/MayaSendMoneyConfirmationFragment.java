package com.paymaya.mayaui.sendmoney.view.fragment.impl;

import Ag.d;
import Ah.p;
import Bb.e;
import Fb.a;
import Gb.b;
import Kh.T;
import M8.A0;
import N5.H;
import We.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.datasource.cache.c;
import androidx.viewbinding.ViewBindings;
import androidx.webkit.ProxyConfig;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.i0;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.OTP;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PersonalizationPayMaya;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferPersonalization;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.model.TransferToken;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.V0;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d4.AbstractC1331a;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.HashMap;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;
import w.C2360b;
import w.C2361c;
import y5.AbstractC2509a;
import y5.f;
import zj.C2576A;
import zj.C2578C;
import zj.o;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class MayaSendMoneyConfirmationFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public H f13749U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f13750V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13751W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13752X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f13753Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f13754Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public TextView f13755a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f13756b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ImageView f13757c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public View f13758d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Group f13759e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public e f13760f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public b f13761g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public d f13762h0;

    public static final void K1(MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment) {
        TransferToken transferTokenMTransferToken;
        Transfer transferH1;
        TransferToken transferTokenMTransferToken2;
        String strI;
        String strMValue;
        int i = 8;
        int i4 = 2;
        int i6 = 1;
        int i10 = 0;
        String strMId = null;
        if (mayaSendMoneyConfirmationFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
            Transfer transferH12 = mayaSendMoneyConfirmationFragment.H1();
            String strMAuthChallengeId = transferH12 != null ? transferH12.mAuthChallengeId() : null;
            mayaSendMoneyConfirmationFragment.I1("Send now", (strMAuthChallengeId == null || strMAuthChallengeId.length() == 0) ? "Send Money Confirmation Screen" : "OTP Screen");
        } else {
            C1220i c1220iO1 = mayaSendMoneyConfirmationFragment.o1();
            FragmentActivity activity = mayaSendMoneyConfirmationFragment.getActivity();
            C1219h c1219hD = C1219h.d(mayaSendMoneyConfirmationFragment.u1());
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.SEND);
            c1220iO1.c(activity, c1219hD);
        }
        e eVar = (e) mayaSendMoneyConfirmationFragment.G1();
        ((MayaBaseFragment) ((a) eVar.c.get())).E1();
        Transfer transfer = ((MayaSendMoneyConfirmationFragment) ((a) eVar.c.get())).H1();
        String strMAuthChallengeId2 = transfer != null ? transfer.mAuthChallengeId() : null;
        if (strMAuthChallengeId2 != null && !C2576A.H(strMAuthChallengeId2)) {
            j.g(transfer, "transfer");
            TransferRecipient transferRecipientMTransferRecipient = transfer.mTransferRecipient();
            if (transferRecipientMTransferRecipient == null || (strI = transferRecipientMTransferRecipient.mValue()) == null) {
                strI = "";
            }
            o oVar = Ke.d.f2649a;
            if ((strI.length() <= 1 || C2578C.c0(strI) != '@') && strI.length() > 4) {
                strI = s.i(z.r(strI.length() - 4, ProxyConfig.MATCH_ALL_SCHEMES), C2578C.f0(4, strI));
            }
            Amount amountMTransferAmount = transfer.mTransferAmount();
            String strMCurrency = amountMTransferAmount != null ? amountMTransferAmount.mCurrency() : null;
            if (amountMTransferAmount != null && (strMValue = amountMTransferAmount.mValue()) != null) {
                try {
                    strMId = new DecimalFormat("#,###.00").format(Double.parseDouble(new o("[^\\d.]").f("", strMValue)));
                    j.f(strMId, "format(...)");
                } catch (Exception unused) {
                    strMId = "";
                }
            }
            HashMap mapQ = c.q("recipient", strI, "amount", androidx.camera.core.impl.a.j(strMCurrency, Global.BLANK, strMId));
            String strR = eVar.j.r();
            C1278p0 c1278p0 = eVar.f398g;
            c1278p0.getClass();
            p<MFAChallengeInformation> pVarStartMFAChallenge = c1278p0.f11471b.startMFAChallenge("p2p", strMAuthChallengeId2, RequestBody.create(f.f21063a, A0.h(strR, mapQ)));
            eVar.e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarStartMFAChallenge, pVarStartMFAChallenge, zh.b.a()), new Bb.d(eVar, transfer, i10), i4), new Bb.d(eVar, transfer, i6), i10).e());
            return;
        }
        if (!eVar.j.e().isSendMoneyP2PConfigEnabled() || (transferH1 = ((MayaSendMoneyConfirmationFragment) ((a) eVar.c.get())).H1()) == null || !transferH1.isForAuthentication()) {
            V0 v02 = eVar.f397d;
            Transfer transferH13 = ((MayaSendMoneyConfirmationFragment) ((a) eVar.c.get())).H1();
            if (transferH13 != null && (transferTokenMTransferToken = transferH13.mTransferToken()) != null) {
                strMId = transferTokenMTransferToken.mId();
            }
            String strB = i0.b();
            String strH = eVar.j.h();
            v02.getClass();
            p<Transfer> pVarExecuteP2PTransferV3WithTransferId = v02.f11400b.executeP2PTransferV3WithTransferId(strMId, Je.d.a(new byte[0]), strB, strH, "2.153.0", "android");
            eVar.e(new Lh.d(new Lh.d(AbstractC1331a.l(pVarExecuteP2PTransferV3WithTransferId, pVarExecuteP2PTransferV3WithTransferId, zh.b.a()), new J5.a(eVar, 9), i4), new J5.c(eVar, i), i10).e());
            return;
        }
        C1278p0 c1278p02 = eVar.f398g;
        Transfer transferH14 = ((MayaSendMoneyConfirmationFragment) ((a) eVar.c.get())).H1();
        if (transferH14 != null && (transferTokenMTransferToken2 = transferH14.mTransferToken()) != null) {
            strMId = transferTokenMTransferToken2.mId();
        }
        c1278p02.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("transfer_id", strMId);
        } catch (JSONException unused2) {
            yk.a.e();
        }
        p<OTP> pVarTransferOTPP2P = c1278p02.c.transferOTPP2P(RequestBody.create(f.f21063a, jSONObject.toString().getBytes(Charset.forName("UTF-8"))));
        eVar.e(new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarTransferOTPP2P, pVarTransferOTPP2P, zh.b.a()), new C2360b(eVar, 7), i4), new C2361c(eVar, i), i10), new Bb.b(eVar, 0)).e());
    }

    public static final void L1(MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment) {
        String decorationId;
        Amount amountBuild;
        String strMMessage;
        TransferPersonalization transferPersonalizationMPersonalization;
        TransferPersonalizationMeta meta;
        PersonalizationPayMaya mayaDecoration;
        if (mayaSendMoneyConfirmationFragment.t1().e().isAppEventV2SendMoneyEnabled()) {
            mayaSendMoneyConfirmationFragment.I1(Ke.d.a("PREVIEW"), "Preview Screen");
        }
        e eVar = (e) mayaSendMoneyConfirmationFragment.G1();
        Transfer transferH1 = ((MayaSendMoneyConfirmationFragment) ((a) eVar.c.get())).H1();
        String str = "";
        if (transferH1 == null || (transferPersonalizationMPersonalization = transferH1.mPersonalization()) == null || (meta = transferPersonalizationMPersonalization.getMeta()) == null || (mayaDecoration = meta.getMayaDecoration()) == null || (decorationId = mayaDecoration.getDecorationId()) == null) {
            decorationId = "";
        }
        Decoration decorationB = eVar.i.b(decorationId);
        if (decorationB != null) {
            a aVar = (a) eVar.c.get();
            Transfer transferH12 = ((MayaSendMoneyConfirmationFragment) ((a) eVar.c.get())).H1();
            if (transferH12 == null || (amountBuild = transferH12.mTransferAmount()) == null) {
                amountBuild = Amount.sBuilder().mCurrency("PHP").mValue("").build();
                j.f(amountBuild, "build(...)");
            }
            Transfer transferH13 = ((MayaSendMoneyConfirmationFragment) ((a) eVar.c.get())).H1();
            if (transferH13 != null && (strMMessage = transferH13.mMessage()) != null) {
                str = strMMessage;
            }
            MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment2 = (MayaSendMoneyConfirmationFragment) aVar;
            mayaSendMoneyConfirmationFragment2.getClass();
            b bVar = mayaSendMoneyConfirmationFragment2.f13761g0;
            if (bVar != null) {
                ((MayaSendMoneyActivity) bVar).b2(decorationB, amountBuild, str);
            } else {
                j.n("mMayaSendMoneyConfirmationFragmentListener");
                throw null;
            }
        }
    }

    public final Ab.a G1() {
        e eVar = this.f13760f0;
        if (eVar != null) {
            return eVar;
        }
        j.n("mIMayaSendMoneyConfirmationFragmentPresenter");
        throw null;
    }

    public final Transfer H1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Transfer) arguments.getParcelable("transfer_confirmation");
        }
        return null;
    }

    public final void I1(String str, String str2) {
        b bVar = this.f13761g0;
        if (bVar == null) {
            j.n("mMayaSendMoneyConfirmationFragmentListener");
            throw null;
        }
        String str3 = ((MayaSendMoneyActivity) bVar).f13744u;
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("SEND_MONEY_CONFIRMATION_" + EnumC1212a.BUTTON + Global.UNDERSCORE + AbstractC1173g.G(18));
        HashMap map = c1219hE.j;
        map.put("source_page", str3);
        map.put("button", str);
        map.put("destination_page", str2);
        c1220iO1.b(c1219hE);
    }

    public final void J1(PayMayaError payMayaError) {
        C1220i c1220iO1 = o1();
        C1219h c1219hE = C1219h.e("SEND_MONEY_CONFIRMATION_".concat(AbstractC1173g.G(27)));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        b bVar = this.f13761g0;
        if (bVar == null) {
            j.n("mMayaSendMoneyConfirmationFragmentListener");
            throw null;
        }
        String str = ((MayaSendMoneyActivity) bVar).f13744u;
        HashMap map = c1219hE.j;
        map.put("source_page", str);
        map.put("error_reason", payMayaError.mSpiel());
        map.put(StateEvent.Name.ERROR_CODE, String.valueOf(payMayaError.mErrorCode()));
        c1220iO1.b(c1219hE);
    }

    public final void M1(String message) {
        j.g(message, "message");
        TextView textView = this.f13756b0;
        if (textView == null) {
            j.n("mTextViewMessage");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = this.f13756b0;
        if (textView2 != null) {
            textView2.setText(message);
        } else {
            j.n("mTextViewMessage");
            throw null;
        }
    }

    public final void N1(String primary) {
        j.g(primary, "primary");
        TextView textView = this.f13752X;
        if (textView != null) {
            textView.setText(primary);
        } else {
            j.n("mTextViewDestinationPrimary");
            throw null;
        }
    }

    public final void O1(String str) {
        TextView textView = this.f13753Y;
        if (textView != null) {
            textView.setText(str);
        } else {
            j.n("mTextViewDestinationSecondary");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONFIRMATION;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.sendmoney.view.fragment.impl.MayaSendMoneyConfirmationFragment.MayaSendMoneyConfirmationFragmentListener");
        this.f13761g0 = (b) activity;
        O5.a aVar = W4.a.e().x().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f13760f0 = new e(aVar.T(), aVar.q(), aVar.X(), aVar.E(), aVar.v(), aVar.o(), (com.paymaya.data.preference.a) aVar.e.get(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) G1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_send_money_confirmation, viewGroup, false);
        int i = R.id.barrier_bottom_notes_section_content;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_bottom_notes_section_content)) != null) {
            i = R.id.barrier_destination;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_destination)) != null) {
                i = R.id.barrier_source;
                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_source)) != null) {
                    i = R.id.barrier_transaction_fee;
                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_transaction_fee)) != null) {
                        i = R.id.button_send_money;
                        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_send_money);
                        if (button != null) {
                            i = R.id.group_decoration;
                            Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_decoration);
                            if (group != null) {
                                i = R.id.guideline_labels;
                                if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guideline_labels)) != null) {
                                    i = R.id.image_view_decoration;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_decoration);
                                    if (imageView != null) {
                                        i = R.id.image_view_green_arrow;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_green_arrow);
                                        if (imageView2 != null) {
                                            i = R.id.labels_content_bottom_space_view;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.labels_content_bottom_space_view);
                                            if (viewFindChildViewById != null) {
                                                i = R.id.scroll_view_send_money_confirmation;
                                                if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_send_money_confirmation)) != null) {
                                                    i = R.id.space_bottom_notes_section;
                                                    if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_bottom_notes_section)) != null) {
                                                        i = R.id.space_top_notes_section;
                                                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.space_top_notes_section)) != null) {
                                                            i = R.id.text_view_amount;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount);
                                                            if (textView != null) {
                                                                i = R.id.text_view_confirm_transaction;
                                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirm_transaction)) != null) {
                                                                    i = R.id.text_view_destination_label;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_label)) != null) {
                                                                        i = R.id.text_view_destination_primary;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_primary);
                                                                        if (textView2 != null) {
                                                                            i = R.id.text_view_destination_secondary;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_secondary);
                                                                            if (textView3 != null) {
                                                                                i = R.id.text_view_destination_verified_seller;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_destination_verified_seller);
                                                                                if (textView4 != null) {
                                                                                    i = R.id.text_view_message;
                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_message);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.text_view_powered_by_giphy_label;
                                                                                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_powered_by_giphy_label);
                                                                                        if (appCompatTextView != null) {
                                                                                            i = R.id.text_view_source_label;
                                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_label)) != null) {
                                                                                                i = R.id.text_view_source_number;
                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_number);
                                                                                                if (textView6 != null) {
                                                                                                    i = R.id.text_view_source_value;
                                                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_source_value)) != null) {
                                                                                                        i = R.id.text_view_transaction_fee_label;
                                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_fee_label)) != null) {
                                                                                                            i = R.id.text_view_transaction_fee_value;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_transaction_fee_value);
                                                                                                            if (textView7 != null) {
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
                                                                                                                                i = R.id.view_information_background;
                                                                                                                                View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.view_information_background);
                                                                                                                                if (viewFindChildViewById4 != null) {
                                                                                                                                    i = R.id.view_notes_decoration_background;
                                                                                                                                    View viewFindChildViewById5 = ViewBindings.findChildViewById(viewInflate, R.id.view_notes_decoration_background);
                                                                                                                                    if (viewFindChildViewById5 != null) {
                                                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                                                                                                        this.f13749U = new H(constraintLayout, button, group, imageView, imageView2, viewFindChildViewById, textView, textView2, textView3, textView4, textView5, appCompatTextView, textView6, textView7, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) G1()).i();
        super.onDestroy();
        this.f13749U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.f13761g0;
        if (bVar == null) {
            j.n("mMayaSendMoneyConfirmationFragmentListener");
            throw null;
        }
        ((MayaSendMoneyActivity) bVar).Q(this);
        d dVar = this.f13762h0;
        if (dVar != null) {
            dVar.invoke(this);
        }
        this.f13762h0 = null;
        if (t1().e().isAppEventV2SendMoneyEnabled()) {
            b bVar2 = this.f13761g0;
            if (bVar2 == null) {
                j.n("mMayaSendMoneyConfirmationFragmentListener");
                throw null;
            }
            String str = ((MayaSendMoneyActivity) bVar2).f13744u;
            C1220i c1220iO1 = o1();
            C1219h c1219h = new C1219h();
            HashMap map = c1219h.j;
            c1219h.p(EnumC1215d.SEND_MONEY_CONFIRMATION);
            c1219h.n(2);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            map.put("source_page", str);
            TextView textView = this.f13751W;
            if (textView == null) {
                j.n("mTextViewSourceNumber");
                throw null;
            }
            map.put("source_account", AbstractC1213b.M("\\s+", textView.getText().toString(), ""));
            TextView textView2 = this.f13750V;
            if (textView2 == null) {
                j.n("mTextViewAmount");
                throw null;
            }
            map.put("amount", textView2.getText().toString());
            TextView textView3 = this.f13756b0;
            if (textView3 == null) {
                j.n("mTextViewMessage");
                throw null;
            }
            map.put("note", textView3.getText().toString());
            c1220iO1.b(c1219h);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        H h = this.f13749U;
        j.d(h);
        this.f13750V = h.c;
        this.f13751W = (TextView) h.f3639o;
        this.f13755a0 = (TextView) h.f3640p;
        this.f13754Z = (TextView) h.j;
        this.f13756b0 = (TextView) h.f3636k;
        this.f13752X = h.f;
        this.f13753Y = h.f3635g;
        this.f13757c0 = (ImageView) h.f3641q;
        this.f13758d0 = h.m;
        this.f13759e0 = (Group) h.f3638n;
        final int i = 0;
        ((Button) h.f3634d).setOnClickListener(new View.OnClickListener(this) { // from class: Gb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyConfirmationFragment f1940b;

            {
                this.f1940b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = this.f1940b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyConfirmationFragment.K1(mayaSendMoneyConfirmationFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment2 = this.f1940b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaSendMoneyConfirmationFragment.L1(mayaSendMoneyConfirmationFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        View view2 = this.f13758d0;
        if (view2 == null) {
            j.n("mViewNotesDecorationBackground");
            throw null;
        }
        final int i4 = 1;
        view2.setOnClickListener(new View.OnClickListener(this) { // from class: Gb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaSendMoneyConfirmationFragment f1940b;

            {
                this.f1940b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view22) {
                switch (i4) {
                    case 0:
                        MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment = this.f1940b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaSendMoneyConfirmationFragment.K1(mayaSendMoneyConfirmationFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaSendMoneyConfirmationFragment mayaSendMoneyConfirmationFragment2 = this.f1940b;
                        Callback.onClick_enter(view22);
                        try {
                            MayaSendMoneyConfirmationFragment.L1(mayaSendMoneyConfirmationFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        ((e) G1()).j();
    }
}
