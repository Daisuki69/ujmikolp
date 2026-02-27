package androidx.window.area.utils;

import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import cj.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(17)
public final class DeviceUtils {
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final List<DeviceMetrics> deviceList;

    static {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.widthPixels = 1080;
        displayMetrics.heightPixels = 2092;
        displayMetrics.density = 2.625f;
        displayMetrics.densityDpi = TypedValues.CycleType.TYPE_EASING;
        Unit unit = Unit.f18162a;
        deviceList = r.c(new DeviceMetrics("google", "pixel fold", displayMetrics));
    }

    private DeviceUtils() {
    }

    public final DisplayMetrics getRearDisplayMetrics$window_release(String manufacturer, String model) {
        Object next;
        j.g(manufacturer, "manufacturer");
        j.g(model, "model");
        Iterator<T> it = deviceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DeviceMetrics deviceMetrics = (DeviceMetrics) next;
            String manufacturer2 = deviceMetrics.getManufacturer();
            Locale US = Locale.US;
            j.f(US, "US");
            String lowerCase = manufacturer.toLowerCase(US);
            j.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (j.b(manufacturer2, lowerCase)) {
                String model2 = deviceMetrics.getModel();
                j.f(US, "US");
                String lowerCase2 = model.toLowerCase(US);
                j.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (j.b(model2, lowerCase2)) {
                    break;
                }
            }
        }
        DeviceMetrics deviceMetrics2 = (DeviceMetrics) next;
        if (deviceMetrics2 != null) {
            return deviceMetrics2.getRearDisplayMetrics();
        }
        return null;
    }

    public final boolean hasDeviceMetrics$window_release(String manufacturer, String model) {
        j.g(manufacturer, "manufacturer");
        j.g(model, "model");
        List<DeviceMetrics> list = deviceList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (DeviceMetrics deviceMetrics : list) {
            String manufacturer2 = deviceMetrics.getManufacturer();
            Locale US = Locale.US;
            j.f(US, "US");
            String lowerCase = manufacturer.toLowerCase(US);
            j.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (j.b(manufacturer2, lowerCase)) {
                String model2 = deviceMetrics.getModel();
                j.f(US, "US");
                String lowerCase2 = model.toLowerCase(US);
                j.f(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (j.b(model2, lowerCase2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
