package bg;

import android.app.ActivityManager;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import cj.C1110A;
import cj.C1129o;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: bg.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0991c extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0962F f8934b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0991c(C0962F c0962f, int i) {
        super(1);
        this.f8933a = i;
        this.f8934b = c0962f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f8933a) {
            case 0:
                C0962F c0962f = this.f8934b;
                return C0962F.i(c0962f, c0962f.f8796k, "Total");
            case 1:
                ((ActivityManager) this.f8934b.c.getValue()).getMemoryInfo(new ActivityManager.MemoryInfo());
                return String.valueOf((r10.availMem / 1024.0f) / 1024.0f);
            case 2:
                ((ActivityManager) this.f8934b.c.getValue()).getMemoryInfo(new ActivityManager.MemoryInfo());
                return String.valueOf((r10.totalMem / 1024.0f) / 1024.0f);
            case 3:
                Integer num = (Integer) C1110A.I(C0962F.j(this.f8934b, "cpuinfo_max_freq"));
                if (num != null) {
                    return String.valueOf(num.intValue());
                }
                return null;
            case 4:
                AbstractC0982V abstractC0982V = (AbstractC0982V) ((C0976O) this.f8934b.h.getValue()).f8843a.getValue();
                if (abstractC0982V instanceof C0980T) {
                    return ((C0980T) abstractC0982V).f8871a.f8811a;
                }
                return null;
            case 5:
                return String.valueOf(this.f8934b.f7198b.getApplicationInfo().targetSdkVersion);
            case 6:
                Integer num2 = (Integer) C1110A.J(C0962F.j(this.f8934b, "cpuinfo_min_freq"));
                if (num2 != null) {
                    return String.valueOf(num2.intValue());
                }
                return null;
            case 7:
                return String.valueOf(C0962F.l(this.f8934b).getStreamVolume(4));
            case 8:
                C0962F c0962f2 = this.f8934b;
                Intent intentH = C0962F.h(c0962f2);
                if (intentH != null) {
                    return String.valueOf(intentH.getIntExtra("health", c0962f2.f8800p));
                }
                return null;
            case 9:
                return String.valueOf(C0962F.l(this.f8934b).getStreamMaxVolume(4));
            case 10:
                C0962F c0962f3 = this.f8934b;
                Intent intentH2 = C0962F.h(c0962f3);
                if (intentH2 != null) {
                    return String.valueOf(intentH2.getIntExtra("level", c0962f3.f8800p));
                }
                return null;
            case 11:
                return String.valueOf(C0962F.l(this.f8934b).getStreamMaxVolume(3));
            case 12:
                C0962F c0962f4 = this.f8934b;
                Intent intentH3 = C0962F.h(c0962f4);
                if (intentH3 != null) {
                    return String.valueOf(intentH3.getIntExtra("plugged", c0962f4.f8800p));
                }
                return null;
            case 13:
                return String.valueOf(C0962F.l(this.f8934b).getStreamMaxVolume(5));
            case 14:
                C0962F c0962f5 = this.f8934b;
                Intent intentH4 = C0962F.h(c0962f5);
                if (intentH4 != null) {
                    return String.valueOf(intentH4.getIntExtra("scale", c0962f5.f8800p));
                }
                return null;
            case 15:
                Display defaultDisplay = ((WindowManager) this.f8934b.f8794d.getValue()).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                return String.valueOf(Math.sqrt(Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d) + Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d)));
            case 16:
                return String.valueOf(C0962F.l(this.f8934b).getStreamMaxVolume(2));
            case 17:
                C0962F c0962f6 = this.f8934b;
                Intent intentH5 = C0962F.h(c0962f6);
                if (intentH5 != null) {
                    return String.valueOf(intentH5.getIntExtra("temperature", c0962f6.f8800p));
                }
                return null;
            case 18:
                Display defaultDisplay2 = ((WindowManager) this.f8934b.f8794d.getValue()).getDefaultDisplay();
                kotlin.jvm.internal.j.c(defaultDisplay2, "_windowManager.defaultDisplay");
                Display.Mode mode = defaultDisplay2.getMode();
                kotlin.jvm.internal.j.c(mode, "_windowManager.defaultDisplay.mode");
                return String.valueOf(mode.getPhysicalHeight());
            case 19:
                return String.valueOf(C0962F.l(this.f8934b).getStreamMaxVolume(1));
            case 20:
                C0962F c0962f7 = this.f8934b;
                Intent intentH6 = C0962F.h(c0962f7);
                if (intentH6 != null) {
                    return String.valueOf(intentH6.getIntExtra("voltage", c0962f7.f8800p));
                }
                return null;
            case 21:
                Display defaultDisplay3 = ((WindowManager) this.f8934b.f8794d.getValue()).getDefaultDisplay();
                kotlin.jvm.internal.j.c(defaultDisplay3, "_windowManager.defaultDisplay");
                Display.Mode mode2 = defaultDisplay3.getMode();
                kotlin.jvm.internal.j.c(mode2, "_windowManager.defaultDisplay.mode");
                return String.valueOf(mode2.getPhysicalWidth());
            case 22:
                return String.valueOf(C0962F.l(this.f8934b).getStreamMaxVolume(0));
            case 23:
                C0962F c0962f8 = this.f8934b;
                Intent intentH7 = C0962F.h(c0962f8);
                if (intentH7 != null) {
                    return String.valueOf(intentH7.getIntExtra("icon-small", c0962f8.f8800p));
                }
                return null;
            case 24:
                C0962F c0962f9 = this.f8934b;
                if (!kotlin.jvm.internal.j.b(c0962f9.j, "mounted") || c0962f9.f8797l.length < 2) {
                    return C0962F.i(c0962f9, System.getenv(c0962f9.f8801q), "Free");
                }
                String[] strArrK = C0962F.k(c0962f9, c0962f9.f7198b);
                return C0962F.i(c0962f9, !(strArrK.length == 0) ? (String) C1129o.r(strArrK) : null, "Free");
            case 25:
                return String.valueOf(C0962F.l(this.f8934b).getStreamVolume(3));
            case 26:
                Intent intentH8 = C0962F.h(this.f8934b);
                if (intentH8 != null) {
                    return intentH8.getStringExtra("technology");
                }
                return null;
            case 27:
                C0962F c0962f10 = this.f8934b;
                if (!kotlin.jvm.internal.j.b(c0962f10.j, "mounted") || c0962f10.f8797l.length < 2) {
                    return C0962F.i(c0962f10, System.getenv(c0962f10.f8801q), "Total");
                }
                String[] strArrK2 = C0962F.k(c0962f10, c0962f10.f7198b);
                return C0962F.i(c0962f10, !(strArrK2.length == 0) ? (String) C1129o.r(strArrK2) : null, "Total");
            case 28:
                return String.valueOf(C0962F.l(this.f8934b).getStreamVolume(5));
            default:
                return String.valueOf(C0962F.l(this.f8934b).getStreamVolume(2));
        }
    }
}
