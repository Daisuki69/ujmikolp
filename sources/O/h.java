package O;

import dOYHB6.tiZVw8.numX49;
import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f4515b;
    public static final /* synthetic */ h[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4516a;

    static {
        h hVar = new h(numX49.tnTj78("PzV"), 0, "template");
        h hVar2 = new h(numX49.tnTj78("Pzj"), 1, numX49.tnTj78("PzS"));
        f4515b = hVar2;
        h[] hVarArr = {hVar, hVar2};
        c = hVarArr;
        v0.h(hVarArr);
    }

    public h(String str, int i, String str2) {
        this.f4516a = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) c.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4516a;
    }
}
