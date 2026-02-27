package androidx.media3.exoplayer.upstream;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements CmcdConfiguration.Factory {
    @Override // androidx.media3.exoplayer.upstream.CmcdConfiguration.Factory
    public final CmcdConfiguration createCmcdConfiguration(MediaItem mediaItem) {
        return d.a(mediaItem);
    }
}
