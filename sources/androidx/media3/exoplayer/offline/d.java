package androidx.media3.exoplayer.offline;

import androidx.media3.common.Metadata;
import androidx.media3.exoplayer.metadata.MetadataOutput;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements MetadataOutput {
    @Override // androidx.media3.exoplayer.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        DownloadHelper.lambda$getRendererCapabilities$1(metadata);
    }
}
