package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements ListenerSet.Event {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnalyticsListener.EventTime f7975b;
    public final /* synthetic */ Format c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DecoderReuseEvaluation f7976d;

    public /* synthetic */ r(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i) {
        this.f7974a = i;
        this.f7975b = eventTime;
        this.c = format;
        this.f7976d = decoderReuseEvaluation;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f7974a) {
            case 0:
                analyticsListener.onVideoInputFormatChanged(this.f7975b, this.c, this.f7976d);
                break;
            default:
                analyticsListener.onAudioInputFormatChanged(this.f7975b, this.c, this.f7976d);
                break;
        }
    }
}
