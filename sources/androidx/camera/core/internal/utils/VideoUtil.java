package androidx.camera.core.internal.utils;

/* JADX INFO: loaded from: classes.dex */
public final class VideoUtil {
    private static final String TAG = "VideoUtil";

    private VideoUtil() {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getAbsolutePathFromUri(@androidx.annotation.NonNull android.content.ContentResolver r9, @androidx.annotation.NonNull android.net.Uri r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "_data"
            java.lang.String r1 = "Failed in getting absolute path for Uri "
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L35
            r7 = 0
            r8 = 0
            r6 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32
            java.lang.Object r9 = androidx.core.util.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32
            android.database.Cursor r9 = (android.database.Cursor) r9     // Catch: java.lang.Throwable -> L2f java.lang.RuntimeException -> L32
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2b
            r9.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2b
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2b
            r9.close()
            return r10
        L27:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L66
        L2b:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L38
        L2f:
            r0 = move-exception
            r10 = r0
            goto L66
        L32:
            r0 = move-exception
        L33:
            r10 = r0
            goto L38
        L35:
            r0 = move-exception
            r4 = r10
            goto L33
        L38:
            java.lang.String r9 = "VideoUtil"
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L63
            r3.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = " with Exception "
            r3.append(r0)     // Catch: java.lang.Throwable -> L63
            r3.append(r10)     // Catch: java.lang.Throwable -> L63
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L63
            androidx.camera.core.Logger.e(r9, r10)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r9 = ""
            if (r2 == 0) goto L60
            r2.close()
        L60:
            return r9
        L61:
            r10 = r9
            goto L66
        L63:
            r0 = move-exception
            r9 = r0
            goto L61
        L66:
            if (r2 == 0) goto L6b
            r2.close()
        L6b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.internal.utils.VideoUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }
}
