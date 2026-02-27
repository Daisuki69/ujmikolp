package n0;

import D.S;
import We.s;
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CleverTapInstanceConfig f18543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18544b;

    public d(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f18544b = context;
        this.f18543a = cleverTapInstanceConfig;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            synchronized (d.class) {
                try {
                    File file = new File(this.f18544b.getFilesDir(), str);
                    if (file.exists()) {
                        if (file.delete()) {
                            S sC = this.f18543a.c();
                            sC.getClass();
                            S.s(this.f18543a.f9439a, "File Deleted:" + str);
                        } else {
                            S sC2 = this.f18543a.c();
                            sC2.getClass();
                            S.s(this.f18543a.f9439a, "Failed to delete file" + str);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            S sC3 = this.f18543a.c();
            String str2 = this.f18543a.f9439a;
            StringBuilder sbW = s.w("writeFileOnInternalStorage: failed", str, " Error:");
            sbW.append(e.getLocalizedMessage());
            String string = sbW.toString();
            sC3.getClass();
            S.s(str2, string);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            com.clevertap.android.sdk.CleverTapInstanceConfig r0 = r7.f18543a
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            android.content.Context r3 = r7.f18544b     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            r2.append(r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            r2.append(r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L66 java.lang.Exception -> L6a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            r2.<init>()     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L62
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
        L36:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            if (r1 == 0) goto L46
            r2.append(r1)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            goto L36
        L40:
            r0 = move-exception
        L41:
            r1 = r8
            goto La2
        L44:
            r1 = move-exception
            goto L6f
        L46:
            r8.close()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L44
            r8.close()
            r3.close()
            r4.close()
            return r0
        L57:
            r0 = move-exception
            r4 = r1
            goto L41
        L5a:
            r2 = move-exception
            r4 = r1
        L5c:
            r1 = r2
            goto L6f
        L5e:
            r0 = move-exception
            r3 = r1
            r4 = r3
            goto L41
        L62:
            r2 = move-exception
            r3 = r1
            r4 = r3
            goto L5c
        L66:
            r0 = move-exception
            r3 = r1
            r4 = r3
            goto La2
        L6a:
            r8 = move-exception
            r3 = r1
            r4 = r3
            r1 = r8
            r8 = r4
        L6f:
            D.S r2 = r0.c()     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.f9439a     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r5.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r6 = "[Exception While Reading: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r1.getLocalizedMessage()     // Catch: java.lang.Throwable -> L40
            r5.append(r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L40
            r2.getClass()     // Catch: java.lang.Throwable -> L40
            D.S.s(r0, r1)     // Catch: java.lang.Throwable -> L40
            if (r8 == 0) goto L95
            r8.close()
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            if (r4 == 0) goto L9f
            r4.close()
        L9f:
            java.lang.String r8 = ""
            return r8
        La2:
            if (r1 == 0) goto La7
            r1.close()
        La7:
            if (r3 == 0) goto Lac
            r3.close()
        Lac:
            if (r4 == 0) goto Lb1
            r4.close()
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.d.b(java.lang.String):java.lang.String");
    }

    public final void c(JSONObject jSONObject, String str, String str2) throws IOException {
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        synchronized (d.class) {
                            try {
                                File file = new File(this.f18544b.getFilesDir(), str);
                                if (!file.exists() && !file.mkdir()) {
                                    return;
                                }
                                FileWriter fileWriter2 = new FileWriter(new File(file, str2), false);
                                try {
                                    fileWriter2.append((CharSequence) jSONObject.toString());
                                    fileWriter2.flush();
                                    fileWriter2.close();
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileWriter = fileWriter2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    S sC = this.f18543a.c();
                    String str3 = this.f18543a.f9439a;
                    String str4 = "writeFileOnInternalStorage: failed" + e.getLocalizedMessage();
                    sC.getClass();
                    S.s(str3, str4);
                    if (fileWriter != null) {
                        fileWriter.close();
                    }
                }
            } catch (Throwable th4) {
                if (fileWriter != null) {
                    fileWriter.close();
                }
                throw th4;
            }
        }
    }
}
