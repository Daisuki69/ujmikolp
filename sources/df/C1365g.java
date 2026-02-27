package df;

import com.paymaya.domain.store.L;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: df.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1365g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f16439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16440b;
    public final x c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f16441d;
    public final Map e;
    public volatile q f;

    public C1365g(Ci.b bVar) {
        this.f16439a = (z) bVar.f785b;
        this.f16440b = (String) bVar.c;
        L l6 = (L) bVar.f786d;
        l6.getClass();
        this.c = new x(l6);
        this.f16441d = (i) bVar.e;
        byte[] bArr = ef.c.f16663a;
        Map map = (Map) bVar.f;
        this.e = map.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public final Ci.b a() {
        Ci.b bVar = new Ci.b(false);
        Object linkedHashMap = Collections.EMPTY_MAP;
        bVar.f = linkedHashMap;
        bVar.f785b = this.f16439a;
        bVar.c = this.f16440b;
        bVar.e = this.f16441d;
        Map map = this.e;
        if (!map.isEmpty()) {
            linkedHashMap = new LinkedHashMap(map);
        }
        bVar.f = linkedHashMap;
        bVar.f786d = this.c.a();
        return bVar;
    }

    public final String toString() {
        return "Request{method=" + this.f16440b + ", url=" + this.f16439a + ", tags=" + this.e + '}';
    }
}
