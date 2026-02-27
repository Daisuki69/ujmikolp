package A7;

import defpackage.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pg.t f207b;

    public /* synthetic */ d(pg.t tVar, int i) {
        this.f206a = i;
        this.f207b = tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Location location = (Location) obj;
        R4.a aVar = (R4.a) obj2;
        switch (this.f206a) {
            case 0:
                pg.t tVar = this.f207b;
                if (location == null) {
                    int i = aVar == null ? -1 : e.f208a[aVar.ordinal()];
                    if (i == 1) {
                        tVar.error("1100", aVar.f5455a, aVar.name());
                    } else if (i == 2) {
                        tVar.error("1102", aVar.f5455a, aVar.name());
                    } else if (i == 3) {
                        tVar.error("1103", aVar.f5455a, aVar.name());
                    } else if (i != 4) {
                        tVar.error("1104", "Location Not Found", "LOCATION_NOT_FOUND");
                    } else {
                        tVar.error("1001", aVar.f5455a, aVar.name());
                    }
                } else {
                    tVar.success("1000");
                }
                break;
            default:
                pg.t tVar2 = this.f207b;
                if (location == null) {
                    int i4 = aVar == null ? -1 : U8.a.f5960a[aVar.ordinal()];
                    if (i4 == 1) {
                        tVar2.error("1100", aVar.f5455a, aVar.name());
                    } else if (i4 == 2) {
                        tVar2.error("1102", aVar.f5455a, aVar.name());
                    } else if (i4 == 3) {
                        tVar2.error("1103", aVar.f5455a, aVar.name());
                    } else if (i4 != 4) {
                        tVar2.error("1104", "Location Not Found", "LOCATION_NOT_FOUND");
                    } else {
                        tVar2.error("1001", aVar.f5455a, aVar.name());
                    }
                } else {
                    tVar2.success("1000");
                }
                break;
        }
        return Unit.f18162a;
    }
}
