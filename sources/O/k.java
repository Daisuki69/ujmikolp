package O;

import D.S;
import cj.L;
import cj.t;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f4522d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S f4523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4524b;
    public final LinkedHashMap c;

    public k(LinkedHashSet linkedHashSet, S s9) {
        this.f4523a = s9;
        int iB = L.b(t.l(linkedHashSet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(((b) obj).f4508a, obj);
        }
        this.f4524b = linkedHashMap;
        this.c = new LinkedHashMap();
    }
}
