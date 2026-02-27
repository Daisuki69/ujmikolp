package androidx.media3.exoplayer.offline;

import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.text.TextOutput;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements TextOutput {
    @Override // androidx.media3.exoplayer.text.TextOutput
    public final void onCues(CueGroup cueGroup) {
        DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
    }

    @Override // androidx.media3.exoplayer.text.TextOutput
    public final /* synthetic */ void onCues(List list) {
        androidx.media3.exoplayer.text.b.a(this, list);
    }
}
