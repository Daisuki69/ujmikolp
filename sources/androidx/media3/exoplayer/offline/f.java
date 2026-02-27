package androidx.media3.exoplayer.offline;

import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.offline.DownloadHelper;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8051b;

    public /* synthetic */ f(Object obj, int i) {
        this.f8050a = i;
        this.f8051b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f8050a) {
            case 0:
                return ((DownloadHelper.MediaPreparer) this.f8051b).handleDownloadHelperCallbackMessage(message);
            default:
                return ((DownloadManager) this.f8051b).handleMainMessage(message);
        }
    }
}
