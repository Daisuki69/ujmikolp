package ei;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: ei.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1447b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16681a;

    public C1447b(HashMap map) {
        if (map.isEmpty()) {
            this.f16681a = Collections.EMPTY_MAP;
        } else {
            this.f16681a = androidx.media3.datasource.cache.c.r(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1447b.class == obj.getClass() && Objects.equals(this.f16681a, ((C1447b) obj).f16681a);
    }

    public final int hashCode() {
        return Objects.hash(null, this.f16681a);
    }
}
