package mx_android.support.v4.view;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes7.dex */
class KeyEventCompatHoneycomb {
    KeyEventCompatHoneycomb() {
    }

    public static int normalizeMetaState(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    public static boolean metaStateHasModifiers(int i, int i4) {
        return KeyEvent.metaStateHasModifiers(i, i4);
    }

    public static boolean metaStateHasNoModifiers(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
