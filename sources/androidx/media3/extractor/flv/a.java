package androidx.media3.extractor.flv;

import B2.b;
import N1.g;
import Z0.h;
import android.net.Uri;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.text.Cue;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.mp4.Track;
import androidx.media3.extractor.ogg.OggExtractor;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.CuesWithTimingSubtitle;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.ts.Ac3Extractor;
import androidx.media3.extractor.ts.Ac4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.media3.extractor.wav.WavExtractor;
import androidx.work.ListenableWorker;
import b2.c;
import b2.d;
import b2.j;
import c2.l;
import com.dynatrace.agent.di.SelfMonitoringComponent;
import com.dynatrace.android.internal.api.SelfMonitoring;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements ExtractorsFactory, Id3Decoder.FramePredicate, g, CallbackToFutureAdapter.Resolver, d, B2.a, c, h, SelfMonitoringComponent, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8149a;

    public /* synthetic */ a(int i) {
        this.f8149a = i;
    }

    @Override // b2.d
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // N1.g
    public Object apply(Object obj) {
        switch (this.f8149a) {
            case 6:
                return Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
            case 9:
                return ((Cue) obj).toSerializableBundle();
            default:
                return CuesWithTimingSubtitle.lambda$static$0((CuesWithTiming) obj);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ListenableWorker.lambda$getForegroundInfoAsync$0(completer);
    }

    @Override // Z0.h
    public void b(Exception exc) {
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.f8149a) {
            case 0:
                return FlvExtractor.lambda$static$0();
            case 1:
            case 4:
            case 6:
            case 9:
            case 10:
            default:
                return WavExtractor.lambda$static$0();
            case 2:
                return MatroskaExtractor.lambda$static$1();
            case 3:
                return Mp3Extractor.lambda$static$0();
            case 5:
                return FragmentedMp4Extractor.lambda$static$1();
            case 7:
                return Mp4Extractor.lambda$static$1();
            case 8:
                return OggExtractor.lambda$static$0();
            case 11:
                return Ac3Extractor.lambda$static$0();
            case 12:
                return Ac4Extractor.lambda$static$0();
            case 13:
                return AdtsExtractor.lambda$static$0();
            case 14:
                return PsExtractor.lambda$static$0();
            case 15:
                return TsExtractor.lambda$static$1();
        }
    }

    @Override // B2.a
    public void d(b bVar) {
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i4, int i6, int i10, int i11) {
        switch (this.f8149a) {
            case 1:
                return Id3Decoder.lambda$static$0(i, i4, i6, i10, i11);
            default:
                return Mp3Extractor.lambda$static$1(i, i4, i6, i10, i11);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z4) {
        int i = this.f8149a;
        return androidx.media3.extractor.c.b(this, z4);
    }

    @Override // com.dynatrace.agent.di.SelfMonitoringComponent
    public void reportLogEvent(String str, String str2) {
        SelfMonitoring.reportLogEvent(str, str2);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo74setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f8149a;
        return androidx.media3.extractor.c.c(this, factory);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f8149a) {
            case 28:
                return Integer.valueOf(TypedValues.CycleType.TYPE_ALPHA);
            default:
                return -1;
        }
    }

    @Override // b2.c
    public Object v(Xh.b bVar) {
        switch (this.f8149a) {
            case 20:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(bVar);
            case 21:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(bVar);
            case 22:
            default:
                j jVar = ExecutorsRegistrar.f9744a;
                return l.f9273a;
            case 23:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9744a.get();
            case 24:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 25:
                return (ScheduledExecutorService) ExecutorsRegistrar.f9745b.get();
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f8149a;
        return androidx.media3.extractor.c.a(this, uri, map);
    }
}
