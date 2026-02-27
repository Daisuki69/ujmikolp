package dOYHB6.iY9fr2;

import android.view.Display;
import dOYHB6.krwAC8.slgMP8;
import dOYHB6.speLp8.fChUQ4;
import dOYHB6.tiZVw8.numX49;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class wVTWZ7 {
    private static hXuph3 capturingLastState = hXuph3.LAST_STATE_NOT_CAPTURING;

    private enum hXuph3 {
        LAST_STATE_CAPTURING,
        LAST_STATE_NOT_CAPTURING
    }

    public static void cGkQr9() {
        if (wHSa32()) {
            capturingLastState = hXuph3.LAST_STATE_CAPTURING;
        } else if (capturingLastState == hXuph3.LAST_STATE_CAPTURING) {
            fChUQ4.zJGTn5(numX49.tnTj78("bFSB"), numX49.tnTj78("bFSZ"), numX49.tnTj78("bFSk"));
            capturingLastState = hXuph3.LAST_STATE_NOT_CAPTURING;
        }
    }

    private static boolean wHSa32() {
        Iterator<Display> it = slgMP8.tFp7P6().iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            fChUQ4.zJGTn5(numX49.tnTj78("bFSj"), numX49.tnTj78("bFSu"), numX49.tnTj78("bFSV"), numX49.tnTj78("bFSS"), it.next().getName());
            z4 = true;
        }
        return z4;
    }
}
