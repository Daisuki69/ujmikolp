package androidx.media3.exoplayer.hls.playlist;

import O1.AbstractC0529x;
import O1.P;
import O1.S;
import O1.X;
import O1.t0;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;

    @Nullable
    public final DrmInitData protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, @Nullable Segment segment, long j, int i, long j6, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j7, long j9, boolean z4, boolean z5, boolean z8) {
            super(str, segment, j, i, j6, drmInitData, str2, str3, j7, j9, z4);
            this.isIndependent = z5;
            this.isPreload = z8;
        }

        public Part copyWith(long j, int i) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j, int i) {
            this.playlistUri = uri;
            this.lastMediaSequence = j;
            this.lastPartIndex = i;
        }
    }

    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;

        @Nullable
        public final DrmInitData drmInitData;
        public final long durationUs;

        @Nullable
        public final String encryptionIV;

        @Nullable
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;

        @Nullable
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, @Nullable Segment segment, long j, int i, long j6, @Nullable DrmInitData drmInitData, @Nullable String str2, @Nullable String str3, long j7, long j9, boolean z4) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j6;
            this.drmInitData = drmInitData;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j7;
            this.byteRangeLength = j9;
            this.hasGapTag = z4;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l6) {
            if (this.relativeStartTimeUs > l6.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l6.longValue() ? -1 : 0;
        }
    }

    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j, boolean z4, long j6, long j7, boolean z5) {
            this.skipUntilUs = j;
            this.canSkipDateRanges = z4;
            this.holdBackUs = j6;
            this.partHoldBackUs = j7;
            this.canBlockReload = z5;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, boolean z4, long j6, boolean z5, int i4, long j7, int i6, long j9, long j10, boolean z8, boolean z9, boolean z10, @Nullable DrmInitData drmInitData, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map) {
        super(str, list, z8);
        this.playlistType = i;
        this.startTimeUs = j6;
        this.preciseStart = z4;
        this.hasDiscontinuitySequence = z5;
        this.discontinuitySequence = i4;
        this.mediaSequence = j7;
        this.version = i6;
        this.targetDurationUs = j9;
        this.partTargetDurationUs = j10;
        this.hasEndTag = z9;
        this.hasProgramDateTime = z10;
        this.protectionSchemes = drmInitData;
        this.segments = S.k(list2);
        this.trailingParts = S.k(list3);
        this.renditionReports = X.a(map);
        if (!list3.isEmpty()) {
            Part part = (Part) AbstractC0529x.k(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            Segment segment = (Segment) AbstractC0529x.k(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        }
        this.startOffsetUs = j != C.TIME_UNSET ? j >= 0 ? Math.min(this.durationUs, j) : Math.max(0L, this.durationUs + j) : C.TIME_UNSET;
        this.hasPositiveStartOffset = j >= 0;
        this.serverControl = serverControl;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public HlsPlaylist copy(List<StreamKey> list) {
        return this;
    }

    public HlsMediaPlaylist copyWith(long j, int i) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j, true, i, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(@Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j = this.mediaSequence;
            long j6 = hlsMediaPlaylist.mediaSequence;
            if (j <= j6) {
                if (j < j6) {
                    return false;
                }
                int size = this.segments.size() - hlsMediaPlaylist.segments.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.trailingParts.size();
                int size3 = hlsMediaPlaylist.trailingParts.size();
                if (size2 <= size3 && (size2 != size3 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* JADX INFO: renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<StreamKey>) list);
    }

    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Segment(String str, long j, long j6, @Nullable String str2, @Nullable String str3) {
            this(str, null, "", 0L, -1, C.TIME_UNSET, null, str2, str3, j, j6, false, t0.e);
            P p10 = S.f4555b;
        }

        public Segment copyWith(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j6 = j;
            for (int i4 = 0; i4 < this.parts.size(); i4++) {
                Part part = this.parts.get(i4);
                arrayList.add(part.copyWith(j6, i));
                j6 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(String str, @Nullable Segment segment, String str2, long j, int i, long j6, @Nullable DrmInitData drmInitData, @Nullable String str3, @Nullable String str4, long j7, long j9, boolean z4, List<Part> list) {
            super(str, segment, j, i, j6, drmInitData, str3, str4, j7, j9, z4);
            this.title = str2;
            this.parts = S.k(list);
        }
    }
}
