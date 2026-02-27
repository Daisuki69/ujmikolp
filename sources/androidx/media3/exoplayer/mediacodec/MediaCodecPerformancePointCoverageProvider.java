package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Util;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class MediaCodecPerformancePointCoverageProvider {
    static final int COVERAGE_RESULT_NO = 1;
    static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    @RequiresApi(29)
    public static final class Api29 {
        private Api29() {
        }

        @DoNotInline
        public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            androidx.core.view.accessibility.c.l();
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, androidx.core.view.accessibility.c.f(i, i4, (int) d10));
            if (iEvaluatePerformancePointCoverage == 1 && MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints == null) {
                Boolean unused = MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (MediaCodecPerformancePointCoverageProvider.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }

        private static int evaluatePerformancePointCoverage(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i = 0; i < list.size(); i++) {
                if (androidx.core.view.accessibility.c.g(list.get(i)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        
            androidx.core.view.accessibility.c.l();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        
            if (evaluatePerformancePointCoverage(r4, androidx.core.view.accessibility.c.e()) != 1) goto L22;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean shouldIgnorePerformancePoints() {
            /*
                int r0 = androidx.media3.common.util.Util.SDK_INT
                r1 = 35
                r2 = 0
                if (r0 < r1) goto L8
                goto L67
            L8:
                r0 = 1
                androidx.media3.common.Format$Builder r1 = new androidx.media3.common.Format$Builder     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                r1.<init>()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                java.lang.String r3 = "video/avc"
                androidx.media3.common.Format$Builder r1 = r1.setSampleMimeType(r3)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                androidx.media3.common.Format r1 = r1.build()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                java.lang.String r3 = r1.sampleMimeType     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                if (r3 == 0) goto L6b
                androidx.media3.exoplayer.mediacodec.MediaCodecSelector r3 = androidx.media3.exoplayer.mediacodec.MediaCodecSelector.DEFAULT     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                java.util.List r1 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSoftMatch(r3, r1, r2, r2)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                r3 = r2
            L23:
                int r4 = r1.size()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                if (r3 >= r4) goto L6b
                java.lang.Object r4 = r1.get(r3)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r4 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r4     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.capabilities     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                if (r4 == 0) goto L68
                java.lang.Object r4 = r1.get(r3)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r4 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r4     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.capabilities     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                if (r4 == 0) goto L68
                java.lang.Object r4 = r1.get(r3)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo r4 = (androidx.media3.exoplayer.mediacodec.MediaCodecInfo) r4     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                android.media.MediaCodecInfo$CodecCapabilities r4 = r4.capabilities     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                java.util.List r4 = androidx.core.view.accessibility.c.j(r4)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                if (r4 == 0) goto L68
                boolean r5 = r4.isEmpty()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                if (r5 != 0) goto L68
                androidx.core.view.accessibility.c.l()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = androidx.core.view.accessibility.c.e()     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                int r1 = evaluatePerformancePointCoverage(r4, r1)     // Catch: androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException -> L6b
                if (r1 != r0) goto L67
                goto L6b
            L67:
                return r2
            L68:
                int r3 = r3 + 1
                goto L23
            L6b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecPerformancePointCoverageProvider.Api29.shouldIgnorePerformancePoints():boolean");
        }
    }

    private MediaCodecPerformancePointCoverageProvider() {
    }

    public static int areResolutionAndFrameRateCovered(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d10) {
        if (Util.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return Api29.areResolutionAndFrameRateCovered(videoCapabilities, i, i4, d10);
        }
        return 0;
    }
}
