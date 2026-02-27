package l9;

import android.os.Bundle;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaQRPHMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaQRPHMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import java.util.Locale;
import kotlin.Pair;
import p9.InterfaceC2029n;
import pg.u;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: renamed from: l9.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1817o implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1819q f18280b;

    public /* synthetic */ C1817o(C1819q c1819q, int i) {
        this.f18279a = i;
        this.f18280b = c1819q;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f18279a) {
            case 0:
                MerchantPaymentV2 merchantPaymentV2 = (MerchantPaymentV2) obj;
                C1819q c1819q = this.f18280b;
                s sVar = (o9.j) c1819q.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CREATE);
                c1219hH.i();
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (merchantPaymentV2 != null) {
                    o9.j jVar = (o9.j) c1819q.c.get();
                    String merchantPaymentId = merchantPaymentV2.getId();
                    MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment = (MayaQRPHMerchantPaymentFragment) jVar;
                    mayaQRPHMerchantPaymentFragment.getClass();
                    kotlin.jvm.internal.j.g(merchantPaymentId, "merchantPaymentId");
                    InterfaceC2029n interfaceC2029n = mayaQRPHMerchantPaymentFragment.t0;
                    if (interfaceC2029n != null) {
                        ((MayaQRPHMerchantActivity) interfaceC2029n).f12857s = merchantPaymentId;
                    }
                    o9.j jVar2 = (o9.j) c1819q.c.get();
                    String paymentId = merchantPaymentV2.getPaymentDetails().getPaymentId();
                    MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment2 = (MayaQRPHMerchantPaymentFragment) jVar2;
                    mayaQRPHMerchantPaymentFragment2.getClass();
                    kotlin.jvm.internal.j.g(paymentId, "paymentId");
                    InterfaceC2029n interfaceC2029n2 = mayaQRPHMerchantPaymentFragment2.t0;
                    if (interfaceC2029n2 != null) {
                        MayaQRPHMerchantActivity mayaQRPHMerchantActivity = (MayaQRPHMerchantActivity) interfaceC2029n2;
                        u uVar = mayaQRPHMerchantActivity.f12854p;
                        if (uVar == null) {
                            kotlin.jvm.internal.j.n("checkoutFullscreenMethodChannel");
                            throw null;
                        }
                        uVar.a("requestFullscreen", M.h(new Pair("route", "buyLoadScreen"), new Pair("paymentId", paymentId)), null);
                        mayaQRPHMerchantActivity.n1();
                        B5.i.g(mayaQRPHMerchantActivity);
                        return;
                    }
                    return;
                }
                return;
            default:
                MerchantPaymentV2 merchantPaymentV22 = (MerchantPaymentV2) obj;
                C1819q c1819q2 = this.f18280b;
                s sVar2 = (o9.j) c1819q2.c.get();
                C1219h c1219hH2 = AbstractC2329d.h(14);
                c1219hH2.t(EnumC1217f.CREATE);
                c1219hH2.i();
                ((MayaBaseFragment) sVar2).A1(c1219hH2);
                if (merchantPaymentV22 != null) {
                    String status = merchantPaymentV22.getStatus();
                    Locale locale = Locale.getDefault();
                    kotlin.jvm.internal.j.f(locale, "getDefault(...)");
                    String upperCase = status.toUpperCase(locale);
                    kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
                    int iHashCode = upperCase.hashCode();
                    if (iHashCode == 74702359 ? upperCase.equals("REFUNDED") : iHashCode == 733698236 ? upperCase.equals("FAILED_FULFILLMENT") : iHashCode == 2045206500 && upperCase.equals("FAILED_PAYMENT")) {
                        MayaQRPHMerchantPaymentFragment mayaQRPHMerchantPaymentFragment3 = (MayaQRPHMerchantPaymentFragment) ((o9.j) c1819q2.c.get());
                        InterfaceC2029n interfaceC2029n3 = mayaQRPHMerchantPaymentFragment3.t0;
                        if (interfaceC2029n3 != null) {
                            ((MayaQRPHMerchantActivity) interfaceC2029n3).o(mayaQRPHMerchantPaymentFragment3.getString(R.string.maya_merchant_payment_error_title), mayaQRPHMerchantPaymentFragment3.getString(R.string.maya_merchant_payment_error_subtitle_refund));
                            return;
                        }
                        return;
                    }
                    InterfaceC2029n interfaceC2029n4 = ((MayaQRPHMerchantPaymentFragment) ((o9.j) c1819q2.c.get())).t0;
                    if (interfaceC2029n4 != null) {
                        MayaV2MerchantPaymentReceiptFragment mayaV2MerchantPaymentReceiptFragment = new MayaV2MerchantPaymentReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("merchant_payment_v2", merchantPaymentV22);
                        mayaV2MerchantPaymentReceiptFragment.setArguments(bundle);
                        AbstractC1236z.g((MayaQRPHMerchantActivity) interfaceC2029n4, R.id.maya_activity_qr_ph_merchant_fragment_container, mayaV2MerchantPaymentReceiptFragment);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
