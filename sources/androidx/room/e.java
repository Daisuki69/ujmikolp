package androidx.room;

import androidx.sqlite.db.SupportSQLiteQuery;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorDatabase f8183b;
    public final /* synthetic */ SupportSQLiteQuery c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ QueryInterceptorProgram f8184d;

    public /* synthetic */ e(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, int i) {
        this.f8182a = i;
        this.f8183b = queryInterceptorDatabase;
        this.c = supportSQLiteQuery;
        this.f8184d = queryInterceptorProgram;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8182a) {
            case 0:
                QueryInterceptorDatabase.query$lambda$8(this.f8183b, this.c, this.f8184d);
                break;
            default:
                QueryInterceptorDatabase.query$lambda$9(this.f8183b, this.c, this.f8184d);
                break;
        }
    }
}
