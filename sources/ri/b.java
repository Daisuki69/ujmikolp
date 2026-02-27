package ri;

import g3.InterfaceC1498b;
import io.split.android.client.dtos.Identifiable;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class b implements Identifiable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient long f19958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("k")
    private final String f19959b;

    @InterfaceC1498b("fs")
    private final Set<String> c;

    public b(String str, Set set) {
        this.f19959b = str;
        this.c = set;
    }

    public final Set a() {
        return this.c;
    }

    public final String b() {
        return this.f19959b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f19959b.equals(bVar.f19959b) && this.c.equals(bVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.split.android.client.dtos.Identifiable
    public final long getId() {
        return this.f19958a;
    }

    public final int hashCode() {
        return this.c.hashCode() + this.f19959b.hashCode();
    }
}
