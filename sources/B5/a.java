package B5;

import com.paymaya.common.utility.A;
import com.paymaya.domain.model.MaintenanceDynamicConfig;
import com.paymaya.domain.model.UpdaterConfigDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Ch.f, Ch.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f347b = new a(0);
    public static final a c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f348d = new a(2);
    public static final a e = new a(3);
    public static final a f = new a(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f349a;

    public /* synthetic */ a(int i) {
        this.f349a = i;
    }

    @Override // Ch.c
    public void accept(Object obj) {
        Throwable throwable = (Throwable) obj;
        kotlin.jvm.internal.j.g(throwable, "throwable");
        throwable.getMessage();
        yk.a.h();
    }

    @Override // Ch.f
    public Object apply(Object obj) {
        switch (this.f349a) {
            case 0:
                String maintenanceDynamicConfigJson = (String) obj;
                kotlin.jvm.internal.j.g(maintenanceDynamicConfigJson, "maintenanceDynamicConfigJson");
                Object objE = A.f10366a.e(maintenanceDynamicConfigJson, MaintenanceDynamicConfig.class);
                kotlin.jvm.internal.j.f(objE, "fromJson(...)");
                return (MaintenanceDynamicConfig) objE;
            case 1:
            default:
                Throwable error = (Throwable) obj;
                kotlin.jvm.internal.j.g(error, "error");
                error.printStackTrace();
                return Ah.h.d(c.f);
            case 2:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.j.g(it, "it");
                return Ah.h.d(c.f352g);
            case 3:
                String updaterDetailsJson = (String) obj;
                kotlin.jvm.internal.j.g(updaterDetailsJson, "updaterDetailsJson");
                UpdaterConfigDetails updaterConfigDetails = (UpdaterConfigDetails) A.f10366a.e(updaterDetailsJson, UpdaterConfigDetails.class);
                return updaterConfigDetails == null ? c.f : updaterConfigDetails;
        }
    }
}
