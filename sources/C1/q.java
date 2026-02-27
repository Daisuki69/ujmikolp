package c1;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Z0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f9243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f9244b;
    public final s c;

    public q(Set set, i iVar, s sVar) {
        this.f9243a = set;
        this.f9244b = iVar;
        this.c = sVar;
    }

    public final r a(String str, Z0.c cVar, Z0.f fVar) {
        Set set = this.f9243a;
        if (set.contains(cVar)) {
            return new r(this.f9244b, str, cVar, fVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
