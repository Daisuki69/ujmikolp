package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.WindowInsetsCompat;
import androidx.window.core.Bounds;
import androidx.window.layout.util.ActivityCompatHelperApi24;
import androidx.window.layout.util.ContextCompatHelper;
import androidx.window.layout.util.ContextCompatHelperApi30;
import androidx.window.layout.util.DisplayCompatHelperApi17;
import androidx.window.layout.util.DisplayCompatHelperApi28;
import cj.C1132s;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowMetricsCalculatorCompat implements WindowMetricsCalculator {
    public static final WindowMetricsCalculatorCompat INSTANCE = new WindowMetricsCalculatorCompat();
    private static final String TAG = "WindowMetricsCalculatorCompat";
    private static final ArrayList<Integer> insetsTypeMasks = C1132s.d(Integer.valueOf(WindowInsetsCompat.Type.statusBars()), Integer.valueOf(WindowInsetsCompat.Type.navigationBars()), Integer.valueOf(WindowInsetsCompat.Type.captionBar()), Integer.valueOf(WindowInsetsCompat.Type.ime()), Integer.valueOf(WindowInsetsCompat.Type.systemGestures()), Integer.valueOf(WindowInsetsCompat.Type.mandatorySystemGestures()), Integer.valueOf(WindowInsetsCompat.Type.tappableElement()), Integer.valueOf(WindowInsetsCompat.Type.displayCutout()));

    private WindowMetricsCalculatorCompat() {
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection"})
    private final DisplayCutout getCutoutForDisplay(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (androidx.webkit.internal.c.A(obj)) {
                return androidx.webkit.internal.c.k(obj);
            }
        } catch (ClassNotFoundException e) {
            Log.w(TAG, e);
        } catch (IllegalAccessException e7) {
            Log.w(TAG, e7);
        } catch (InstantiationException e10) {
            Log.w(TAG, e10);
        } catch (NoSuchFieldException e11) {
            Log.w(TAG, e11);
        } catch (NoSuchMethodException e12) {
            Log.w(TAG, e12);
        } catch (InvocationTargetException e13) {
            Log.w(TAG, e13);
        }
        return null;
    }

    private final int getNavigationBarHeight(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final void getRectSizeFromDisplay(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Context context) {
        j.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return ContextCompatHelperApi30.INSTANCE.currentWindowMetrics(context);
        }
        Context contextUnwrapUiContext$window_release = ContextCompatHelper.INSTANCE.unwrapUiContext$window_release(context);
        if (contextUnwrapUiContext$window_release instanceof Activity) {
            return computeCurrentWindowMetrics((Activity) context);
        }
        if (!(contextUnwrapUiContext$window_release instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        j.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        j.f(defaultDisplay, "wm.defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        return new WindowMetrics(new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y), null, 2, 0 == true ? 1 : 0);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Activity activity) {
        j.g(activity, "activity");
        return computeMaximumWindowMetrics((Context) activity);
    }

    public final Rect computeWindowBoundsIceCreamSandwich$window_release(Activity activity) {
        int i;
        j.g(activity, "activity");
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        j.f(defaultDisplay, "defaultDisplay");
        Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        Rect rect = new Rect();
        int i4 = realSizeForDisplay$window_release.x;
        if (i4 == 0 || (i = realSizeForDisplay$window_release.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i4;
        rect.bottom = i;
        return rect;
    }

    @RequiresApi(24)
    public final Rect computeWindowBoundsN$window_release(Activity activity) {
        j.g(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom = i + navigationBarHeight;
                return rect;
            }
            int i4 = rect.right;
            if (i4 + navigationBarHeight == realSizeForDisplay$window_release.x) {
                rect.right = i4 + navigationBarHeight;
            }
        }
        return rect;
    }

    @RequiresApi(28)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsP$window_release(Activity activity) {
        DisplayCutout cutoutForDisplay;
        j.g(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                j.e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                j.e(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e) {
            Log.w(TAG, e);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchFieldException e7) {
            Log.w(TAG, e7);
            getRectSizeFromDisplay(activity, rect);
        } catch (NoSuchMethodException e10) {
            Log.w(TAG, e10);
            getRectSizeFromDisplay(activity, rect);
        } catch (InvocationTargetException e11) {
            Log.w(TAG, e11);
            getRectSizeFromDisplay(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        DisplayCompatHelperApi17 displayCompatHelperApi17 = DisplayCompatHelperApi17.INSTANCE;
        j.f(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        ActivityCompatHelperApi24 activityCompatHelperApi24 = ActivityCompatHelperApi24.INSTANCE;
        if (!activityCompatHelperApi24.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            int i = rect.bottom;
            if (i + navigationBarHeight == point.y) {
                rect.bottom = i + navigationBarHeight;
            } else {
                int i4 = rect.right;
                if (i4 + navigationBarHeight == point.x) {
                    rect.right = i4 + navigationBarHeight;
                } else if (rect.left == navigationBarHeight) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activityCompatHelperApi24.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            int i6 = rect.left;
            DisplayCompatHelperApi28 displayCompatHelperApi28 = DisplayCompatHelperApi28.INSTANCE;
            if (i6 == displayCompatHelperApi28.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == displayCompatHelperApi28.safeInsetRight(cutoutForDisplay)) {
                rect.right = displayCompatHelperApi28.safeInsetRight(cutoutForDisplay) + rect.right;
            }
            if (rect.top == displayCompatHelperApi28.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom = displayCompatHelperApi28.safeInsetBottom(cutoutForDisplay) + rect.bottom;
            }
        }
        return rect;
    }

    @RequiresApi(29)
    @SuppressLint({"BanUncheckedReflection", "BlockedPrivateApi"})
    public final Rect computeWindowBoundsQ$window_release(Activity activity) {
        j.g(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            j.e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (IllegalAccessException e) {
            Log.w(TAG, e);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchFieldException e7) {
            Log.w(TAG, e7);
            return computeWindowBoundsP$window_release(activity);
        } catch (NoSuchMethodException e10) {
            Log.w(TAG, e10);
            return computeWindowBoundsP$window_release(activity);
        } catch (InvocationTargetException e11) {
            Log.w(TAG, e11);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    @RequiresApi(30)
    public final WindowInsetsCompat computeWindowInsetsCompat$window_release(Context context) throws Exception {
        j.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return ContextCompatHelperApi30.INSTANCE.currentWindowInsets(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final ArrayList<Integer> getInsetsTypeMasks$window_release() {
        return insetsTypeMasks;
    }

    @VisibleForTesting
    public final Point getRealSizeForDisplay$window_release(Display display) {
        j.g(display, "display");
        Point point = new Point();
        DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeMaximumWindowMetrics(Context context) throws Exception {
        Rect rect;
        WindowInsetsCompat windowInsetsCompatBuild;
        j.g(context, "context");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rect = ContextCompatHelperApi30.INSTANCE.maximumWindowBounds(context);
        } else {
            Object systemService = context.getSystemService("window");
            j.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display display = ((WindowManager) systemService).getDefaultDisplay();
            j.f(display, "display");
            Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        if (i >= 30) {
            windowInsetsCompatBuild = computeWindowInsetsCompat$window_release(context);
        } else {
            windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            j.f(windowInsetsCompatBuild, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new WindowMetrics(new Bounds(rect), windowInsetsCompatBuild);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public WindowMetrics computeCurrentWindowMetrics(Activity activity) throws Exception {
        Rect rectComputeWindowBoundsIceCreamSandwich$window_release;
        WindowInsetsCompat windowInsetsCompatBuild;
        j.g(activity, "activity");
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            rectComputeWindowBoundsIceCreamSandwich$window_release = ContextCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else if (i >= 29) {
            rectComputeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsQ$window_release(activity);
        } else if (i >= 28) {
            rectComputeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsP$window_release(activity);
        } else if (i >= 24) {
            rectComputeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsN$window_release(activity);
        } else {
            rectComputeWindowBoundsIceCreamSandwich$window_release = computeWindowBoundsIceCreamSandwich$window_release(activity);
        }
        if (i >= 30) {
            windowInsetsCompatBuild = computeWindowInsetsCompat$window_release(activity);
        } else {
            windowInsetsCompatBuild = new WindowInsetsCompat.Builder().build();
            j.f(windowInsetsCompatBuild, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new WindowMetrics(new Bounds(rectComputeWindowBoundsIceCreamSandwich$window_release), windowInsetsCompatBuild);
    }
}
