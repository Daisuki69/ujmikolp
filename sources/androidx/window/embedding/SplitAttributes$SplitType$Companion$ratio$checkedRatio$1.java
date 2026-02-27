package androidx.window.embedding;

import androidx.camera.video.AudioStats;
import cj.C1129o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.k;

/* JADX INFO: loaded from: classes2.dex */
public final class SplitAttributes$SplitType$Companion$ratio$checkedRatio$1 extends k implements Function1<Float, Boolean> {
    final /* synthetic */ float $ratio;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitAttributes$SplitType$Companion$ratio$checkedRatio$1(float f) {
        super(1);
        this.$ratio = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Boolean invoke(float f) {
        double d10 = this.$ratio;
        return Boolean.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE <= d10 && d10 <= 1.0d && !C1129o.p(new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)}, Float.valueOf(this.$ratio)));
    }
}
