package io.flutter.plugins.urllauncher;

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

    public static final class BrowserOptions {

        @NonNull
        private Boolean showTitle;

        public static final class Builder {

            @Nullable
            private Boolean showTitle;

            @NonNull
            public BrowserOptions build() {
                BrowserOptions browserOptions = new BrowserOptions();
                browserOptions.setShowTitle(this.showTitle);
                return browserOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setShowTitle(@NonNull Boolean bool) {
                this.showTitle = bool;
                return this;
            }
        }

        @NonNull
        public static BrowserOptions fromList(@NonNull ArrayList<Object> arrayList) {
            BrowserOptions browserOptions = new BrowserOptions();
            browserOptions.setShowTitle((Boolean) arrayList.get(0));
            return browserOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || BrowserOptions.class != obj.getClass()) {
                return false;
            }
            return this.showTitle.equals(((BrowserOptions) obj).showTitle);
        }

        @NonNull
        public Boolean getShowTitle() {
            return this.showTitle;
        }

        public int hashCode() {
            return Objects.hash(this.showTitle);
        }

        public void setShowTitle(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            this.showTitle = bool;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.showTitle);
            return arrayList;
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    public @interface CanIgnoreReturnValue {
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
            return b8 != -127 ? b8 != -126 ? super.readValueOfType(b8, byteBuffer) : BrowserOptions.fromList((ArrayList) readValue(byteBuffer)) : WebViewOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // pg.C2037D
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebViewOptions) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                writeValue(byteArrayOutputStream, ((WebViewOptions) obj).toList());
            } else if (!(obj instanceof BrowserOptions)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((BrowserOptions) obj).toList());
            }
        }
    }

    public interface UrlLauncherApi {
        @NonNull
        Boolean canLaunchUrl(@NonNull String str);

        void closeWebView();

        @NonNull
        Boolean launchUrl(@NonNull String str, @NonNull Map<String, String> map);

        @NonNull
        Boolean openUrlInApp(@NonNull String str, @NonNull Boolean bool, @NonNull WebViewOptions webViewOptions, @NonNull BrowserOptions browserOptions);

        @NonNull
        Boolean supportsCustomTabs();
    }

    public static final class WebViewOptions {

        @NonNull
        private Boolean enableDomStorage;

        @NonNull
        private Boolean enableJavaScript;

        @NonNull
        private Map<String, String> headers;

        public static final class Builder {

            @Nullable
            private Boolean enableDomStorage;

            @Nullable
            private Boolean enableJavaScript;

            @Nullable
            private Map<String, String> headers;

            @NonNull
            public WebViewOptions build() {
                WebViewOptions webViewOptions = new WebViewOptions();
                webViewOptions.setEnableJavaScript(this.enableJavaScript);
                webViewOptions.setEnableDomStorage(this.enableDomStorage);
                webViewOptions.setHeaders(this.headers);
                return webViewOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnableDomStorage(@NonNull Boolean bool) {
                this.enableDomStorage = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnableJavaScript(@NonNull Boolean bool) {
                this.enableJavaScript = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHeaders(@NonNull Map<String, String> map) {
                this.headers = map;
                return this;
            }
        }

        @NonNull
        public static WebViewOptions fromList(@NonNull ArrayList<Object> arrayList) {
            WebViewOptions webViewOptions = new WebViewOptions();
            webViewOptions.setEnableJavaScript((Boolean) arrayList.get(0));
            webViewOptions.setEnableDomStorage((Boolean) arrayList.get(1));
            webViewOptions.setHeaders((Map) arrayList.get(2));
            return webViewOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && WebViewOptions.class == obj.getClass()) {
                WebViewOptions webViewOptions = (WebViewOptions) obj;
                if (this.enableJavaScript.equals(webViewOptions.enableJavaScript) && this.enableDomStorage.equals(webViewOptions.enableDomStorage) && this.headers.equals(webViewOptions.headers)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public Boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        @NonNull
        public Boolean getEnableJavaScript() {
            return this.enableJavaScript;
        }

        @NonNull
        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            return Objects.hash(this.enableJavaScript, this.enableDomStorage, this.headers);
        }

        public void setEnableDomStorage(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
            }
            this.enableDomStorage = bool;
        }

        public void setEnableJavaScript(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
            }
            this.enableJavaScript = bool;
        }

        public void setHeaders(@NonNull Map<String, String> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            this.headers = map;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.enableJavaScript);
            arrayList.add(this.enableDomStorage);
            arrayList.add(this.headers);
            return arrayList;
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
