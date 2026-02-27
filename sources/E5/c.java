package e5;

import We.s;
import com.google.gson.annotations.JsonAdapter;
import com.paymaya.adkit.data.network.MapTypeAdapter;
import defpackage.AbstractC1414e;
import g3.InterfaceC1498b;
import java.util.Map;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("message")
    private final String f16604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("status")
    private final String f16605b;

    @JsonAdapter(MapTypeAdapter.class)
    @InterfaceC1498b("tags")
    private final Map<String, Object> c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @InterfaceC1498b("total")
    private final int f16606d;

    public final Map a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return j.b(this.f16604a, cVar.f16604a) && j.b(this.f16605b, cVar.f16605b) && j.b(this.c, cVar.c) && this.f16606d == cVar.f16606d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + AbstractC1414e.c(this.f16604a.hashCode() * 31, 31, this.f16605b)) * 31) + this.f16606d;
    }

    public final String toString() {
        String str = this.f16604a;
        String str2 = this.f16605b;
        Map<String, Object> map = this.c;
        int i = this.f16606d;
        StringBuilder sbX = s.x("UserTagResponseData(message=", str, ", status=", str2, ", tags=");
        sbX.append(map);
        sbX.append(", total=");
        sbX.append(i);
        sbX.append(")");
        return sbX.toString();
    }
}
