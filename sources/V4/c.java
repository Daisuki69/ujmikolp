package V4;

import android.app.Activity;
import android.os.Looper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import pg.l;
import pg.w;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements w {
    public static final int j = (g.class.hashCode() + 43) & 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f6058k = (g.class.hashCode() + 83) & 65535;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f6059a;
    public String e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f6062g;
    public l h;
    public byte[] i;
    public boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6061d = false;
    public int f = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f6060b = null;

    public c(Activity activity) {
        this.f6059a = activity;
    }

    public final void a(boolean z4) {
        if (this.h == null || this.e.equals("dir")) {
            return;
        }
        new b(this, Looper.getMainLooper(), z4).obtainMessage().sendToTarget();
    }

    public final void b(String str, String str2) {
        if (this.f6060b == null) {
            return;
        }
        a(false);
        this.f6060b.error(str, str2, null);
        this.f6060b = null;
    }

    public final void c(Serializable serializable) {
        a(false);
        if (this.f6060b != null) {
            if (serializable != null && !(serializable instanceof String)) {
                ArrayList arrayList = new ArrayList();
                for (a aVar : (ArrayList) serializable) {
                    aVar.getClass();
                    HashMap map = new HashMap();
                    map.put("path", aVar.f6053a);
                    map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, aVar.f6054b);
                    map.put("size", Long.valueOf(aVar.f6055d));
                    map.put("bytes", aVar.e);
                    map.put(Constants.IDENTIFIER, aVar.c.toString());
                    arrayList.add(map);
                }
                serializable = arrayList;
            }
            this.f6060b.success(serializable);
            this.f6060b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    @Override // pg.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            int r0 = V4.c.f6058k
            r1 = 0
            r2 = -1
            java.lang.String r3 = "FilePickerDelegate"
            r4 = 0
            r5 = 1
            if (r7 != r0) goto L70
            if (r8 != r2) goto L65
            if (r9 != 0) goto L10
            goto La5
        L10:
            r6.a(r5)
            android.net.Uri r7 = r9.getData()
            if (r7 == 0) goto L65
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.lang.String r0 = r0.getAbsolutePath()
            r9.append(r0)
            java.lang.String r0 = java.io.File.separator
            r9.append(r0)
            android.app.Activity r0 = r6.f6059a
            java.lang.String r2 = k2.v0.l(r0, r7)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.io.IOException -> L53
            java.io.OutputStream r7 = r0.openOutputStream(r7)     // Catch: java.io.IOException -> L53
            if (r7 == 0) goto L55
            byte[] r0 = r6.i     // Catch: java.io.IOException -> L53
            r7.write(r0)     // Catch: java.io.IOException -> L53
            r7.flush()     // Catch: java.io.IOException -> L53
            r7.close()     // Catch: java.io.IOException -> L53
            goto L55
        L53:
            r7 = move-exception
            goto L59
        L55:
            r6.c(r9)     // Catch: java.io.IOException -> L53
            return r5
        L59:
            java.lang.String r9 = "Error while saving file"
            android.util.Log.i(r3, r9, r7)
            java.lang.String r7 = r7.getMessage()
            r6.b(r9, r7)
        L65:
            if (r8 != 0) goto La5
            java.lang.String r7 = "User cancelled the save request"
            android.util.Log.i(r3, r7)
            r6.c(r1)
            goto La5
        L70:
            java.lang.String r0 = r6.e
            if (r0 != 0) goto L75
            goto La5
        L75:
            int r0 = V4.c.j
            if (r7 != r0) goto L8f
            if (r8 != r2) goto L8f
            r6.a(r5)
            java.lang.Thread r7 = new java.lang.Thread
            S1.v r8 = new S1.v
            r0 = 17
            r1 = 0
            r8.<init>(r0, r6, r9, r1)
            r7.<init>(r8)
            r7.start()
            return r5
        L8f:
            if (r7 != r0) goto L9c
            if (r8 != 0) goto L9c
            java.lang.String r7 = "User cancelled the picker request"
            android.util.Log.i(r3, r7)
            r6.c(r1)
            return r5
        L9c:
            if (r7 != r0) goto La5
            java.lang.String r7 = "unknown_activity"
            java.lang.String r8 = "Unknown activity error, please fill an issue."
            r6.b(r7, r8)
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.c.onActivityResult(int, int, android.content.Intent):boolean");
    }
}
