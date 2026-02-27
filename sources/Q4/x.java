package Q4;

import M8.A0;
import defpackage.Location;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f5257a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar) {
        super(2);
        this.f5257a = yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String string;
        Location location = (Location) obj;
        R4.a aVar = (R4.a) obj2;
        if (location == null || (string = location.toString()) == null) {
            string = aVar != null ? aVar.f5455a : "invalid call";
        }
        y yVar = this.f5257a;
        String strC = kotlin.jvm.internal.z.a(yVar.getClass()).c();
        if (strC == null) {
            strC = "LocationRepository";
        }
        A0.w(2, string, strC);
        yVar.f5258d = location;
        G4.b bVar = yVar.f1548b;
        if (bVar != null) {
            bVar.b(new K4.r(location));
        }
        return Unit.f18162a;
    }
}
