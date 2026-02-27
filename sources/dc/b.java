package Dc;

import D8.C0214w;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.Voucher;
import com.paymaya.mayaui.vouchers.view.fragment.impl.MayaVoucherDetailsFragment;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import y5.s;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0214w f1117b;

    public /* synthetic */ b(C0214w c0214w, int i) {
        this.f1116a = i;
        this.f1117b = c0214w;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String strMCampaignName;
        switch (this.f1116a) {
            case 0:
                C0214w c0214w = this.f1117b;
                PayMayaError payMayaErrorF = c0214w.f((Throwable) obj, true);
                j.f(payMayaErrorF, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((Fc.b) c0214w.c.get())).w1();
                if (!payMayaErrorF.isSessionTimeout()) {
                    s sVar = (Fc.b) c0214w.c.get();
                    C1219h c1219hH = AbstractC2329d.h(12);
                    c1219hH.t(EnumC1217f.EXECUTE);
                    EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                    Voucher voucher = ((MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get())).f14297L0;
                    if (voucher == null || (strMCampaignName = voucher.mCampaignName()) == null) {
                        strMCampaignName = "";
                    }
                    c1219hH.j.put("campaign_name", strMCampaignName);
                    c1219hH.j.put(Constants.REASON, payMayaErrorF.mSpiel());
                    ((MayaBaseFragment) sVar).A1(c1219hH);
                    ((MayaVoucherDetailsFragment) ((Fc.b) c0214w.c.get())).W1(payMayaErrorF);
                }
                break;
            default:
                C0214w c0214w2 = this.f1117b;
                PayMayaError payMayaErrorF2 = c0214w2.f((Throwable) obj, true);
                j.f(payMayaErrorF2, "mayaErrorHandling(...)");
                ((MayaBaseFragment) ((Fc.b) c0214w2.c.get())).w1();
                if (!payMayaErrorF2.isSessionTimeout()) {
                    ((MayaVoucherDetailsFragment) ((Fc.b) c0214w2.c.get())).W1(payMayaErrorF2);
                }
                break;
        }
    }
}
