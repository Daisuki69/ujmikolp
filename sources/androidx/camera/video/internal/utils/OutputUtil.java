package androidx.camera.video.internal.utils;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class OutputUtil {
    private static final String TAG = "OutputUtil";

    private OutputUtil() {
    }

    public static boolean createParentFolder(@NonNull File file) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return false;
        }
        return parentFile.exists() ? parentFile.isDirectory() : parentFile.mkdirs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.database.Cursor] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getAbsolutePathFromUri(@androidx.annotation.NonNull android.content.ContentResolver r9, @androidx.annotation.NonNull android.net.Uri r10, @androidx.annotation.NonNull java.lang.String r11) {
        /*
            java.lang.String r1 = "Failed in getting absolute path for Uri "
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L35
            r7 = 0
            r8 = 0
            r6 = 0
            r3 = r9
            r4 = r10
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e java.lang.RuntimeException -> L31
            if (r9 != 0) goto L18
            if (r9 == 0) goto L17
            r9.close()
        L17:
            return r2
        L18:
            int r10 = r9.getColumnIndexOrThrow(r11)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2b
            r9.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2b
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L2b
            r9.close()
            return r10
        L27:
            r0 = move-exception
            r10 = r0
            r2 = r9
            goto L5f
        L2b:
            r0 = move-exception
            r10 = r0
            goto L38
        L2e:
            r0 = move-exception
            r10 = r0
            goto L5f
        L31:
            r0 = move-exception
        L32:
            r10 = r0
            r9 = r2
            goto L38
        L35:
            r0 = move-exception
            r4 = r10
            goto L32
        L38:
            java.lang.String r11 = "OutputUtil"
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L27
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L27
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L27
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L27
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = " with Exception "
            r3.append(r0)     // Catch: java.lang.Throwable -> L27
            r3.append(r10)     // Catch: java.lang.Throwable -> L27
            java.lang.String r10 = r3.toString()     // Catch: java.lang.Throwable -> L27
            androidx.camera.core.Logger.e(r11, r10)     // Catch: java.lang.Throwable -> L27
            if (r9 == 0) goto L5e
            r9.close()
        L5e:
            return r2
        L5f:
            if (r2 == 0) goto L64
            r2.close()
        L64:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.utils.OutputUtil.getAbsolutePathFromUri(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }
}
