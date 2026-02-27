package dOYHB6.speLp8;

import android.content.ContentProvider;

/* JADX INFO: loaded from: classes6.dex */
public class mlOlZ7 {
    private static boolean onCreateHookCalled = false;

    public static void xCZPS1(ContentProvider contentProvider) {
        if (onCreateHookCalled) {
            return;
        }
        onCreateHookCalled = true;
        pl7Hu0.eaXH36(contentProvider.getContext().getApplicationContext());
    }
}
