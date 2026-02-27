package h2;

import E8.RunnableC0219b;
import P5.N;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import bg.AbstractC0983W;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d2.C1326a;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import e2.C1419a;
import e2.C1421c;
import e2.C1422d;
import i2.AbstractC1586b;
import j2.C1666e;
import j2.C1667f;
import j2.InterfaceC1665d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import k2.C1692B;
import k2.C1693C;
import k2.C1700J;
import k2.C1701K;
import k2.C1702L;
import k2.C1704N;
import k2.C1733j0;
import k2.C1739m0;
import k2.C1741n0;
import k2.C1743o0;
import k2.C1745p0;
import k2.P0;
import n2.C1914a;
import n2.C1915b;

/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f16875t = new g(1);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Charset f16876u = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f16878b;
    public final C1421c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1915b f16879d;
    public final i2.e e;
    public final w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1915b f16880g;
    public final N h;
    public final C1667f i;
    public final C1419a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1326a f16881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f16882l;
    public final C1915b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f16883n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b1.t f16884o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource f16885p = new TaskCompletionSource();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource f16886q = new TaskCompletionSource();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TaskCompletionSource f16887r = new TaskCompletionSource();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f16888s = new AtomicBoolean(false);

    public l(Context context, w wVar, t tVar, C1915b c1915b, C1421c c1421c, N n7, C1915b c1915b2, C1667f c1667f, C1915b c1915b3, C1419a c1419a, C1326a c1326a, i iVar, i2.e eVar) {
        this.f16877a = context;
        this.f = wVar;
        this.f16878b = tVar;
        this.f16880g = c1915b;
        this.c = c1421c;
        this.h = n7;
        this.f16879d = c1915b2;
        this.i = c1667f;
        this.j = c1419a;
        this.f16881k = c1326a;
        this.f16882l = iVar;
        this.m = c1915b3;
        this.e = eVar;
    }

    public static Task a(l lVar) {
        Task taskCall;
        lVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : C1915b.s(((File) lVar.f16880g.f18588d).listFiles(f16875t))) {
            try {
                long j = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    taskCall = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    taskCall = Tasks.call(new ScheduledThreadPoolExecutor(1), new k(lVar, j));
                }
                arrayList.add(taskCall);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c6  */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27, types: [int] */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r33v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r33, b1.t r34, boolean r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.l.b(boolean, b1.t, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        String str2;
        String str3;
        String str4;
        int i;
        Integer num;
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        String strH = AbstractC1414e.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strH, null);
        }
        Locale locale = Locale.US;
        w wVar = this.f;
        N n7 = this.h;
        C1741n0 c1741n0 = new C1741n0(wVar.c, (String) n7.f, (String) n7.f5028g, wVar.c().f16855a, AbstractC1331a.h(((String) n7.f5027d) != null ? 4 : 1), (C1421c) n7.h);
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        C1745p0 c1745p0 = new C1745p0(f.g());
        Context context = this.f16877a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        EnumC1535e enumC1535e = EnumC1535e.f16861a;
        String str7 = Build.CPU_ABI;
        boolean zIsEmpty = TextUtils.isEmpty(str7);
        EnumC1535e enumC1535e2 = EnumC1535e.f16861a;
        if (!zIsEmpty) {
            EnumC1535e enumC1535e3 = (EnumC1535e) EnumC1535e.f16862b.get(str7.toLowerCase(locale));
            if (enumC1535e3 != null) {
                enumC1535e2 = enumC1535e3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int iOrdinal = enumC1535e2.ordinal();
        String str8 = Build.MODEL;
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        long jA = f.a(context);
        boolean zF = f.f();
        int iC = f.c();
        String str9 = Build.MANUFACTURER;
        String str10 = Build.PRODUCT;
        this.j.d(str, jCurrentTimeMillis, new C1739m0(c1741n0, c1745p0, new C1743o0(iOrdinal, iAvailableProcessors, jA, blockCount, zF, iC)));
        if (!bool.booleanValue() || str == null) {
            str2 = str6;
            str3 = str9;
            str4 = str10;
            i = 4;
        } else {
            C1915b c1915b = this.f16879d;
            synchronized (((String) c1915b.f18587b)) {
                c1915b.f18587b = str;
                str4 = str10;
                str2 = str6;
                str3 = str9;
                i = 4;
                ((i2.e) c1915b.f18588d).f17093b.a(new RunnableC0219b(c1915b, str, ((C1666e) ((AtomicMarkableReference) ((B1.a) c1915b.e).c).getReference()).a(), ((gf.g) c1915b.f18589g).a(), 19));
            }
        }
        C1667f c1667f = this.i;
        ((InterfaceC1665d) c1667f.f17680b).b();
        c1667f.f17680b = C1667f.c;
        if (str != null) {
            c1667f.f17680b = new j2.m(((C1915b) c1667f.f17679a).m(str, "userlog"));
        }
        this.f16882l.a(str);
        C1915b c1915b2 = this.m;
        r rVar = (r) c1915b2.f18587b;
        Charset charset = P0.f17882a;
        C1692B c1692b = new C1692B();
        c1692b.f17828a = "20.0.2";
        N n10 = rVar.c;
        String str11 = (String) n10.f5025a;
        if (str11 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        c1692b.f17829b = str11;
        w wVar2 = rVar.f16908b;
        String str12 = wVar2.c().f16855a;
        if (str12 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        c1692b.f17830d = str12;
        c1692b.e = wVar2.c().f16856b;
        c1692b.f = wVar2.c().c;
        String str13 = (String) n10.f;
        if (str13 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c1692b.h = str13;
        String str14 = (String) n10.f5028g;
        if (str14 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        c1692b.i = str14;
        c1692b.c = i;
        c1692b.m = (byte) (c1692b.m | 1);
        C1700J c1700j = new C1700J();
        c1700j.f = false;
        byte b8 = (byte) (c1700j.m | 2);
        c1700j.f17857d = jCurrentTimeMillis;
        c1700j.m = (byte) (b8 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        c1700j.f17856b = str;
        String str15 = r.f16906g;
        if (str15 == null) {
            throw new NullPointerException("Null generator");
        }
        c1700j.f17855a = str15;
        String str16 = wVar2.c;
        if (str16 == null) {
            throw new NullPointerException("Null identifier");
        }
        String str17 = wVar2.c().f16855a;
        C1421c c1421c = (C1421c) n10.h;
        if (((M5.e) c1421c.c) == null) {
            c1421c.c = new M5.e(c1421c);
        }
        M5.e eVar = (M5.e) c1421c.c;
        String str18 = eVar.f3087b;
        if (eVar == null) {
            c1421c.c = new M5.e(c1421c);
        }
        c1700j.f17858g = new C1702L(str16, str13, str14, str17, str18, ((M5.e) c1421c.c).c);
        C1733j0 c1733j0 = new C1733j0();
        c1733j0.f17966a = 3;
        c1733j0.e = (byte) (c1733j0.e | 1);
        if (str5 == null) {
            throw new NullPointerException("Null version");
        }
        c1733j0.f17967b = str5;
        String str19 = str2;
        if (str19 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        c1733j0.c = str19;
        c1733j0.f17968d = f.g();
        c1733j0.e = (byte) (c1733j0.e | 2);
        c1700j.i = c1733j0.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int iIntValue = 7;
        if (!TextUtils.isEmpty(str7) && (num = (Integer) r.f.get(str7.toLowerCase(locale))) != null) {
            iIntValue = num.intValue();
        }
        int iAvailableProcessors2 = Runtime.getRuntime().availableProcessors();
        long jA2 = f.a(rVar.f16907a);
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean zF2 = f.f();
        int iC2 = f.c();
        C1704N c1704n = new C1704N();
        c1704n.f17870a = iIntValue;
        byte b10 = (byte) (c1704n.j | 1);
        c1704n.j = b10;
        if (str8 == null) {
            throw new NullPointerException("Null model");
        }
        c1704n.f17871b = str8;
        c1704n.c = iAvailableProcessors2;
        c1704n.f17872d = jA2;
        c1704n.e = blockCount2;
        c1704n.f = zF2;
        c1704n.f17873g = iC2;
        c1704n.j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
        String str20 = str3;
        if (str20 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        c1704n.h = str20;
        String str21 = str4;
        if (str21 == null) {
            throw new NullPointerException("Null modelClass");
        }
        c1704n.i = str21;
        c1700j.j = c1704n.a();
        c1700j.f17860l = 3;
        c1700j.m = (byte) (c1700j.m | 4);
        c1692b.j = c1700j.a();
        C1693C c1693cA = c1692b.a();
        C1915b c1915b3 = ((C1914a) c1915b2.c).f18584b;
        C1701K c1701k = c1693cA.f17837k;
        if (c1701k == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String str22 = c1701k.f17862b;
        try {
            C1914a.f18582g.getClass();
            C1914a.f(c1915b3.m(str22, "report"), l2.a.f18226a.a(c1693cA));
            File fileM = c1915b3.m(str22, "start-time");
            long j = c1701k.f17863d;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileM), C1914a.e);
            try {
                outputStreamWriter.write("");
                fileM.setLastModified(j * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e) {
            String strH2 = AbstractC1414e.h("Could not persist report for session ", str22);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", strH2, e);
            }
        }
    }

    public final boolean d(b1.t tVar) throws Throwable {
        i2.e.a();
        s sVar = this.f16883n;
        if (sVar != null && sVar.e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, tVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
            return false;
        }
    }

    public final String e() {
        NavigableSet navigableSetC = ((C1914a) this.m.c).c();
        if (navigableSetC.isEmpty()) {
            return null;
        }
        return (String) navigableSetC.first();
    }

    public final String f() throws IOException {
        InputStream resourceAsStream;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        Context context = this.f16877a;
        int iD = f.d(context, "com.google.firebase.crashlytics.version_control_info", TypedValues.Custom.S_STRING);
        String string = iD == 0 ? null : context.getResources().getString(iD);
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f16876u), 0);
        }
        ClassLoader classLoader = l.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream == null) {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
        try {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from file", null);
            }
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bArr = new byte[1024];
            } finally {
            }
        } catch (Throwable th2) {
            try {
                resourceAsStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
        while (true) {
            int i = resourceAsStream.read(bArr);
            if (i == -1) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                String strEncodeToString = Base64.encodeToString(byteArray, 0);
                resourceAsStream.close();
                return strEncodeToString;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            resourceAsStream.close();
            throw th2;
        }
    }

    public final synchronized void g(b1.t tVar, Thread thread, Throwable th2, boolean z4) {
        Throwable th3;
        try {
            try {
                String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    try {
                        Log.d("FirebaseCrashlytics", str, null);
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                }
                if (!z4) {
                    AbstractC0983W.t();
                }
                Task taskB = this.e.f17092a.b(new j(this, System.currentTimeMillis(), th2, thread, tVar, z4));
                if (!z4) {
                    try {
                        try {
                            y.a(taskB);
                        } catch (TimeoutException unused) {
                            Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                        }
                    } catch (Exception e) {
                        Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                th3 = th;
                throw th3;
            }
        } catch (Throwable th6) {
            th = th6;
            th3 = th;
            throw th3;
        }
    }

    public final void h() {
        try {
            String strF = f();
            if (strF != null) {
                i("com.crashlytics.version-control-info", strF);
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e);
        }
    }

    public final void i(String str, String str2) {
        try {
            ((B1.a) this.f16879d.f).k(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = this.f16877a;
            if (context != null && (context.getApplicationInfo().flags & 2) != 0) {
                throw e;
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void j(Task task) {
        Task task2;
        Task taskA;
        C1915b c1915b = ((C1914a) this.m.c).f18584b;
        boolean zIsEmpty = C1915b.s(((File) c1915b.f).listFiles()).isEmpty();
        TaskCompletionSource taskCompletionSource = this.f16885p;
        if (zIsEmpty && C1915b.s(((File) c1915b.f18589g).listFiles()).isEmpty() && C1915b.s(((File) c1915b.h).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        C1422d c1422d = C1422d.f16556a;
        c1422d.f("Crash reports are available to be sent.");
        t tVar = this.f16878b;
        if (tVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            taskA = Tasks.forResult(Boolean.TRUE);
        } else {
            c1422d.c("Automatic data collection is disabled.");
            c1422d.f("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (tVar.c) {
                task2 = tVar.f16915d.getTask();
            }
            Task taskOnSuccessTask = task2.onSuccessTask(new z2.d(22));
            c1422d.c("Waiting for send/deleteUnsentReports to be called.");
            taskA = AbstractC1586b.a(taskOnSuccessTask, this.f16886q.getTask());
        }
        taskA.onSuccessTask(this.e.f17092a, new C1421c(6, this, task, false));
    }
}
