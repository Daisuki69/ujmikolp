package io.flutter.view;

import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f17489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f17490b;
    public final Method c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f17491d;
    public final Field e;
    public final Method f;

    /* JADX WARN: Multi-variable type inference failed */
    public m() throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Field field;
        Method method6 = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        int i = Build.VERSION.SDK_INT;
        Class<?> cls = Integer.TYPE;
        if (i <= 26) {
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
            } catch (NoSuchMethodException unused3) {
                Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                method3 = null;
            }
            try {
                method4 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
                method5 = null;
            } catch (NoSuchMethodException unused4) {
                Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
                method4 = null;
                method5 = null;
            }
            field = method5;
            method6 = method3;
        } else {
            try {
                Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method5 = Class.forName("android.util.LongArray").getMethod("get", cls);
                method4 = null;
                field = declaredField;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method4 = null;
                method5 = null;
                field = 0;
            }
        }
        this.f17489a = method;
        this.f17490b = method6;
        this.c = method2;
        this.f17491d = method4;
        this.e = field;
        this.f = method5;
    }

    public static Long a(m mVar, AccessibilityRecord accessibilityRecord) {
        Method method = mVar.c;
        if (method != null) {
            try {
                return (Long) method.invoke(accessibilityRecord, null);
            } catch (IllegalAccessException e) {
                Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e);
            } catch (InvocationTargetException e7) {
                Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e7);
            }
        }
        return null;
    }

    public static boolean b(int i, long j) {
        return (j & (1 << i)) != 0;
    }
}
