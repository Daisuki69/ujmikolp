package A7;

import G7.G;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.domain.model.DecoratedActivity;
import com.paymaya.domain.model.Decoration;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.TransferPersonalizationMeta;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaWalletFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f250b;
    public final /* synthetic */ UserActivity c;

    public /* synthetic */ z(A a8, UserActivity userActivity, int i) {
        this.f249a = i;
        this.f250b = a8;
        this.c = userActivity;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f249a) {
            case 0:
                DecoratedActivity decoratedActivity = (DecoratedActivity) obj;
                kotlin.jvm.internal.j.g(decoratedActivity, "decoratedActivity");
                A a8 = this.f250b;
                UserActivity userActivity = this.c;
                a8.getClass();
                kotlin.jvm.internal.j.g(userActivity, "userActivity");
                Decoration mDecoration = decoratedActivity.getMDecoration();
                TransferPersonalizationMeta mMeta = decoratedActivity.getMMeta();
                String mProvider = decoratedActivity.getMProvider();
                if (mMeta == null) {
                    if (mDecoration != null) {
                        UserActivity userActivityBuild = userActivity.toBuilder().mDecoration(mDecoration).build();
                        ((MayaBaseFragment) ((F7.s) a8.c.get())).w1();
                        F7.s sVar = (F7.s) a8.c.get();
                        kotlin.jvm.internal.j.d(userActivityBuild);
                        ((MayaWalletFragment) sVar).a2(userActivityBuild);
                    }
                } else if (kotlin.jvm.internal.j.b(mProvider, "paymaya") && mDecoration != null) {
                    UserActivity userActivityBuild2 = userActivity.toBuilder().mDecoration(mDecoration).build();
                    ((MayaBaseFragment) ((F7.s) a8.c.get())).w1();
                    F7.s sVar2 = (F7.s) a8.c.get();
                    kotlin.jvm.internal.j.d(userActivityBuild2);
                    ((MayaWalletFragment) sVar2).a2(userActivityBuild2);
                } else if (kotlin.jvm.internal.j.b(mProvider, "giphy")) {
                    UserActivity userActivityBuild3 = userActivity.toBuilder().mProvider(mProvider).mTransferPersonalizationMeta(mMeta).build();
                    ((MayaBaseFragment) ((F7.s) a8.c.get())).w1();
                    F7.s sVar3 = (F7.s) a8.c.get();
                    kotlin.jvm.internal.j.d(userActivityBuild3);
                    ((MayaWalletFragment) sVar3).a2(userActivityBuild3);
                }
                break;
            case 1:
                A a10 = this.f250b;
                UserActivity userActivity2 = this.c;
                kotlin.jvm.internal.j.f(a10.f((Throwable) obj, true), "mayaErrorHandling(...)");
                kotlin.jvm.internal.j.g(userActivity2, "userActivity");
                ((MayaBaseFragment) ((F7.s) a10.c.get())).w1();
                ((MayaWalletFragment) ((F7.s) a10.c.get())).a2(userActivity2);
                break;
            default:
                PurchasedTicket purchasedTicket = (PurchasedTicket) obj;
                A a11 = this.f250b;
                UserActivity userActivity3 = this.c;
                a11.getClass();
                kotlin.jvm.internal.j.g(userActivity3, "userActivity");
                ((MayaBaseFragment) ((F7.s) a11.c.get())).w1();
                MayaWalletFragment mayaWalletFragment = (MayaWalletFragment) ((F7.s) a11.c.get());
                mayaWalletFragment.getClass();
                G g8 = mayaWalletFragment.f12245k1;
                if (g8 != null) {
                    ((MayaDashboardActivity) g8).i2(userActivity3, purchasedTicket);
                }
                break;
        }
    }
}
