package O1;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends AbstractC0502c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient o0 f4603g;

    @Override // O1.AbstractC0522p
    public final Map f() {
        Map map = this.e;
        return map instanceof NavigableMap ? new C0514i(this, (NavigableMap) map) : map instanceof SortedMap ? new C0518l(this, (SortedMap) map) : new C0510g(this, map);
    }

    @Override // O1.AbstractC0522p
    public final Collection g() {
        return (List) this.f4603g.get();
    }

    @Override // O1.AbstractC0522p
    public final Set h() {
        Map map = this.e;
        return map instanceof NavigableMap ? new C0516j(this, (NavigableMap) map) : map instanceof SortedMap ? new C0519m(this, (SortedMap) map) : new C0512h(this, map);
    }
}
