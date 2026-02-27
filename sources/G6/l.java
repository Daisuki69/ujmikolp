package G6;

import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.PushNotification;
import com.paymaya.domain.model.SevenElevenPushNotification;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Ch.g, Ch.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f1797b = new l(0);
    public static final l c = new l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f1798d = new l(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1799a;

    public /* synthetic */ l(int i) {
        this.f1799a = i;
    }

    @Override // Ch.b
    public Object a(Object obj, Object obj2) {
        AddMoneyViaCardSettings settings = (AddMoneyViaCardSettings) obj;
        List cards = (List) obj2;
        kotlin.jvm.internal.j.g(settings, "settings");
        kotlin.jvm.internal.j.g(cards, "cards");
        return new Pair(cards, settings);
    }

    @Override // Ch.g
    public boolean test(Object obj) {
        switch (this.f1799a) {
            case 0:
                return ((PushNotification) obj) instanceof SevenElevenPushNotification;
            default:
                List loadUpPartners = (List) obj;
                kotlin.jvm.internal.j.g(loadUpPartners, "loadUpPartners");
                return !loadUpPartners.isEmpty();
        }
    }
}
