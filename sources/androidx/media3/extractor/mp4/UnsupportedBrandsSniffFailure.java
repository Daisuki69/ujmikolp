package androidx.media3.extractor.mp4;

import R1.a;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SniffFailure;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class UnsupportedBrandsSniffFailure implements SniffFailure {
    public final a compatibleBrands;
    public final int majorBrand;

    public UnsupportedBrandsSniffFailure(int i, @Nullable int[] iArr) {
        a aVar;
        this.majorBrand = i;
        if (iArr != null) {
            a aVar2 = a.c;
            aVar = iArr.length == 0 ? a.c : new a(Arrays.copyOf(iArr, iArr.length));
        } else {
            aVar = a.c;
        }
        this.compatibleBrands = aVar;
    }
}
