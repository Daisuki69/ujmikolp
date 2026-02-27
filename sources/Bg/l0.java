package bg;

import android.os.health.HealthStats;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1008l f9094b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(C1008l c1008l, int i) {
        super(1);
        this.f9093a = i;
        this.f9094b = c1008l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9093a) {
            case 0:
                C1008l c1008l = this.f9094b;
                HealthStats _healthStats = C1008l.h(c1008l);
                kotlin.jvm.internal.j.c(_healthStats, "_healthStats");
                return C1008l.k(c1008l, _healthStats, 10039);
            case 1:
                C1008l c1008l2 = this.f9094b;
                return S1.r.a(c1008l2, c1008l2, 10049);
            case 2:
                C1008l c1008l3 = this.f9094b;
                HealthStats healthStatsJ = androidx.webkit.internal.a.j(c1008l3.e.getValue());
                if (healthStatsJ != null) {
                    return C1008l.i(c1008l3, healthStatsJ, 30002);
                }
                return null;
            case 3:
                C1008l c1008l4 = this.f9094b;
                HealthStats _healthStats2 = C1008l.h(c1008l4);
                kotlin.jvm.internal.j.c(_healthStats2, "_healthStats");
                return C1008l.j(c1008l4, _healthStats2, 10038);
            case 4:
                C1008l c1008l5 = this.f9094b;
                return S1.r.a(c1008l5, c1008l5, 10026);
            case 5:
                C1008l c1008l6 = this.f9094b;
                HealthStats healthStatsJ2 = androidx.webkit.internal.a.j(c1008l6.e.getValue());
                if (healthStatsJ2 != null) {
                    return C1008l.i(c1008l6, healthStatsJ2, 30001);
                }
                return null;
            case 6:
                C1008l c1008l7 = this.f9094b;
                HealthStats _healthStats3 = C1008l.h(c1008l7);
                kotlin.jvm.internal.j.c(_healthStats3, "_healthStats");
                return C1008l.k(c1008l7, _healthStats3, 10038);
            case 7:
                C1008l c1008l8 = this.f9094b;
                return S1.r.a(c1008l8, c1008l8, 10055);
            case 8:
                HealthStats healthStatsJ3 = androidx.webkit.internal.a.j(this.f9094b.f9092d.getValue());
                if (healthStatsJ3 != null) {
                    return String.valueOf(healthStatsJ3.getStatsKeyCount());
                }
                return null;
            case 9:
                C1008l c1008l9 = this.f9094b;
                HealthStats _healthStats4 = C1008l.h(c1008l9);
                kotlin.jvm.internal.j.c(_healthStats4, "_healthStats");
                return C1008l.j(c1008l9, _healthStats4, 10040);
            case 10:
                C1008l c1008l10 = this.f9094b;
                return S1.r.a(c1008l10, c1008l10, 10045);
            case 11:
                C1008l c1008l11 = this.f9094b;
                HealthStats _healthStats5 = C1008l.h(c1008l11);
                kotlin.jvm.internal.j.c(_healthStats5, "_healthStats");
                return C1008l.j(c1008l11, _healthStats5, 10032);
            case 12:
                C1008l c1008l12 = this.f9094b;
                HealthStats _healthStats6 = C1008l.h(c1008l12);
                kotlin.jvm.internal.j.c(_healthStats6, "_healthStats");
                return C1008l.k(c1008l12, _healthStats6, 10040);
            case 13:
                C1008l c1008l13 = this.f9094b;
                return S1.r.a(c1008l13, c1008l13, CameraAccessExceptionCompat.CAMERA_UNAVAILABLE_DO_NOT_DISTURB);
            case 14:
                C1008l c1008l14 = this.f9094b;
                HealthStats _healthStats7 = C1008l.h(c1008l14);
                kotlin.jvm.internal.j.c(_healthStats7, "_healthStats");
                return C1008l.k(c1008l14, _healthStats7, 10032);
            case 15:
                C1008l c1008l15 = this.f9094b;
                HealthStats _healthStats8 = C1008l.h(c1008l15);
                kotlin.jvm.internal.j.c(_healthStats8, "_healthStats");
                return C1008l.j(c1008l15, _healthStats8, 10044);
            case 16:
                C1008l c1008l16 = this.f9094b;
                return S1.r.a(c1008l16, c1008l16, 10003);
            case 17:
                C1008l c1008l17 = this.f9094b;
                HealthStats _healthStats9 = C1008l.h(c1008l17);
                kotlin.jvm.internal.j.c(_healthStats9, "_healthStats");
                return C1008l.j(c1008l17, _healthStats9, 10037);
            default:
                C1008l c1008l18 = this.f9094b;
                HealthStats _healthStats10 = C1008l.h(c1008l18);
                kotlin.jvm.internal.j.c(_healthStats10, "_healthStats");
                return C1008l.k(c1008l18, _healthStats10, 10044);
        }
    }
}
