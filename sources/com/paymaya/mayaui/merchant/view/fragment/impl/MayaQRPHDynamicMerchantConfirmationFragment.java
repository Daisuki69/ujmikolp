package com.paymaya.mayaui.merchant.view.fragment.impl;

import Ah.p;
import Ch.a;
import Kh.T;
import Lh.d;
import N5.F0;
import S5.c;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MFAChallengeInformation;
import com.paymaya.domain.model.QRPHMerchantPaymentTransaction;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import com.paymaya.domain.store.C1278p0;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import d4.AbstractC1331a;
import fa.ViewOnClickListenerC1479a;
import kotlin.jvm.internal.j;
import l9.C1811i;
import l9.C1812j;
import o9.f;
import okhttp3.RequestBody;
import p9.InterfaceC2024i;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaQRPHDynamicMerchantConfirmationFragment extends MayaBaseFragment implements f {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C1812j f12887U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public F0 f12888V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f12889W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f12890X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public QRPHMerchantPaymentTransaction f12891Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public InterfaceC2024i f12892Z;

    public static final void G1(MayaQRPHDynamicMerchantConfirmationFragment mayaQRPHDynamicMerchantConfirmationFragment) {
        int i = 5;
        final int i4 = 1;
        final int i6 = 0;
        C1220i c1220iO1 = mayaQRPHDynamicMerchantConfirmationFragment.o1();
        FragmentActivity activity = mayaQRPHDynamicMerchantConfirmationFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaQRPHDynamicMerchantConfirmationFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.PAY);
        c1220iO1.c(activity, c1219hD);
        final C1812j c1812j = mayaQRPHDynamicMerchantConfirmationFragment.f12887U;
        if (c1812j == null) {
            j.n("mQRPHDynamicMerchantConfirmationFragmentPresenter");
            throw null;
        }
        QRPHMerchantPaymentTransaction qRPHMerchantPaymentTransaction = ((MayaQRPHDynamicMerchantConfirmationFragment) ((f) c1812j.c.get())).f12891Y;
        if (qRPHMerchantPaymentTransaction == null) {
            j.n("mQRPHMerchantPaymentTransaction");
            throw null;
        }
        ((MayaBaseFragment) ((f) c1812j.c.get())).D1();
        if (qRPHMerchantPaymentTransaction.getAuthChallengeId() == null) {
            p<QRPHMerchantPaymentTransaction> pVarExecuteQRPHMerchantPayment = c1812j.e.f11455b.executeQRPHMerchantPayment(qRPHMerchantPaymentTransaction.getPaymentToken().getId());
            c1812j.e(new T(i, new d(new d(AbstractC1331a.l(pVarExecuteQRPHMerchantPayment, pVarExecuteQRPHMerchantPayment, b.a()), new A0(c1812j, 20), 2), new C1258f0(c1812j, 21), 0), new a() { // from class: l9.h
                @Override // Ch.a
                public final void run() {
                    switch (i6) {
                        case 0:
                            ((MayaBaseFragment) ((o9.f) c1812j.c.get())).w1();
                            break;
                        default:
                            ((MayaBaseFragment) ((o9.f) c1812j.c.get())).w1();
                            break;
                    }
                }
            }).e());
        } else {
            String authChallengeId = qRPHMerchantPaymentTransaction.getAuthChallengeId();
            j.g(authChallengeId, "authChallengeId");
            C1278p0 c1278p0 = c1812j.f;
            c1278p0.getClass();
            p<MFAChallengeInformation> pVarStartMFAChallenge = c1278p0.f11471b.startMFAChallenge("qrph", authChallengeId, RequestBody.create(y5.f.f21063a, M8.A0.h(null, null)));
            c1812j.e(new T(i, new d(new d(AbstractC1331a.l(pVarStartMFAChallenge, pVarStartMFAChallenge, b.a()), new C1811i(c1812j, qRPHMerchantPaymentTransaction, i6), 2), new C1811i(c1812j, qRPHMerchantPaymentTransaction, i4), 0), new a() { // from class: l9.h
                @Override // Ch.a
                public final void run() {
                    switch (i4) {
                        case 0:
                            ((MayaBaseFragment) ((o9.f) c1812j.c.get())).w1();
                            break;
                        default:
                            ((MayaBaseFragment) ((o9.f) c1812j.c.get())).w1();
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

    @Override // y5.InterfaceC2511c
    public final boolean e0() {
        InterfaceC2024i interfaceC2024i = this.f12892Z;
        if (interfaceC2024i == null) {
            return true;
        }
        ((MayaQRPHMerchantActivity) interfaceC2024i).a2();
        return true;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().q().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12887U = new C1812j(aVar.B(), aVar.E(), (Uh.d) aVar.f4748y.get(), 0);
        this.f12892Z = (InterfaceC2024i) getActivity();
        C1812j c1812j = this.f12887U;
        if (c1812j != null) {
            c1812j.h(this);
        } else {
            j.n("mQRPHDynamicMerchantConfirmationFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        F0 f0A = F0.a(inflater, viewGroup);
        this.f12888V = f0A;
        return f0A.f3618b;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1812j c1812j = this.f12887U;
        if (c1812j == null) {
            j.n("mQRPHDynamicMerchantConfirmationFragmentPresenter");
            throw null;
        }
        c1812j.i();
        super.onDestroy();
        this.f12888V = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC2024i interfaceC2024i = this.f12892Z;
        if (interfaceC2024i != null) {
            ((MayaQRPHMerchantActivity) interfaceC2024i).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F0 f02 = this.f12888V;
        j.d(f02);
        this.f12889W = f02.f3619d;
        F0 f03 = this.f12888V;
        j.d(f03);
        this.f12890X = f03.e;
        F0 f04 = this.f12888V;
        j.d(f04);
        f04.c.setOnClickListener(new ViewOnClickListenerC1479a(this, 25));
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("qr_ph_merchant_payment_transaction");
            j.d(parcelable);
            this.f12891Y = (QRPHMerchantPaymentTransaction) parcelable;
            C1812j c1812j = this.f12887U;
            if (c1812j != null) {
                c1812j.j();
            } else {
                j.n("mQRPHDynamicMerchantConfirmationFragmentPresenter");
                throw null;
            }
        }
    }
}
