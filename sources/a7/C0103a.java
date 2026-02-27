package A7;

import com.paymaya.domain.model.Biller;
import com.paymaya.domain.model.PushNotification;
import com.paymaya.domain.model.ShopPurchaseHistoryPushNotification;
import java.util.HashMap;
import java.util.List;
import y5.AbstractC2509a;

/* JADX INFO: renamed from: A7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0103a implements Ch.g, Ch.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0103a f193b = new C0103a(0);
    public static final C0103a c = new C0103a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0103a f194d = new C0103a(2);
    public static final C0103a e = new C0103a(3);
    public static final C0103a f = new C0103a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f195a;

    public /* synthetic */ C0103a(int i) {
        this.f195a = i;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        switch (this.f195a) {
            case 1:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                break;
            case 5:
                Biller biller = (Biller) obj;
                J5.a aVarC = J5.a.c();
                kotlin.jvm.internal.j.f(aVarC, "getInstance(...)");
                ((HashMap) aVarC.f2414b).put(biller.mSlug(), biller);
                break;
            default:
                Biller biller2 = (Biller) obj;
                ((HashMap) J5.a.c().f2414b).put(biller2.mSlug(), biller2);
                break;
        }
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        switch (this.f195a) {
            case 0:
                return ((PushNotification) obj) instanceof ShopPurchaseHistoryPushNotification;
            case 1:
            default:
                List userActivities = (List) obj;
                kotlin.jvm.internal.j.g(userActivities, "userActivities");
                return !userActivities.isEmpty();
            case 2:
                List userActivities2 = (List) obj;
                kotlin.jvm.internal.j.g(userActivities2, "userActivities");
                return !userActivities2.isEmpty();
            case 3:
                List it = (List) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return !it.isEmpty();
        }
    }

    public /* synthetic */ C0103a(AbstractC2509a abstractC2509a, int i) {
        this.f195a = i;
    }
}
