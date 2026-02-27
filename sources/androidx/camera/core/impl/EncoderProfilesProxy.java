package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface EncoderProfilesProxy {
    public static final int CODEC_PROFILE_NONE = -1;

    public static abstract class AudioProfileProxy {
        public static final String MEDIA_TYPE_NONE = "audio/none";

        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        @NonNull
        public static AudioProfileProxy create(int i, @NonNull String str, int i4, int i6, int i10, int i11) {
            return new AutoValue_EncoderProfilesProxy_AudioProfileProxy(i, str, i4, i6, i10, i11);
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        @NonNull
        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();
    }

    public static abstract class ImmutableEncoderProfilesProxy implements EncoderProfilesProxy {
        @NonNull
        public static ImmutableEncoderProfilesProxy create(int i, int i4, @NonNull List<AudioProfileProxy> list, @NonNull List<VideoProfileProxy> list2) {
            return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i, i4, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    public static abstract class VideoProfileProxy {
        public static final int BIT_DEPTH_10 = 10;
        public static final int BIT_DEPTH_8 = 8;
        public static final String MEDIA_TYPE_NONE = "video/none";

        @Retention(RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        @NonNull
        public static VideoProfileProxy create(int i, @NonNull String str, int i4, int i6, int i10, int i11, int i12, int i13, int i14, int i15) {
            return new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i, str, i4, i6, i10, i11, i12, i13, i14, i15);
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        @NonNull
        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getWidth();
    }

    @NonNull
    List<AudioProfileProxy> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    @NonNull
    List<VideoProfileProxy> getVideoProfiles();
}
