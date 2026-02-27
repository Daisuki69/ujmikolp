package x3;

import D.S;
import We.s;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import b2.C0859a;
import b2.h;
import b2.n;
import ch.r;
import com.dynatrace.android.agent.conf.SessionSplitConfiguration;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.components.DependencyCycleException;
import com.google.firebase.messaging.p;
import d4.AbstractC1331a;
import fh.C1487c;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yf.j;
import zf.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements Qf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ExecutorService f20899a;

    public static int A(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    public static boolean B(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(extras.getString("google.c.a.e"));
    }

    public static int C(int[] iArr) {
        int i = 0;
        for (int i4 : iArr) {
            i += i4;
        }
        return i;
    }

    public static OutputStream D(OutputStream outputStream, yf.d dVar) {
        int iT = dVar.t(j.f21211b1, null, -1);
        return iT > 1 ? new g(outputStream, iT, Math.min(dVar.t(j.f21187P, null, 1), 32), dVar.t(j.f21248s, null, 8), dVar.t(j.f21191R, null, 1)) : outputStream;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Dj.r r4, kotlin.jvm.functions.Function0 r5, gj.InterfaceC1526a r6) {
        /*
            boolean r0 = r6 instanceof Dj.p
            if (r0 == 0) goto L13
            r0 = r6
            Dj.p r0 = (Dj.p) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            Dj.p r0 = new Dj.p
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1199b
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.functions.Function0 r5 = r0.f1198a
            bj.AbstractC1039j.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            bj.AbstractC1039j.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            Bj.m0 r2 = Bj.C0154m0.f630a
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L6e
            r0.f1198a = r5     // Catch: java.lang.Throwable -> L29
            r0.c = r3     // Catch: java.lang.Throwable -> L29
            Bj.l r6 = new Bj.l     // Catch: java.lang.Throwable -> L29
            gj.a r0 = hj.h.b(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.r()     // Catch: java.lang.Throwable -> L29
            Ag.q r0 = new Ag.q     // Catch: java.lang.Throwable -> L29
            r2 = 1
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            Dj.q r4 = (Dj.q) r4     // Catch: java.lang.Throwable -> L29
            r4.k0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.q()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f18162a
            return r4
        L6a:
            r5.invoke()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.d.b(Dj.r, kotlin.jvm.functions.Function0, gj.a):java.lang.Object");
    }

    public static FlutterEngine c(Context context) {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
        FlutterEngine flutterEngine = flutterEngineCache.get("checkoutFullscreen");
        if (flutterEngine != null) {
            return flutterEngine;
        }
        FlutterEngine flutterEngine2 = new FlutterEngine(context);
        flutterEngineCache.put("checkoutFullscreen", flutterEngine2);
        return flutterEngine2;
    }

    public static FlutterEngine d(Context context) {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
        FlutterEngine flutterEngine = flutterEngineCache.get("loadFullscreen");
        if (flutterEngine != null) {
            return flutterEngine;
        }
        FlutterEngine flutterEngine2 = new FlutterEngine(context);
        flutterEngineCache.put("loadFullscreen", flutterEngine2);
        return flutterEngine2;
    }

    public static FlutterEngine e(Context context) {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
        FlutterEngine flutterEngine = flutterEngineCache.get("autoDebitArrangementFullscreen");
        if (flutterEngine != null) {
            return flutterEngine;
        }
        FlutterEngine flutterEngine2 = new FlutterEngine(context);
        flutterEngineCache.put("autoDebitArrangementFullscreen", flutterEngine2);
        return flutterEngine2;
    }

    public static FlutterEngine f(Context context) {
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
        FlutterEngine flutterEngine = flutterEngineCache.get("mayaScoreActivity");
        if (flutterEngine != null) {
            return flutterEngine;
        }
        FlutterEngine flutterEngine2 = new FlutterEngine(context);
        flutterEngineCache.put("mayaScoreActivity", flutterEngine2);
        return flutterEngine2;
    }

    public static final float g(Bitmap bitmap, int i, int i4) {
        float width = bitmap.getWidth() / i;
        float height = bitmap.getHeight() / i4;
        u("width scale = " + width);
        u("height scale = " + height);
        return Math.max(1.0f, Math.min(width, height));
    }

    public static final boolean h(r observer) {
        kotlin.jvm.internal.j.h(observer, "observer");
        if (kotlin.jvm.internal.j.b(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        observer.onSubscribe(new C1487c(jh.e.f17816b));
        StringBuilder sb2 = new StringBuilder("Expected to be called on the main thread but was ");
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.jvm.internal.j.c(threadCurrentThread, "Thread.currentThread()");
        sb2.append(threadCurrentThread.getName());
        observer.onError(new IllegalStateException(sb2.toString()));
        return false;
    }

    public static final byte[] i(Bitmap bitmap, int i, int i4, int i6, int i10, int i11) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        u("src width = " + width);
        u("src height = " + height);
        float fG = g(bitmap, i, i4);
        u("scale = " + fG);
        float f = width / fG;
        float f3 = height / fG;
        u("dst width = " + f);
        u("dst height = " + f3);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f3, true);
        kotlin.jvm.internal.j.f(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
        z(bitmapCreateScaledBitmap, i10).compress(i11 != 1 ? i11 != 3 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG, i6, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.j.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static boolean j() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            U1.g.e();
            U1.g gVarE = U1.g.e();
            gVarE.a();
            Context context = gVarE.f5904a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void k(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b2.f fVar : (Set) it2.next()) {
                        for (h hVar : fVar.f8358a.c) {
                            if (hVar.c == 0) {
                                Set<b2.f> set = (Set) map.get(new b2.g(hVar.f8362a, hVar.f8363b == 2));
                                if (set != null) {
                                    for (b2.f fVar2 : set) {
                                        fVar.f8359b.add(fVar2);
                                        fVar2.c.add(fVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet<b2.f> hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                for (b2.f fVar3 : hashSet) {
                    if (fVar3.c.isEmpty()) {
                        hashSet2.add(fVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b2.f fVar4 = (b2.f) hashSet2.iterator().next();
                    hashSet2.remove(fVar4);
                    i++;
                    for (b2.f fVar5 : fVar4.f8359b) {
                        fVar5.c.remove(fVar4);
                        if (fVar5.c.isEmpty()) {
                            hashSet2.add(fVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (b2.f fVar6 : hashSet) {
                    if (!fVar6.c.isEmpty() && !fVar6.f8359b.isEmpty()) {
                        arrayList2.add(fVar6.f8358a);
                    }
                }
                throw new DependencyCycleException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C0859a c0859a = (C0859a) it.next();
            b2.f fVar7 = new b2.f(c0859a);
            for (n nVar : c0859a.f8350b) {
                boolean z4 = c0859a.e == 0;
                b2.g gVar = new b2.g(nVar, !z4);
                if (!map.containsKey(gVar)) {
                    map.put(gVar, new HashSet());
                }
                Set set2 = (Set) map.get(gVar);
                if (!set2.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + nVar + ".");
                }
                set2.add(fVar7);
            }
        }
    }

    public static int l(Context context, float f) {
        return (int) AbstractC1331a.j(context, 1, f);
    }

    public static HashMap m(String str) {
        if (str == null) {
            return null;
        }
        try {
            return x(new JSONObject(str));
        } catch (JSONException e) {
            S.o("Error converting " + str + " from JSON", e);
            return null;
        }
    }

    public static String n(Context context) {
        return Build.VERSION.SDK_INT >= 24 ? context.getDataDir().getPath() : context.getApplicationInfo().dataDir;
    }

    public static final LayoutInflater p(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        kotlin.jvm.internal.j.f(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    public static String r(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i = 0;
        for (int i4 = 0; i4 < objArr.length; i4++) {
            Object obj = objArr[i4];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e);
                    StringBuilder sbW = s.w("<", str2, " threw ");
                    sbW.append(e.getClass().getName());
                    sbW.append(">");
                    string = sbW.toString();
                }
            }
            objArr[i4] = string;
        }
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i6 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i6)) != -1) {
            sb2.append((CharSequence) str, i6, iIndexOf);
            sb2.append(objArr[i]);
            i6 = iIndexOf + 2;
            i++;
        }
        sb2.append((CharSequence) str, i6, str.length());
        if (i < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i10 = i + 1; i10 < objArr.length; i10++) {
                sb2.append(", ");
                sb2.append(objArr[i10]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList s(org.json.JSONArray r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.length()
            r1.<init>(r2)
            r2 = 0
        Le:
            int r3 = r6.length()
            if (r2 >= r3) goto L42
            java.lang.Object r3 = r6.opt(r2)
            if (r3 == 0) goto L3b
            java.lang.Object r4 = org.json.JSONObject.NULL
            if (r3 != r4) goto L1f
            goto L3b
        L1f:
            boolean r5 = r3 instanceof org.json.JSONObject
            if (r5 == 0) goto L2a
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.HashMap r3 = x(r3)
            goto L3c
        L2a:
            boolean r5 = r3 instanceof org.json.JSONArray
            if (r5 == 0) goto L35
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.ArrayList r3 = s(r3)
            goto L3c
        L35:
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L3c
        L3b:
            r3 = r0
        L3c:
            r1.add(r3)
            int r2 = r2 + 1
            goto Le
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.d.s(org.json.JSONArray):java.util.ArrayList");
    }

    public static JSONArray t(Iterable iterable) throws JSONException {
        if (iterable == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objT : iterable) {
            if (objT instanceof Map) {
                objT = y((Map) objT);
            } else if (objT instanceof Iterable) {
                objT = t((Iterable) objT);
            } else if (objT == null) {
                objT = JSONObject.NULL;
            }
            jSONArray.put(objT);
        }
        return jSONArray;
    }

    public static final void u(String str) {
        if (F0.a.c) {
            if (str == null) {
                str = "null";
            }
            System.out.println((Object) str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1 A[PHI: r6
  0x00e1: PHI (r6v24 java.lang.String) = (r6v23 java.lang.String), (r6v47 java.lang.String) binds: [B:45:0x00c9, B:49:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(android.content.Intent r22) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.d.v(android.content.Intent):void");
    }

    public static void w(Bundle bundle, String str) {
        try {
            U1.g.e();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString(TypedValues.TransitionType.S_FROM);
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e7) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e7);
                }
            }
            String str2 = p.q(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            Y1.b bVar = (Y1.b) U1.g.e().c(Y1.b.class);
            if (bVar != null) {
                ((Y1.c) bVar).a(AppMeasurement.FCM_ORIGIN, str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap x(org.json.JSONObject r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r7.keys()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r7.opt(r3)
            if (r4 == 0) goto L40
            java.lang.Object r5 = org.json.JSONObject.NULL
            if (r4 != r5) goto L24
            goto L40
        L24:
            boolean r6 = r4 instanceof org.json.JSONObject
            if (r6 == 0) goto L2f
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.HashMap r4 = x(r4)
            goto L41
        L2f:
            boolean r6 = r4 instanceof org.json.JSONArray
            if (r6 == 0) goto L3a
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.util.ArrayList r4 = s(r4)
            goto L41
        L3a:
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L41
        L40:
            r4 = r0
        L41:
            r1.put(r3, r4)
            goto Ld
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.d.x(org.json.JSONObject):java.util.HashMap");
    }

    public static JSONObject y(Map map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = y((Map) value);
            } else if (value instanceof Iterable) {
                value = t((Iterable) value);
            } else if (value instanceof Editable) {
                value = value.toString();
            } else if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(str, value);
        }
        return jSONObject;
    }

    public static final Bitmap z(Bitmap bitmap, int i) {
        if (i % SessionSplitConfiguration.DEFAULT_MAX_SESSION_DURATION_MINS == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        kotlin.jvm.internal.j.d(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public String o() {
        return null;
    }

    public String q() {
        return null;
    }
}
