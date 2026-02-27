package com.paymaya.ui.sendmoney.view.fragment.impl;

import G6.p;
import Lh.d;
import Lh.h;
import M8.T2;
import N5.D1;
import N5.I;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.h0;
import com.paymaya.domain.model.ActivityDescription;
import com.paymaya.domain.model.DecoratedActivity;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PersonalizationGiphy;
import com.paymaya.domain.model.SendMoneyCard;
import com.paymaya.domain.model.Transfer;
import com.paymaya.domain.model.TransferPersonalization;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.TransferRecipient;
import com.paymaya.domain.model.TransferSender;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.E;
import com.paymaya.domain.store.L;
import com.paymaya.domain.store.M;
import com.paymaya.domain.store.T;
import com.paymaya.ui.sendmoney.view.activity.impl.SendMoneyCardActivity;
import com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment;
import ha.u;
import java.util.Arrays;
import je.InterfaceC1679a;
import ke.InterfaceC1771b;
import kotlin.jvm.internal.j;
import zh.b;
import zj.z;

/* JADX INFO: loaded from: classes4.dex */
public class SendMoneyCardFragment extends BaseFragment implements InterfaceC1679a {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public D1 f14764S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final T f14765T = new T(this, 18);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public p f14766U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public InterfaceC1771b f14767V;

    public static final void s1(SendMoneyCardFragment sendMoneyCardFragment) {
        p pVar = sendMoneyCardFragment.f14766U;
        if (pVar == null) {
            j.n("mSendMoneyCardFragmentPresenter");
            throw null;
        }
        if (pVar.f) {
            Transfer transfer = (Transfer) pVar.f1808g;
            if (transfer != null) {
                InterfaceC1679a interfaceC1679a = (InterfaceC1679a) pVar.c.get();
                TransferSender transferSenderMTransferSender = transfer.mTransferSender();
                ((SendMoneyCardFragment) interfaceC1679a).w1(transferSenderMTransferSender != null ? transferSenderMTransferSender.mValue() : null, transfer.getFormattedAmount());
            }
            UserActivity userActivity = (UserActivity) pVar.h;
            if (userActivity != null) {
                InterfaceC1679a interfaceC1679a2 = (InterfaceC1679a) pVar.c.get();
                ActivityDescription activityDescriptionMDescription = userActivity.mDescription();
                ((SendMoneyCardFragment) interfaceC1679a2).w1(activityDescriptionMDescription != null ? activityDescriptionMDescription.mTarget() : null, userActivity.getAmountFormattedValue());
            }
            SendMoneyCard sendMoneyCard = (SendMoneyCard) pVar.i;
            if (sendMoneyCard != null) {
                ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).w1(sendMoneyCard.getSender(), sendMoneyCard.formattedAmount());
                return;
            }
            return;
        }
        Transfer transfer2 = (Transfer) pVar.f1808g;
        if (transfer2 != null) {
            InterfaceC1679a interfaceC1679a3 = (InterfaceC1679a) pVar.c.get();
            TransferRecipient transferRecipientMTransferRecipient = transfer2.mTransferRecipient();
            ((SendMoneyCardFragment) interfaceC1679a3).x1(transferRecipientMTransferRecipient != null ? transferRecipientMTransferRecipient.mValue() : null, transfer2.getFormattedAmount());
        }
        UserActivity userActivity2 = (UserActivity) pVar.h;
        if (userActivity2 != null) {
            InterfaceC1679a interfaceC1679a4 = (InterfaceC1679a) pVar.c.get();
            ActivityDescription activityDescriptionMDescription2 = userActivity2.mDescription();
            ((SendMoneyCardFragment) interfaceC1679a4).x1(activityDescriptionMDescription2 != null ? activityDescriptionMDescription2.mTarget() : null, userActivity2.getAmountFormattedValue());
        }
        SendMoneyCard sendMoneyCard2 = (SendMoneyCard) pVar.i;
        if (sendMoneyCard2 != null) {
            ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).x1(sendMoneyCard2.getRecipient(), sendMoneyCard2.formattedAmount());
        }
    }

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CARD;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        a aVar = W4.a.e().G().f4754a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14766U = new p(aVar.o());
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.sendmoney.view.fragment.impl.SendMoneyCardFragment.SendMoneyCardFragmentListener");
        this.f14767V = (InterfaceC1771b) activity;
        p pVar = this.f14766U;
        if (pVar != null) {
            pVar.h(this);
        } else {
            j.n("mSendMoneyCardFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_fragment_send_money_card, viewGroup, false);
        int i = R.id.bottom_gradient_pma_fragment_send_money_card;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.bottom_gradient_pma_fragment_send_money_card);
        if (viewFindChildViewById != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            i = R.id.done_text_pma_fragment_send_money_card;
            if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.done_text_pma_fragment_send_money_card)) != null) {
                i = R.id.done_view_group_pma_fragment_send_money_card;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.done_view_group_pma_fragment_send_money_card);
                if (frameLayout != null) {
                    i = R.id.end_guide_pma_fragment_send_money_card;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.end_guide_pma_fragment_send_money_card)) != null) {
                        i = R.id.label_guide_pma_fragment_send_money_card;
                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.label_guide_pma_fragment_send_money_card)) != null) {
                            i = R.id.layout_background_pma_fragment_send_money_card;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.layout_background_pma_fragment_send_money_card);
                            if (imageView != null) {
                                i = R.id.pma_view_card_layout;
                                View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.pma_view_card_layout);
                                if (viewFindChildViewById2 != null) {
                                    I iA = I.a(viewFindChildViewById2);
                                    i = R.id.progress_bar_pma_fragment_send_money_card;
                                    if (((ProgressBar) ViewBindings.findChildViewById(viewInflate, R.id.progress_bar_pma_fragment_send_money_card)) != null) {
                                        i = R.id.scroll_container_view_pma_fragment_send_money_card;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.scroll_container_view_pma_fragment_send_money_card);
                                        if (constraintLayout2 != null) {
                                            i = R.id.scroll_view_pma_fragment_send_money_card;
                                            if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_pma_fragment_send_money_card)) != null) {
                                                i = R.id.share_text_pma_fragment_send_money_card;
                                                if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.share_text_pma_fragment_send_money_card)) != null) {
                                                    i = R.id.share_view_group_pma_fragment_send_money_card;
                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.share_view_group_pma_fragment_send_money_card);
                                                    if (frameLayout2 != null) {
                                                        i = R.id.start_guide_pma_fragment_send_money_card;
                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.start_guide_pma_fragment_send_money_card)) != null) {
                                                            this.f14764S = new D1(constraintLayout, viewFindChildViewById, frameLayout, imageView, iA, constraintLayout2, frameLayout2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        p pVar = this.f14766U;
        if (pVar == null) {
            j.n("mSendMoneyCardFragmentPresenter");
            throw null;
        }
        pVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14764S = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String gifId;
        TransferPersonalizationMeta transferPersonalizationMetaMTransferPersonalizationMeta;
        PersonalizationGiphy gifDecoration;
        String decorationId;
        Decoration decorationMDecoration;
        TransferPersonalization transferPersonalizationMPersonalization;
        TransferPersonalization transferPersonalizationMPersonalization2;
        int i = 13;
        final int i4 = 1;
        final int i6 = 2;
        final int i10 = 0;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        SendMoneyCard sendMoneyCard = arguments != null ? (SendMoneyCard) arguments.getParcelable("send_money_card") : null;
        if (sendMoneyCard == null) {
            sendMoneyCard = null;
        }
        Bundle arguments2 = getArguments();
        Transfer transfer = arguments2 != null ? (Transfer) arguments2.getParcelable("transfer") : null;
        if (transfer == null) {
            transfer = null;
        }
        Bundle arguments3 = getArguments();
        UserActivity userActivity = arguments3 != null ? (UserActivity) arguments3.getParcelable("user_activity") : null;
        if (userActivity == null) {
            userActivity = null;
        }
        Bundle arguments4 = getArguments();
        boolean z4 = arguments4 != null ? arguments4.getBoolean("is_receiver") : false;
        p pVar = this.f14766U;
        if (pVar == null) {
            j.n("mSendMoneyCardFragmentPresenter");
            throw null;
        }
        pVar.f1808g = transfer;
        pVar.h = userActivity;
        pVar.i = sendMoneyCard;
        pVar.f = z4;
        String transaction_id = sendMoneyCard != null ? sendMoneyCard.getTransaction_id() : null;
        if (transfer == null || (transferPersonalizationMPersonalization2 = transfer.mPersonalization()) == null || (gifId = transferPersonalizationMPersonalization2.getGifId()) == null) {
            gifId = (userActivity == null || (transferPersonalizationMetaMTransferPersonalizationMeta = userActivity.mTransferPersonalizationMeta()) == null || (gifDecoration = transferPersonalizationMetaMTransferPersonalizationMeta.getGifDecoration()) == null) ? null : gifDecoration.getGifId();
        }
        if (transaction_id != null) {
            E e = (E) pVar.e;
            e.getClass();
            Ah.p<DecoratedActivity> decoratedTransactionById = e.f11345b.getDecoratedTransactionById(transaction_id);
            j.f(decoratedTransactionById, "getDecoratedTransactionById(...)");
            pVar.e(new d(new d(new h(decoratedTransactionById, b.a(), 0), new L(pVar, i), i6), new M(pVar, 10), i10).e());
        } else if (gifId != null) {
            ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).y1();
            SendMoneyCardFragment sendMoneyCardFragment = (SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get());
            D1 d12 = sendMoneyCardFragment.f14764S;
            j.d(d12);
            ((Group) ((I) d12.h).j).setVisibility(0);
            D1 d13 = sendMoneyCardFragment.f14764S;
            j.d(d13);
            ((ImageView) ((I) d13.h).f3649k).setVisibility(8);
            ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).t1(gifId);
        } else {
            ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).r1();
            if (transfer == null || (transferPersonalizationMPersonalization = transfer.mPersonalization()) == null || (decorationId = transferPersonalizationMPersonalization.getPayMayaDecorationId()) == null) {
                decorationId = sendMoneyCard != null ? sendMoneyCard.getDecorationId() : null;
                if (decorationId == null) {
                    decorationId = "";
                }
            }
            if (transfer == null || (decorationMDecoration = transfer.mOldDecorationDetails()) == null) {
                decorationMDecoration = userActivity != null ? userActivity.mDecoration() : null;
                if (decorationMDecoration == null) {
                    decorationMDecoration = ((E) pVar.e).b(decorationId);
                }
            }
            if (decorationMDecoration == null) {
                E e7 = (E) pVar.e;
                e7.getClass();
                Ah.p<Decoration> decorationById = e7.f11345b.getDecorationById(decorationId, T2.s());
                j.f(decorationById, "getDecorationById(...)");
                pVar.e(new d(new d(new h(decorationById, b.a(), 0), new com.google.firebase.messaging.p(pVar, i), i6), new A0(pVar, 11), i10).e());
            } else {
                pVar.o(decorationMDecoration);
            }
        }
        if (z4) {
            D1 d14 = ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).f14764S;
            j.d(d14);
            ((TextView) ((I) d14.h).f3650l).setVisibility(0);
        } else {
            D1 d15 = ((SendMoneyCardFragment) ((InterfaceC1679a) pVar.c.get())).f14764S;
            j.d(d15);
            ((TextView) ((I) d15.h).f3650l).setVisibility(8);
        }
        if (transfer != null) {
            InterfaceC1679a interfaceC1679a = (InterfaceC1679a) pVar.c.get();
            String formattedAmount = transfer.getFormattedAmount();
            D1 d16 = ((SendMoneyCardFragment) interfaceC1679a).f14764S;
            j.d(d16);
            ((I) d16.h).f3646b.setText(formattedAmount);
            InterfaceC1679a interfaceC1679a2 = (InterfaceC1679a) pVar.c.get();
            String strMMessage = transfer.mMessage();
            ((SendMoneyCardFragment) interfaceC1679a2).u1(strMMessage != null ? z.t(strMMessage, Global.NEWLINE, "<br/>") : null);
        }
        if (userActivity != null) {
            InterfaceC1679a interfaceC1679a3 = (InterfaceC1679a) pVar.c.get();
            String amountFormattedValue = userActivity.getAmountFormattedValue();
            D1 d17 = ((SendMoneyCardFragment) interfaceC1679a3).f14764S;
            j.d(d17);
            ((I) d17.h).f3646b.setText(amountFormattedValue);
            InterfaceC1679a interfaceC1679a4 = (InterfaceC1679a) pVar.c.get();
            String strMMessage2 = userActivity.mMessage();
            ((SendMoneyCardFragment) interfaceC1679a4).u1(strMMessage2 != null ? z.t(strMMessage2, Global.NEWLINE, "<br/>") : null);
        }
        if (sendMoneyCard != null) {
            InterfaceC1679a interfaceC1679a5 = (InterfaceC1679a) pVar.c.get();
            String str = sendMoneyCard.formattedAmount();
            D1 d18 = ((SendMoneyCardFragment) interfaceC1679a5).f14764S;
            j.d(d18);
            ((I) d18.h).f3646b.setText(str);
            InterfaceC1679a interfaceC1679a6 = (InterfaceC1679a) pVar.c.get();
            String message = sendMoneyCard.getMessage();
            ((SendMoneyCardFragment) interfaceC1679a6).u1(message != null ? z.t(message, Global.NEWLINE, "<br/>") : null);
            InterfaceC1679a interfaceC1679a7 = (InterfaceC1679a) pVar.c.get();
            String id = sendMoneyCard.getId();
            C1219h c1219h = ((SendMoneyCardFragment) interfaceC1679a7).f10248Q;
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219h.j.put("uuid", id);
        }
        D1 d19 = this.f14764S;
        j.d(d19);
        ((FrameLayout) d19.f).setOnClickListener(new View.OnClickListener(this) { // from class: ke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyCardFragment f18125b;

            {
                this.f18125b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        SendMoneyCardFragment sendMoneyCardFragment2 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            SendMoneyCardFragment.s1(sendMoneyCardFragment2);
                            return;
                        } finally {
                        }
                    case 1:
                        SendMoneyCardFragment sendMoneyCardFragment3 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            InterfaceC1771b interfaceC1771b = sendMoneyCardFragment3.f14767V;
                            if (interfaceC1771b != null) {
                                ((SendMoneyCardActivity) interfaceC1771b).finish();
                                return;
                            } else {
                                j.n("mSendMoneyCardFragmentListener");
                                throw null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    default:
                        SendMoneyCardFragment sendMoneyCardFragment4 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            Bundle arguments5 = sendMoneyCardFragment4.getArguments();
                            String string = arguments5 != null ? arguments5.getString("gif_id") : null;
                            if (string != null) {
                                sendMoneyCardFragment4.t1(string);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        D1 d110 = this.f14764S;
        j.d(d110);
        ((FrameLayout) d110.e).setOnClickListener(new View.OnClickListener(this) { // from class: ke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyCardFragment f18125b;

            {
                this.f18125b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        SendMoneyCardFragment sendMoneyCardFragment2 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            SendMoneyCardFragment.s1(sendMoneyCardFragment2);
                            return;
                        } finally {
                        }
                    case 1:
                        SendMoneyCardFragment sendMoneyCardFragment3 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            InterfaceC1771b interfaceC1771b = sendMoneyCardFragment3.f14767V;
                            if (interfaceC1771b != null) {
                                ((SendMoneyCardActivity) interfaceC1771b).finish();
                                return;
                            } else {
                                j.n("mSendMoneyCardFragmentListener");
                                throw null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    default:
                        SendMoneyCardFragment sendMoneyCardFragment4 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            Bundle arguments5 = sendMoneyCardFragment4.getArguments();
                            String string = arguments5 != null ? arguments5.getString("gif_id") : null;
                            if (string != null) {
                                sendMoneyCardFragment4.t1(string);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        D1 d111 = this.f14764S;
        j.d(d111);
        ((TextView) ((I) d111.h).c).setOnClickListener(new View.OnClickListener(this) { // from class: ke.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SendMoneyCardFragment f18125b;

            {
                this.f18125b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        SendMoneyCardFragment sendMoneyCardFragment2 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            SendMoneyCardFragment.s1(sendMoneyCardFragment2);
                            return;
                        } finally {
                        }
                    case 1:
                        SendMoneyCardFragment sendMoneyCardFragment3 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            InterfaceC1771b interfaceC1771b = sendMoneyCardFragment3.f14767V;
                            if (interfaceC1771b != null) {
                                ((SendMoneyCardActivity) interfaceC1771b).finish();
                                return;
                            } else {
                                j.n("mSendMoneyCardFragmentListener");
                                throw null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    default:
                        SendMoneyCardFragment sendMoneyCardFragment4 = this.f18125b;
                        Callback.onClick_enter(view2);
                        try {
                            Bundle arguments5 = sendMoneyCardFragment4.getArguments();
                            String string = arguments5 != null ? arguments5.getString("gif_id") : null;
                            if (string != null) {
                                sendMoneyCardFragment4.t1(string);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    public final void r1() {
        D1 d12 = this.f14764S;
        j.d(d12);
        ((Group) ((I) d12.h).j).setVisibility(8);
        D1 d13 = this.f14764S;
        j.d(d13);
        ((LottieAnimationView) ((I) d13.h).i).setVisibility(8);
        D1 d14 = this.f14764S;
        j.d(d14);
        ((LinearLayout) ((I) d14.h).h).setVisibility(8);
        D1 d15 = this.f14764S;
        j.d(d15);
        ((ImageView) ((I) d15.h).f3649k).setVisibility(0);
    }

    public final void t1(String str) {
        C1219h c1219h = this.f10248Q;
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put("gif_id", str);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(SessionDescription.ATTR_TYPE, "gif");
        D1 d12 = this.f14764S;
        j.d(d12);
        ((LottieAnimationView) ((I) d12.h).i).setVisibility(0);
        D1 d13 = this.f14764S;
        j.d(d13);
        ((LinearLayout) ((I) d13.h).h).setVisibility(8);
    }

    public final void u1(String str) {
        D1 d12 = this.f14764S;
        j.d(d12);
        TextView textView = (TextView) ((I) d12.h).f3647d;
        if (str == null) {
            str = "";
        }
        textView.setText(HtmlCompat.fromHtml(str, 0));
    }

    public final void v1(String str) {
        String str2 = String.format("card_snapshot_%s.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        D1 d12 = this.f14764S;
        j.d(d12);
        h0 h0VarD = h0.d((ConstraintLayout) d12.c, new u(5, this, str));
        h0VarD.e(ContextCompat.getColor(requireContext(), R.color.light_light));
        D1 d13 = this.f14764S;
        j.d(d13);
        h0VarD.f11209b = (ImageView) d13.f3584g;
        h0VarD.b(str2);
    }

    public final void w1(String str, String str2) {
        String string = getString(R.string.pma_format_share_card_receiver, str2, str);
        j.f(string, "getString(...)");
        v1(string);
    }

    public final void x1(String str, String str2) {
        String string = getString(R.string.pma_format_share_card_sender, str2, str);
        j.f(string, "getString(...)");
        v1(string);
    }

    public final void y1() {
        D1 d12 = this.f14764S;
        j.d(d12);
        ((ImageView) ((I) d12.h).f).setImageResource(2131231797);
        D1 d13 = this.f14764S;
        j.d(d13);
        ((FrameLayout) ((I) d13.h).f3648g).setVisibility(0);
    }
}
