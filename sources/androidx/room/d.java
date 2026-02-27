package androidx.room;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f8181b;
    public final /* synthetic */ String c;

    public /* synthetic */ d(QueryInterceptorDatabase queryInterceptorDatabase, String str, int i) {
        this.f8180a = i;
        this.f8181b = queryInterceptorDatabase;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8180a) {
            case 0:
                QueryInterceptorDatabase.query$lambda$6(this.f8181b, this.c);
                break;
            default:
                QueryInterceptorDatabase.execSQL$lambda$10(this.f8181b, this.c);
                break;
        }
    }
}
