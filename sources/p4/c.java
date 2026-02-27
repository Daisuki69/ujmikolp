package p4;

import Kh.I;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static c h;
    public static final Object i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19063b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19064d;
    public int e;
    public Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ExecutorService f19065g;

    public final void a(I i4, Object obj, String str, Boolean bool, b bVar) {
        if (i4 != null) {
            new Handler(Looper.getMainLooper()).post(new io.split.android.client.storage.splits.e(this, bool, obj, str, i4, bVar, 1));
        }
    }

    public final void b(Object obj, String str) {
        if (this.f19063b) {
            Log.d("DataCollector", "<Data Collector> " + str);
        }
        if (obj != null) {
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod("collectorDebugMessage", String.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, str);
            } catch (Exception e) {
                Log.d("DataCollector", "Exception: " + e.getMessage());
            }
        }
    }
}
