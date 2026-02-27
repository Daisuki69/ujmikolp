package l3;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1798a extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }
}
