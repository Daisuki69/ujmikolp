package n1;

import O1.P;
import O1.S;
import O1.t0;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import pi.C2151a;
import s1.C2229d;
import s1.InterfaceC2230e;
import s1.InterfaceC2231f;
import v1.C2335b;
import z1.AbstractC2550e;
import z1.InterfaceC2546a;

/* JADX INFO: renamed from: n1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1900f implements ExoPlayer, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1893F f18565a = new C1893F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18566b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18567d;
    public boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18568g;
    public boolean h;
    public C1890C i;
    public InterfaceC2231f j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18570l;
    public long m;

    public C1900f(C2335b c2335b) {
        Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.13.3] [" + AbstractC2550e.f21353d + "]");
        throw null;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() <= 0) {
            return arrayList;
        }
        throw null;
    }

    public static boolean f(AbstractC1909o abstractC1909o) {
        abstractC1909o.getClass();
        return false;
    }

    public final ArrayList a(int i, List list) {
        Random random;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            C1908n c1908n = new C1908n((InterfaceC2230e) list.get(0));
            arrayList.add(c1908n);
            new C1899e(c1908n.f18576b, c1908n.f18575a.f19995b);
            throw null;
        }
        InterfaceC2231f interfaceC2231f = this.j;
        int size = arrayList.size();
        C2151a c2151a = (C2151a) interfaceC2231f;
        c2151a.getClass();
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        int i4 = 0;
        while (true) {
            random = (Random) c2151a.f19707a;
            iArr = (int[]) c2151a.f19708b;
            if (i4 >= size) {
                break;
            }
            iArr2[i4] = random.nextInt(iArr.length + 1);
            int i6 = i4 + 1;
            int iNextInt = random.nextInt(i6);
            iArr3[i4] = iArr3[iNextInt];
            iArr3[iNextInt] = i4 + i;
            i4 = i6;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length + size; i12++) {
            if (i10 >= size || i11 != iArr2[i10]) {
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                iArr4[i12] = i14;
                if (i14 >= i) {
                    iArr4[i12] = i14 + size;
                }
                i11 = i13;
            } else {
                iArr4[i12] = iArr3[i10];
                i10++;
            }
        }
        this.j = new C2151a(iArr4, new Random(random.nextLong()));
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void addListener(t tVar) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaItem(int i, MediaItem mediaItem) {
        addMediaItems(i, Collections.singletonList(mediaItem));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaItems(List list) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSource(InterfaceC2230e interfaceC2230e) {
        addMediaSources(Collections.singletonList(interfaceC2230e));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSources(List list) {
        throw null;
    }

    public final int c() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void clearMediaItems() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C1888A createMessage(z zVar) {
        throw null;
    }

    public final Pair d(AbstractC1894G abstractC1894G, C1889B c1889b) {
        boolean z4 = false;
        C1892E c1892e = null;
        long contentPosition = getContentPosition();
        if (abstractC1894G.n() || c1889b.n()) {
            boolean z5 = !abstractC1894G.n() && c1889b.n();
            int iC = z5 ? -1 : c();
            if (z5) {
                contentPosition = -9223372036854775807L;
            }
            return e(c1889b, iC, contentPosition);
        }
        Pair pairH = abstractC1894G.h(this.f18565a, null, getCurrentWindowIndex(), AbstractC1895a.a(contentPosition));
        int i = AbstractC2550e.f21351a;
        Object obj = pairH.first;
        if (c1889b.b(obj) != -1) {
            return pairH;
        }
        int i4 = this.f18566b;
        boolean z8 = this.c;
        C1893F c1893f = this.f18565a;
        int iB = abstractC1894G.b(obj);
        int iG = abstractC1894G.g();
        int i6 = 0;
        int iB2 = -1;
        while (i6 < iG && iB2 == -1) {
            int i10 = abstractC1894G.e(iB, c1892e, z4).c;
            if (abstractC1894G.k(i10, c1893f, 0L).j == iB) {
                int iD = abstractC1894G.d(i10, i4, z8);
                iB = iD == -1 ? -1 : abstractC1894G.k(iD, c1893f, 0L).i;
            } else {
                iB++;
            }
            if (iB == -1) {
                break;
            }
            iB2 = c1889b.b(abstractC1894G.j(iB));
            i6++;
            z4 = false;
            c1892e = null;
        }
        Object objJ = iB2 == -1 ? null : c1889b.j(iB2);
        if (objJ == null) {
            return e(c1889b, -1, androidx.media3.common.C.TIME_UNSET);
        }
        c1889b.f(objJ, null);
        throw null;
    }

    public final Pair e(AbstractC1894G abstractC1894G, int i, long j) {
        if (abstractC1894G.n()) {
            this.f18570l = i;
            if (j == androidx.media3.common.C.TIME_UNSET) {
                j = 0;
            }
            this.m = j;
            return null;
        }
        if (i == -1 || i >= abstractC1894G.m()) {
            i = abstractC1894G.a(this.c);
            abstractC1894G.k(i, this.f18565a, 0L).getClass();
            j = AbstractC1895a.b(0L);
        }
        return abstractC1894G.h(this.f18565a, null, i, AbstractC1895a.a(j));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean experimentalIsSleepingForOffload() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void experimentalSetOffloadSchedulingEnabled(boolean z4) {
        throw null;
    }

    public final void g(int i, int i4) {
        if (i4 - 1 >= i) {
            throw null;
        }
        C2151a c2151a = (C2151a) this.j;
        int i6 = i4 - i;
        int[] iArr = (int[]) c2151a.f19708b;
        int[] iArr2 = new int[iArr.length - i6];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 < i || i12 >= i4) {
                int i13 = i11 - i10;
                if (i12 >= i) {
                    i12 -= i6;
                }
                iArr2[i13] = i12;
            } else {
                i10++;
            }
        }
        this.j = new C2151a(iArr2, new Random(((Random) c2151a.f19707a).nextLong()));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final Looper getApplicationLooper() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final InterfaceC1912r getAudioComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getBufferedPercentage() {
        long bufferedPosition = getBufferedPosition();
        long duration = getDuration();
        if (bufferedPosition == androidx.media3.common.C.TIME_UNSET || duration == androidx.media3.common.C.TIME_UNSET) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        int i = AbstractC2550e.f21351a;
        return Math.max(0, Math.min((int) ((bufferedPosition * 100) / duration), 100));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final long getBufferedPosition() {
        if (isPlayingAd()) {
            throw null;
        }
        return getContentBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final InterfaceC2546a getClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final long getContentBufferedPosition() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final long getContentDuration() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final long getContentPosition() {
        if (isPlayingAd()) {
            throw null;
        }
        return getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            throw null;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            throw null;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final long getCurrentLiveOffset() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final Object getCurrentManifest() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final MediaItem getCurrentMediaItem() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getCurrentPeriodIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final long getCurrentPosition() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final List getCurrentStaticMetadata() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final Object getCurrentTag() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final AbstractC1894G getCurrentTimeline() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final TrackGroupArray getCurrentTrackGroups() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final v1.d getCurrentTrackSelections() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final int getCurrentWindowIndex() {
        int iC = c();
        if (iC == -1) {
            return 0;
        }
        return iC;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final InterfaceC1913s getDeviceComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final long getDuration() {
        if (isPlayingAd()) {
            throw null;
        }
        return getContentDuration();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final MediaItem getMediaItemAt(int i) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getMediaItemCount() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final v getMetadataComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final int getNextWindowIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean getPauseAtEndOfMediaItems() {
        return this.f18569k;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final boolean getPlayWhenReady() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final ExoPlaybackException getPlaybackError() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final Looper getPlaybackLooper() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final C1910p getPlaybackParameters() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final int getPlaybackState() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getPlaybackSuppressionReason() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final ExoPlaybackException getPlayerError() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final int getPreviousWindowIndex() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final int getRendererCount() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final int getRendererType(int i) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final int getRepeatMode() {
        return this.f18566b;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final C1890C getSeekParameters() {
        return this.i;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final boolean getShuffleModeEnabled() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final w getTextComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final long getTotalBufferedDuration() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final v1.e getTrackSelector() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final x getVideoComponent() {
        return null;
    }

    public final void h(List list, int i, long j, boolean z4) {
        c();
        getCurrentPosition();
        this.f18567d++;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final boolean hasNext() {
        return getNextWindowIndex() != -1;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean hasPrevious() {
        return getPreviousWindowIndex() != -1;
    }

    public final void i(boolean z4, ExoPlaybackException exoPlaybackException) {
        if (!z4) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean isCurrentWindowDynamic() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean isCurrentWindowLive() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final boolean isCurrentWindowSeekable() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final boolean isLoading() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final boolean isPlaying() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final boolean isPlayingAd() {
        throw null;
    }

    public final void j(AbstractC1909o abstractC1909o, boolean z4, int i, int i4, int i6, boolean z5) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void moveMediaItem(int i, int i4) {
        if (i != i4) {
            moveMediaItems(i, i + 1, i4);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void moveMediaItems(int i, int i4, int i6) {
        if (i >= 0 && i <= i4) {
            throw null;
        }
        Xh.i.e(false);
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void next() {
        int nextWindowIndex = getNextWindowIndex();
        if (nextWindowIndex != -1) {
            seekToDefaultPosition(nextWindowIndex);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void prepare() {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void previous() {
        int previousWindowIndex = getPreviousWindowIndex();
        if (previousWindowIndex != -1) {
            seekToDefaultPosition(previousWindowIndex);
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void release() {
        String str;
        StringBuilder sb2 = new StringBuilder("Release ");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" [ExoPlayerLib/2.13.3] [");
        sb2.append(AbstractC2550e.f21353d);
        sb2.append("] [");
        HashSet hashSet = AbstractC1902h.f18571a;
        synchronized (AbstractC1902h.class) {
            str = AbstractC1902h.f18572b;
        }
        sb2.append(str);
        sb2.append("]");
        Log.i("ExoPlayerImpl", sb2.toString());
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void removeListener(t tVar) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void removeMediaItem(int i) {
        removeMediaItems(i, i + 1);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void removeMediaItems(int i, int i4) {
        if (i >= 0 && i4 >= i) {
            throw null;
        }
        Xh.i.e(false);
        getCurrentWindowIndex();
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void retry() {
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void seekTo(long j) {
        seekTo(getCurrentWindowIndex(), j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void seekToDefaultPosition() {
        seekToDefaultPosition(getCurrentWindowIndex());
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setForegroundMode(boolean z4) {
        if (this.h == z4) {
            return;
        }
        this.h = z4;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItem(MediaItem mediaItem) {
        setMediaItems(Collections.singletonList(mediaItem), true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItems(List list) {
        setMediaItems(list, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSource(InterfaceC2230e interfaceC2230e) {
        setMediaSources(Collections.singletonList(interfaceC2230e), true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSources(List list) {
        setMediaSources(list, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setPauseAtEndOfMediaItems(boolean z4) {
        if (this.f18569k == z4) {
            return;
        }
        this.f18569k = z4;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void setPlayWhenReady(boolean z4) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void setPlaybackParameters(C1910p c1910p) {
        if (c1910p == null) {
            C1910p c1910p2 = C1910p.c;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void setRepeatMode(int i) {
        if (this.f18566b == i) {
            return;
        }
        this.f18566b = i;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setSeekParameters(C1890C c1890c) {
        if (c1890c == null) {
            c1890c = C1890C.c;
        }
        if (this.i.equals(c1890c)) {
            return;
        }
        this.i = c1890c;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void setShuffleModeEnabled(boolean z4) {
        if (this.c == z4) {
            return;
        }
        this.c = z4;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setShuffleOrder(InterfaceC2231f interfaceC2231f) {
        AbstractC1909o abstractC1909o = null;
        C1889B c1889b = new C1889B(null, this.j);
        Xh.i.e(c1889b.n() || e(c1889b, getCurrentWindowIndex(), getCurrentPosition()) != null);
        abstractC1909o.getClass();
        abstractC1909o.g(c1889b);
        AbstractC1909o abstractC1909o2 = null;
        if (!c1889b.n()) {
            abstractC1909o2.getClass();
            throw null;
        }
        C2229d c2229d = AbstractC1909o.c;
        long jA = AbstractC1895a.a(this.m);
        long jA2 = AbstractC1895a.a(this.m);
        TrackGroupArray trackGroupArray = TrackGroupArray.f9654d;
        P p10 = S.f4555b;
        abstractC1909o2.b(c2229d, jA, jA2, 0L, trackGroupArray, null, t0.e);
        abstractC1909o.a(c2229d);
        abstractC1909o.getClass();
        abstractC1909o.f18577a = 0L;
        this.f18567d++;
        this.j = interfaceC2231f;
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void stop() {
        i(false, null);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaItem(MediaItem mediaItem) {
        addMediaItems(Collections.singletonList(mediaItem));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaItems(int i, List list) {
        addMediaSources(i, b(list));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSource(int i, InterfaceC2230e interfaceC2230e) {
        addMediaSources(i, Collections.singletonList(interfaceC2230e));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void addMediaSources(int i, List list) {
        Xh.i.e(i >= 0);
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void prepare(InterfaceC2230e interfaceC2230e) {
        setMediaSource(interfaceC2230e);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, n1.y
    public final void seekTo(int i, long j) {
        throw null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void seekToDefaultPosition(int i) {
        seekTo(i, androidx.media3.common.C.TIME_UNSET);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItems(List list, boolean z4) {
        setMediaSources(b(list), z4);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSources(List list, boolean z4) {
        h(list, -1, androidx.media3.common.C.TIME_UNSET, z4);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void stop(boolean z4) {
        i(z4, null);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItem(MediaItem mediaItem, long j) {
        setMediaItems(Collections.singletonList(mediaItem), 0, j);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItems(List list, int i, long j) {
        h(b(list), i, j, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSource(InterfaceC2230e interfaceC2230e, long j) {
        h(Collections.singletonList(interfaceC2230e), 0, j, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSources(List list, int i, long j) {
        h(list, i, j, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void prepare(InterfaceC2230e interfaceC2230e, boolean z4, boolean z5) {
        setMediaSource(interfaceC2230e, z4);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaItem(MediaItem mediaItem, boolean z4) {
        setMediaItems(Collections.singletonList(mediaItem), z4);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final void setMediaSource(InterfaceC2230e interfaceC2230e, boolean z4) {
        setMediaSources(Collections.singletonList(interfaceC2230e), z4);
    }
}
