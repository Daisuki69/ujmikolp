package O1;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: renamed from: O1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0519m extends C0512h implements SortedSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0 f4597d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0519m(p0 p0Var, SortedMap sortedMap) {
        super(p0Var, sortedMap);
        this.f4597d = p0Var;
    }

    public SortedMap a() {
        return (SortedMap) this.f4588b;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C0519m(this.f4597d, a().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C0519m(this.f4597d, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C0519m(this.f4597d, a().tailMap(obj));
    }
}
