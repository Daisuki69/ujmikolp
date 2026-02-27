package I3;

import We.s;
import android.hardware.Camera;
import android.util.Log;
import com.dynatrace.android.agent.Global;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2207a = 0;

    static {
        Pattern.compile(Global.SEMICOLON);
    }

    public static String a(String str, List list, String... strArr) {
        StringBuilder sbW = s.w("Requesting ", str, " value from among: ");
        sbW.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", sbW.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z4) {
        String strA;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z4) {
            strA = a("flash mode", supportedFlashModes, "torch", f.f16147l);
        } else {
            strA = a("flash mode", supportedFlashModes, f.m);
        }
        if (strA != null) {
            if (strA.equals(parameters.getFlashMode())) {
                Log.i("CameraConfiguration", "Flash mode already set to ".concat(strA));
            } else {
                Log.i("CameraConfiguration", "Setting flash mode to ".concat(strA));
                parameters.setFlashMode(strA);
            }
        }
    }
}
