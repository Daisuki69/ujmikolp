package bg;

import android.os.health.HealthStats;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0970J extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1008l f8817b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0970J(C1008l c1008l, int i) {
        super(1);
        this.f8816a = i;
        this.f8817b = c1008l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8816a) {
            case 0:
                HealthStats healthStatsJ = androidx.webkit.internal.a.j(this.f8817b.f9092d.getValue());
                if (healthStatsJ != null) {
                    return String.valueOf(healthStatsJ.getTimerKeyCount());
                }
                return null;
            case 1:
                C1008l c1008l = this.f8817b;
                return S1.r.a(c1008l, c1008l, 10022);
            case 2:
                C1008l c1008l2 = this.f8817b;
                return S1.r.a(c1008l2, c1008l2, 10050);
            case 3:
                C1008l c1008l3 = this.f8817b;
                HealthStats _healthStats = C1008l.h(c1008l3);
                kotlin.jvm.internal.j.c(_healthStats, "_healthStats");
                return C1008l.j(c1008l3, _healthStats, 10061);
            case 4:
                C1008l c1008l4 = this.f8817b;
                return S1.r.a(c1008l4, c1008l4, 10059);
            case 5:
                C1008l c1008l5 = this.f8817b;
                return S1.r.a(c1008l5, c1008l5, 10017);
            case 6:
                C1008l c1008l6 = this.f8817b;
                HealthStats _healthStats2 = C1008l.h(c1008l6);
                kotlin.jvm.internal.j.c(_healthStats2, "_healthStats");
                return C1008l.k(c1008l6, _healthStats2, 10061);
            case 7:
                C1008l c1008l7 = this.f8817b;
                return S1.r.a(c1008l7, c1008l7, 10046);
            case 8:
                C1008l c1008l8 = this.f8817b;
                return S1.r.a(c1008l8, c1008l8, 10056);
            case 9:
                C1008l c1008l9 = this.f8817b;
                HealthStats _healthStats3 = C1008l.h(c1008l9);
                kotlin.jvm.internal.j.c(_healthStats3, "_healthStats");
                return C1008l.j(c1008l9, _healthStats3, 10042);
            case 10:
                C1008l c1008l10 = this.f8817b;
                return S1.r.a(c1008l10, c1008l10, 10064);
            case 11:
                C1008l c1008l11 = this.f8817b;
                return S1.r.a(c1008l11, c1008l11, 10051);
            case 12:
                C1008l c1008l12 = this.f8817b;
                HealthStats _healthStats4 = C1008l.h(c1008l12);
                kotlin.jvm.internal.j.c(_healthStats4, "_healthStats");
                return C1008l.k(c1008l12, _healthStats4, 10042);
            case 13:
                HealthStats healthStatsJ2 = androidx.webkit.internal.a.j(this.f8817b.f9092d.getValue());
                if (healthStatsJ2 != null) {
                    return String.valueOf(healthStatsJ2.getMeasurementKeyCount());
                }
                return null;
            case 14:
                C1008l c1008l13 = this.f8817b;
                return S1.r.a(c1008l13, c1008l13, 10018);
            case 15:
                C1008l c1008l14 = this.f8817b;
                HealthStats _healthStats5 = C1008l.h(c1008l14);
                kotlin.jvm.internal.j.c(_healthStats5, "_healthStats");
                return C1008l.j(c1008l14, _healthStats5, 10043);
            case 16:
                C1008l c1008l15 = this.f8817b;
                return S1.r.a(c1008l15, c1008l15, 10024);
            case 17:
                C1008l c1008l16 = this.f8817b;
                return S1.r.a(c1008l16, c1008l16, 10057);
            case 18:
                C1008l c1008l17 = this.f8817b;
                HealthStats _healthStats6 = C1008l.h(c1008l17);
                kotlin.jvm.internal.j.c(_healthStats6, "_healthStats");
                return C1008l.k(c1008l17, _healthStats6, 10043);
            case 19:
                C1008l c1008l18 = this.f8817b;
                return S1.r.a(c1008l18, c1008l18, 10027);
            case 20:
                C1008l c1008l19 = this.f8817b;
                HealthStats healthStatsJ3 = androidx.webkit.internal.a.j(c1008l19.e.getValue());
                if (healthStatsJ3 != null) {
                    return C1008l.i(c1008l19, healthStatsJ3, 30005);
                }
                return null;
            case 21:
                C1008l c1008l20 = this.f8817b;
                HealthStats _healthStats7 = C1008l.h(c1008l20);
                kotlin.jvm.internal.j.c(_healthStats7, "_healthStats");
                return C1008l.j(c1008l20, _healthStats7, 10041);
            case 22:
                C1008l c1008l21 = this.f8817b;
                return S1.r.a(c1008l21, c1008l21, 10048);
            case 23:
                C1008l c1008l22 = this.f8817b;
                HealthStats healthStatsJ4 = androidx.webkit.internal.a.j(c1008l22.e.getValue());
                if (healthStatsJ4 != null) {
                    return C1008l.i(c1008l22, healthStatsJ4, 30004);
                }
                return null;
            case 24:
                C1008l c1008l23 = this.f8817b;
                HealthStats _healthStats8 = C1008l.h(c1008l23);
                kotlin.jvm.internal.j.c(_healthStats8, "_healthStats");
                return C1008l.k(c1008l23, _healthStats8, 10041);
            case 25:
                C1008l c1008l24 = this.f8817b;
                return S1.r.a(c1008l24, c1008l24, 10025);
            case 26:
                C1008l c1008l25 = this.f8817b;
                return S1.r.a(c1008l25, c1008l25, 30006);
            case 27:
                C1008l c1008l26 = this.f8817b;
                HealthStats _healthStats9 = C1008l.h(c1008l26);
                kotlin.jvm.internal.j.c(_healthStats9, "_healthStats");
                return C1008l.j(c1008l26, _healthStats9, 10039);
            case 28:
                C1008l c1008l27 = this.f8817b;
                return S1.r.a(c1008l27, c1008l27, 10054);
            default:
                C1008l c1008l28 = this.f8817b;
                HealthStats healthStatsJ5 = androidx.webkit.internal.a.j(c1008l28.e.getValue());
                if (healthStatsJ5 != null) {
                    return C1008l.i(c1008l28, healthStatsJ5, 30003);
                }
                return null;
        }
    }
}
