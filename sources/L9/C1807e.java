package l9;

import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MerchantPaymentV2;
import com.paymaya.mayaui.merchant.view.activity.impl.MayaMerchantActivity;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaMerchantPaymentFragment;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import java.util.Locale;
import kotlin.Pair;
import p9.InterfaceC2021f;
import pg.u;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: renamed from: l9.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1807e implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1809g f18261b;

    public /* synthetic */ C1807e(C1809g c1809g, int i) {
        this.f18260a = i;
        this.f18261b = c1809g;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f18260a) {
            case 0:
                MerchantPaymentV2 merchantPaymentV2 = (MerchantPaymentV2) obj;
                C1809g c1809g = this.f18261b;
                s sVar = (o9.d) c1809g.c.get();
                C1219h c1219hH = AbstractC2329d.h(14);
                c1219hH.t(EnumC1217f.CREATE);
                c1219hH.i();
                ((MayaBaseFragment) sVar).A1(c1219hH);
                if (merchantPaymentV2 != null) {
                    o9.d dVar = (o9.d) c1809g.c.get();
                    String merchantPaymentId = merchantPaymentV2.getId();
                    MayaMerchantPaymentFragment mayaMerchantPaymentFragment = (MayaMerchantPaymentFragment) dVar;
                    mayaMerchantPaymentFragment.getClass();
                    kotlin.jvm.internal.j.g(merchantPaymentId, "merchantPaymentId");
                    InterfaceC2021f interfaceC2021f = mayaMerchantPaymentFragment.t0;
                    if (interfaceC2021f != null) {
                        ((MayaMerchantActivity) interfaceC2021f).f12850r = merchantPaymentId;
                    }
                    o9.d dVar2 = (o9.d) c1809g.c.get();
                    String paymentId = merchantPaymentV2.getPaymentDetails().getPaymentId();
                    MayaMerchantPaymentFragment mayaMerchantPaymentFragment2 = (MayaMerchantPaymentFragment) dVar2;
                    mayaMerchantPaymentFragment2.getClass();
                    kotlin.jvm.internal.j.g(paymentId, "paymentId");
                    InterfaceC2021f interfaceC2021f2 = mayaMerchantPaymentFragment2.t0;
                    if (interfaceC2021f2 != null) {
                        MayaMerchantActivity mayaMerchantActivity = (MayaMerchantActivity) interfaceC2021f2;
                        u uVar = mayaMerchantActivity.f12847o;
                        if (uVar == null) {
                            kotlin.jvm.internal.j.n("checkoutFullscreenMethodChannel");
                            throw null;
                        }
                        uVar.a("requestFullscreen", M.h(new Pair("route", "buyLoadScreen"), new Pair("paymentId", paymentId)), null);
                        mayaMerchantActivity.n1();
                        B5.i.g(mayaMerchantActivity);
                        return;
                    }
                    return;
                }
                return;
            default:
                MerchantPaymentV2 merchantPaymentV22 = (MerchantPaymentV2) obj;
                C1809g c1809g2 = this.f18261b;
                s sVar2 = (o9.d) c1809g2.c.get();
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
                        MayaMerchantPaymentFragment mayaMerchantPaymentFragment3 = (MayaMerchantPaymentFragment) ((o9.d) c1809g2.c.get());
                        InterfaceC2021f interfaceC2021f3 = mayaMerchantPaymentFragment3.t0;
                        if (interfaceC2021f3 != null) {
                            M2.b.Z(0, mayaMerchantPaymentFragment3.getString(R.string.maya_merchant_payment_error_title), mayaMerchantPaymentFragment3.getString(R.string.maya_merchant_payment_error_subtitle_refund), null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(((MayaMerchantActivity) interfaceC2021f3).getSupportFragmentManager(), "error_dialog");
                            return;
                        }
                        return;
                    }
                    InterfaceC2021f interfaceC2021f4 = ((MayaMerchantPaymentFragment) ((o9.d) c1809g2.c.get())).t0;
                    if (interfaceC2021f4 != null) {
                        MayaV2MerchantPaymentReceiptFragment mayaV2MerchantPaymentReceiptFragment = new MayaV2MerchantPaymentReceiptFragment();
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("merchant_payment_v2", merchantPaymentV22);
                        mayaV2MerchantPaymentReceiptFragment.setArguments(bundle);
                        AbstractC1236z.g((MayaMerchantActivity) interfaceC2021f4, R.id.maya_activity_merchant_fragment_container, mayaV2MerchantPaymentReceiptFragment);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
