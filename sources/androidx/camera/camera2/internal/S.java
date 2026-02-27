package androidx.camera.camera2.internal;

import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return MeteringRepeatingSession.lambda$getProperPreviewSize$1((Size) obj, (Size) obj2);
    }
}
