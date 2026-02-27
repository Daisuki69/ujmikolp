package androidx.camera.extensions.internal;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static SessionProcessor a(VendorExtender vendorExtender, Context context) {
        return null;
    }

    public static Range b(VendorExtender vendorExtender, Size size) {
        return null;
    }

    public static List c(VendorExtender vendorExtender) {
        return Collections.EMPTY_LIST;
    }

    public static List d(VendorExtender vendorExtender) {
        return Collections.EMPTY_LIST;
    }

    public static Map e(VendorExtender vendorExtender, Size size) {
        return Collections.EMPTY_MAP;
    }

    public static List f(VendorExtender vendorExtender) {
        return Collections.EMPTY_LIST;
    }

    public static Size[] g(VendorExtender vendorExtender) {
        return new Size[0];
    }

    public static void h(VendorExtender vendorExtender, CameraInfo cameraInfo) {
    }

    public static boolean i(VendorExtender vendorExtender) {
        return false;
    }

    public static boolean j(VendorExtender vendorExtender) {
        return false;
    }

    public static boolean k(VendorExtender vendorExtender, String str, Map map) {
        return false;
    }

    public static boolean l(VendorExtender vendorExtender) {
        return false;
    }

    public static boolean m(VendorExtender vendorExtender) {
        return false;
    }

    public static boolean n(VendorExtender vendorExtender) {
        Version version = Version.VERSION_1_2;
        if (ClientVersion.isMaximumCompatibleVersion(version) || ExtensionVersion.isMaximumCompatibleVersion(version)) {
            return false;
        }
        return !vendorExtender.getSupportedCaptureResultKeys().isEmpty();
    }
}
