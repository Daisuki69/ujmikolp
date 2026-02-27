package zj;

import cj.AbstractC1115a;
import cj.C1110A;
import cj.C1132s;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends AbstractC1115a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f21487a;

    public m(n nVar) {
        this.f21487a = nVar;
    }

    public final MatchGroup a(int i) {
        n nVar = this.f21487a;
        Matcher matcher = nVar.f21488a;
        IntRange intRangeF = kotlin.ranges.d.f(matcher.start(i), matcher.end(i));
        if (intRangeF.f18201a < 0) {
            return null;
        }
        String strGroup = nVar.f21488a.group(i);
        kotlin.jvm.internal.j.f(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeF);
    }

    @Override // cj.AbstractC1115a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // cj.AbstractC1115a
    public final int getSize() {
        return this.f21487a.f21488a.groupCount() + 1;
    }

    @Override // cj.AbstractC1115a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Rg.l(yj.q.n(C1110A.u(C1132s.e(this)), new l(this, 0)));
    }
}
