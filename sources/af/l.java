package af;

import D.P;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import pg.E;
import pg.r;
import pg.s;
import pg.t;
import pg.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements FlutterPlugin, s {
    public static String h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static h f7166l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f7167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u f7168b;
    public static final HashMap c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashMap f7163d = new HashMap();
    public static final Object e = new Object();
    public static final Object f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f7164g = 0;
    public static int i = 0;
    public static int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f7165k = 0;

    public static void a(l lVar, C0690e c0690e) {
        lVar.getClass();
        try {
            if (c0690e.f7145d >= 1) {
                Log.d("Sqflite", c0690e.h() + "closing database ");
            }
            c0690e.a();
        } catch (Exception e7) {
            Log.e("Sqflite", "error " + e7 + " while closing database " + f7165k);
        }
        synchronized (e) {
            try {
                if (f7163d.isEmpty() && f7166l != null) {
                    if (c0690e.f7145d >= 1) {
                        Log.d("Sqflite", c0690e.h() + "stopping thread");
                    }
                    f7166l.a();
                    f7166l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static C0690e b(r rVar, t tVar) {
        Integer num = (Integer) rVar.a(TtmlNode.ATTR_ID);
        int iIntValue = num.intValue();
        C0690e c0690e = (C0690e) f7163d.get(num);
        if (c0690e != null) {
            return c0690e;
        }
        tVar.error("sqlite_error", "database_closed " + iIntValue, null);
        return null;
    }

    public static HashMap c(int i4, boolean z4, boolean z5) {
        HashMap map = new HashMap();
        map.put(TtmlNode.ATTR_ID, Integer.valueOf(i4));
        if (z4) {
            map.put("recovered", Boolean.TRUE);
        }
        if (z5) {
            map.put("recoveredInTransaction", Boolean.TRUE);
        }
        return map;
    }

    public final void d(r rVar, t tVar) {
        Integer num = (Integer) rVar.a(TtmlNode.ATTR_ID);
        int iIntValue = num.intValue();
        C0690e c0690eB = b(rVar, tVar);
        if (c0690eB == null) {
            return;
        }
        if (c0690eB.f7145d >= 1) {
            Log.d("Sqflite", c0690eB.h() + "closing " + iIntValue + Global.BLANK + c0690eB.f7144b);
        }
        String str = c0690eB.f7144b;
        synchronized (e) {
            try {
                f7163d.remove(num);
                if (c0690eB.f7143a) {
                    c.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f7166l.b(c0690eB, new P(4, this, c0690eB, tVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(pg.r r9, pg.t r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Look for "
            java.lang.String r1 = "path"
            java.lang.Object r9 = r9.a(r1)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = af.l.e
            monitor-enter(r1)
            int r2 = af.l.f7164g     // Catch: java.lang.Throwable -> L35
            boolean r2 = af.AbstractC0686a.a(r2)     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L37
            java.lang.String r2 = "Sqflite"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L35
            r3.append(r9)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = " in "
            r3.append(r0)     // Catch: java.lang.Throwable -> L35
            java.util.HashMap r0 = af.l.c     // Catch: java.lang.Throwable -> L35
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L35
            r3.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L35
            android.util.Log.d(r2, r0)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r9 = move-exception
            goto La8
        L37:
            java.util.HashMap r0 = af.l.c     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r0.get(r9)     // Catch: java.lang.Throwable -> L35
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L95
            java.util.HashMap r3 = af.l.f7163d     // Catch: java.lang.Throwable -> L35
            java.lang.Object r4 = r3.get(r2)     // Catch: java.lang.Throwable -> L35
            af.e r4 = (af.C0690e) r4     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L95
            android.database.sqlite.SQLiteDatabase r5 = r4.i     // Catch: java.lang.Throwable -> L35
            boolean r5 = r5.isOpen()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L95
            int r5 = af.l.f7164g     // Catch: java.lang.Throwable -> L35
            boolean r5 = af.AbstractC0686a.a(r5)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L8e
            java.lang.String r5 = "Sqflite"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = r4.h()     // Catch: java.lang.Throwable -> L35
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = "found single instance "
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            boolean r7 = r4.j()     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L77
            java.lang.String r7 = "(in transaction) "
            goto L79
        L77:
            java.lang.String r7 = ""
        L79:
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            r6.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = " "
            r6.append(r7)     // Catch: java.lang.Throwable -> L35
            r6.append(r9)     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L35
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L35
        L8e:
            r3.remove(r2)     // Catch: java.lang.Throwable -> L35
            r0.remove(r9)     // Catch: java.lang.Throwable -> L35
            goto L96
        L95:
            r4 = 0
        L96:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            V4.e r0 = new V4.e
            r0.<init>(r8, r4, r9, r10)
            af.h r9 = af.l.f7166l
            if (r9 == 0) goto La4
            r9.b(r4, r0)
            return
        La4:
            r0.run()
            return
        La8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: af.l.e(pg.r, pg.t):void");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        pg.j binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f7167a = applicationContext;
        u uVar = new u(binaryMessenger, "com.tekartik.sqflite", E.f19095b, binaryMessenger.makeBackgroundTaskQueue());
        this.f7168b = uVar;
        uVar.b(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f7167a = null;
        this.f7168b.b(null);
        this.f7168b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pg.s
    public final void onMethodCall(final r rVar, final t tVar) {
        int i4;
        int i6;
        int i10;
        int i11;
        boolean zExists;
        final int i12;
        C0690e c0690e;
        Object[] objArr;
        i4 = 5;
        i6 = 4;
        i10 = 2;
        String str = rVar.f19112a;
        str.getClass();
        i11 = 1;
        zExists = false;
        objArr = 0;
        switch (str) {
            case "execute":
                C0690e c0690eB = b(rVar, tVar);
                if (c0690eB == null) {
                    return;
                }
                f7166l.b(c0690eB, new j(rVar, tVar, c0690eB, i6));
                return;
            case "closeDatabase":
                d(rVar, tVar);
                return;
            case "options":
                Object objA = rVar.a("androidThreadPriority");
                if (objA != null) {
                    i = ((Integer) objA).intValue();
                }
                Object objA2 = rVar.a("androidThreadCount");
                if (objA2 != null && !objA2.equals(Integer.valueOf(j))) {
                    j = ((Integer) objA2).intValue();
                    h hVar = f7166l;
                    if (hVar != null) {
                        hVar.a();
                        f7166l = null;
                    }
                }
                Integer num = (Integer) rVar.a("logLevel");
                if (num != null) {
                    f7164g = num.intValue();
                }
                tVar.success(null);
                return;
            case "insert":
                C0690e c0690eB2 = b(rVar, tVar);
                if (c0690eB2 == null) {
                    return;
                }
                f7166l.b(c0690eB2, new j(rVar, tVar, c0690eB2, i11));
                return;
            case "update":
                C0690e c0690eB3 = b(rVar, tVar);
                if (c0690eB3 == null) {
                    return;
                }
                f7166l.b(c0690eB3, new j(rVar, tVar, c0690eB3, i4));
                return;
            case "androidSetLocale":
                C0690e c0690eB4 = b(rVar, tVar);
                if (c0690eB4 == null) {
                    return;
                }
                f7166l.b(c0690eB4, new j(rVar, c0690eB4, tVar));
                return;
            case "deleteDatabase":
                e(rVar, tVar);
                return;
            case "debugMode":
                boolean zEquals = Boolean.TRUE.equals(rVar.f19113b);
                if (!zEquals) {
                    f7164g = 0;
                } else if (zEquals) {
                    f7164g = 1;
                }
                tVar.success(null);
                return;
            case "openDatabase":
                final String str2 = (String) rVar.a("path");
                final Boolean bool = (Boolean) rVar.a("readOnly");
                final boolean z4 = str2 == null || str2.equals(":memory:");
                boolean z5 = (Boolean.FALSE.equals(rVar.a("singleInstance")) || z4) ? false : true;
                if (z5) {
                    synchronized (e) {
                        try {
                            if (AbstractC0686a.a(f7164g)) {
                                Log.d("Sqflite", "Look for " + str2 + " in " + c.keySet());
                            }
                            Integer num2 = (Integer) c.get(str2);
                            if (num2 != null && (c0690e = (C0690e) f7163d.get(num2)) != null) {
                                if (c0690e.i.isOpen()) {
                                    if (AbstractC0686a.a(f7164g)) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(c0690e.h());
                                        sb2.append("re-opened single instance ");
                                        sb2.append(c0690e.j() ? "(in transaction) " : "");
                                        sb2.append(num2);
                                        sb2.append(Global.BLANK);
                                        sb2.append(str2);
                                        Log.d("Sqflite", sb2.toString());
                                    }
                                    tVar.success(c(num2.intValue(), true, c0690e.j()));
                                    return;
                                }
                                if (AbstractC0686a.a(f7164g)) {
                                    Log.d("Sqflite", c0690e.h() + "single instance database of " + str2 + " not opened");
                                }
                            }
                        } finally {
                        }
                    }
                }
                Object obj = e;
                synchronized (obj) {
                    i12 = f7165k + 1;
                    f7165k = i12;
                    break;
                }
                final C0690e c0690e2 = new C0690e(this.f7167a, str2, i12, f7164g, z5);
                synchronized (obj) {
                    try {
                        if (f7166l == null) {
                            int i13 = j;
                            int i14 = i;
                            h iVar = i13 == 1 ? new F.i(i14) : new K3.d(i13, i14);
                            f7166l = iVar;
                            iVar.start();
                            if (c0690e2.f7145d >= 1) {
                                Log.d("Sqflite", c0690e2.h() + "starting worker pool with priority " + i);
                            }
                        }
                        c0690e2.h = f7166l;
                        if (c0690e2.f7145d >= 1) {
                            Log.d("Sqflite", c0690e2.h() + "opened " + i12 + Global.BLANK + str2);
                        }
                        final boolean z8 = z5;
                        f7166l.b(c0690e2, new Runnable() { // from class: af.k
                            /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x004b, Exception -> 0x00b8, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x004b, Exception -> 0x00b8, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b8, blocks: (B:17:0x004e, B:19:0x0057, B:20:0x0065), top: B:45:0x004e, outer: #2 }] */
                            /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    r12 = this;
                                    boolean r0 = r1
                                    java.lang.String r1 = r2
                                    pg.t r2 = r3
                                    java.lang.Boolean r3 = r4
                                    af.e r4 = r5
                                    pg.r r5 = r6
                                    boolean r6 = r7
                                    int r7 = r8
                                    java.lang.String r8 = "open_failed "
                                    java.lang.Object r9 = af.l.f
                                    monitor-enter(r9)
                                    r10 = 0
                                    if (r0 != 0) goto L4e
                                    java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4b
                                    r0.<init>(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.io.File r11 = new java.io.File     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r0 = r0.getParent()     // Catch: java.lang.Throwable -> L4b
                                    r11.<init>(r0)     // Catch: java.lang.Throwable -> L4b
                                    boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    boolean r0 = r11.mkdirs()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    boolean r0 = r11.exists()     // Catch: java.lang.Throwable -> L4b
                                    if (r0 != 0) goto L4e
                                    java.lang.String r0 = "sqlite_error"
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
                                    r3.<init>(r8)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L4b
                                    r2.error(r0, r1, r10)     // Catch: java.lang.Throwable -> L4b
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    return
                                L4b:
                                    r0 = move-exception
                                    goto Lc3
                                L4e:
                                    java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r3 = 1
                                    if (r0 == 0) goto L65
                                    af.d r0 = new af.d     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r0.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    java.lang.String r8 = r4.f7144b     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    android.database.sqlite.SQLiteDatabase r0 = android.database.sqlite.SQLiteDatabase.openDatabase(r8, r10, r3, r0)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    r4.i = r0     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                    goto L68
                                L65:
                                    r4.k()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> Lb8
                                L68:
                                    java.lang.Object r0 = af.l.e     // Catch: java.lang.Throwable -> L4b
                                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L4b
                                    if (r6 == 0) goto L79
                                    java.util.HashMap r5 = af.l.c     // Catch: java.lang.Throwable -> L77
                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L77
                                    r5.put(r1, r6)     // Catch: java.lang.Throwable -> L77
                                    goto L79
                                L77:
                                    r1 = move-exception
                                    goto Lb6
                                L79:
                                    java.util.HashMap r5 = af.l.f7163d     // Catch: java.lang.Throwable -> L77
                                    java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L77
                                    r5.put(r6, r4)     // Catch: java.lang.Throwable -> L77
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                                    int r0 = r4.f7145d     // Catch: java.lang.Throwable -> L4b
                                    if (r0 < r3) goto Lac
                                    java.lang.String r0 = "Sqflite"
                                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4b
                                    r3.<init>()     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = r4.h()     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = "opened "
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r7)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r4 = " "
                                    r3.append(r4)     // Catch: java.lang.Throwable -> L4b
                                    r3.append(r1)     // Catch: java.lang.Throwable -> L4b
                                    java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L4b
                                    android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L4b
                                Lac:
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    r0 = 0
                                    java.util.HashMap r0 = af.l.c(r7, r0, r0)
                                    r2.success(r0)
                                    return
                                Lb6:
                                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
                                    throw r1     // Catch: java.lang.Throwable -> L4b
                                Lb8:
                                    r0 = move-exception
                                    bf.b r1 = new bf.b     // Catch: java.lang.Throwable -> L4b
                                    r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L4b
                                    r4.i(r0, r1)     // Catch: java.lang.Throwable -> L4b
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    return
                                Lc3:
                                    monitor-exit(r9)     // Catch: java.lang.Throwable -> L4b
                                    throw r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: af.k.run():void");
                            }
                        });
                    } finally {
                    }
                    break;
                }
                return;
            case "batch":
                C0690e c0690eB5 = b(rVar, tVar);
                if (c0690eB5 == null) {
                    return;
                }
                f7166l.b(c0690eB5, new j(c0690eB5, rVar, tVar));
                return;
            case "debug":
                String str3 = (String) rVar.a("cmd");
                HashMap map = new HashMap();
                if ("get".equals(str3)) {
                    int i15 = f7164g;
                    if (i15 > 0) {
                        map.put("logLevel", Integer.valueOf(i15));
                    }
                    HashMap map2 = f7163d;
                    if (!map2.isEmpty()) {
                        HashMap map3 = new HashMap();
                        for (Map.Entry entry : map2.entrySet()) {
                            C0690e c0690e3 = (C0690e) entry.getValue();
                            HashMap map4 = new HashMap();
                            map4.put("path", c0690e3.f7144b);
                            map4.put("singleInstance", Boolean.valueOf(c0690e3.f7143a));
                            int i16 = c0690e3.f7145d;
                            if (i16 > 0) {
                                map4.put("logLevel", Integer.valueOf(i16));
                            }
                            map3.put(((Integer) entry.getKey()).toString(), map4);
                        }
                        map.put("databases", map3);
                    }
                }
                tVar.success(map);
                return;
            case "query":
                C0690e c0690eB6 = b(rVar, tVar);
                if (c0690eB6 == null) {
                    return;
                }
                f7166l.b(c0690eB6, new j(rVar, tVar, c0690eB6, i10));
                return;
            case "databaseExists":
                try {
                    zExists = new File((String) rVar.a("path")).exists();
                    break;
                } catch (Exception unused) {
                }
                tVar.success(Boolean.valueOf(zExists));
                return;
            case "queryCursorNext":
                C0690e c0690eB7 = b(rVar, tVar);
                if (c0690eB7 == null) {
                    return;
                }
                f7166l.b(c0690eB7, new j(rVar, tVar, c0690eB7, objArr == true ? 1 : 0));
                return;
            case "getPlatformVersion":
                tVar.success("Android " + Build.VERSION.RELEASE);
                return;
            case "getDatabasesPath":
                if (h == null) {
                    h = this.f7167a.getDatabasePath("tekartik_sqflite.db").getParent();
                }
                tVar.success(h);
                return;
            default:
                tVar.notImplemented();
                return;
        }
    }
}
