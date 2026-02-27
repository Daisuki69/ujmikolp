package androidx.media3.common.text;

import O1.O;
import O1.P;
import O1.S;
import O1.t0;
import android.os.Bundle;
import androidx.constraintlayout.core.state.a;
import androidx.media3.common.util.BundleCollectionUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CueGroup {

    @UnstableApi
    public static final CueGroup EMPTY_TIME_ZERO;
    private static final String FIELD_CUES;
    private static final String FIELD_PRESENTATION_TIME_US;
    public final S cues;

    @UnstableApi
    public final long presentationTimeUs;

    static {
        P p10 = S.f4555b;
        EMPTY_TIME_ZERO = new CueGroup(t0.e, 0L);
        FIELD_CUES = Util.intToStringMaxRadix(0);
        FIELD_PRESENTATION_TIME_US = Util.intToStringMaxRadix(1);
    }

    @UnstableApi
    public CueGroup(List<Cue> list, long j) {
        this.cues = S.k(list);
        this.presentationTimeUs = j;
    }

    private static S filterOutBitmapCues(List<Cue> list) {
        O oJ = S.j();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                oJ.a(list.get(i));
            }
        }
        return oJ.g();
    }

    @UnstableApi
    public static CueGroup fromBundle(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_CUES);
        return new CueGroup(parcelableArrayList == null ? t0.e : BundleCollectionUtil.fromBundleList(new a(19), parcelableArrayList), bundle.getLong(FIELD_PRESENTATION_TIME_US));
    }

    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(FIELD_CUES, BundleCollectionUtil.toBundleArrayList(filterOutBitmapCues(this.cues), new a(20)));
        bundle.putLong(FIELD_PRESENTATION_TIME_US, this.presentationTimeUs);
        return bundle;
    }
}
