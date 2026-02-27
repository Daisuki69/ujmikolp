package dOYHB6.aztWy0;

import android.view.MotionEvent;
import dOYHB6.speLp8.iKNpI8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes6.dex */
public class hxOD26 {
    private static final int MOTION_EVENTS_HANDLING_INTERVAL = 5;
    private long lastEventHash;
    private final List<dTY6S3> motionEventsCallbackList;
    private final ConcurrentLinkedQueue<eTp7v2> motionEventsQueue;

    private static class aPeQX9 {
        private static final hxOD26 INSTANCE = new hxOD26();

        private aPeQX9() {
        }
    }

    private hxOD26() {
        this.lastEventHash = 0L;
        this.motionEventsQueue = new ConcurrentLinkedQueue<>();
        this.motionEventsCallbackList = new ArrayList();
        nwzZ33();
    }

    public static hxOD26 getInstance() {
        return aPeQX9.INSTANCE;
    }

    public static long lKfpu4(eTp7v2 etp7v2) {
        MotionEvent motionEvent = etp7v2.getMotionEvent();
        return (((long) motionEvent.getPointerId(motionEvent.getActionIndex())) * 31) + (motionEvent.getDownTime() * 37) + (motionEvent.getEventTime() * 41) + (((long) motionEvent.getAction()) * 43);
    }

    private void nwzZ33() {
        new Thread(new Runnable() { // from class: dOYHB6.aztWy0.hxOD26$$uJQhx4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.zH9zf2$nwzZ33$0();
            }
        }).start();
    }

    public static boolean qBE3G5(MotionEvent motionEvent) {
        getInstance().gSVOV1(new eTp7v2(motionEvent, iKNpI8.jqldq5()));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zH9zf2$nwzZ33$0() {
        while (true) {
            if (this.motionEventsQueue.isEmpty()) {
                try {
                    Thread.sleep(5L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            while (!this.motionEventsQueue.isEmpty()) {
                eTp7v2 etp7v2Poll = this.motionEventsQueue.poll();
                synchronized (this.motionEventsCallbackList) {
                    Iterator<dTY6S3> it = this.motionEventsCallbackList.iterator();
                    while (it.hasNext()) {
                        try {
                            it.next().gSVOV1(etp7v2Poll);
                        } catch (Exception e7) {
                        }
                    }
                }
                etp7v2Poll.recycleMotionEvent();
            }
        }
    }

    public static boolean zN5YC5(MotionEvent motionEvent) {
        getInstance().gSVOV1(new eTp7v2(motionEvent, iKNpI8.jqldq5()));
        return false;
    }

    public void gSVOV1(eTp7v2 etp7v2) {
        long jLKfpu4 = lKfpu4(etp7v2);
        if (jLKfpu4 == this.lastEventHash) {
            return;
        }
        this.lastEventHash = jLKfpu4;
        this.motionEventsQueue.add(etp7v2);
    }

    public void registerForMotionEvents(dTY6S3 dty6s3) {
        synchronized (this.motionEventsCallbackList) {
            this.motionEventsCallbackList.add(dty6s3);
        }
    }
}
