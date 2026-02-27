package com.paymaya.mayaui.merchant.view.fragment.impl;

import Ah.p;
import Ch.a;
import Kh.T;
import Lh.d;
import M8.A0;
import N5.F0;
import S5.c;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.domain.store.M;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import d4.AbstractC1331a;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import l9.C1812j;
import l9.C1814l;
import o9.h;
import okhttp3.RequestBody;
import p9.InterfaceC2026k;
import y5.f;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaQRPHMerchantConfirmationFragment extends MayaBaseFragment implements h {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F0 f12899U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f12900V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12901W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Button f12902X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C1812j f12903Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC2026k f12904Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public QRPHMerchantPaymentTransaction f12905a0;

    public static final void G1(MayaQRPHMerchantConfirmationFragment mayaQRPHMerchantConfirmationFragment) {
        int i = 5;
        final int i4 = 1;
        final int i6 = 0;
        C1220i c1220iO1 = mayaQRPHMerchantConfirmationFragment.o1();
        FragmentActivity activity = mayaQRPHMerchantConfirmationFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaQRPHMerchantConfirmationFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.PAY);
        c1220iO1.c(activity, c1219hD);
        final C1812j c1812j = mayaQRPHMerchantConfirmationFragment.f12903Y;
        if (c1812j == null) {
            j.n("mQRPHMerchantConfirmationFragmentPresenter");
            throw null;
        }
        QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = ((MayaQRPHMerchantConfirmationFragment) ((h) c1812j.c.get())).f12905a0;
        if (qRPHMerchantPaymentTransaction == null) {
            j.n("mQRPHMerchantPaymentTransaction");
            throw null;
        }
        ((MayaBaseFragment) ((h) c1812j.c.get())).D1();
        if (qRPHMerchantPaymentTransaction.getAuthChallengeId() == null) {
            p<QRPHMerchantPaymentTransaction> pVarExecuteQRPHMerchantPayment = c1812j.e.f11455b.executeQRPHMerchantPayment(qRPHMerchantPaymentTransaction.getPaymentToken().getId());
            c1812j.e(new T(i, new d(new d(AbstractC1331a.l(pVarExecuteQRPHMerchantPayment, pVarExecuteQRPHMerchantPayment, b.a()), new M(c1812j, 19), 2), new com.google.firebase.messaging.p(c1812j, 22), 0), new a() { // from class: l9.k
                @Override // Ch.a
                public final void run() {
                    switch (i6) {
                        case 0:
                            ((MayaBaseFragment) ((o9.h) c1812j.c.get())).w1();
                            break;
                        default:
                            ((MayaBaseFragment) ((o9.h) c1812j.c.get())).w1();
                            break;
                    }
                }
            }).e());
        } else {
            String authChallengeId = qRPHMerchantPaymentTransaction.getAuthChallengeId();
            j.g(authChallengeId, "authChallengeId");
            C1278p0 c1278p0 = c1812j.f;
            c1278p0.getClass();
            p<MFAChallengeInformation> pVarStartMFAChallenge = c1278p0.f11471b.startMFAChallenge("qrph", authChallengeId, RequestBody.create(f.f21063a, A0.h(null, null)));
            c1812j.e(new T(i, new d(new d(AbstractC1331a.l(pVarStartMFAChallenge, pVarStartMFAChallenge, b.a()), new C1814l(c1812j, qRPHMerchantPaymentTransaction, i6), 2), new C1814l(c1812j, qRPHMerchantPaymentTransaction, i4), 0), new a() { // from class: l9.k
                @Override // Ch.a
                public final void run() {
                    switch (i4) {
                        case 0:
                            ((MayaBaseFragment) ((o9.h) c1812j.c.get())).w1();
                            break;
                        default:
                            ((MayaBaseFragment) ((o9.h) c1812j.c.get())).w1();
                            break;
                    }
                }
            }).e());
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONFIRMATION;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12903Y = new C1812j(aVar.B(), aVar.E(), (Uh.d) aVar.f4748y.get(), 1);
        this.f12904Z = (InterfaceC2026k) getActivity();
        C1812j c1812j = this.f12903Y;
        if (c1812j != null) {
            c1812j.h(this);
        } else {
            j.n("mQRPHMerchantConfirmationFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        F0 f0A = F0.a(inflater, viewGroup);
        this.f12899U = f0A;
        ConstraintLayout constraintLayout = f0A.f3618b;
        j.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1812j c1812j = this.f12903Y;
        if (c1812j == null) {
            j.n("mQRPHMerchantConfirmationFragmentPresenter");
            throw null;
        }
        c1812j.i();
        super.onDestroy();
        this.f12899U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2026k interfaceC2026k = this.f12904Z;
        if (interfaceC2026k != null) {
            ((MayaQRPHMerchantActivity) interfaceC2026k).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F0 f02 = this.f12899U;
        j.d(f02);
        this.f12900V = f02.f3619d;
        F0 f03 = this.f12899U;
        j.d(f03);
        this.f12901W = f03.e;
        F0 f04 = this.f12899U;
        j.d(f04);
        this.f12902X = f04.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("qr_ph_merchant_payment_transaction");
            j.d(parcelable);
            this.f12905a0 = (QRPHMerchantPaymentTransaction) parcelable;
        }
        C1812j c1812j = this.f12903Y;
        if (c1812j == null) {
            j.n("mQRPHMerchantConfirmationFragmentPresenter");
            throw null;
        }
        c1812j.j();
        Button button = this.f12902X;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC1479a(this, 27));
        } else {
            j.n("mPayButton");
            throw null;
        }
    }
}
