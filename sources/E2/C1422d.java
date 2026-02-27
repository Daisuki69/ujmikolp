package e2;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import cj.C1110A;
import cj.C1112C;
import cj.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k2.C1715a0;
import k2.C1717b0;
import k2.E0;
import kotlin.jvm.internal.j;

/* JADX INFO: renamed from: e2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1422d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1422d f16556a = new C1422d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1422d f16557b = new C1422d();

    public static C1717b0 a(C1422d c1422d, String processName, int i, int i4, int i6) {
        if ((i6 & 4) != 0) {
            i4 = 0;
        }
        c1422d.getClass();
        j.g(processName, "processName");
        C1715a0 c1715a0 = new C1715a0();
        c1715a0.f17912a = processName;
        c1715a0.f17913b = i;
        byte b8 = (byte) (c1715a0.e | 1);
        c1715a0.c = i4;
        c1715a0.f17914d = false;
        c1715a0.e = (byte) (((byte) (b8 | 2)) | 4);
        return c1715a0.a();
    }

    public static ArrayList d(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        j.g(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = C1112C.f9377a;
        }
        ArrayList arrayListY = C1110A.y(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListY) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t.l(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            C1715a0 c1715a0 = new C1715a0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            c1715a0.f17912a = str2;
            c1715a0.f17913b = runningAppProcessInfo.pid;
            byte b8 = (byte) (c1715a0.e | 1);
            c1715a0.c = runningAppProcessInfo.importance;
            c1715a0.e = (byte) (b8 | 2);
            c1715a0.f17914d = j.b(str2, str);
            c1715a0.e = (byte) (c1715a0.e | 4);
            arrayList2.add(c1715a0.a());
        }
        return arrayList2;
    }

    public boolean b(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void c(String str) {
        if (b(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public E0 e(Context context) {
        Object next;
        String processName;
        j.g(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = d(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C1717b0) ((E0) next)).f17920b == iMyPid) {
                break;
            }
        }
        E0 e02 = (E0) next;
        if (e02 != null) {
            return e02;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            processName = Process.myProcessName();
            j.d(processName);
        } else if (i < 28 || (processName = Application.getProcessName()) == null) {
            processName = "";
        }
        return a(this, processName, iMyPid, 0, 12);
    }

    public void f(String str) {
        if (b(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void g(String str, Exception exc) {
        if (b(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
