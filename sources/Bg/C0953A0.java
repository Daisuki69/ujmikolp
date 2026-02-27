package bg;

import android.app.UiModeManager;
import android.os.PowerManager;
import android.provider.Settings;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.A0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0953A0 extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0955B0 f8649b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0953A0(C0955B0 c0955b0, int i) {
        super(1);
        this.f8648a = i;
        this.f8649b = c0955b0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8648a) {
            case 0:
                PowerManager powerManager = (PowerManager) this.f8649b.f8717l.getValue();
                Boolean boolValueOf = powerManager != null ? Boolean.valueOf(powerManager.isDeviceIdleMode()) : null;
                return String.valueOf(boolValueOf != null ? Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0) : null);
            case 1:
                return Settings.System.getString(this.f8649b.c, "time_12_24");
            case 2:
                return String.valueOf(Integer.valueOf(((PowerManager) this.f8649b.f8717l.getValue()).isInteractive() ? 1 : 0));
            case 3:
                UiModeManager uiModeManager = (UiModeManager) this.f8649b.f.getValue();
                return String.valueOf((uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null).intValue());
            case 4:
                return String.valueOf(Integer.valueOf(((PowerManager) this.f8649b.f8717l.getValue()).isPowerSaveMode() ? 1 : 0));
            case 5:
                UiModeManager uiModeManager2 = (UiModeManager) this.f8649b.f.getValue();
                return String.valueOf((uiModeManager2 != null ? Integer.valueOf(uiModeManager2.getNightMode()) : null).intValue());
            case 6:
                return String.valueOf(Integer.valueOf(this.f8649b.h.isSafeMode() ? 1 : 0));
            default:
                return Settings.System.getString(this.f8649b.c, "accelerometer_rotation");
        }
    }
}
