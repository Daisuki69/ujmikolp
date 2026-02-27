package io.flutter.plugin.platform;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.core.view.WindowInsetsControllerCompat;
import dOYHB6.iY9fr2.dLgao9;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f17229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlatformChannel f17230b;
    public final Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PlatformChannel.SystemChromeStyle f17231d;
    public int e;

    public j(Activity activity, PlatformChannel platformChannel, i iVar) {
        C1622f c1622f = new C1622f(this);
        this.f17229a = activity;
        this.f17230b = platformChannel;
        platformChannel.setPlatformMessageHandler(c1622f);
        this.c = iVar;
        this.e = 1280;
    }

    public final void a(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        Window window = this.f17229a.getWindow();
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            window.addFlags(Integer.MIN_VALUE);
            dLgao9.oVike1(window, 201326592);
        }
        PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
        if (brightness != null) {
            int i4 = h.c[brightness.ordinal()];
            if (i4 == 1) {
                windowInsetsControllerCompat.setAppearanceLightStatusBars(true);
            } else if (i4 == 2) {
                windowInsetsControllerCompat.setAppearanceLightStatusBars(false);
            }
        }
        Integer num = systemChromeStyle.statusBarColor;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = systemChromeStyle.systemStatusBarContrastEnforced;
        if (bool != null && i >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i >= 26) {
            PlatformChannel.Brightness brightness2 = systemChromeStyle.systemNavigationBarIconBrightness;
            if (brightness2 != null) {
                int i6 = h.c[brightness2.ordinal()];
                if (i6 == 1) {
                    windowInsetsControllerCompat.setAppearanceLightNavigationBars(true);
                } else if (i6 == 2) {
                    windowInsetsControllerCompat.setAppearanceLightNavigationBars(false);
                }
            }
            Integer num2 = systemChromeStyle.systemNavigationBarColor;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = systemChromeStyle.systemNavigationBarDividerColor;
        if (num3 != null && i >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = systemChromeStyle.systemNavigationBarContrastEnforced;
        if (bool2 != null && i >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f17231d = systemChromeStyle;
    }

    public final void b() {
        this.f17229a.getWindow().getDecorView().setSystemUiVisibility(this.e);
        PlatformChannel.SystemChromeStyle systemChromeStyle = this.f17231d;
        if (systemChromeStyle != null) {
            a(systemChromeStyle);
        }
    }
}
