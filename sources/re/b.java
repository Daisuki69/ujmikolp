package Re;

import C.h;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.ConcatenatingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.SilenceMediaSource;
import androidx.media3.extractor.DefaultExtractorsFactory;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import dOYHB6.tiZVw8.numX49;
import defpackage.AbstractC1414e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import pg.j;
import pg.s;
import pg.t;
import pg.u;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements s, Player.Listener, MetadataOutput {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Random f5492U = new Random();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ExoPlayer f5493B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public Integer f5494K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public MediaSource f5495P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Integer f5496Q;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f5499T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5501b;
    public final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5502d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f5503g;
    public long h;
    public Integer i;
    public t j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t f5504k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f5505l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IcyInfo f5506n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IcyHeaders f5507o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5508p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AudioAttributes f5509q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final DefaultLoadControl f5510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f5511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final DefaultLivePlaybackSpeedControl f5512t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f5513u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public HashMap f5517y;
    public final HashMap m = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f5514v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f5515w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5516x = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final Handler f5497R = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final h f5498S = new h(this, 5);

    public b(Context context, j jVar, String str, Map map, List list, Boolean bool) {
        this.f5500a = context;
        this.f5513u = list;
        this.f5511s = bool != null ? bool.booleanValue() : false;
        new u(jVar, AbstractC1414e.h(numX49.tnTj78("bZpP"), str)).b(this);
        this.f5501b = new c(jVar, AbstractC1414e.h(numX49.tnTj78("bZpb"), str));
        this.c = new c(jVar, AbstractC1414e.h(numX49.tnTj78("bZp2"), str));
        this.f5499T = 1;
        if (map != null) {
            Map map2 = (Map) map.get(numX49.tnTj78("bZpL"));
            if (map2 != null) {
                DefaultLoadControl.Builder backBuffer = new DefaultLoadControl.Builder().setBufferDurationsMs((int) (q(map2.get(numX49.tnTj78("bZpr"))).longValue() / 1000), (int) (q(map2.get(numX49.tnTj78("bZpZ"))).longValue() / 1000), (int) (q(map2.get(numX49.tnTj78("bZpk"))).longValue() / 1000), (int) (q(map2.get(numX49.tnTj78("bZpB"))).longValue() / 1000)).setPrioritizeTimeOverSizeThresholds(((Boolean) map2.get(numX49.tnTj78("bZpu"))).booleanValue()).setBackBuffer((int) (q(map2.get(numX49.tnTj78("bZpV"))).longValue() / 1000), false);
                String strTnTj78 = numX49.tnTj78("bZpS");
                if (map2.get(strTnTj78) != null) {
                    backBuffer.setTargetBufferBytes(((Integer) map2.get(strTnTj78)).intValue());
                }
                this.f5510r = backBuffer.build();
            }
            Map map3 = (Map) map.get(numX49.tnTj78("bZpj"));
            if (map3 != null) {
                this.f5512t = new DefaultLivePlaybackSpeedControl.Builder().setFallbackMinPlaybackSpeed((float) ((Double) map3.get(numX49.tnTj78("bZpd"))).doubleValue()).setFallbackMaxPlaybackSpeed((float) ((Double) map3.get(numX49.tnTj78("bZpi"))).doubleValue()).setMinUpdateIntervalMs(q(map3.get(numX49.tnTj78("bZpE"))).longValue() / 1000).setProportionalControlFactor((float) ((Double) map3.get(numX49.tnTj78("bZpF"))).doubleValue()).setMaxLiveOffsetErrorMsForUnitSpeed(q(map3.get(numX49.tnTj78("bZpH"))).longValue() / 1000).setTargetLiveOffsetIncrementOnRebufferMs(q(map3.get(numX49.tnTj78("bZpO"))).longValue() / 1000).setMinPossibleLiveOffsetSmoothingFactor((float) ((Double) map3.get(numX49.tnTj78("bZpQ"))).doubleValue()).build();
            }
        }
    }

    public static ShuffleOrder.DefaultShuffleOrder g(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return new ShuffleOrder.DefaultShuffleOrder(iArr, f5492U.nextLong());
    }

    public static Long q(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    public static Object t(Object obj, String str) {
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        return null;
    }

    public static HashMap u(Object... objArr) {
        HashMap map = new HashMap();
        for (int i = 0; i < objArr.length; i += 2) {
            map.put((String) objArr[i], objArr[i + 1]);
        }
        return map;
    }

    public final void A(int i) {
        this.f5493B.setRepeatMode(i);
    }

    public final void B(float f) {
        PlaybackParameters playbackParameters = this.f5493B.getPlaybackParameters();
        if (playbackParameters.pitch == f) {
            return;
        }
        this.f5493B.setPlaybackParameters(new PlaybackParameters(playbackParameters.speed, f));
        i();
    }

    public final void C(boolean z4) {
        this.f5493B.setShuffleModeEnabled(z4);
    }

    public final void D(Object obj) {
        Map map = (Map) obj;
        MediaSource mediaSource = (MediaSource) this.m.get((String) t(map, numX49.tnTj78("bZpt")));
        if (mediaSource == null) {
            return;
        }
        String str = (String) t(map, numX49.tnTj78("bZpU"));
        str.getClass();
        if (!str.equals(numX49.tnTj78("bZpe"))) {
            if (str.equals(numX49.tnTj78("bZp8"))) {
                D(t(map, numX49.tnTj78("bZpC")));
            }
        } else {
            ((ConcatenatingMediaSource) mediaSource).setShuffleOrder(g((List) t(map, numX49.tnTj78("bZp4"))));
            Iterator it = ((List) t(map, numX49.tnTj78("bZpo"))).iterator();
            while (it.hasNext()) {
                D(it.next());
            }
        }
    }

    public final void E(boolean z4) {
        this.f5493B.setSkipSilenceEnabled(z4);
    }

    public final void F(float f) {
        PlaybackParameters playbackParameters = this.f5493B.getPlaybackParameters();
        if (playbackParameters.speed == f) {
            return;
        }
        this.f5493B.setPlaybackParameters(new PlaybackParameters(f, playbackParameters.pitch));
        if (this.f5493B.getPlayWhenReady()) {
            H();
        }
        i();
    }

    public final void G(float f) {
        this.f5493B.setVolume(f);
    }

    public final void H() {
        this.f5502d = o();
        this.e = System.currentTimeMillis();
    }

    public final void a(String str, boolean z4) {
        ((AudioEffect) this.f5515w.get(str)).setEnabled(z4);
    }

    public final void b() {
        i();
        c();
    }

    public final void c() {
        HashMap map = this.f5517y;
        if (map != null) {
            this.f5501b.success(map);
            this.f5517y = null;
        }
    }

    public final DefaultDataSource.Factory d(Map map) {
        HashMap map2;
        String userAgent = null;
        if (map == null) {
            map2 = null;
        } else {
            map2 = new HashMap();
            for (Object obj : map.keySet()) {
                map2.put((String) obj, (String) map.get(obj));
            }
        }
        if (map2 != null && (userAgent = (String) map2.remove(numX49.tnTj78("bZpK"))) == null) {
            userAgent = (String) map2.remove(numX49.tnTj78("bZpw"));
        }
        Context context = this.f5500a;
        if (userAgent == null) {
            userAgent = Util.getUserAgent(context, numX49.tnTj78("bZpc"));
        }
        DefaultHttpDataSource.Factory allowCrossProtocolRedirects = new DefaultHttpDataSource.Factory().setUserAgent(userAgent).setAllowCrossProtocolRedirects(true);
        if (map2 != null && map2.size() > 0) {
            allowCrossProtocolRedirects.setDefaultRequestProperties((Map<String, String>) map2);
        }
        return new DefaultDataSource.Factory(context, allowCrossProtocolRedirects);
    }

    public final void e() {
        Iterator it = this.f5514v.iterator();
        while (it.hasNext()) {
            ((AudioEffect) it.next()).release();
            it.remove();
        }
        this.f5515w.clear();
    }

    public final ConcatenatingMediaSource f(Object obj) {
        return (ConcatenatingMediaSource) this.m.get((String) obj);
    }

    public final void h() {
        int i = this.f5499T;
        c cVar = this.f5501b;
        if (i == 2) {
            t tVar = this.j;
            String strTnTj78 = numX49.tnTj78("bZpm");
            String strTnTj782 = numX49.tnTj78("bZpD");
            if (tVar != null) {
                tVar.error(strTnTj78, strTnTj782, null);
                this.j = null;
            }
            cVar.error(strTnTj78, strTnTj782, null);
        }
        t tVar2 = this.f5504k;
        if (tVar2 != null) {
            tVar2.success(new HashMap());
            this.f5504k = null;
        }
        this.m.clear();
        this.f5495P = null;
        e();
        ExoPlayer exoPlayer = this.f5493B;
        if (exoPlayer != null) {
            exoPlayer.release();
            this.f5493B = null;
            this.f5499T = 1;
            b();
        }
        cVar.endOfStream();
        this.c.endOfStream();
    }

    public final void i() {
        new HashMap();
        HashMap map = new HashMap();
        Long lValueOf = p() == C.TIME_UNSET ? null : Long.valueOf(p() * 1000);
        ExoPlayer exoPlayer = this.f5493B;
        this.f = exoPlayer != null ? exoPlayer.getBufferedPosition() : 0L;
        map.put(numX49.tnTj78("bZph"), Integer.valueOf(AbstractC2217b.c(this.f5499T)));
        map.put(numX49.tnTj78("bZpM"), Long.valueOf(this.f5502d * 1000));
        map.put(numX49.tnTj78("bZpN"), Long.valueOf(this.e));
        map.put(numX49.tnTj78("bZp6"), Long.valueOf(Math.max(this.f5502d, this.f) * 1000));
        HashMap map2 = new HashMap();
        IcyInfo icyInfo = this.f5506n;
        String strTnTj78 = numX49.tnTj78("bZpa");
        if (icyInfo != null) {
            HashMap map3 = new HashMap();
            map3.put(numX49.tnTj78("bZpX"), this.f5506n.title);
            map3.put(strTnTj78, this.f5506n.url);
            map2.put(numX49.tnTj78("bZpG"), map3);
        }
        if (this.f5507o != null) {
            HashMap map4 = new HashMap();
            map4.put(numX49.tnTj78("bZp3"), Integer.valueOf(this.f5507o.bitrate));
            map4.put(numX49.tnTj78("bZpy"), this.f5507o.genre);
            map4.put(numX49.tnTj78("bZpv"), this.f5507o.name);
            map4.put(numX49.tnTj78("bZp7"), Integer.valueOf(this.f5507o.metadataInterval));
            map4.put(strTnTj78, this.f5507o.url);
            map4.put(numX49.tnTj78("bZpA"), Boolean.valueOf(this.f5507o.isPublic));
            map2.put(numX49.tnTj78("bZpY"), map4);
        }
        map.put(numX49.tnTj78("bZpT"), map2);
        map.put(numX49.tnTj78("bZpR"), lValueOf);
        map.put(numX49.tnTj78("bZpp"), this.f5496Q);
        map.put(numX49.tnTj78("bZp0"), this.f5494K);
        this.f5517y = map;
    }

    public final void j() {
        if (this.f5493B == null) {
            ExoPlayer.Builder builder = new ExoPlayer.Builder(this.f5500a);
            DefaultLoadControl defaultLoadControl = this.f5510r;
            if (defaultLoadControl != null) {
                builder.setLoadControl(defaultLoadControl);
            }
            DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.f5512t;
            if (defaultLivePlaybackSpeedControl != null) {
                builder.setLivePlaybackSpeedControl(defaultLivePlaybackSpeedControl);
            }
            ExoPlayer exoPlayerBuild = builder.build();
            this.f5493B = exoPlayerBuild;
            TrackSelectionParameters.Builder builderBuildUpon = exoPlayerBuild.getTrackSelectionParameters().buildUpon();
            TrackSelectionParameters.AudioOffloadPreferences.Builder builder2 = new TrackSelectionParameters.AudioOffloadPreferences.Builder();
            boolean z4 = !this.f5511s;
            exoPlayerBuild.setTrackSelectionParameters(builderBuildUpon.setAudioOffloadPreferences(builder2.setIsGaplessSupportRequired(z4).setIsSpeedChangeSupportRequired(z4).setAudioOffloadMode(1).build()).build());
            z(this.f5493B.getAudioSessionId());
            this.f5493B.addListener(this);
        }
    }

    public final HashMap k() {
        short s9 = 1;
        Equalizer equalizer = (Equalizer) this.f5515w.get(numX49.tnTj78("bZpg"));
        ArrayList arrayList = new ArrayList();
        short s10 = 0;
        while (s10 < equalizer.getNumberOfBands()) {
            Short shValueOf = Short.valueOf(s10);
            Double dValueOf = Double.valueOf(((double) equalizer.getBandFreqRange(s10)[0]) / 1000.0d);
            Double dValueOf2 = Double.valueOf(((double) equalizer.getBandFreqRange(s10)[s9]) / 1000.0d);
            short s11 = s9;
            Double dValueOf3 = Double.valueOf(((double) equalizer.getCenterFreq(s10)) / 1000.0d);
            Double dValueOf4 = Double.valueOf(((double) equalizer.getBandLevel(s10)) / 1000.0d);
            Object[] objArr = new Object[10];
            objArr[0] = numX49.tnTj78("bZpf");
            objArr[s11] = shValueOf;
            objArr[2] = numX49.tnTj78("bZp1");
            objArr[3] = dValueOf;
            objArr[4] = numX49.tnTj78("bZpn");
            objArr[5] = dValueOf2;
            objArr[6] = numX49.tnTj78("bZpx");
            objArr[7] = dValueOf3;
            objArr[8] = numX49.tnTj78("bZps");
            objArr[9] = dValueOf4;
            arrayList.add(u(objArr));
            s10 = (short) (s10 + s11);
            s9 = s11;
        }
        short s12 = s9;
        Double dValueOf5 = Double.valueOf(((double) equalizer.getBandLevelRange()[0]) / 1000.0d);
        Double dValueOf6 = Double.valueOf(((double) equalizer.getBandLevelRange()[s12]) / 1000.0d);
        Object[] objArr2 = new Object[6];
        objArr2[0] = numX49.tnTj78("bZp5");
        objArr2[s12] = dValueOf5;
        objArr2[2] = numX49.tnTj78("bZpJ");
        objArr2[3] = dValueOf6;
        objArr2[4] = numX49.tnTj78("bZpI");
        objArr2[5] = arrayList;
        HashMap mapU = u(objArr2);
        Object[] objArr3 = new Object[2];
        objArr3[0] = numX49.tnTj78("bZpq");
        objArr3[s12] = mapU;
        return u(objArr3);
    }

    public final void l(int i, double d10) {
        ((Equalizer) this.f5515w.get(numX49.tnTj78("bZpz"))).setBandLevel((short) i, (short) Math.round(d10 * 1000.0d));
    }

    public final MediaSource m(Object obj) {
        MediaSource concatenatingMediaSource;
        int iIntValue;
        Map map;
        boolean zBooleanValue = false;
        boolean zBooleanValue2 = true;
        Map map2 = (Map) obj;
        String strTnTj78 = numX49.tnTj78("bZpl");
        String str = (String) map2.get(strTnTj78);
        HashMap map3 = this.m;
        MediaSource mediaSource = (MediaSource) map3.get(str);
        if (mediaSource != null) {
            return mediaSource;
        }
        Map map4 = map2;
        String str2 = (String) map4.get(strTnTj78);
        String strTnTj782 = numX49.tnTj78("bZpW");
        String str3 = (String) map4.get(strTnTj782);
        str3.getClass();
        String strTnTj783 = numX49.tnTj78("bZpP9");
        String strTnTj784 = numX49.tnTj78("bZpPP");
        String strTnTj785 = numX49.tnTj78("bZpPb");
        byte b8 = -1;
        switch (str3.hashCode()) {
            case -445916622:
                if (str3.equals(numX49.tnTj78("bZpPu"))) {
                    b8 = 0;
                }
                break;
            case 103407:
                if (str3.equals(numX49.tnTj78("bZpPB"))) {
                    b8 = 1;
                }
                break;
            case 3075986:
                if (str3.equals(numX49.tnTj78("bZpPk"))) {
                    b8 = 2;
                }
                break;
            case 349937342:
                if (str3.equals(numX49.tnTj78("bZpPZ"))) {
                    b8 = 3;
                }
                break;
            case 918617282:
                if (str3.equals(numX49.tnTj78("bZpPr"))) {
                    b8 = 4;
                }
                break;
            case 1131547531:
                if (str3.equals(numX49.tnTj78("bZpPL"))) {
                    b8 = 5;
                }
                break;
            case 2092627105:
                if (str3.equals(numX49.tnTj78("bZpP2"))) {
                    b8 = 6;
                }
                break;
        }
        switch (b8) {
            case 0:
                ArrayList arrayListN = n(map4.get(numX49.tnTj78("bZpPe")));
                MediaSource[] mediaSourceArr = new MediaSource[arrayListN.size()];
                arrayListN.toArray(mediaSourceArr);
                concatenatingMediaSource = new ConcatenatingMediaSource(false, ((Boolean) map4.get(numX49.tnTj78("bZpP8"))).booleanValue(), g((List) t(map4, numX49.tnTj78("bZpPC"))), mediaSourceArr);
                break;
            case 1:
                concatenatingMediaSource = new HlsMediaSource.Factory(d((Map) t(map4, strTnTj785))).createMediaSource(new MediaItem.Builder().setUri(Uri.parse((String) map4.get(strTnTj784))).setMimeType(numX49.tnTj78("bZpPU")).build());
                break;
            case 2:
                concatenatingMediaSource = new DashMediaSource.Factory(d((Map) t(map4, strTnTj785))).createMediaSource(new MediaItem.Builder().setUri(Uri.parse((String) map4.get(strTnTj784))).setMimeType(numX49.tnTj78("bZpPt")).setTag(str2).build());
                break;
            case 3:
                Integer num = (Integer) map4.get(numX49.tnTj78("bZpPQ"));
                MediaSource mediaSourceM = m(map4.get(strTnTj783));
                int iIntValue2 = num.intValue();
                MediaSource[] mediaSourceArr2 = new MediaSource[iIntValue2];
                for (int i = 0; i < iIntValue2; i++) {
                    mediaSourceArr2[i] = mediaSourceM;
                }
                concatenatingMediaSource = new ConcatenatingMediaSource(mediaSourceArr2);
                break;
            case 4:
                Long lQ = q(map4.get(numX49.tnTj78("bZpPH")));
                Long lQ2 = q(map4.get(numX49.tnTj78("bZpPO")));
                concatenatingMediaSource = new ClippingMediaSource(m(map4.get(strTnTj783)), lQ != null ? lQ.longValue() : 0L, lQ2 != null ? lQ2.longValue() : Long.MIN_VALUE);
                break;
            case 5:
                DefaultDataSource.Factory factoryD = d((Map) t(map4, strTnTj785));
                Map map5 = (Map) t(map4, numX49.tnTj78("bZpPj"));
                DefaultExtractorsFactory defaultExtractorsFactory = new DefaultExtractorsFactory();
                if (map5 == null || (map = (Map) map5.get(numX49.tnTj78("bZpPd"))) == null) {
                    iIntValue = 0;
                } else {
                    zBooleanValue2 = ((Boolean) map.get(numX49.tnTj78("bZpPi"))).booleanValue();
                    zBooleanValue = ((Boolean) map.get(numX49.tnTj78("bZpPE"))).booleanValue();
                    iIntValue = ((Integer) map.get(numX49.tnTj78("bZpPF"))).intValue();
                }
                defaultExtractorsFactory.setConstantBitrateSeekingEnabled(zBooleanValue2);
                defaultExtractorsFactory.setConstantBitrateSeekingAlwaysEnabled(zBooleanValue);
                defaultExtractorsFactory.setMp3ExtractorFlags(iIntValue);
                concatenatingMediaSource = new ProgressiveMediaSource.Factory(factoryD, defaultExtractorsFactory).createMediaSource(new MediaItem.Builder().setUri(Uri.parse((String) map4.get(strTnTj784))).setTag(str2).build());
                break;
            case 6:
                concatenatingMediaSource = new SilenceMediaSource.Factory().setDurationUs(q(map4.get(numX49.tnTj78("bZpPS"))).longValue()).setTag(str2).createMediaSource();
                break;
            default:
                throw new IllegalArgumentException(numX49.tnTj78("bZpPV") + map4.get(strTnTj782));
        }
        map3.put(str, concatenatingMediaSource);
        return concatenatingMediaSource;
    }

    public final ArrayList n(Object obj) {
        if (!(obj instanceof List)) {
            throw new RuntimeException(numX49.tnTj78("bZpP4") + obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(m(list.get(i)));
        }
        return arrayList;
    }

    public final long o() {
        long j = this.h;
        if (j != C.TIME_UNSET) {
            return j;
        }
        int i = this.f5499T;
        if (i != 1 && i != 2) {
            Long l6 = this.f5503g;
            return (l6 == null || l6.longValue() == C.TIME_UNSET) ? this.f5493B.getCurrentPosition() : this.f5503g.longValue();
        }
        long currentPosition = this.f5493B.getCurrentPosition();
        if (currentPosition < 0) {
            return 0L;
        }
        return currentPosition;
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        androidx.media3.common.e.a(this, audioAttributes);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAudioSessionIdChanged(int i) {
        z(i);
        c();
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        androidx.media3.common.e.c(this, commands);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(CueGroup cueGroup) {
        androidx.media3.common.e.d(this, cueGroup);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        androidx.media3.common.e.f(this, deviceInfo);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onDeviceVolumeChanged(int i, boolean z4) {
        androidx.media3.common.e.g(this, i, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onEvents(Player player, Player.Events events) {
        androidx.media3.common.e.h(this, player, events);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onIsLoadingChanged(boolean z4) {
        androidx.media3.common.e.i(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onIsPlayingChanged(boolean z4) {
        androidx.media3.common.e.j(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onLoadingChanged(boolean z4) {
        androidx.media3.common.e.k(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        androidx.media3.common.e.l(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        androidx.media3.common.e.m(this, mediaItem, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        androidx.media3.common.e.n(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener, androidx.media3.exoplayer.metadata.MetadataOutput
    public final void onMetadata(Metadata metadata) {
        for (int i = 0; i < metadata.length(); i++) {
            Metadata.Entry entry = metadata.get(i);
            if (entry instanceof IcyInfo) {
                this.f5506n = (IcyInfo) entry;
                b();
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0122  */
    @Override // pg.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(pg.r r19, pg.t r20) {
        /*
            Method dump skipped, instruction units count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Re.b.onMethodCall(pg.r, pg.t):void");
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i) {
        androidx.media3.common.e.p(this, z4, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        androidx.media3.common.e.q(this, playbackParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i) {
        if (i == 2) {
            if (o() != this.f5502d) {
                this.f5502d = o();
                this.e = System.currentTimeMillis();
            }
            int i4 = this.f5499T;
            if (i4 != 3 && i4 != 2) {
                this.f5499T = 3;
                b();
            }
            Handler handler = this.f5497R;
            h hVar = this.f5498S;
            handler.removeCallbacks(hVar);
            handler.post(hVar);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            if (this.f5499T != 5) {
                H();
                this.f5499T = 5;
                b();
            }
            if (this.j != null) {
                this.j.success(new HashMap());
                this.j = null;
                AudioAttributes audioAttributes = this.f5509q;
                if (audioAttributes != null) {
                    this.f5493B.setAudioAttributes(audioAttributes, false);
                    this.f5509q = null;
                }
            }
            t tVar = this.f5504k;
            if (tVar != null) {
                tVar.success(new HashMap());
                this.f5504k = null;
                return;
            }
            return;
        }
        if (this.f5493B.getPlayWhenReady()) {
            H();
        }
        this.f5499T = 4;
        b();
        if (this.j != null) {
            HashMap map = new HashMap();
            map.put(numX49.tnTj78("bZpPM"), p() == C.TIME_UNSET ? null : Long.valueOf(p() * 1000));
            this.j.success(map);
            this.j = null;
            AudioAttributes audioAttributes2 = this.f5509q;
            if (audioAttributes2 != null) {
                this.f5493B.setAudioAttributes(audioAttributes2, false);
                this.f5509q = null;
            }
        }
        t tVar2 = this.f5505l;
        if (tVar2 != null) {
            this.f5503g = null;
            tVar2.success(new HashMap());
            this.f5505l = null;
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        androidx.media3.common.e.s(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) throws IOException {
        Integer num;
        int iIntValue;
        boolean z4 = playbackException instanceof ExoPlaybackException;
        c cVar = this.f5501b;
        String strTnTj78 = numX49.tnTj78("bZpPN");
        String strTnTj782 = numX49.tnTj78("bZpP6");
        if (z4) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            int i = exoPlaybackException.type;
            if (i == 0) {
                Log.e(strTnTj782, numX49.tnTj78("bZpP3") + exoPlaybackException.getSourceException().getMessage());
            } else if (i == 1) {
                Log.e(strTnTj782, numX49.tnTj78("bZpPG") + exoPlaybackException.getRendererException().getMessage());
            } else if (i != 2) {
                Log.e(strTnTj782, numX49.tnTj78("bZpPa") + exoPlaybackException.getUnexpectedException().getMessage());
            } else {
                Log.e(strTnTj782, numX49.tnTj78("bZpPX") + exoPlaybackException.getUnexpectedException().getMessage());
            }
            String strValueOf = String.valueOf(exoPlaybackException.type);
            String message = exoPlaybackException.getMessage();
            HashMap mapU = u(strTnTj78, this.f5496Q);
            t tVar = this.j;
            if (tVar != null) {
                tVar.error(strValueOf, message, mapU);
                this.j = null;
            }
            cVar.error(strValueOf, message, mapU);
        } else {
            Log.e(strTnTj782, numX49.tnTj78("bZpPy") + playbackException.getMessage());
            String strValueOf2 = String.valueOf(playbackException.errorCode);
            String message2 = playbackException.getMessage();
            HashMap mapU2 = u(strTnTj78, this.f5496Q);
            t tVar2 = this.j;
            if (tVar2 != null) {
                tVar2.error(strValueOf2, message2, mapU2);
                this.j = null;
            }
            cVar.error(strValueOf2, message2, mapU2);
        }
        this.f5508p++;
        if (!this.f5493B.hasNextMediaItem() || (num = this.f5496Q) == null || this.f5508p > 5 || (iIntValue = num.intValue() + 1) >= this.f5493B.getCurrentTimeline().getWindowCount()) {
            return;
        }
        this.f5493B.setMediaSource(this.f5495P);
        this.f5493B.prepare();
        this.f5493B.seekTo(iIntValue, 0L);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        androidx.media3.common.e.u(this, playbackException);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlayerStateChanged(boolean z4, int i) {
        androidx.media3.common.e.v(this, z4, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        androidx.media3.common.e.w(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onPositionDiscontinuity(int i) {
        androidx.media3.common.e.x(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRenderedFirstFrame() {
        androidx.media3.common.e.z(this);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onRepeatModeChanged(int i) {
        androidx.media3.common.e.A(this, i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekBackIncrementChanged(long j) {
        androidx.media3.common.e.B(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        androidx.media3.common.e.C(this, j);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
        androidx.media3.common.e.D(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
        androidx.media3.common.e.E(this, z4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onSurfaceSizeChanged(int i, int i4) {
        androidx.media3.common.e.F(this, i, i4);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i) {
        if (this.h != C.TIME_UNSET || this.i != null) {
            Integer num = this.i;
            this.f5493B.seekTo(num != null ? num.intValue() : 0, this.h);
            this.i = null;
            this.h = C.TIME_UNSET;
        }
        Integer numValueOf = Integer.valueOf(this.f5493B.getCurrentMediaItemIndex());
        if (!numValueOf.equals(this.f5496Q)) {
            this.f5496Q = numValueOf;
            b();
        }
        if (this.f5493B.getPlaybackState() == 4) {
            try {
                if (this.f5493B.getPlayWhenReady()) {
                    if (this.f5516x == 0 && this.f5493B.getMediaItemCount() > 0) {
                        this.f5493B.seekTo(0, 0L);
                    } else if (this.f5493B.hasNextMediaItem()) {
                        this.f5493B.seekToNextMediaItem();
                    }
                } else if (this.f5493B.getCurrentMediaItemIndex() < this.f5493B.getMediaItemCount()) {
                    ExoPlayer exoPlayer = this.f5493B;
                    exoPlayer.seekTo(exoPlayer.getCurrentMediaItemIndex(), 0L);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f5516x = this.f5493B.getMediaItemCount();
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.common.e.H(this, trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        for (int i = 0; i < tracks.getGroups().size(); i++) {
            TrackGroup mediaTrackGroup = ((Tracks.Group) tracks.getGroups().get(i)).getMediaTrackGroup();
            for (int i4 = 0; i4 < mediaTrackGroup.length; i4++) {
                Metadata metadata = mediaTrackGroup.getFormat(i4).metadata;
                if (metadata != null) {
                    for (int i6 = 0; i6 < metadata.length(); i6++) {
                        Metadata.Entry entry = metadata.get(i6);
                        if (entry instanceof IcyHeaders) {
                            this.f5507o = (IcyHeaders) entry;
                            b();
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        androidx.media3.common.e.J(this, videoSize);
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onVolumeChanged(float f) {
        androidx.media3.common.e.K(this, f);
    }

    public final long p() {
        ExoPlayer exoPlayer;
        int i = this.f5499T;
        return (i == 1 || i == 2 || (exoPlayer = this.f5493B) == null) ? C.TIME_UNSET : exoPlayer.getDuration();
    }

    public final void r(MediaSource mediaSource, long j, Integer num, t tVar) throws IOException {
        this.h = j;
        this.i = num;
        this.f5496Q = Integer.valueOf(num != null ? num.intValue() : 0);
        int iC = AbstractC2217b.c(this.f5499T);
        if (iC != 0) {
            if (iC != 1) {
                this.f5493B.stop();
            } else {
                t tVar2 = this.j;
                String strTnTj78 = numX49.tnTj78("bZpPv");
                String strTnTj782 = numX49.tnTj78("bZpP7");
                if (tVar2 != null) {
                    tVar2.error(strTnTj78, strTnTj782, null);
                    this.j = null;
                }
                this.f5501b.error(strTnTj78, strTnTj782, null);
                this.f5493B.stop();
            }
        }
        this.f5508p = 0;
        this.j = tVar;
        H();
        this.f5499T = 2;
        i();
        this.f5495P = mediaSource;
        this.f5493B.setMediaSource(mediaSource);
        this.f5493B.prepare();
    }

    public final void s(double d10) {
        ((LoudnessEnhancer) this.f5515w.get(numX49.tnTj78("bZpPA"))).setTargetGain((int) Math.round(d10 * 1000.0d));
    }

    public final void v() {
        if (this.f5493B.getPlayWhenReady()) {
            this.f5493B.setPlayWhenReady(false);
            H();
            t tVar = this.f5504k;
            if (tVar != null) {
                tVar.success(new HashMap());
                this.f5504k = null;
            }
        }
    }

    public final void w(t tVar) {
        t tVar2;
        if (this.f5493B.getPlayWhenReady()) {
            tVar.success(new HashMap());
            return;
        }
        t tVar3 = this.f5504k;
        if (tVar3 != null) {
            tVar3.success(new HashMap());
        }
        this.f5504k = tVar;
        this.f5493B.setPlayWhenReady(true);
        H();
        if (this.f5499T != 5 || (tVar2 = this.f5504k) == null) {
            return;
        }
        tVar2.success(new HashMap());
        this.f5504k = null;
    }

    public final void x(long j, Integer num, t tVar) {
        int i = this.f5499T;
        if (i == 1 || i == 2) {
            tVar.success(new HashMap());
            return;
        }
        t tVar2 = this.f5505l;
        if (tVar2 != null) {
            try {
                tVar2.success(new HashMap());
            } catch (RuntimeException unused) {
            }
            this.f5505l = null;
            this.f5503g = null;
        }
        this.f5503g = Long.valueOf(j);
        this.f5505l = tVar;
        try {
            this.f5493B.seekTo(num != null ? num.intValue() : this.f5493B.getCurrentMediaItemIndex(), j);
        } catch (RuntimeException e) {
            this.f5505l = null;
            this.f5503g = null;
            throw e;
        }
    }

    public final void y(int i, int i4, int i6) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setContentType(i);
        builder.setFlags(i4);
        builder.setUsage(i6);
        AudioAttributes audioAttributesBuild = builder.build();
        if (this.f5499T == 2) {
            this.f5509q = audioAttributesBuild;
        } else {
            this.f5493B.setAudioAttributes(audioAttributesBuild, false);
        }
    }

    public final void z(int i) {
        AudioEffect equalizer;
        if (i == 0) {
            this.f5494K = null;
        } else {
            this.f5494K = Integer.valueOf(i);
        }
        e();
        if (this.f5494K != null) {
            for (Map map : this.f5513u) {
                int iIntValue = this.f5494K.intValue();
                String strTnTj78 = numX49.tnTj78("bZpPY");
                String str = (String) map.get(strTnTj78);
                str.getClass();
                if (str.equals(numX49.tnTj78("bZpPT"))) {
                    equalizer = new Equalizer(0, iIntValue);
                } else {
                    if (!str.equals(numX49.tnTj78("bZpPR"))) {
                        throw new IllegalArgumentException(numX49.tnTj78("bZpP0") + map.get(strTnTj78));
                    }
                    int iRound = (int) Math.round(((Double) map.get(numX49.tnTj78("bZpPp"))).doubleValue() * 1000.0d);
                    LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(iIntValue);
                    loudnessEnhancer.setTargetGain(iRound);
                    equalizer = loudnessEnhancer;
                }
                if (((Boolean) map.get(numX49.tnTj78("bZpPg"))).booleanValue()) {
                    equalizer.setEnabled(true);
                }
                this.f5514v.add(equalizer);
                this.f5515w.put((String) map.get(strTnTj78), equalizer);
            }
        }
        i();
    }

    @Override // androidx.media3.common.Player.Listener
    public final /* synthetic */ void onCues(List list) {
        androidx.media3.common.e.e(this, list);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        H();
        if (i == 0 || i == 1) {
            Integer numValueOf = Integer.valueOf(this.f5493B.getCurrentMediaItemIndex());
            if (!numValueOf.equals(this.f5496Q)) {
                this.f5496Q = numValueOf;
            }
        }
        b();
    }
}
