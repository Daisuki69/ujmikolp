package io.flutter.plugins.videoplayer;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.ts.TsExtractor;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import pg.C2037D;

/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    public interface AndroidVideoPlayerApi {
        @NonNull
        Long create(@NonNull CreateMessage createMessage);

        void dispose(@NonNull Long l6);

        void initialize();

        void pause(@NonNull Long l6);

        void play(@NonNull Long l6);

        @NonNull
        Long position(@NonNull Long l6);

        void seekTo(@NonNull Long l6, @NonNull Long l8);

        void setLooping(@NonNull Long l6, @NonNull Boolean bool);

        void setMixWithOthers(@NonNull Boolean bool);

        void setPlaybackSpeed(@NonNull Long l6, @NonNull Double d10);

        void setVolume(@NonNull Long l6, @NonNull Double d10);
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
    }

    public static final class CreateMessage {

        @Nullable
        private String asset;

        @Nullable
        private String formatHint;

        @NonNull
        private Map<String, String> httpHeaders;

        @Nullable
        private String packageName;

        @Nullable
        private String uri;

        @Nullable
        private PlatformVideoViewType viewType;

        public static final class Builder {

            @Nullable
            private String asset;

            @Nullable
            private String formatHint;

            @Nullable
            private Map<String, String> httpHeaders;

            @Nullable
            private String packageName;

            @Nullable
            private String uri;

            @Nullable
            private PlatformVideoViewType viewType;

            @NonNull
            public CreateMessage build() {
                CreateMessage createMessage = new CreateMessage();
                createMessage.setAsset(this.asset);
                createMessage.setUri(this.uri);
                createMessage.setPackageName(this.packageName);
                createMessage.setFormatHint(this.formatHint);
                createMessage.setHttpHeaders(this.httpHeaders);
                createMessage.setViewType(this.viewType);
                return createMessage;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAsset(@Nullable String str) {
                this.asset = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setFormatHint(@Nullable String str) {
                this.formatHint = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHttpHeaders(@NonNull Map<String, String> map) {
                this.httpHeaders = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPackageName(@Nullable String str) {
                this.packageName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUri(@Nullable String str) {
                this.uri = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setViewType(@Nullable PlatformVideoViewType platformVideoViewType) {
                this.viewType = platformVideoViewType;
                return this;
            }
        }

        @NonNull
        public static CreateMessage fromList(@NonNull ArrayList<Object> arrayList) {
            CreateMessage createMessage = new CreateMessage();
            createMessage.setAsset((String) arrayList.get(0));
            createMessage.setUri((String) arrayList.get(1));
            createMessage.setPackageName((String) arrayList.get(2));
            createMessage.setFormatHint((String) arrayList.get(3));
            createMessage.setHttpHeaders((Map) arrayList.get(4));
            createMessage.setViewType((PlatformVideoViewType) arrayList.get(5));
            return createMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CreateMessage.class == obj.getClass()) {
                CreateMessage createMessage = (CreateMessage) obj;
                if (Objects.equals(this.asset, createMessage.asset) && Objects.equals(this.uri, createMessage.uri) && Objects.equals(this.packageName, createMessage.packageName) && Objects.equals(this.formatHint, createMessage.formatHint) && this.httpHeaders.equals(createMessage.httpHeaders) && Objects.equals(this.viewType, createMessage.viewType)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public String getAsset() {
            return this.asset;
        }

        @Nullable
        public String getFormatHint() {
            return this.formatHint;
        }

        @NonNull
        public Map<String, String> getHttpHeaders() {
            return this.httpHeaders;
        }

        @Nullable
        public String getPackageName() {
            return this.packageName;
        }

        @Nullable
        public String getUri() {
            return this.uri;
        }

        @Nullable
        public PlatformVideoViewType getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            return Objects.hash(this.asset, this.uri, this.packageName, this.formatHint, this.httpHeaders, this.viewType);
        }

        public void setAsset(@Nullable String str) {
            this.asset = str;
        }

        public void setFormatHint(@Nullable String str) {
            this.formatHint = str;
        }

        public void setHttpHeaders(@NonNull Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
            }
            this.httpHeaders = map;
        }

        public void setPackageName(@Nullable String str) {
            this.packageName = str;
        }

        public void setUri(@Nullable String str) {
            this.uri = str;
        }

        public void setViewType(@Nullable PlatformVideoViewType platformVideoViewType) {
            this.viewType = platformVideoViewType;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.asset);
            arrayList.add(this.uri);
            arrayList.add(this.packageName);
            arrayList.add(this.formatHint);
            arrayList.add(this.httpHeaders);
            arrayList.add(this.viewType);
            return arrayList;
        }
    }

    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, @Nullable String str2, @Nullable Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    public static class PigeonCodec extends C2037D {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // pg.C2037D
        public Object readValueOfType(byte b8, @NonNull ByteBuffer byteBuffer) {
            switch (b8) {
                case -127:
                    Object value = readValue(byteBuffer);
                    if (value == null) {
                        return null;
                    }
                    return PlatformVideoViewType.values()[((Long) value).intValue()];
                case -126:
                    return PlatformVideoViewCreationParams.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return CreateMessage.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b8, byteBuffer);
            }
        }

        @Override // pg.C2037D
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PlatformVideoViewType) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                writeValue(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((PlatformVideoViewType) obj).index));
            } else if (obj instanceof PlatformVideoViewCreationParams) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PlatformVideoViewCreationParams) obj).toList());
            } else if (!(obj instanceof CreateMessage)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((CreateMessage) obj).toList());
            }
        }
    }

    public static final class PlatformVideoViewCreationParams {

        @NonNull
        private Long playerId;

        public static final class Builder {

            @Nullable
            private Long playerId;

            @NonNull
            public PlatformVideoViewCreationParams build() {
                PlatformVideoViewCreationParams platformVideoViewCreationParams = new PlatformVideoViewCreationParams();
                platformVideoViewCreationParams.setPlayerId(this.playerId);
                return platformVideoViewCreationParams;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPlayerId(@NonNull Long l6) {
                this.playerId = l6;
                return this;
            }
        }

        @NonNull
        public static PlatformVideoViewCreationParams fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformVideoViewCreationParams platformVideoViewCreationParams = new PlatformVideoViewCreationParams();
            platformVideoViewCreationParams.setPlayerId((Long) arrayList.get(0));
            return platformVideoViewCreationParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PlatformVideoViewCreationParams.class != obj.getClass()) {
                return false;
            }
            return this.playerId.equals(((PlatformVideoViewCreationParams) obj).playerId);
        }

        @NonNull
        public Long getPlayerId() {
            return this.playerId;
        }

        public int hashCode() {
            return Objects.hash(this.playerId);
        }

        public void setPlayerId(@NonNull Long l6) {
            if (l6 == null) {
                throw new IllegalStateException("Nonnull field \"playerId\" is null.");
            }
            this.playerId = l6;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.playerId);
            return arrayList;
        }
    }

    public enum PlatformVideoViewType {
        TEXTURE_VIEW(0),
        PLATFORM_VIEW(1);

        final int index;

        PlatformVideoViewType(int i) {
            this.index = i;
        }
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th2) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th2 instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th2;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
            return arrayList;
        }
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }
}
