package ei;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import java.util.Objects;

/* JADX INFO: renamed from: ei.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1446a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16680a;

    public C1446a(String str) {
        this.f16680a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1446a.class != obj.getClass()) {
            return false;
        }
        return SessionDescription.ATTR_CONTROL.equals(SessionDescription.ATTR_CONTROL) && Objects.equals(this.f16680a, ((C1446a) obj).f16680a);
    }

    public final int hashCode() {
        return Objects.hash(SessionDescription.ATTR_CONTROL, null, this.f16680a);
    }
}
