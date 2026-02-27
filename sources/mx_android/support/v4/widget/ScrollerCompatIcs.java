package mx_android.support.v4.widget;

import android.widget.OverScroller;

/* JADX INFO: loaded from: classes7.dex */
class ScrollerCompatIcs {
    ScrollerCompatIcs() {
    }

    public static float getCurrVelocity(Object obj) {
        return ((OverScroller) obj).getCurrVelocity();
    }
}
