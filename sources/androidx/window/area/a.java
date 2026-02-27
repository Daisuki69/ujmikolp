package androidx.window.area;

import androidx.window.area.WindowAreaController;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    static {
        WindowAreaController.Companion companion = WindowAreaController.Companion;
    }

    public static WindowAreaController a() {
        return WindowAreaController.Companion.getOrCreate();
    }

    public static void b(WindowAreaControllerDecorator windowAreaControllerDecorator) {
        WindowAreaController.Companion.overrideDecorator(windowAreaControllerDecorator);
    }

    public static void c() {
        WindowAreaController.Companion.reset();
    }
}
