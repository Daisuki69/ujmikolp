package bg;

import ag.C0703m;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.E0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0961E0 extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1003i f8729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M5.c f8730b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0961E0(C1003i c1003i, M5.c cVar, ArrayList arrayList) {
        super(1);
        this.f8729a = c1003i;
        this.f8730b = cVar;
        this.c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<C0703m> filteredConfigurations = (List) obj;
        kotlin.jvm.internal.j.h(filteredConfigurations, "filteredConfigurations");
        ArrayList arrayList = new ArrayList();
        for (C0703m c0703m : filteredConfigurations) {
            Xf.a aVarA = c0703m.a();
            if (aVarA == null) {
                throw new TypeCastException("null cannot be cast to non-null type credoapp.module.meta.IMetaExtractor");
            }
            ((C1004i0) aVarA).f9014b = this.f8730b;
            String areaName = c0703m.a().d();
            try {
                arrayList.add(c0703m.a().b());
            } catch (Exception e) {
                String strC = X5.f.c(e);
                kotlin.jvm.internal.j.h(areaName, "areaName");
                arrayList.add(cj.L.c(new Pair(areaName, strC)));
                Xf.b bVar = this.f8729a.f8919a;
                if (bVar != null) {
                    bVar.b("Core", e, null);
                }
            }
            this.c.addAll(arrayList);
        }
        return Unit.f18162a;
    }
}
