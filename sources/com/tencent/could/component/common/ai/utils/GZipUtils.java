package com.tencent.could.component.common.ai.utils;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public class GZipUtils {
    public static final String TAG = "GZipUtils";

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0048: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:73), block:B:17:0x0048 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] compress(java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r0 = " gzip.close(): "
            java.lang.String r1 = "GZipUtils"
            java.lang.String r2 = "compress Exception e: "
            r3 = 0
            if (r7 == 0) goto La6
            int r4 = r7.length()
            if (r4 != 0) goto L11
            goto La6
        L11:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            r4.<init>()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5b
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L4e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = "UTF-8"
            byte[] r7 = r7.getBytes(r6)     // Catch: java.lang.Throwable -> L4c
            r5.write(r7)     // Catch: java.lang.Throwable -> L4c
            r5.close()     // Catch: java.lang.Throwable -> L4c
            byte[] r7 = r4.toByteArray()     // Catch: java.lang.Throwable -> L4c
            r4.close()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
            r5.close()     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r2.getLocalizedMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r1, r0)
            return r7
        L47:
            r7 = move-exception
            r3 = r5
            goto L8b
        L4a:
            r7 = move-exception
            goto L5d
        L4c:
            r7 = move-exception
            goto L50
        L4e:
            r7 = move-exception
            r5 = r3
        L50:
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r4 = move-exception
            r7.addSuppressed(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
        L58:
            throw r7     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4a
        L59:
            r7 = move-exception
            goto L8b
        L5b:
            r7 = move-exception
            r5 = r3
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r7.getLocalizedMessage()     // Catch: java.lang.Throwable -> L47
            r4.append(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L47
            android.util.Log.e(r1, r7)     // Catch: java.lang.Throwable -> L47
            if (r5 == 0) goto L8a
            r5.close()     // Catch: java.io.IOException -> L76
            goto L8a
        L76:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r7 = r7.getLocalizedMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r1, r7)
        L8a:
            return r3
        L8b:
            if (r3 == 0) goto La5
            r3.close()     // Catch: java.io.IOException -> L91
            goto La5
        L91:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r2.getLocalizedMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r1, r0)
        La5:
            throw r7
        La6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.could.component.common.ai.utils.GZipUtils.compress(java.lang.String):byte[]");
    }

    public static boolean isGzip(byte[] bArr) {
        return ((bArr[1] & 255) | (bArr[0] << 8)) == 8075;
    }

    public static String uncompressToString(byte[] bArr) {
        GZIPInputStream gZIPInputStream;
        byte[] bArr2;
        String string = null;
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        try {
                            bArr2 = new byte[256];
                        } finally {
                        }
                    } finally {
                    }
                    while (true) {
                        int i = gZIPInputStream.read(bArr2);
                        if (i < 0) {
                            string = byteArrayOutputStream.toString("UTF-8");
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            byteArrayOutputStream.close();
                            return string;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i);
                    }
                } finally {
                }
            } catch (IOException e) {
                Log.e(TAG, "uncompressToString Exception e: " + e.getLocalizedMessage());
            }
        }
        return string;
    }
}
