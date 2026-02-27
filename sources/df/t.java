package df;

/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f16487b;
    public String[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16488d;

    public t(boolean z4) {
        this.f16486a = z4;
    }

    public final void a(s... sVarArr) {
        if (!this.f16486a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        int length = sVarArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < sVarArr.length; i++) {
            strArr[i] = sVarArr[i].f16485a;
        }
        if (!this.f16486a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f16487b = (String[]) strArr.clone();
    }

    public final void b(EnumC1358D... enumC1358DArr) {
        if (!this.f16486a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        int length = enumC1358DArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < enumC1358DArr.length; i++) {
            strArr[i] = enumC1358DArr[i].f16400a;
        }
        if (!this.f16486a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.c = (String[]) strArr.clone();
    }
}
