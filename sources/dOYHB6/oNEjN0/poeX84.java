package dOYHB6.oNEjN0;

import android.os.Build;
import android.view.MotionEvent;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class poeX84 {
    private static boolean sent_unknown_tool_type_event = false;
    private static boolean sent_click_bot_virtual_click_event = false;
    private static Map<Long, Integer> thread_to_mid_scroll = new HashMap();
    private static boolean found_virtual_click = false;

    static void eo9bs4() {
        fChUQ4.zJGTn5(numX49.tnTj78("bHYV"), numX49.tnTj78("bHYB"), numX49.tnTj78("bHYu"));
    }

    public static void gSVOV1(eTp7v2 etp7v2) {
        nCaZH6(etp7v2);
        found_virtual_click = false;
    }

    static void jqVlS3() {
        fChUQ4.zJGTn5(numX49.tnTj78("bHYd"), numX49.tnTj78("bHYS"), numX49.tnTj78("bHYj"));
    }

    public static void lfmkF0(eTp7v2 etp7v2) {
        if (!rixKR5(etp7v2.getMotionEvent()) || sent_click_bot_virtual_click_event) {
            return;
        }
        sent_click_bot_virtual_click_event = true;
        jqVlS3();
    }

    public static boolean mpKOx4(MotionEvent motionEvent) {
        long id = Thread.currentThread().getId();
        if (!thread_to_mid_scroll.containsKey(Long.valueOf(id)) && motionEvent.getActionMasked() == 0) {
            thread_to_mid_scroll.put(Long.valueOf(id), 0);
            return true;
        }
        if (thread_to_mid_scroll.containsKey(Long.valueOf(id))) {
            if (motionEvent.getActionMasked() == 2) {
                thread_to_mid_scroll.put(Long.valueOf(id), Integer.valueOf(thread_to_mid_scroll.get(Long.valueOf(id)).intValue() + 1));
                return true;
            }
            if (thread_to_mid_scroll.get(Long.valueOf(id)).intValue() > 0) {
                thread_to_mid_scroll.remove(Long.valueOf(id));
                return true;
            }
        }
        return false;
    }

    public static void nCaZH6(eTp7v2 etp7v2) {
        MotionEvent motionEvent = etp7v2.getMotionEvent();
        if (!wSYSM9(motionEvent) || mpKOx4(motionEvent) || sent_unknown_tool_type_event) {
            return;
        }
        sent_unknown_tool_type_event = true;
        eo9bs4();
    }

    public static boolean rixKR5(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        boolean zYLxLX8 = yLxLX8();
        for (int i = 0; i < pointerCount; i++) {
            if (motionEvent.getToolType(i) == zYLxLX8 && motionEvent.getDeviceId() == -1 && motionEvent.getActionMasked() != 3) {
                found_virtual_click = true;
                return true;
            }
        }
        return false;
    }

    public static boolean wSYSM9(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            if (motionEvent.getToolType(i) == 0 && motionEvent.getActionMasked() != 3 && !found_virtual_click) {
                return true;
            }
        }
        return false;
    }

    public static boolean yLxLX8() {
        return (Build.VERSION.SDK_INT == 30 || Build.VERSION.SDK_INT == 35 || Build.VERSION.SDK_INT == 32 || Build.VERSION.SDK_INT == 31) ? false : true;
    }
}
