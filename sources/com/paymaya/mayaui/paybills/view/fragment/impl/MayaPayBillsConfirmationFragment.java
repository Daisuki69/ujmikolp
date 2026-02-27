package com.paymaya.mayaui.paybills.view.fragment.impl;

import Ch.c;
import D8.C0193a;
import Kh.T;
import Lh.g;
import Lh.h;
import N5.F;
import Q6.r;
import Q6.s;
import Qd.a;
import R4.i;
import T3.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import b7.f;
import ba.t;
import ba.u;
import bg.AbstractC0983W;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.M;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.messaging.n;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.d0;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerInput;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.store.C1277p;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsConfirmationFragment;
import dOYHB6.tiZVw8.numX49;
import ga.d;
import ha.p;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import y5.AbstractC2509a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPayBillsConfirmationFragment extends MayaBaseFragment implements d {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public u f13401U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public F f13402V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f13403W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f13404X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Group f13405Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public MayaReviewInfoRecyclerView f13406Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f13407a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public Button f13408b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final f f13409c0 = new f();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final f f13410d0 = new f();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public p f13411e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final InterfaceC1033d f13412f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final InterfaceC1033d f13413g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final InterfaceC1033d f13414h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final InterfaceC1033d f13415i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final InterfaceC1033d f13416j0;

    public MayaPayBillsConfirmationFragment() {
        final int i = 0;
        this.f13412f0 = C1034e.b(new Function0(this) { // from class: ha.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsConfirmationFragment f17014b;

            {
                this.f17014b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillerInput billerInput;
                BillerTransaction billerTransaction;
                switch (i) {
                    case 0:
                        Bundle arguments = this.f17014b.getArguments();
                        return (arguments == null || (billerInput = (BillerInput) arguments.getParcelable(numX49.tnTj78("bSH4"))) == null) ? BillerInput.sBuilder().build() : billerInput;
                    case 1:
                        Bundle arguments2 = this.f17014b.getArguments();
                        return (arguments2 == null || (billerTransaction = (BillerTransaction) arguments2.getParcelable(numX49.tnTj78("bSHC"))) == null) ? BillerTransaction.sBuilder().build() : billerTransaction;
                    case 2:
                        Bundle arguments3 = this.f17014b.getArguments();
                        if (arguments3 != null) {
                            return (FavoriteDetails) arguments3.getParcelable(numX49.tnTj78("bSH8"));
                        }
                        return null;
                    case 3:
                        Bundle arguments4 = this.f17014b.getArguments();
                        if (arguments4 != null) {
                            return arguments4.getString(numX49.tnTj78("bSHe"));
                        }
                        return null;
                    default:
                        Bundle arguments5 = this.f17014b.getArguments();
                        if (arguments5 != null) {
                            return arguments5.getString(numX49.tnTj78("bSHU"));
                        }
                        return null;
                }
            }
        });
        final int i4 = 1;
        this.f13413g0 = C1034e.b(new Function0(this) { // from class: ha.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsConfirmationFragment f17014b;

            {
                this.f17014b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillerInput billerInput;
                BillerTransaction billerTransaction;
                switch (i4) {
                    case 0:
                        Bundle arguments = this.f17014b.getArguments();
                        return (arguments == null || (billerInput = (BillerInput) arguments.getParcelable(numX49.tnTj78("bSH4"))) == null) ? BillerInput.sBuilder().build() : billerInput;
                    case 1:
                        Bundle arguments2 = this.f17014b.getArguments();
                        return (arguments2 == null || (billerTransaction = (BillerTransaction) arguments2.getParcelable(numX49.tnTj78("bSHC"))) == null) ? BillerTransaction.sBuilder().build() : billerTransaction;
                    case 2:
                        Bundle arguments3 = this.f17014b.getArguments();
                        if (arguments3 != null) {
                            return (FavoriteDetails) arguments3.getParcelable(numX49.tnTj78("bSH8"));
                        }
                        return null;
                    case 3:
                        Bundle arguments4 = this.f17014b.getArguments();
                        if (arguments4 != null) {
                            return arguments4.getString(numX49.tnTj78("bSHe"));
                        }
                        return null;
                    default:
                        Bundle arguments5 = this.f17014b.getArguments();
                        if (arguments5 != null) {
                            return arguments5.getString(numX49.tnTj78("bSHU"));
                        }
                        return null;
                }
            }
        });
        final int i6 = 2;
        this.f13414h0 = C1034e.b(new Function0(this) { // from class: ha.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsConfirmationFragment f17014b;

            {
                this.f17014b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillerInput billerInput;
                BillerTransaction billerTransaction;
                switch (i6) {
                    case 0:
                        Bundle arguments = this.f17014b.getArguments();
                        return (arguments == null || (billerInput = (BillerInput) arguments.getParcelable(numX49.tnTj78("bSH4"))) == null) ? BillerInput.sBuilder().build() : billerInput;
                    case 1:
                        Bundle arguments2 = this.f17014b.getArguments();
                        return (arguments2 == null || (billerTransaction = (BillerTransaction) arguments2.getParcelable(numX49.tnTj78("bSHC"))) == null) ? BillerTransaction.sBuilder().build() : billerTransaction;
                    case 2:
                        Bundle arguments3 = this.f17014b.getArguments();
                        if (arguments3 != null) {
                            return (FavoriteDetails) arguments3.getParcelable(numX49.tnTj78("bSH8"));
                        }
                        return null;
                    case 3:
                        Bundle arguments4 = this.f17014b.getArguments();
                        if (arguments4 != null) {
                            return arguments4.getString(numX49.tnTj78("bSHe"));
                        }
                        return null;
                    default:
                        Bundle arguments5 = this.f17014b.getArguments();
                        if (arguments5 != null) {
                            return arguments5.getString(numX49.tnTj78("bSHU"));
                        }
                        return null;
                }
            }
        });
        final int i10 = 3;
        this.f13415i0 = C1034e.b(new Function0(this) { // from class: ha.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsConfirmationFragment f17014b;

            {
                this.f17014b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillerInput billerInput;
                BillerTransaction billerTransaction;
                switch (i10) {
                    case 0:
                        Bundle arguments = this.f17014b.getArguments();
                        return (arguments == null || (billerInput = (BillerInput) arguments.getParcelable(numX49.tnTj78("bSH4"))) == null) ? BillerInput.sBuilder().build() : billerInput;
                    case 1:
                        Bundle arguments2 = this.f17014b.getArguments();
                        return (arguments2 == null || (billerTransaction = (BillerTransaction) arguments2.getParcelable(numX49.tnTj78("bSHC"))) == null) ? BillerTransaction.sBuilder().build() : billerTransaction;
                    case 2:
                        Bundle arguments3 = this.f17014b.getArguments();
                        if (arguments3 != null) {
                            return (FavoriteDetails) arguments3.getParcelable(numX49.tnTj78("bSH8"));
                        }
                        return null;
                    case 3:
                        Bundle arguments4 = this.f17014b.getArguments();
                        if (arguments4 != null) {
                            return arguments4.getString(numX49.tnTj78("bSHe"));
                        }
                        return null;
                    default:
                        Bundle arguments5 = this.f17014b.getArguments();
                        if (arguments5 != null) {
                            return arguments5.getString(numX49.tnTj78("bSHU"));
                        }
                        return null;
                }
            }
        });
        final int i11 = 4;
        this.f13416j0 = C1034e.b(new Function0(this) { // from class: ha.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsConfirmationFragment f17014b;

            {
                this.f17014b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BillerInput billerInput;
                BillerTransaction billerTransaction;
                switch (i11) {
                    case 0:
                        Bundle arguments = this.f17014b.getArguments();
                        return (arguments == null || (billerInput = (BillerInput) arguments.getParcelable(numX49.tnTj78("bSH4"))) == null) ? BillerInput.sBuilder().build() : billerInput;
                    case 1:
                        Bundle arguments2 = this.f17014b.getArguments();
                        return (arguments2 == null || (billerTransaction = (BillerTransaction) arguments2.getParcelable(numX49.tnTj78("bSHC"))) == null) ? BillerTransaction.sBuilder().build() : billerTransaction;
                    case 2:
                        Bundle arguments3 = this.f17014b.getArguments();
                        if (arguments3 != null) {
                            return (FavoriteDetails) arguments3.getParcelable(numX49.tnTj78("bSH8"));
                        }
                        return null;
                    case 3:
                        Bundle arguments4 = this.f17014b.getArguments();
                        if (arguments4 != null) {
                            return arguments4.getString(numX49.tnTj78("bSHe"));
                        }
                        return null;
                    default:
                        Bundle arguments5 = this.f17014b.getArguments();
                        if (arguments5 != null) {
                            return arguments5.getString(numX49.tnTj78("bSHU"));
                        }
                        return null;
                }
            }
        });
    }

    public static final void J1(MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment) {
        Lh.d dVar;
        int i = 22;
        final int i4 = 1;
        int i6 = 2;
        final int i10 = 0;
        C1220i c1220iO1 = mayaPayBillsConfirmationFragment.o1();
        FragmentActivity activity = mayaPayBillsConfirmationFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaPayBillsConfirmationFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.PAY);
        c1220iO1.c(activity, c1219hD);
        u uVar = (u) mayaPayBillsConfirmationFragment.H1();
        ((MayaBaseFragment) ((d) uVar.c.get())).E1();
        final String strA = uVar.f.a();
        String strMBillPaymentId = ((MayaPayBillsConfirmationFragment) ((d) uVar.c.get())).G1().mBillPaymentId();
        final C1277p c1277p = uVar.f8621d;
        if (c1277p.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
            dVar = new Lh.d(c1277p.c.executeBillsPaymentV3(strMBillPaymentId, RequestBody.create(d0.f10787a, new byte[0])).d(new n(21)), new c() { // from class: com.paymaya.domain.store.o
                @Override // Ch.c
                public final void accept(Object obj) {
                    BillerTransaction billerTransaction = (BillerTransaction) obj;
                    switch (i10) {
                        case 0:
                            C1277p c1277p2 = c1277p;
                            c1277p2.getClass();
                            c1277p2.f11470d.a(billerTransaction.toBuilder().mUserMin(strA).build());
                            break;
                        default:
                            C1277p c1277p3 = c1277p;
                            c1277p3.getClass();
                            c1277p3.f11470d.a(billerTransaction.toBuilder().mUserMin(strA).build());
                            break;
                    }
                }
            }, i6);
        } else {
            Ah.p<BillerTransaction> pVarExecuteBillsPaymentV2 = c1277p.f11469b.executeBillsPaymentV2(strMBillPaymentId, RequestBody.create(d0.f10787a, new byte[0]));
            c cVar = new c() { // from class: com.paymaya.domain.store.o
                @Override // Ch.c
                public final void accept(Object obj) {
                    BillerTransaction billerTransaction = (BillerTransaction) obj;
                    switch (i4) {
                        case 0:
                            C1277p c1277p2 = c1277p;
                            c1277p2.getClass();
                            c1277p2.f11470d.a(billerTransaction.toBuilder().mUserMin(strA).build());
                            break;
                        default:
                            C1277p c1277p3 = c1277p;
                            c1277p3.getClass();
                            c1277p3.f11470d.a(billerTransaction.toBuilder().mUserMin(strA).build());
                            break;
                    }
                }
            };
            pVarExecuteBillsPaymentV2.getClass();
            dVar = new Lh.d(pVarExecuteBillsPaymentV2, cVar, i6);
        }
        new Lh.d(new T(5, new Lh.d(new Lh.d(new h(dVar, b.a(), 0), new Q6.n(uVar, 26), i6), new i(uVar, i), i10), new t(uVar, i10)), new l(uVar, i), i4).e();
        u uVar2 = (u) mayaPayBillsConfirmationFragment.H1();
        if (uVar2.f8622g.e().isBillsPayEventsV2Enabled()) {
            BillerTransaction billerTransactionG1 = ((MayaPayBillsConfirmationFragment) ((d) uVar2.c.get())).G1();
            Pair pair = new Pair(EnumC1212a.BILL_AMOUNT, billerTransactionG1.mAmount().getCurrencyFormattedValue());
            EnumC1212a enumC1212a = EnumC1212a.CONVENIENCE_FEE;
            Amount amountMFee = billerTransactionG1.mFee();
            Pair pair2 = new Pair(enumC1212a, amountMFee != null ? amountMFee.getCurrencyFormattedValue() : null);
            EnumC1212a enumC1212a2 = EnumC1212a.TOTAL_AMOUNT;
            Amount amountMTotalAmount = billerTransactionG1.mTotalAmount();
            Map mapH = M.h(pair, pair2, new Pair(enumC1212a2, amountMTotalAmount != null ? amountMTotalAmount.getCurrencyFormattedValue() : null));
            BillerDetails billerDetailsMBiller = ((MayaPayBillsConfirmationFragment) ((d) uVar2.c.get())).G1().mBiller();
            Map mapH2 = billerDetailsMBiller != null ? M.h(new Pair(EnumC1212a.BILLER_SLUG, billerDetailsMBiller.mSlug()), new Pair(EnumC1212a.BILLER_NAME, billerDetailsMBiller.mName()), new Pair(EnumC1212a.CATEGORY_SLUG, billerDetailsMBiller.mCategorySlug()), new Pair(EnumC1212a.CATEGORY_NAME, billerDetailsMBiller.mCategory())) : M.e();
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapH);
            linkedHashMap.putAll(mapH2);
            MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment2 = (MayaPayBillsConfirmationFragment) ((d) uVar2.c.get());
            mayaPayBillsConfirmationFragment2.getClass();
            C1219h c1219hE = C1219h.e("BILLS_PAYMENT_PAGE_CONFIRMED");
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
            }
            mayaPayBillsConfirmationFragment2.o1().b(c1219hE);
        }
    }

    public final BillerTransaction G1() {
        Object value = this.f13413g0.getValue();
        j.f(value, "getValue(...)");
        return (BillerTransaction) value;
    }

    public final aa.c H1() {
        u uVar = this.f13401U;
        if (uVar != null) {
            return uVar;
        }
        j.n("mPayBillsConfirmationFragmentPresenter");
        throw null;
    }

    public final FavoriteDetails I1() {
        return (FavoriteDetails) this.f13414h0.getValue();
    }

    public final void K1() {
        u uVar = (u) H1();
        ((MayaBaseFragment) ((d) uVar.c.get())).E1();
        C1277p c1277p = uVar.f8621d;
        try {
            try {
                try {
                    c1277p.c.getBillsPaymentV3(((MayaPayBillsConfirmationFragment) ((d) uVar.c.get())).G1().mBillPaymentId()).d(new n(21)).f(new g(new Hh.d(new C0193a(new Gh.d(1, new a(uVar, 23), new s(uVar, 25)), new r(uVar, 23)), new t(uVar, 1), 1), b.a()));
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th2) {
                    AbstractC0983W.G(th2);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th2);
                    throw nullPointerException;
                }
            } catch (NullPointerException e7) {
                throw e7;
            } catch (Throwable th3) {
                AbstractC0983W.G(th3);
                NullPointerException nullPointerException2 = new NullPointerException("subscribeActual failed");
                nullPointerException2.initCause(th3);
                throw nullPointerException2;
            }
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th4) {
            throw AbstractC1213b.L(th4, "subscribeActual failed", th4);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.f13411e0 = (p) getActivity();
        O5.a aVar = W4.a.e().t().f4754a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        this.f13401U = new u(aVar.h(), aVar.q(), aVar.v(), (com.paymaya.data.preference.a) aVar.e.get(), (Uh.d) aVar.f4748y.get());
        ((AbstractC2509a) H1()).h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_pay_bills_confirmation, viewGroup, false);
        int i = R.id.barrier_payment_method;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_payment_method)) != null) {
            i = R.id.button_pay;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_pay);
            if (button != null) {
                i = R.id.button_view_initial_receipt;
                Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_view_initial_receipt);
                if (button2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i = R.id.currency_text_view;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.currency_text_view)) != null) {
                        i = R.id.group_payment_method;
                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_payment_method);
                        if (group != null) {
                            i = R.id.image_view_biller_icon;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_biller_icon);
                            if (imageView != null) {
                                i = R.id.payment_method_bottom_space;
                                if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_bottom_space)) != null) {
                                    i = R.id.payment_method_value_text_view;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.payment_method_value_text_view)) != null) {
                                        i = R.id.payment_method_view;
                                        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.payment_method_view);
                                        if (viewFindChildViewById != null) {
                                            i = R.id.review_info_recycler_view_additional_info;
                                            MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.review_info_recycler_view_additional_info);
                                            if (mayaReviewInfoRecyclerView != null) {
                                                i = R.id.review_info_recycler_view_payment_details;
                                                MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2 = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.review_info_recycler_view_payment_details);
                                                if (mayaReviewInfoRecyclerView2 != null) {
                                                    i = R.id.scroll_view_pma_fragment_pay_bills_confirmation;
                                                    if (((ScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_view_pma_fragment_pay_bills_confirmation)) != null) {
                                                        i = R.id.source_label_text_view;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.source_label_text_view)) != null) {
                                                            i = R.id.text_view_amount;
                                                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount);
                                                            if (textView != null) {
                                                                i = R.id.text_view_confirm_payment_title;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirm_payment_title);
                                                                if (textView2 != null) {
                                                                    i = R.id.text_view_payment_method_phone_number;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_payment_method_phone_number);
                                                                    if (textView3 != null) {
                                                                        i = R.id.vertical_middle_guideline;
                                                                        if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.vertical_middle_guideline)) != null) {
                                                                            this.f13402V = new F(constraintLayout, button, button2, group, imageView, viewFindChildViewById, mayaReviewInfoRecyclerView, mayaReviewInfoRecyclerView2, textView, textView2, textView3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ((AbstractC2509a) H1()).i();
        super.onDestroy();
        this.f13402V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        p pVar = this.f13411e0;
        if (pVar != null) {
            ((MayaPayBillsActivity) pVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f13402V;
        j.d(f);
        this.f13403W = (TextView) f.h;
        this.f13404X = (TextView) f.i;
        this.f13405Y = (Group) f.f3615d;
        this.f13406Z = (MayaReviewInfoRecyclerView) f.f3616g;
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = (MayaReviewInfoRecyclerView) f.f;
        this.f13407a0 = (Button) f.c;
        this.f13408b0 = (Button) f.e;
        mayaReviewInfoRecyclerView.setAdapter(this.f13410d0);
        MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2 = this.f13406Z;
        if (mayaReviewInfoRecyclerView2 == null) {
            j.n("mReviewInfoRecyclerViewPaymentDetails");
            throw null;
        }
        mayaReviewInfoRecyclerView2.setAdapter(this.f13409c0);
        Button button = this.f13407a0;
        if (button == null) {
            j.n("mButtonPay");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: ha.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsConfirmationFragment f17012b;

            {
                this.f17012b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment = this.f17012b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPayBillsConfirmationFragment.J1(mayaPayBillsConfirmationFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment2 = this.f17012b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPayBillsConfirmationFragment2.K1();
                            return;
                        } finally {
                        }
                }
            }
        });
        Button button2 = this.f13408b0;
        if (button2 == null) {
            j.n("mButtonViewInitialReceipt");
            throw null;
        }
        final int i4 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: ha.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaPayBillsConfirmationFragment f17012b;

            {
                this.f17012b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment = this.f17012b;
                        Callback.onClick_enter(view2);
                        try {
                            MayaPayBillsConfirmationFragment.J1(mayaPayBillsConfirmationFragment);
                            return;
                        } finally {
                        }
                    default:
                        MayaPayBillsConfirmationFragment mayaPayBillsConfirmationFragment2 = this.f17012b;
                        Callback.onClick_enter(view2);
                        try {
                            mayaPayBillsConfirmationFragment2.K1();
                            return;
                        } finally {
                        }
                }
            }
        });
        ((u) H1()).j();
    }
}
