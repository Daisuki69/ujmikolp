package androidx.room;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorStatement f8186b;

    public /* synthetic */ f(QueryInterceptorStatement queryInterceptorStatement, int i) {
        this.f8185a = i;
        this.f8186b = queryInterceptorStatement;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8185a) {
            case 0:
                QueryInterceptorStatement.simpleQueryForLong$lambda$3(this.f8186b);
                break;
            case 1:
                QueryInterceptorStatement.executeInsert$lambda$2(this.f8186b);
                break;
            case 2:
                QueryInterceptorStatement.simpleQueryForString$lambda$4(this.f8186b);
                break;
            case 3:
                QueryInterceptorStatement.execute$lambda$0(this.f8186b);
                break;
            default:
                QueryInterceptorStatement.executeUpdateDelete$lambda$1(this.f8186b);
                break;
        }
    }
}
