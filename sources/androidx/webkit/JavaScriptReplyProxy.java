package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes2.dex */
@UiThread
public abstract class JavaScriptReplyProxy {
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public JavaScriptReplyProxy() {
    }

    public abstract void postMessage(String str);

    public abstract void postMessage(byte[] bArr);
}
