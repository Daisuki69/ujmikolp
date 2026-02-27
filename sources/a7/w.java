package A7;

import G7.E;
import Kh.T;
import androidx.media3.exoplayer.rtsp.RtspHeaders;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.domain.model.CustomerAccount;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;
import d4.AbstractC1331a;
import java.util.HashMap;
import v5.C2342a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements Ch.c, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f244b;

    public /* synthetic */ w(A a8, int i) {
        this.f243a = i;
        this.f244b = a8;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        String strMBillerslug;
        switch (this.f243a) {
            case 0:
                A a8 = this.f244b;
                if (a8.f183d.b() != null) {
                    ((MayaWalletFragment) ((F7.s) a8.c.get())).L1();
                } else {
                    MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) a8.c.get());
                    mayaWalletFragment.getClass();
                    MayaBaseLoadingFragment.N1(mayaWalletFragment, 200, null, null, new E(mayaWalletFragment, 8), 30);
                }
                break;
            default:
                UserActivity userActivity = (UserActivity) obj;
                kotlin.jvm.internal.j.g(userActivity, "userActivity");
                A a10 = this.f244b;
                if (userActivity.isBillsPayMethod(true) && (strMBillerslug = userActivity.mBillerslug()) != null && !C2576A.H(strMBillerslug)) {
                    if (!((HashMap) J5.a.c().f2414b).containsKey(userActivity.mBillerslug())) {
                        new T(5, new Lh.d(new Lh.h(a10.f184g.b(userActivity.mBillerslug()), zh.b.a(), 0), new C0103a(a10, 6), 2), new r(0, a10, userActivity)).e();
                    }
                }
                if (kotlin.jvm.internal.j.b(userActivity.mMethod(), "MONEYINCR") || kotlin.jvm.internal.j.b(userActivity.mMethod(), "MONEYINDB") || kotlin.jvm.internal.j.b(userActivity.mMethod(), "SMP2PCONCD") || kotlin.jvm.internal.j.b(userActivity.mMethod(), "SMP2PCONDB")) {
                    new Lh.d(new Lh.d(new Lh.h(a10.j.a(String.valueOf(userActivity.mMethod()), String.valueOf(userActivity.mRequestReferenceNo())), zh.b.a(), 0), new z(a10, userActivity, 0), 2), new z(a10, userActivity, 1), 0).e();
                } else if (!kotlin.jvm.internal.j.b(userActivity.mType(), RtspHeaders.TRANSPORT)) {
                    ((MayaBaseFragment) ((F7.s) a10.c.get())).w1();
                    ((MayaWalletFragment) ((F7.s) a10.c.get())).a2(userActivity);
                } else {
                    Ah.p<PurchasedTicket> ticketDetails = a10.f186l.f11403b.getTicketDetails(userActivity.mRequestReferenceNo());
                    new Lh.d(new Lh.d(AbstractC1331a.l(ticketDetails, ticketDetails, zh.b.a()), new z(a10, userActivity, 2), 2), new y(a10, 2), 0).e();
                }
                break;
        }
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        CustomerAccount information = (CustomerAccount) obj;
        kotlin.jvm.internal.j.g(information, "information");
        this.f244b.getClass();
        return Ah.p.c(new C2342a(information));
    }
}
