package mx_android.support.v4.hardware.display;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final WeakHashMap<Context, DisplayManagerCompat> sInstances = new WeakHashMap<>();

    public abstract Display getDisplay(int i);

    public abstract Display[] getDisplays();

    public abstract Display[] getDisplays(String str);

    DisplayManagerCompat() {
    }

    public static DisplayManagerCompat getInstance(Context context) {
        DisplayManagerCompat legacyImpl;
        WeakHashMap<Context, DisplayManagerCompat> weakHashMap = sInstances;
        synchronized (weakHashMap) {
            legacyImpl = weakHashMap.get(context);
            if (legacyImpl == null) {
                if (Build.VERSION.SDK_INT >= 17) {
                    legacyImpl = new JellybeanMr1Impl(context);
                } else {
                    legacyImpl = new LegacyImpl(context);
                }
                weakHashMap.put(context, legacyImpl);
            }
        }
        return legacyImpl;
    }

    private static class LegacyImpl extends DisplayManagerCompat {
        private final WindowManager mWindowManager;

        public LegacyImpl(Context context) {
            this.mWindowManager = (WindowManager) context.getSystemService("window");
        }

        @Override // mx_android.support.v4.hardware.display.DisplayManagerCompat
        public Display getDisplay(int i) {
            Display defaultDisplay = this.mWindowManager.getDefaultDisplay();
            if (defaultDisplay.getDisplayId() == i) {
                return defaultDisplay;
            }
            return null;
        }

        @Override // mx_android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays() {
            return new Display[]{this.mWindowManager.getDefaultDisplay()};
        }

        @Override // mx_android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays(String str) {
            return str == null ? getDisplays() : new Display[0];
        }
    }

    private static class JellybeanMr1Impl extends DisplayManagerCompat {
        private final Object mDisplayManagerObj;

        public JellybeanMr1Impl(Context context) {
            this.mDisplayManagerObj = DisplayManagerJellybeanMr1.getDisplayManager(context);
        }

        @Override // mx_android.support.v4.hardware.display.DisplayManagerCompat
        public Display getDisplay(int i) {
            return DisplayManagerJellybeanMr1.getDisplay(this.mDisplayManagerObj, i);
        }

        @Override // mx_android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays() {
            return DisplayManagerJellybeanMr1.getDisplays(this.mDisplayManagerObj);
        }

        @Override // mx_android.support.v4.hardware.display.DisplayManagerCompat
        public Display[] getDisplays(String str) {
            return DisplayManagerJellybeanMr1.getDisplays(this.mDisplayManagerObj, str);
        }
    }
}
