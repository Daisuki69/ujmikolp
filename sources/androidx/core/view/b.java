package androidx.core.view;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.ClipData;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ForegroundServiceStartNotAllowedException c(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* synthetic */ ContentInfo.Builder l(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ ContentInfo.Builder m(ContentInfo contentInfo) {
        return new ContentInfo.Builder(contentInfo);
    }

    public static /* synthetic */ void o() {
    }

    public static /* bridge */ /* synthetic */ boolean w(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
