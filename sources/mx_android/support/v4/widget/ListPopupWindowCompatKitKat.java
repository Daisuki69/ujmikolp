package mx_android.support.v4.widget;

import android.view.View;
import android.widget.ListPopupWindow;

/* JADX INFO: loaded from: classes7.dex */
class ListPopupWindowCompatKitKat {
    ListPopupWindowCompatKitKat() {
    }

    public static View.OnTouchListener createDragToOpenListener(Object obj, View view) {
        return ((ListPopupWindow) obj).createDragToOpenListener(view);
    }
}
