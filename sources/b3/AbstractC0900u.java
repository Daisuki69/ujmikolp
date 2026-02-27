package b3;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import cj.C1110A;
import cj.C1112C;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: b3.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0900u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0896q f8497a = new C0896q(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0896q f8498b = new C0896q(2);

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        kotlin.jvm.internal.j.g(context, "context");
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
        ArrayList arrayList2 = new ArrayList(cj.t.l(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String processName = runningAppProcessInfo.processName;
            kotlin.jvm.internal.j.f(processName, "processName");
            arrayList2.add(new C0865E(processName, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.j.b(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static C0865E b(Context context) {
        Object next;
        String myProcessName;
        kotlin.jvm.internal.j.g(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0865E) next).f8385b == iMyPid) {
                break;
            }
        }
        C0865E c0865e = (C0865E) next;
        if (c0865e != null) {
            return c0865e;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            myProcessName = Process.myProcessName();
            kotlin.jvm.internal.j.f(myProcessName, "myProcessName(...)");
        } else if ((i < 28 || (myProcessName = Application.getProcessName()) == null) && (myProcessName = ProcessUtils.getMyProcessName()) == null) {
            myProcessName = "";
        }
        return new C0865E(myProcessName, iMyPid, 0, false);
    }
}
