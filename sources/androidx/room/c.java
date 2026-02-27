package androidx.room;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f8179b;

    public /* synthetic */ c(QueryInterceptorDatabase queryInterceptorDatabase, int i) {
        this.f8178a = i;
        this.f8179b = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8178a) {
            case 0:
                QueryInterceptorDatabase.endTransaction$lambda$4(this.f8179b);
                break;
            case 1:
                QueryInterceptorDatabase.beginTransactionWithListenerNonExclusive$lambda$3(this.f8179b);
                break;
            case 2:
                QueryInterceptorDatabase.beginTransaction$lambda$0(this.f8179b);
                break;
            case 3:
                QueryInterceptorDatabase.setTransactionSuccessful$lambda$5(this.f8179b);
                break;
            case 4:
                QueryInterceptorDatabase.beginTransactionNonExclusive$lambda$1(this.f8179b);
                break;
            default:
                QueryInterceptorDatabase.beginTransactionWithListener$lambda$2(this.f8179b);
                break;
        }
    }
}
