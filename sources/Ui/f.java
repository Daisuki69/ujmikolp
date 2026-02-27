package Ui;

import com.dynatrace.android.agent.Global;
import io.split.android.client.dtos.MatcherCombiner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MatcherCombiner f5992b;

    public f(MatcherCombiner matcherCombiner, List list) {
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f5991a = listUnmodifiableList;
        this.f5992b = matcherCombiner;
        if (listUnmodifiableList.size() <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public final boolean a(String str, HashMap map, U8.c cVar) {
        Object obj;
        List<c> list = this.f5991a;
        if (list.isEmpty()) {
            return false;
        }
        MatcherCombiner matcherCombiner = MatcherCombiner.AND;
        MatcherCombiner matcherCombiner2 = this.f5992b;
        if (matcherCombiner2 != matcherCombiner) {
            throw new IllegalArgumentException("Unknown combiner: " + matcherCombiner2);
        }
        boolean zC = true;
        for (c cVar2 : list) {
            b bVar = cVar2.f5986b;
            String str2 = cVar2.f5985a;
            zC &= str2 == null ? bVar.c(str, map, cVar) : (map == null || (obj = map.get(str2)) == null) ? false : bVar.c(obj, null, null);
        }
        return zC;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5992b.equals(fVar.f5992b) && this.f5991a.equals(fVar.f5991a);
    }

    public final int hashCode() {
        return this.f5992b.hashCode() + (this.f5991a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("if");
        boolean z4 = true;
        for (c cVar : this.f5991a) {
            if (!z4) {
                sb2.append(Global.BLANK);
                sb2.append(this.f5992b);
            }
            sb2.append(Global.BLANK);
            sb2.append(cVar);
            z4 = false;
        }
        return sb2.toString();
    }
}
