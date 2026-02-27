package io.flutter.plugins.googlemobileads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* JADX INFO: loaded from: classes4.dex */
class FlutterVideoOptions {

    @Nullable
    final Boolean clickToExpandRequested;

    @Nullable
    final Boolean customControlsRequested;

    @Nullable
    final Boolean startMuted;

    public FlutterVideoOptions(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        this.clickToExpandRequested = bool;
        this.customControlsRequested = bool2;
        this.startMuted = bool3;
    }

    public VideoOptions asVideoOptions() {
        VideoOptions.Builder builder = new VideoOptions.Builder();
        Boolean bool = this.clickToExpandRequested;
        if (bool != null) {
            builder.setClickToExpandRequested(bool.booleanValue());
        }
        Boolean bool2 = this.customControlsRequested;
        if (bool2 != null) {
            builder.setCustomControlsRequested(bool2.booleanValue());
        }
        Boolean bool3 = this.startMuted;
        if (bool3 != null) {
            builder.setStartMuted(bool3.booleanValue());
        }
        return builder.build();
    }
}
