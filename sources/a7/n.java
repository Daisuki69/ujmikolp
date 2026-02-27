package A7;

import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.DecoratedActivity;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaTransactionsActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaTransactionsFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f226b;
    public final /* synthetic */ UserActivity c;

    public /* synthetic */ n(o oVar, UserActivity userActivity, int i) {
        this.f225a = i;
        this.f226b = oVar;
        this.c = userActivity;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f225a) {
            case 0:
                DecoratedActivity decoratedActivity = (DecoratedActivity) obj;
                kotlin.jvm.internal.j.g(decoratedActivity, "decoratedActivity");
                o oVar = this.f226b;
                UserActivity userActivity = this.c;
                kotlin.jvm.internal.j.g(userActivity, "userActivity");
                Decoration mDecoration = decoratedActivity.getMDecoration();
                TransferPersonalizationMeta mMeta = decoratedActivity.getMMeta();
                String mProvider = decoratedActivity.getMProvider();
                if (mMeta == null) {
                    if (mDecoration != null) {
                        UserActivity userActivityBuild = userActivity.toBuilder().mDecoration(mDecoration).build();
                        ((MayaBaseFragment) ((F7.c) oVar.c.get())).w1();
                        jk.b.w((F7.c) oVar.c.get(), userActivityBuild);
                    }
                } else if (kotlin.jvm.internal.j.b(mProvider, "paymaya") && mDecoration != null) {
                    UserActivity userActivityBuild2 = userActivity.toBuilder().mDecoration(mDecoration).build();
                    ((MayaBaseFragment) ((F7.c) oVar.c.get())).w1();
                    jk.b.w((F7.c) oVar.c.get(), userActivityBuild2);
                } else if (kotlin.jvm.internal.j.b(mProvider, "giphy")) {
                    UserActivity userActivityBuild3 = userActivity.toBuilder().mProvider(mProvider).mTransferPersonalizationMeta(mMeta).build();
                    ((MayaBaseFragment) ((F7.c) oVar.c.get())).w1();
                    jk.b.w((F7.c) oVar.c.get(), userActivityBuild3);
                }
                break;
            case 1:
                o oVar2 = this.f226b;
                UserActivity userActivity2 = this.c;
                kotlin.jvm.internal.j.f(oVar2.f((Throwable) obj, true), "mayaErrorHandling(...)");
                kotlin.jvm.internal.j.g(userActivity2, "userActivity");
                ((MayaBaseFragment) ((F7.c) oVar2.c.get())).w1();
                jk.b.w((F7.c) oVar2.c.get(), userActivity2);
                break;
            default:
                PurchasedTicket purchasedTicket = (PurchasedTicket) obj;
                o oVar3 = this.f226b;
                UserActivity userActivity3 = this.c;
                ((MayaBaseFragment) ((F7.c) oVar3.c.get())).w1();
                G7.r rVar = ((MayaTransactionsFragment) ((F7.c) oVar3.c.get())).f12205s0;
                if (rVar != null) {
                    ((MayaTransactionsActivity) rVar).V1().Z(userActivity3, purchasedTicket);
                }
                break;
        }
    }
}
