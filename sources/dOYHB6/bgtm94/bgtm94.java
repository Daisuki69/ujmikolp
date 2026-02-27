package dOYHB6.bgtm94;

import android.app.Activity;
import android.view.MotionEvent;
import dOYHB6.aztWy0.dTY6S3;
import dOYHB6.aztWy0.eTp7v2;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.qOnQ39.qOnQ39;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class bgtm94 {
    private static final int ANTI_OVERLAY_THRESHOLD_DEFAULT_VALUE = 3;
    private static final int FLAG_WINDOW_IS_PARTIALLY_OBSCURED = 2;
    private static int antiOverlayThreshold;
    private static boolean isAntiOverlayEventSent = false;
    private static boolean isAntiOverlayPartialEventSent = false;
    private static boolean hidingNonSystemOverlays = false;
    private static String[] whitelistedActivities = null;
    private static int overlayDetectedCounter = 0;

    public static int fNqC86(MotionEvent motionEvent) {
        if ((motionEvent.getFlags() & 1) != 0) {
            return (motionEvent.getAction() == 1 || motionEvent.getAction() == 0 || motionEvent.getAction() == 2) ? 1 : 0;
        }
        return 0;
    }

    public static void init() {
        whitelistedActivities = qOnQ39.getStringArray(numX49.tnTj78("bHXZ"));
        antiOverlayThreshold = qOnQ39.getInt(numX49.tnTj78("bHXk"), 3);
        hxOD26.getInstance().registerForMotionEvents(new dTY6S3() { // from class: dOYHB6.bgtm94.bgtm94.1
            @Override // dOYHB6.aztWy0.dTY6S3
            public void gSVOV1(eTp7v2 etp7v2) {
                MotionEvent motionEvent = etp7v2.getMotionEvent();
                final String activityPath = etp7v2.getActivityPath();
                if (motionEvent.getActionMasked() != 0) {
                    return;
                }
                if (bgtm94.whitelistedActivities == null || !Arrays.asList(bgtm94.whitelistedActivities).contains(activityPath)) {
                    int iFNqC86 = bgtm94.fNqC86(motionEvent);
                    if (iFNqC86 == 1) {
                        bgtm94.overlayDetectedCounter++;
                        if (bgtm94.overlayDetectedCounter < bgtm94.antiOverlayThreshold || bgtm94.isAntiOverlayEventSent) {
                            return;
                        }
                        new Thread(new Runnable() { // from class: dOYHB6.bgtm94.bgtm94.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                fChUQ4.zJGTn5(numX49.tnTj78("bHXS"), numX49.tnTj78("bHXB"), numX49.tnTj78("bHXu"), numX49.tnTj78("bHXV"), activityPath);
                            }
                        }).start();
                        bgtm94.isAntiOverlayEventSent = true;
                        return;
                    }
                    if (iFNqC86 != 2) {
                        bgtm94.overlayDetectedCounter = 0;
                        return;
                    }
                    bgtm94.overlayDetectedCounter++;
                    bgtm94.lw9zc2(etp7v2.getActivity());
                    if (bgtm94.overlayDetectedCounter < bgtm94.antiOverlayThreshold || bgtm94.isAntiOverlayPartialEventSent) {
                        return;
                    }
                    new Thread(new Runnable() { // from class: dOYHB6.bgtm94.bgtm94.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            fChUQ4.zJGTn5(numX49.tnTj78("bHXr"), numX49.tnTj78("bHXP"), numX49.tnTj78("bHXb"), numX49.tnTj78("bHX2"), activityPath, numX49.tnTj78("bHXL"), String.valueOf(bgtm94.hidingNonSystemOverlays));
                        }
                    }).start();
                    bgtm94.isAntiOverlayPartialEventSent = true;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lw9zc2(Activity activity) {
    }
}
