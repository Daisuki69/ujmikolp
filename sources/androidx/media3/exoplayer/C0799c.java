package androidx.media3.exoplayer;

import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.DefaultRendererCapabilitiesList;
import androidx.media3.exoplayer.metadata.MetadataOutput;

/* JADX INFO: renamed from: androidx.media3.exoplayer.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0799c implements MetadataOutput {
    @Override // androidx.media3.exoplayer.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(metadata);
    }
}
