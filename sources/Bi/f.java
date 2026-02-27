package Bi;

import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.impl.QuirkSettings;
import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f578a;

    public /* synthetic */ f(int i) {
        this.f578a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        switch (this.f578a) {
            case 0:
                ((b) obj).destroy();
                break;
            case 1:
                ((b) obj).b();
                break;
            case 2:
                ((b) obj).d();
                break;
            case 3:
                ((b) obj).e();
                break;
            case 4:
                ((b) obj).c();
                break;
            case 5:
                ((b) obj).g();
                break;
            case 6:
                DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 7:
                androidx.camera.core.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 8:
                androidx.camera.extensions.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 9:
                androidx.camera.video.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
            case 10:
                IntentSanitizer.lambda$sanitizeByThrowing$1((String) obj);
                break;
            case 11:
                IntentSanitizer.lambda$sanitizeByFiltering$0((String) obj);
                break;
            default:
                androidx.camera.view.internal.compat.quirk.DeviceQuirks.lambda$static$0((QuirkSettings) obj);
                break;
        }
    }
}
