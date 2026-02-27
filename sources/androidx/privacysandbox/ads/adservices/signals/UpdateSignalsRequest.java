package androidx.privacysandbox.ads.adservices.signals;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@ExperimentalFeatures.Ext12OptIn
public final class UpdateSignalsRequest {
    private final Uri updateUri;

    public UpdateSignalsRequest(Uri updateUri) {
        j.g(updateUri, "updateUri");
        this.updateUri = updateUri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateSignalsRequest) {
            return j.b(this.updateUri, ((UpdateSignalsRequest) obj).updateUri);
        }
        return false;
    }

    public final Uri getUpdateUri() {
        return this.updateUri;
    }

    public int hashCode() {
        return this.updateUri.hashCode();
    }

    public String toString() {
        return "UpdateSignalsRequest: updateUri=" + this.updateUri;
    }
}
