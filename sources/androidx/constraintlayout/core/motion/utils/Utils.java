package androidx.constraintlayout.core.motion.utils;

import We.s;
import com.dynatrace.android.agent.Global;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes.dex */
public class Utils {
    static DebugHandle ourHandle;

    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i) {
        int i4 = (i & (~(i >> 31))) - 255;
        return (i4 & (i4 >> 31)) + 255;
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void logStack(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i, stackTrace.length - 1);
        String strI = Global.BLANK;
        for (int i4 = 1; i4 <= iMin; i4++) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            String str2 = ".(" + stackTrace[i4].getFileName() + Global.COLON + stackTrace[i4].getLineNumber() + ") " + stackTrace[i4].getMethodName();
            strI = s.i(strI, Global.BLANK);
            System.out.println(str + strI + str2 + strI);
        }
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static int rgbaTocColor(float f, float f3, float f7, float f10) {
        int iClamp = clamp((int) (f * 255.0f));
        int iClamp2 = clamp((int) (f3 * 255.0f));
        return (iClamp << 16) | (clamp((int) (f10 * 255.0f)) << 24) | (iClamp2 << 8) | clamp((int) (f7 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        ourHandle = debugHandle;
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String strSubstring = (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        String str2 = ".(" + stackTraceElement.getFileName() + Global.COLON + stackTraceElement.getLineNumber() + ")" + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + strSubstring;
        System.out.println(str2 + Global.BLANK + str);
        DebugHandle debugHandle = ourHandle;
        if (debugHandle != null) {
            debugHandle.message(str2 + Global.BLANK + str);
        }
    }
}
