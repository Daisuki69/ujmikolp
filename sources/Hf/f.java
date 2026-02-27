package hf;

import df.C1362d;
import df.m;
import of.g;
import of.n;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17039b;
    public final n c;

    public f(String str, long j, n nVar) {
        this.f17038a = str;
        this.f17039b = j;
        this.c = nVar;
    }

    @Override // df.m
    public final long c() {
        return this.f17039b;
    }

    @Override // df.m
    public final C1362d f() {
        String str = this.f17038a;
        if (str == null) {
            return null;
        }
        try {
            return C1362d.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // df.m
    public final g g() {
        return this.c;
    }
}
