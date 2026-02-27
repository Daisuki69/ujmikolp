package bg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: bg.G0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0965G0 implements Xf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xf.b f8807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.k f8808b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0965G0(Xf.b bVar, Function0 function0) {
        this.f8807a = bVar;
        this.f8808b = (kotlin.jvm.internal.k) function0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.k] */
    @Override // Xf.b
    public final void a(String messageName, LinkedHashMap linkedHashMap, Pair... tags) {
        kotlin.jvm.internal.j.h(messageName, "messageName");
        kotlin.jvm.internal.j.h(tags, "tags");
        if (this.f8808b.invoke() != null) {
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        Unit unit = Unit.f18162a;
        kotlin.jvm.internal.B b8 = new kotlin.jvm.internal.B(0);
        b8.a(tags);
        Pair pair = new Pair("module_ver", "4.5.0");
        ArrayList arrayList = b8.f18173a;
        arrayList.add(pair);
        this.f8807a.a(messageName, linkedHashMap2, (Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.k] */
    @Override // Xf.b
    public final void b(String str, Exception ex, LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.j.h(ex, "ex");
        if (this.f8808b.invoke() != null) {
            throw new ClassCastException();
        }
        LinkedHashMap linkedHashMapI = cj.M.i(new Pair("tag:module_ver", "4.5.0"));
        if (linkedHashMap != null) {
            linkedHashMapI.putAll(linkedHashMap);
        }
        Unit unit = Unit.f18162a;
        this.f8807a.b(str, ex, linkedHashMapI);
    }
}
