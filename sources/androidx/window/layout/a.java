package androidx.window.layout;

import Ej.InterfaceC0230h;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.WindowInfoTracker;
import bj.C1036g;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    static {
        WindowInfoTracker.Companion companion = WindowInfoTracker.Companion;
    }

    public static InterfaceC0230h a(WindowInfoTracker windowInfoTracker, Context context) {
        j.g(context, "context");
        Activity activity = context instanceof Activity ? (Activity) context : null;
        InterfaceC0230h interfaceC0230hWindowLayoutInfo = activity != null ? windowInfoTracker.windowLayoutInfo(activity) : null;
        if (interfaceC0230hWindowLayoutInfo != null) {
            return interfaceC0230hWindowLayoutInfo;
        }
        throw new C1036g("Must override windowLayoutInfo(context) and provide an implementation.");
    }

    public static WindowInfoTracker b(Context context) {
        return WindowInfoTracker.Companion.getOrCreate(context);
    }

    public static void c(WindowInfoTrackerDecorator windowInfoTrackerDecorator) {
        WindowInfoTracker.Companion.overrideDecorator(windowInfoTrackerDecorator);
    }

    public static void d() {
        WindowInfoTracker.Companion.reset();
    }
}
