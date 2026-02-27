package net.zetetic.database.sqlcipher;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class SQLiteDebug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f18699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f18700b;

    public static class DbStats {
        public DbStats(String str, long j, long j6, int i, int i4, int i6, int i10) {
        }
    }

    public static class PagerStats {
        public int largestMemAlloc;
        public int memoryUsed;
        public int pageCacheOverflow;
    }

    static {
        Log.isLoggable("SQLiteLog", 2);
        f18699a = Log.isLoggable("SQLiteStatements", 2);
        f18700b = Log.isLoggable("SQLiteTime", 2);
    }

    private static native void nativeGetPagerStats(PagerStats pagerStats);
}
