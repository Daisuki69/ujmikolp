package androidx.camera.core.impl;

import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.media3.common.MimeTypes;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static String a(int i) {
        switch (i) {
            case 1:
                return MimeTypes.AUDIO_AMR_NB;
            case 2:
                return MimeTypes.AUDIO_AMR_WB;
            case 3:
            case 4:
            case 5:
                return MimeTypes.AUDIO_AAC;
            case 6:
                return MimeTypes.AUDIO_VORBIS;
            case 7:
                return MimeTypes.AUDIO_OPUS;
            default:
                return EncoderProfilesProxy.AudioProfileProxy.MEDIA_TYPE_NONE;
        }
    }

    public static int b(int i) {
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            return i != 5 ? -1 : 39;
        }
        return 5;
    }

    public static String c(int i) {
        switch (i) {
            case 1:
                return MimeTypes.VIDEO_H263;
            case 2:
                return "video/avc";
            case 3:
                return MimeTypes.VIDEO_MP4V;
            case 4:
                return MimeTypes.VIDEO_VP8;
            case 5:
                return MimeTypes.VIDEO_H265;
            case 6:
                return MimeTypes.VIDEO_VP9;
            case 7:
                return MimeTypes.VIDEO_DOLBY_VISION;
            case 8:
                return MimeTypes.VIDEO_AV1;
            default:
                return EncoderProfilesProxy.VideoProfileProxy.MEDIA_TYPE_NONE;
        }
    }
}
