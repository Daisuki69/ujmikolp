package com.shield.android.context;

import android.app.Activity;
import android.view.ActionMode;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RequiresApi;
import com.paymaya.common.utility.AbstractC1213b;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class TouchEventInfoJobScheduler implements Window.Callback {
    private WeakReference<Window.Callback> fp;
    private Function0<Unit> fq;
    private WeakReference<Activity> fr;
    private String fs = f("");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15074d = {1658533826, 1574316194, 1755309871, 606138706, 795955177};
    public static final a Companion = new a((((int) 1574316194) ^ 1574316194) == true ? 1 : 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b8) {
            this();
        }
    }

    public static final class b extends AbstractC1616j implements Function1<InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15075d = {2037024710};

        public b(InterfaceC1526a<? super b> interfaceC1526a) {
            super(((int) f15075d[0]) ^ 2037024711, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(InterfaceC1526a<?> interfaceC1526a) {
            return TouchEventInfoJobScheduler.this.new b(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Object invoke(Object obj) {
            return ((b) create((InterfaceC1526a) obj)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            ConcurrentHashMap concurrentHashMapR = AbstractC1213b.R(obj);
            concurrentHashMapR.put("IN_SRC", TouchEventInfoJobScheduler.this.fs);
            return concurrentHashMapR;
        }
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15074d[1]) ^ 1574316194;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15074d;
            long j = jArr[2];
            long j6 = jArr[3];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1755288383) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1755288383)) + (((int) j6) ^ 606138707), (~(((int) j) ^ 1755288383)) | i4, i6, (((((int) j) ^ 1755288383) + cCharAt) + (((int) j6) ^ 606138707)) + ((~(((int) j) ^ 1755288383)) | i4)) ^ (i % (((int) jArr[4]) ^ 795979798))));
            long j7 = f15074d[3];
            int i10 = ~i;
            i = i + (((int) j7) ^ 606138707) + (((int) j7) ^ 606138707) + ((~(((int) j7) ^ 606138707)) | i10) + (((((int) j7) ^ 606138707) + i) - ((((((int) j7) ^ 606138707) + i) + (((int) j7) ^ 606138707)) + ((~(((int) j7) ^ 606138707)) | i10)));
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.dispatchKeyShortcutEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        long j;
        Window.Callback callback;
        Window.Callback callback2;
        if (motionEvent != null) {
            InputDevice device = InputDevice.getDevice(motionEvent.getDeviceId());
            String name = device != null ? device.getName() : null;
            if (name != null && !kotlin.jvm.internal.j.b(this.fs, name)) {
                com.shield.android.k.a.dL().a(f("瑄瑾瑧瑰瑼瑐瑠瑲瑶瑭瑗瑴瑲瑴瑪瑰瑲琭琢瑪瑪瑵瑳瑳瑛瑦瑿瑹瑯瑨琮瑦瑃琑") + this.fs + f("琼琱瑡瑼瑡瑧瑵瑲琸瑰瑩琻") + name, new Object[((int) f15074d[1]) ^ 1574316194]);
                this.fs = name;
                Function0<Unit> function0 = this.fq;
                if (function0 == null) {
                    kotlin.jvm.internal.j.n(f("瑳瑰瑾瑿瑶瑴瑵瑼"));
                    throw null;
                }
                function0.invoke();
            }
            WeakReference<Window.Callback> weakReference = this.fp;
            if (weakReference != null && (callback2 = weakReference.get()) != null) {
                return callback2.dispatchTouchEvent(motionEvent);
            }
            j = f15074d[1];
        } else {
            WeakReference<Window.Callback> weakReference2 = this.fp;
            if (weakReference2 != null && (callback = weakReference2.get()) != null) {
                return callback.dispatchTouchEvent(null);
            }
            j = f15074d[1];
        }
        return ((int) j) ^ 1574316194;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.dispatchTrackballEvent(motionEvent);
    }

    public final void monitorTouchEvent(Activity activity, Function0<Unit> function0) {
        kotlin.jvm.internal.j.g(activity, f("瑱瑲瑦瑺瑢瑼瑢瑮"));
        kotlin.jvm.internal.j.g(function0, f("瑳瑰瑾瑿瑶瑴瑵瑼"));
        stopMonitor();
        this.fp = new WeakReference<>(activity.getWindow().getCallback());
        this.fr = new WeakReference<>(activity);
        this.fq = function0;
        Window window = activity.getWindow();
        if (window == null) {
            return;
        }
        window.setCallback(this);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onContentChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        Window.Callback callback;
        kotlin.jvm.internal.j.g(menu, f("瑽瑴瑼瑦"));
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return null;
        }
        return callback.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Window.Callback callback;
        kotlin.jvm.internal.j.g(menuItem, f("瑹瑥瑷瑾"));
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.onMenuItemSelected(i, menuItem);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        Window.Callback callback;
        kotlin.jvm.internal.j.g(menu, f("瑽瑴瑼瑦"));
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Window.Callback callback;
        kotlin.jvm.internal.j.g(menu, f("瑽瑴瑼瑦"));
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(26)
    public final void onPointerCaptureChanged(boolean z4) {
        Unit unit;
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            unit = null;
        } else {
            callback.onPointerCaptureChanged(z4);
            unit = Unit.f18162a;
        }
        if (unit == null) {
            super.onPointerCaptureChanged(z4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        Window.Callback callback;
        kotlin.jvm.internal.j.g(menu, f("瑽瑴瑼瑦"));
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(24)
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        Unit unit;
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            unit = null;
        } else {
            callback.onProvideKeyboardShortcuts(list, menu, i);
            unit = Unit.f18162a;
        }
        if (unit == null) {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z4) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback = weakReference.get()) == null) {
            return;
        }
        callback.onWindowFocusChanged(z4);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        Window.Callback callback2;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback2 = weakReference.get()) == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback);
    }

    public final List<g> scheduleJobs() {
        return cj.r.c(new g("TouchEventInfoJobScheduler", 0L, null, new b(null), ((int) f15074d[0]) ^ 1658533828));
    }

    public final void stopMonitor() {
        Window.Callback callback;
        Activity activity;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference != null && (callback = weakReference.get()) != null) {
            WeakReference<Activity> weakReference2 = this.fr;
            Window window = (weakReference2 == null || (activity = weakReference2.get()) == null) ? null : activity.getWindow();
            if (window != null) {
                window.setCallback(callback);
            }
        }
        this.fp = null;
        this.fr = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.Window.Callback
    @RequiresApi(23)
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        Window.Callback callback;
        WeakReference<Window.Callback> weakReference = this.fp;
        return (weakReference == null || (callback = weakReference.get()) == null) ? ((int) f15074d[1]) ^ 1574316194 : callback.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    @RequiresApi(23)
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Window.Callback callback2;
        WeakReference<Window.Callback> weakReference = this.fp;
        if (weakReference == null || (callback2 = weakReference.get()) == null) {
            return null;
        }
        return callback2.onWindowStartingActionMode(callback, i);
    }
}
