package androidx.core.graphics;

import android.app.NotificationChannel;
import android.media.AudioFocusRequest;
import android.media.MediaMuxer;
import java.io.FileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel h(int i, String str, String str2) {
        return new NotificationChannel(str, str2, i);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest n(Object obj) {
        return (AudioFocusRequest) obj;
    }

    public static /* synthetic */ MediaMuxer o(FileDescriptor fileDescriptor) {
        return new MediaMuxer(fileDescriptor, 3);
    }

    public static /* synthetic */ void x() {
    }
}
