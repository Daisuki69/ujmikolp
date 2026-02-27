package io.flutter.plugins.imagepicker;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.ts.TsExtractor;
import defpackage.AbstractC1414e;
import io.flutter.plugins.imagepicker.Messages;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import pg.C2037D;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;
import pg.h;
import pg.j;
import pg.q;

/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    public static final class CacheRetrievalError {

        @NonNull
        private String code;

        @Nullable
        private String message;

        public static final class Builder {

            @Nullable
            private String code;

            @Nullable
            private String message;

            @NonNull
            public CacheRetrievalError build() {
                CacheRetrievalError cacheRetrievalError = new CacheRetrievalError();
                cacheRetrievalError.setCode(this.code);
                cacheRetrievalError.setMessage(this.message);
                return cacheRetrievalError;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCode(@NonNull String str) {
                this.code = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMessage(@Nullable String str) {
                this.message = str;
                return this;
            }
        }

        @NonNull
        public static CacheRetrievalError fromList(@NonNull ArrayList<Object> arrayList) {
            CacheRetrievalError cacheRetrievalError = new CacheRetrievalError();
            cacheRetrievalError.setCode((String) arrayList.get(0));
            cacheRetrievalError.setMessage((String) arrayList.get(1));
            return cacheRetrievalError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CacheRetrievalError.class == obj.getClass()) {
                CacheRetrievalError cacheRetrievalError = (CacheRetrievalError) obj;
                if (this.code.equals(cacheRetrievalError.code) && Objects.equals(this.message, cacheRetrievalError.message)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public String getCode() {
            return this.code;
        }

        @Nullable
        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return Objects.hash(this.code, this.message);
        }

        public void setCode(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            }
            this.code = str;
        }

        public void setMessage(@Nullable String str) {
            this.message = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.code);
            arrayList.add(this.message);
            return arrayList;
        }
    }

    public static final class CacheRetrievalResult {

        @Nullable
        private CacheRetrievalError error;

        @NonNull
        private List<String> paths;

        @NonNull
        private CacheRetrievalType type;

        public static final class Builder {

            @Nullable
            private CacheRetrievalError error;

            @Nullable
            private List<String> paths;

            @Nullable
            private CacheRetrievalType type;

            @NonNull
            public CacheRetrievalResult build() {
                CacheRetrievalResult cacheRetrievalResult = new CacheRetrievalResult();
                cacheRetrievalResult.setType(this.type);
                cacheRetrievalResult.setError(this.error);
                cacheRetrievalResult.setPaths(this.paths);
                return cacheRetrievalResult;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setError(@Nullable CacheRetrievalError cacheRetrievalError) {
                this.error = cacheRetrievalError;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPaths(@NonNull List<String> list) {
                this.paths = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setType(@NonNull CacheRetrievalType cacheRetrievalType) {
                this.type = cacheRetrievalType;
                return this;
            }
        }

        @NonNull
        public static CacheRetrievalResult fromList(@NonNull ArrayList<Object> arrayList) {
            CacheRetrievalResult cacheRetrievalResult = new CacheRetrievalResult();
            cacheRetrievalResult.setType((CacheRetrievalType) arrayList.get(0));
            cacheRetrievalResult.setError((CacheRetrievalError) arrayList.get(1));
            cacheRetrievalResult.setPaths((List) arrayList.get(2));
            return cacheRetrievalResult;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && CacheRetrievalResult.class == obj.getClass()) {
                CacheRetrievalResult cacheRetrievalResult = (CacheRetrievalResult) obj;
                if (this.type.equals(cacheRetrievalResult.type) && Objects.equals(this.error, cacheRetrievalResult.error) && this.paths.equals(cacheRetrievalResult.paths)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public CacheRetrievalError getError() {
            return this.error;
        }

        @NonNull
        public List<String> getPaths() {
            return this.paths;
        }

        @NonNull
        public CacheRetrievalType getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.type, this.error, this.paths);
        }

        public void setError(@Nullable CacheRetrievalError cacheRetrievalError) {
            this.error = cacheRetrievalError;
        }

        public void setPaths(@NonNull List<String> list) {
            if (list == null) {
                throw new IllegalStateException("Nonnull field \"paths\" is null.");
            }
            this.paths = list;
        }

        public void setType(@NonNull CacheRetrievalType cacheRetrievalType) {
            if (cacheRetrievalType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = cacheRetrievalType;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.type);
            arrayList.add(this.error);
            arrayList.add(this.paths);
            return arrayList;
        }
    }

    public enum CacheRetrievalType {
        IMAGE(0),
        VIDEO(1);

        final int index;

        CacheRetrievalType(int i) {
            this.index = i;
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

    public static final class GeneralOptions {

        @NonNull
        private Boolean allowMultiple;

        @Nullable
        private Long limit;

        @NonNull
        private Boolean usePhotoPicker;

        public static final class Builder {

            @Nullable
            private Boolean allowMultiple;

            @Nullable
            private Long limit;

            @Nullable
            private Boolean usePhotoPicker;

            @NonNull
            public GeneralOptions build() {
                GeneralOptions generalOptions = new GeneralOptions();
                generalOptions.setAllowMultiple(this.allowMultiple);
                generalOptions.setUsePhotoPicker(this.usePhotoPicker);
                generalOptions.setLimit(this.limit);
                return generalOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAllowMultiple(@NonNull Boolean bool) {
                this.allowMultiple = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setLimit(@Nullable Long l6) {
                this.limit = l6;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUsePhotoPicker(@NonNull Boolean bool) {
                this.usePhotoPicker = bool;
                return this;
            }
        }

        @NonNull
        public static GeneralOptions fromList(@NonNull ArrayList<Object> arrayList) {
            GeneralOptions generalOptions = new GeneralOptions();
            generalOptions.setAllowMultiple((Boolean) arrayList.get(0));
            generalOptions.setUsePhotoPicker((Boolean) arrayList.get(1));
            generalOptions.setLimit((Long) arrayList.get(2));
            return generalOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && GeneralOptions.class == obj.getClass()) {
                GeneralOptions generalOptions = (GeneralOptions) obj;
                if (this.allowMultiple.equals(generalOptions.allowMultiple) && this.usePhotoPicker.equals(generalOptions.usePhotoPicker) && Objects.equals(this.limit, generalOptions.limit)) {
                    return true;
                }
            }
            return false;
        }

        @NonNull
        public Boolean getAllowMultiple() {
            return this.allowMultiple;
        }

        @Nullable
        public Long getLimit() {
            return this.limit;
        }

        @NonNull
        public Boolean getUsePhotoPicker() {
            return this.usePhotoPicker;
        }

        public int hashCode() {
            return Objects.hash(this.allowMultiple, this.usePhotoPicker, this.limit);
        }

        public void setAllowMultiple(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            }
            this.allowMultiple = bool;
        }

        public void setLimit(@Nullable Long l6) {
            this.limit = l6;
        }

        public void setUsePhotoPicker(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
            }
            this.usePhotoPicker = bool;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.allowMultiple);
            arrayList.add(this.usePhotoPicker);
            arrayList.add(this.limit);
            return arrayList;
        }
    }

    public interface ImagePickerApi {

        /* JADX INFO: renamed from: io.flutter.plugins.imagepicker.Messages$ImagePickerApi$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static q a() {
                return PigeonCodec.INSTANCE;
            }

            public static /* synthetic */ void b(ImagePickerApi imagePickerApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                imagePickerApi.pickImages((SourceSpecification) arrayList2.get(0), (ImageSelectionOptions) arrayList2.get(1), (GeneralOptions) arrayList2.get(2), new Result<List<String>>() { // from class: io.flutter.plugins.imagepicker.Messages.ImagePickerApi.1
                    @Override // io.flutter.plugins.imagepicker.Messages.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(Messages.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.imagepicker.Messages.Result
                    public void success(List<String> list) {
                        arrayList.add(0, list);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(ImagePickerApi imagePickerApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                imagePickerApi.pickVideos((SourceSpecification) arrayList2.get(0), (VideoSelectionOptions) arrayList2.get(1), (GeneralOptions) arrayList2.get(2), new Result<List<String>>() { // from class: io.flutter.plugins.imagepicker.Messages.ImagePickerApi.2
                    @Override // io.flutter.plugins.imagepicker.Messages.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(Messages.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.imagepicker.Messages.Result
                    public void success(List<String> list) {
                        arrayList.add(0, list);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(ImagePickerApi imagePickerApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                imagePickerApi.pickMedia((MediaSelectionOptions) arrayList2.get(0), (GeneralOptions) arrayList2.get(1), new Result<List<String>>() { // from class: io.flutter.plugins.imagepicker.Messages.ImagePickerApi.3
                    @Override // io.flutter.plugins.imagepicker.Messages.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(Messages.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.imagepicker.Messages.Result
                    public void success(List<String> list) {
                        arrayList.add(0, list);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(ImagePickerApi imagePickerApi, Object obj, InterfaceC2041d interfaceC2041d) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, imagePickerApi.retrieveLostResults());
                } catch (Throwable th2) {
                    arrayList = Messages.wrapError(th2);
                }
                interfaceC2041d.reply(arrayList);
            }

            public static void f(j jVar, ImagePickerApi imagePickerApi) {
                g(jVar, "", imagePickerApi);
            }

            public static void g(j jVar, String str, final ImagePickerApi imagePickerApi) {
                String strConcat = str.isEmpty() ? "" : ".".concat(str);
                h hVarMakeBackgroundTaskQueue = jVar.makeBackgroundTaskQueue();
                C2042e c2042e = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickImages", strConcat), a(), hVarMakeBackgroundTaskQueue);
                if (imagePickerApi != null) {
                    final int i = 0;
                    c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.imagepicker.e
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i) {
                                case 0:
                                    Messages.ImagePickerApi.CC.b(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.ImagePickerApi.CC.c(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.ImagePickerApi.CC.d(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.ImagePickerApi.CC.e(imagePickerApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e.b(null);
                }
                C2042e c2042e2 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickVideos", strConcat), a(), hVarMakeBackgroundTaskQueue);
                if (imagePickerApi != null) {
                    final int i4 = 1;
                    c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.imagepicker.e
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i4) {
                                case 0:
                                    Messages.ImagePickerApi.CC.b(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.ImagePickerApi.CC.c(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.ImagePickerApi.CC.d(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.ImagePickerApi.CC.e(imagePickerApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e2.b(null);
                }
                C2042e c2042e3 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.image_picker_android.ImagePickerApi.pickMedia", strConcat), a(), null);
                if (imagePickerApi != null) {
                    final int i6 = 2;
                    c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.imagepicker.e
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i6) {
                                case 0:
                                    Messages.ImagePickerApi.CC.b(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.ImagePickerApi.CC.c(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.ImagePickerApi.CC.d(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.ImagePickerApi.CC.e(imagePickerApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e3.b(null);
                }
                C2042e c2042e4 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.image_picker_android.ImagePickerApi.retrieveLostResults", strConcat), a(), hVarMakeBackgroundTaskQueue);
                if (imagePickerApi == null) {
                    c2042e4.b(null);
                } else {
                    final int i10 = 3;
                    c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.imagepicker.e
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i10) {
                                case 0:
                                    Messages.ImagePickerApi.CC.b(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.ImagePickerApi.CC.c(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.ImagePickerApi.CC.d(imagePickerApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.ImagePickerApi.CC.e(imagePickerApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                }
            }
        }

        void pickImages(@NonNull SourceSpecification sourceSpecification, @NonNull ImageSelectionOptions imageSelectionOptions, @NonNull GeneralOptions generalOptions, @NonNull Result<List<String>> result);

        void pickMedia(@NonNull MediaSelectionOptions mediaSelectionOptions, @NonNull GeneralOptions generalOptions, @NonNull Result<List<String>> result);

        void pickVideos(@NonNull SourceSpecification sourceSpecification, @NonNull VideoSelectionOptions videoSelectionOptions, @NonNull GeneralOptions generalOptions, @NonNull Result<List<String>> result);

        @Nullable
        CacheRetrievalResult retrieveLostResults();
    }

    public static final class ImageSelectionOptions {

        @Nullable
        private Double maxHeight;

        @Nullable
        private Double maxWidth;

        @NonNull
        private Long quality;

        public static final class Builder {

            @Nullable
            private Double maxHeight;

            @Nullable
            private Double maxWidth;

            @Nullable
            private Long quality;

            @NonNull
            public ImageSelectionOptions build() {
                ImageSelectionOptions imageSelectionOptions = new ImageSelectionOptions();
                imageSelectionOptions.setMaxWidth(this.maxWidth);
                imageSelectionOptions.setMaxHeight(this.maxHeight);
                imageSelectionOptions.setQuality(this.quality);
                return imageSelectionOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMaxHeight(@Nullable Double d10) {
                this.maxHeight = d10;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMaxWidth(@Nullable Double d10) {
                this.maxWidth = d10;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setQuality(@NonNull Long l6) {
                this.quality = l6;
                return this;
            }
        }

        @NonNull
        public static ImageSelectionOptions fromList(@NonNull ArrayList<Object> arrayList) {
            ImageSelectionOptions imageSelectionOptions = new ImageSelectionOptions();
            imageSelectionOptions.setMaxWidth((Double) arrayList.get(0));
            imageSelectionOptions.setMaxHeight((Double) arrayList.get(1));
            imageSelectionOptions.setQuality((Long) arrayList.get(2));
            return imageSelectionOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ImageSelectionOptions.class == obj.getClass()) {
                ImageSelectionOptions imageSelectionOptions = (ImageSelectionOptions) obj;
                if (Objects.equals(this.maxWidth, imageSelectionOptions.maxWidth) && Objects.equals(this.maxHeight, imageSelectionOptions.maxHeight) && this.quality.equals(imageSelectionOptions.quality)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public Double getMaxHeight() {
            return this.maxHeight;
        }

        @Nullable
        public Double getMaxWidth() {
            return this.maxWidth;
        }

        @NonNull
        public Long getQuality() {
            return this.quality;
        }

        public int hashCode() {
            return Objects.hash(this.maxWidth, this.maxHeight, this.quality);
        }

        public void setMaxHeight(@Nullable Double d10) {
            this.maxHeight = d10;
        }

        public void setMaxWidth(@Nullable Double d10) {
            this.maxWidth = d10;
        }

        public void setQuality(@NonNull Long l6) {
            if (l6 == null) {
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            }
            this.quality = l6;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.maxWidth);
            arrayList.add(this.maxHeight);
            arrayList.add(this.quality);
            return arrayList;
        }
    }

    public static final class MediaSelectionOptions {

        @NonNull
        private ImageSelectionOptions imageSelectionOptions;

        public static final class Builder {

            @Nullable
            private ImageSelectionOptions imageSelectionOptions;

            @NonNull
            public MediaSelectionOptions build() {
                MediaSelectionOptions mediaSelectionOptions = new MediaSelectionOptions();
                mediaSelectionOptions.setImageSelectionOptions(this.imageSelectionOptions);
                return mediaSelectionOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setImageSelectionOptions(@NonNull ImageSelectionOptions imageSelectionOptions) {
                this.imageSelectionOptions = imageSelectionOptions;
                return this;
            }
        }

        @NonNull
        public static MediaSelectionOptions fromList(@NonNull ArrayList<Object> arrayList) {
            MediaSelectionOptions mediaSelectionOptions = new MediaSelectionOptions();
            mediaSelectionOptions.setImageSelectionOptions((ImageSelectionOptions) arrayList.get(0));
            return mediaSelectionOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MediaSelectionOptions.class != obj.getClass()) {
                return false;
            }
            return this.imageSelectionOptions.equals(((MediaSelectionOptions) obj).imageSelectionOptions);
        }

        @NonNull
        public ImageSelectionOptions getImageSelectionOptions() {
            return this.imageSelectionOptions;
        }

        public int hashCode() {
            return Objects.hash(this.imageSelectionOptions);
        }

        public void setImageSelectionOptions(@NonNull ImageSelectionOptions imageSelectionOptions) {
            if (imageSelectionOptions == null) {
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            }
            this.imageSelectionOptions = imageSelectionOptions;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.imageSelectionOptions);
            return arrayList;
        }
    }

    public interface NullableResult<T> {
        void error(@NonNull Throwable th2);

        void success(@Nullable T t5);
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
                    return SourceCamera.values()[((Long) value).intValue()];
                case -126:
                    Object value2 = readValue(byteBuffer);
                    if (value2 == null) {
                        return null;
                    }
                    return SourceType.values()[((Long) value2).intValue()];
                case -125:
                    Object value3 = readValue(byteBuffer);
                    if (value3 == null) {
                        return null;
                    }
                    return CacheRetrievalType.values()[((Long) value3).intValue()];
                case -124:
                    return GeneralOptions.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return ImageSelectionOptions.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return MediaSelectionOptions.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return VideoSelectionOptions.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return SourceSpecification.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return CacheRetrievalError.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return CacheRetrievalResult.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b8, byteBuffer);
            }
        }

        @Override // pg.C2037D
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof SourceCamera) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((SourceCamera) obj).index) : null);
                return;
            }
            if (obj instanceof SourceType) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((SourceType) obj).index) : null);
                return;
            }
            if (obj instanceof CacheRetrievalType) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, obj != null ? Integer.valueOf(((CacheRetrievalType) obj).index) : null);
                return;
            }
            if (obj instanceof GeneralOptions) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((GeneralOptions) obj).toList());
                return;
            }
            if (obj instanceof ImageSelectionOptions) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((ImageSelectionOptions) obj).toList());
                return;
            }
            if (obj instanceof MediaSelectionOptions) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
                writeValue(byteArrayOutputStream, ((MediaSelectionOptions) obj).toList());
                return;
            }
            if (obj instanceof VideoSelectionOptions) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_E_AC3);
                writeValue(byteArrayOutputStream, ((VideoSelectionOptions) obj).toList());
                return;
            }
            if (obj instanceof SourceSpecification) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_DTS_HD);
                writeValue(byteArrayOutputStream, ((SourceSpecification) obj).toList());
            } else if (obj instanceof CacheRetrievalError) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((CacheRetrievalError) obj).toList());
            } else if (!(obj instanceof CacheRetrievalResult)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_DTS);
                writeValue(byteArrayOutputStream, ((CacheRetrievalResult) obj).toList());
            }
        }
    }

    public interface Result<T> {
        void error(@NonNull Throwable th2);

        void success(@NonNull T t5);
    }

    public enum SourceCamera {
        REAR(0),
        FRONT(1);

        final int index;

        SourceCamera(int i) {
            this.index = i;
        }
    }

    public static final class SourceSpecification {

        @Nullable
        private SourceCamera camera;

        @NonNull
        private SourceType type;

        public static final class Builder {

            @Nullable
            private SourceCamera camera;

            @Nullable
            private SourceType type;

            @NonNull
            public SourceSpecification build() {
                SourceSpecification sourceSpecification = new SourceSpecification();
                sourceSpecification.setType(this.type);
                sourceSpecification.setCamera(this.camera);
                return sourceSpecification;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCamera(@Nullable SourceCamera sourceCamera) {
                this.camera = sourceCamera;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setType(@NonNull SourceType sourceType) {
                this.type = sourceType;
                return this;
            }
        }

        @NonNull
        public static SourceSpecification fromList(@NonNull ArrayList<Object> arrayList) {
            SourceSpecification sourceSpecification = new SourceSpecification();
            sourceSpecification.setType((SourceType) arrayList.get(0));
            sourceSpecification.setCamera((SourceCamera) arrayList.get(1));
            return sourceSpecification;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SourceSpecification.class == obj.getClass()) {
                SourceSpecification sourceSpecification = (SourceSpecification) obj;
                if (this.type.equals(sourceSpecification.type) && Objects.equals(this.camera, sourceSpecification.camera)) {
                    return true;
                }
            }
            return false;
        }

        @Nullable
        public SourceCamera getCamera() {
            return this.camera;
        }

        @NonNull
        public SourceType getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.type, this.camera);
        }

        public void setCamera(@Nullable SourceCamera sourceCamera) {
            this.camera = sourceCamera;
        }

        public void setType(@NonNull SourceType sourceType) {
            if (sourceType == null) {
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            }
            this.type = sourceType;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.type);
            arrayList.add(this.camera);
            return arrayList;
        }
    }

    public enum SourceType {
        CAMERA(0),
        GALLERY(1);

        final int index;

        SourceType(int i) {
            this.index = i;
        }
    }

    public static final class VideoSelectionOptions {

        @Nullable
        private Long maxDurationSeconds;

        public static final class Builder {

            @Nullable
            private Long maxDurationSeconds;

            @NonNull
            public VideoSelectionOptions build() {
                VideoSelectionOptions videoSelectionOptions = new VideoSelectionOptions();
                videoSelectionOptions.setMaxDurationSeconds(this.maxDurationSeconds);
                return videoSelectionOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMaxDurationSeconds(@Nullable Long l6) {
                this.maxDurationSeconds = l6;
                return this;
            }
        }

        @NonNull
        public static VideoSelectionOptions fromList(@NonNull ArrayList<Object> arrayList) {
            VideoSelectionOptions videoSelectionOptions = new VideoSelectionOptions();
            videoSelectionOptions.setMaxDurationSeconds((Long) arrayList.get(0));
            return videoSelectionOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VideoSelectionOptions.class != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.maxDurationSeconds, ((VideoSelectionOptions) obj).maxDurationSeconds);
        }

        @Nullable
        public Long getMaxDurationSeconds() {
            return this.maxDurationSeconds;
        }

        public int hashCode() {
            return Objects.hash(this.maxDurationSeconds);
        }

        public void setMaxDurationSeconds(@Nullable Long l6) {
            this.maxDurationSeconds = l6;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.maxDurationSeconds);
            return arrayList;
        }
    }

    public interface VoidResult {
        void error(@NonNull Throwable th2);

        void success();
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
