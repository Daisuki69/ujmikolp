package h2;

import P5.N;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.ht2aO8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import k2.C1710U;
import k2.C1711V;
import k2.C1712W;
import k2.C1719c0;
import k2.C1721d0;
import k2.Y;
import pg.C2038a;

/* JADX INFO: loaded from: classes2.dex */
public final class r {
    public static final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16906g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f16908b;
    public final N c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2038a f16909d;
    public final b1.t e;

    static {
        HashMap map = new HashMap();
        f = map;
        androidx.media3.datasource.cache.c.t(5, map, "armeabi", 6, "armeabi-v7a");
        androidx.media3.datasource.cache.c.t(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f16906g = "Crashlytics Android SDK/20.0.2";
    }

    public r(Context context, w wVar, N n7, C2038a c2038a, b1.t tVar) {
        this.f16907a = context;
        this.f16908b = wVar;
        this.c = n7;
        this.f16909d = c2038a;
        this.e = tVar;
    }

    public static C1711V c(com.google.firebase.messaging.r rVar, int i) {
        String str = (String) rVar.c;
        int i4 = 0;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) rVar.f9804d;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.r rVar2 = (com.google.firebase.messaging.r) rVar.e;
        if (i >= 8) {
            for (com.google.firebase.messaging.r rVar3 = rVar2; rVar3 != null; rVar3 = (com.google.firebase.messaging.r) rVar3.e) {
                i4++;
            }
        }
        int i6 = i4;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b8 = (byte) (0 | 1);
        C1711V c1711vC = null;
        if (rVar2 != null && i6 == 0) {
            c1711vC = c(rVar2, i + 1);
        }
        if (b8 == 1) {
            return new C1711V(str, (String) rVar.f9803b, listD, c1711vC, i6);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            Y y7 = new Y();
            y7.e = i;
            y7.f = (byte) (y7.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            y7.f17903a = jMax;
            byte b8 = (byte) (y7.f | 1);
            y7.f = b8;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            y7.f17904b = str;
            y7.c = fileName;
            y7.f17905d = lineNumber;
            y7.f = (byte) (b8 | 2);
            arrayList.add(y7.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static C1712W e() {
        byte b8 = (byte) 1;
        if (b8 == 1) {
            return new C1712W("0", "0", 0L);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b8 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }

    public final List a() {
        byte b8 = (byte) (((byte) (0 | 1)) | 2);
        N n7 = this.c;
        String str = (String) n7.e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        if (b8 == 3) {
            return Collections.singletonList(new C1710U(str, (String) n7.f5026b, 0L, 0L));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b8 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b8 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(AbstractC1331a.o(sb2, "Missing required properties:"));
    }

    public final C1721d0 b(int i) {
        boolean z4;
        Float fValueOf;
        Intent intentRegisterReceiver;
        int intExtra;
        int intExtra2;
        Context context = this.f16907a;
        boolean z5 = false;
        try {
            intentRegisterReceiver = ht2aO8.registerReceiver(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (IllegalStateException e) {
            e = e;
            z4 = false;
        }
        if (intentRegisterReceiver != null) {
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            z4 = intExtra3 != -1 && (intExtra3 == 2 || intExtra3 == 5);
            try {
                intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            } catch (IllegalStateException e7) {
                e = e7;
                Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
            }
            fValueOf = (intExtra == -1 || intExtra2 == -1) ? null : Float.valueOf(intExtra / intExtra2);
        } else {
            fValueOf = null;
            z4 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        int i4 = (!z4 || fValueOf == null) ? 1 : ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
        if (!f.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z5 = true;
        }
        long jA = f.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jA - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        C1719c0 c1719c0 = new C1719c0();
        c1719c0.f17924a = dValueOf;
        c1719c0.f17925b = i4;
        byte b8 = (byte) (c1719c0.f17927g | 1);
        c1719c0.c = z5;
        c1719c0.f17926d = i;
        c1719c0.e = j;
        c1719c0.f = blockCount;
        c1719c0.f17927g = (byte) (((byte) (((byte) (((byte) (b8 | 2)) | 4)) | 8)) | 16);
        return c1719c0.a();
    }
}
