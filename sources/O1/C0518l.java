package O1;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: O1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0518l extends C0510g implements SortedMap {
    public SortedSet e;
    public final /* synthetic */ p0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0518l(p0 p0Var, SortedMap sortedMap) {
        super(p0Var, sortedMap);
        this.f = p0Var;
    }

    public SortedSet b() {
        return new C0519m(this.f, d());
    }

    @Override // O1.C0510g, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.e = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new C0518l(this.f, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C0518l(this.f, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C0518l(this.f, d().tailMap(obj));
    }
}
