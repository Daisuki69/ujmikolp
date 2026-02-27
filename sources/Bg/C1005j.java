package bg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.health.HealthStats;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import zj.C2576A;

/* JADX INFO: renamed from: bg.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1005j extends kotlin.jvm.internal.k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9017b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1005j(int i, Object obj, Object obj2) {
        super(0);
        this.f9016a = i;
        this.f9017b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9016a) {
            case 0:
                HealthStats _healthStats = C1008l.h((C1008l) this.f9017b);
                kotlin.jvm.internal.j.c(_healthStats, "_healthStats");
                Map stats = _healthStats.hasStats(10014) ? _healthStats.getStats(10014) : null;
                if (stats != null) {
                    return androidx.webkit.internal.a.j(stats.get(((Context) this.c).getPackageName()));
                }
                return null;
            case 1:
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.c;
                vVar.f18192a = ((AbstractC0971J0) this.f9017b).a() + vVar.f18192a;
                return Unit.f18162a;
            case 2:
                return new C0976O((Context) this.c, ((C0962F) this.f9017b).f8803s);
            case 3:
                return Boolean.valueOf(C2576A.x((String) this.c, (String) this.f9017b, true));
            default:
                boolean z4 = false;
                try {
                    ((Context) this.c).getPackageManager().getPackageInfo((String) this.f9017b, 0);
                    z4 = true;
                } catch (PackageManager.NameNotFoundException unused) {
                }
                return Boolean.valueOf(z4);
        }
    }
}
