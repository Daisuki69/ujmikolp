package io.flutter.plugins.firebase.core;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.ts.TsExtractor;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pg.C2037D;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;
import pg.j;
import pg.q;

/* JADX INFO: loaded from: classes4.dex */
public class GeneratedAndroidFirebaseCore {

    public interface FirebaseAppHostApi {

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$FirebaseAppHostApi$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static q a() {
                return new C2037D();
            }

            public static /* synthetic */ void b(FirebaseAppHostApi firebaseAppHostApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAppHostApi.setAutomaticDataCollectionEnabled((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi.1
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(GeneratedAndroidFirebaseCore.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseAppHostApi firebaseAppHostApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAppHostApi.setAutomaticResourceManagementEnabled((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<Void>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi.2
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(GeneratedAndroidFirebaseCore.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseAppHostApi firebaseAppHostApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                firebaseAppHostApi.delete((String) ((ArrayList) obj).get(0), new Result<Void>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi.3
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(GeneratedAndroidFirebaseCore.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(Void r32) {
                        arrayList.add(0, null);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static void e(j jVar, final FirebaseAppHostApi firebaseAppHostApi) {
                C2042e c2042e = new C2042e(jVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", a(), null);
                if (firebaseAppHostApi != null) {
                    final int i = 0;
                    c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.firebase.core.e
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.b(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.c(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.d(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e.b(null);
                }
                C2042e c2042e2 = new C2042e(jVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", a(), null);
                if (firebaseAppHostApi != null) {
                    final int i4 = 1;
                    c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.firebase.core.e
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i4) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.b(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.c(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.d(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e2.b(null);
                }
                C2042e c2042e3 = new C2042e(jVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", a(), null);
                if (firebaseAppHostApi == null) {
                    c2042e3.b(null);
                } else {
                    final int i6 = 2;
                    c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.firebase.core.e
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i6) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.b(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.c(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.d(firebaseAppHostApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                }
            }
        }

        void delete(@NonNull String str, @NonNull Result<Void> result);

        void setAutomaticDataCollectionEnabled(@NonNull String str, @NonNull Boolean bool, @NonNull Result<Void> result);

        void setAutomaticResourceManagementEnabled(@NonNull String str, @NonNull Boolean bool, @NonNull Result<Void> result);
    }

    public interface FirebaseCoreHostApi {

        /* JADX INFO: renamed from: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static q a() {
                return FirebaseCoreHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseCoreHostApi firebaseCoreHostApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseCoreHostApi.initializeApp((String) arrayList2.get(0), (PigeonFirebaseOptions) arrayList2.get(1), new Result<PigeonInitializeResponse>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.1
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(GeneratedAndroidFirebaseCore.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(PigeonInitializeResponse pigeonInitializeResponse) {
                        arrayList.add(0, pigeonInitializeResponse);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseCoreHostApi firebaseCoreHostApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                firebaseCoreHostApi.initializeCore(new Result<List<PigeonInitializeResponse>>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.2
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(GeneratedAndroidFirebaseCore.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(List<PigeonInitializeResponse> list) {
                        arrayList.add(0, list);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseCoreHostApi firebaseCoreHostApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                firebaseCoreHostApi.optionsFromResource(new Result<PigeonFirebaseOptions>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.3
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(GeneratedAndroidFirebaseCore.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(PigeonFirebaseOptions pigeonFirebaseOptions) {
                        arrayList.add(0, pigeonFirebaseOptions);
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static void e(j jVar, final FirebaseCoreHostApi firebaseCoreHostApi) {
                C2042e c2042e = new C2042e(jVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", a(), null);
                if (firebaseCoreHostApi != null) {
                    final int i = 0;
                    c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.firebase.core.f
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.b(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.c(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.d(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e.b(null);
                }
                C2042e c2042e2 = new C2042e(jVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", a(), null);
                if (firebaseCoreHostApi != null) {
                    final int i4 = 1;
                    c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.firebase.core.f
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i4) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.b(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.c(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.d(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e2.b(null);
                }
                C2042e c2042e3 = new C2042e(jVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", a(), null);
                if (firebaseCoreHostApi == null) {
                    c2042e3.b(null);
                } else {
                    final int i6 = 2;
                    c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.firebase.core.f
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i6) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.b(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.c(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.d(firebaseCoreHostApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                }
            }
        }

        void initializeApp(@NonNull String str, @NonNull PigeonFirebaseOptions pigeonFirebaseOptions, @NonNull Result<PigeonInitializeResponse> result);

        void initializeCore(@NonNull Result<List<PigeonInitializeResponse>> result);

        void optionsFromResource(@NonNull Result<PigeonFirebaseOptions> result);
    }

    public static class FirebaseCoreHostApiCodec extends C2037D {
        public static final FirebaseCoreHostApiCodec INSTANCE = new FirebaseCoreHostApiCodec();

        private FirebaseCoreHostApiCodec() {
        }

        @Override // pg.C2037D
        public Object readValueOfType(byte b8, @NonNull ByteBuffer byteBuffer) {
            return b8 != -128 ? b8 != -127 ? super.readValueOfType(b8, byteBuffer) : PigeonInitializeResponse.fromList((ArrayList) readValue(byteBuffer)) : PigeonFirebaseOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // pg.C2037D
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PigeonFirebaseOptions) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((PigeonFirebaseOptions) obj).toList());
            } else if (!(obj instanceof PigeonInitializeResponse)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                writeValue(byteArrayOutputStream, ((PigeonInitializeResponse) obj).toList());
            }
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

    public static final class PigeonFirebaseOptions {

        @Nullable
        private String androidClientId;

        @NonNull
        private String apiKey;

        @Nullable
        private String appGroupId;

        @NonNull
        private String appId;

        @Nullable
        private String authDomain;

        @Nullable
        private String databaseURL;

        @Nullable
        private String deepLinkURLScheme;

        @Nullable
        private String iosBundleId;

        @Nullable
        private String iosClientId;

        @Nullable
        private String measurementId;

        @NonNull
        private String messagingSenderId;

        @NonNull
        private String projectId;

        @Nullable
        private String storageBucket;

        @Nullable
        private String trackingId;

        public static final class Builder {

            @Nullable
            private String androidClientId;

            @Nullable
            private String apiKey;

            @Nullable
            private String appGroupId;

            @Nullable
            private String appId;

            @Nullable
            private String authDomain;

            @Nullable
            private String databaseURL;

            @Nullable
            private String deepLinkURLScheme;

            @Nullable
            private String iosBundleId;

            @Nullable
            private String iosClientId;

            @Nullable
            private String measurementId;

            @Nullable
            private String messagingSenderId;

            @Nullable
            private String projectId;

            @Nullable
            private String storageBucket;

            @Nullable
            private String trackingId;

            @NonNull
            public PigeonFirebaseOptions build() {
                PigeonFirebaseOptions pigeonFirebaseOptions = new PigeonFirebaseOptions();
                pigeonFirebaseOptions.setApiKey(this.apiKey);
                pigeonFirebaseOptions.setAppId(this.appId);
                pigeonFirebaseOptions.setMessagingSenderId(this.messagingSenderId);
                pigeonFirebaseOptions.setProjectId(this.projectId);
                pigeonFirebaseOptions.setAuthDomain(this.authDomain);
                pigeonFirebaseOptions.setDatabaseURL(this.databaseURL);
                pigeonFirebaseOptions.setStorageBucket(this.storageBucket);
                pigeonFirebaseOptions.setMeasurementId(this.measurementId);
                pigeonFirebaseOptions.setTrackingId(this.trackingId);
                pigeonFirebaseOptions.setDeepLinkURLScheme(this.deepLinkURLScheme);
                pigeonFirebaseOptions.setAndroidClientId(this.androidClientId);
                pigeonFirebaseOptions.setIosClientId(this.iosClientId);
                pigeonFirebaseOptions.setIosBundleId(this.iosBundleId);
                pigeonFirebaseOptions.setAppGroupId(this.appGroupId);
                return pigeonFirebaseOptions;
            }

            @NonNull
            public Builder setAndroidClientId(@Nullable String str) {
                this.androidClientId = str;
                return this;
            }

            @NonNull
            public Builder setApiKey(@NonNull String str) {
                this.apiKey = str;
                return this;
            }

            @NonNull
            public Builder setAppGroupId(@Nullable String str) {
                this.appGroupId = str;
                return this;
            }

            @NonNull
            public Builder setAppId(@NonNull String str) {
                this.appId = str;
                return this;
            }

            @NonNull
            public Builder setAuthDomain(@Nullable String str) {
                this.authDomain = str;
                return this;
            }

            @NonNull
            public Builder setDatabaseURL(@Nullable String str) {
                this.databaseURL = str;
                return this;
            }

            @NonNull
            public Builder setDeepLinkURLScheme(@Nullable String str) {
                this.deepLinkURLScheme = str;
                return this;
            }

            @NonNull
            public Builder setIosBundleId(@Nullable String str) {
                this.iosBundleId = str;
                return this;
            }

            @NonNull
            public Builder setIosClientId(@Nullable String str) {
                this.iosClientId = str;
                return this;
            }

            @NonNull
            public Builder setMeasurementId(@Nullable String str) {
                this.measurementId = str;
                return this;
            }

            @NonNull
            public Builder setMessagingSenderId(@NonNull String str) {
                this.messagingSenderId = str;
                return this;
            }

            @NonNull
            public Builder setProjectId(@NonNull String str) {
                this.projectId = str;
                return this;
            }

            @NonNull
            public Builder setStorageBucket(@Nullable String str) {
                this.storageBucket = str;
                return this;
            }

            @NonNull
            public Builder setTrackingId(@Nullable String str) {
                this.trackingId = str;
                return this;
            }
        }

        @NonNull
        public static PigeonFirebaseOptions fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonFirebaseOptions pigeonFirebaseOptions = new PigeonFirebaseOptions();
            pigeonFirebaseOptions.setApiKey((String) arrayList.get(0));
            pigeonFirebaseOptions.setAppId((String) arrayList.get(1));
            pigeonFirebaseOptions.setMessagingSenderId((String) arrayList.get(2));
            pigeonFirebaseOptions.setProjectId((String) arrayList.get(3));
            pigeonFirebaseOptions.setAuthDomain((String) arrayList.get(4));
            pigeonFirebaseOptions.setDatabaseURL((String) arrayList.get(5));
            pigeonFirebaseOptions.setStorageBucket((String) arrayList.get(6));
            pigeonFirebaseOptions.setMeasurementId((String) arrayList.get(7));
            pigeonFirebaseOptions.setTrackingId((String) arrayList.get(8));
            pigeonFirebaseOptions.setDeepLinkURLScheme((String) arrayList.get(9));
            pigeonFirebaseOptions.setAndroidClientId((String) arrayList.get(10));
            pigeonFirebaseOptions.setIosClientId((String) arrayList.get(11));
            pigeonFirebaseOptions.setIosBundleId((String) arrayList.get(12));
            pigeonFirebaseOptions.setAppGroupId((String) arrayList.get(13));
            return pigeonFirebaseOptions;
        }

        @Nullable
        public String getAndroidClientId() {
            return this.androidClientId;
        }

        @NonNull
        public String getApiKey() {
            return this.apiKey;
        }

        @Nullable
        public String getAppGroupId() {
            return this.appGroupId;
        }

        @NonNull
        public String getAppId() {
            return this.appId;
        }

        @Nullable
        public String getAuthDomain() {
            return this.authDomain;
        }

        @Nullable
        public String getDatabaseURL() {
            return this.databaseURL;
        }

        @Nullable
        public String getDeepLinkURLScheme() {
            return this.deepLinkURLScheme;
        }

        @Nullable
        public String getIosBundleId() {
            return this.iosBundleId;
        }

        @Nullable
        public String getIosClientId() {
            return this.iosClientId;
        }

        @Nullable
        public String getMeasurementId() {
            return this.measurementId;
        }

        @NonNull
        public String getMessagingSenderId() {
            return this.messagingSenderId;
        }

        @NonNull
        public String getProjectId() {
            return this.projectId;
        }

        @Nullable
        public String getStorageBucket() {
            return this.storageBucket;
        }

        @Nullable
        public String getTrackingId() {
            return this.trackingId;
        }

        public void setAndroidClientId(@Nullable String str) {
            this.androidClientId = str;
        }

        public void setApiKey(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.apiKey = str;
        }

        public void setAppGroupId(@Nullable String str) {
            this.appGroupId = str;
        }

        public void setAppId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.appId = str;
        }

        public void setAuthDomain(@Nullable String str) {
            this.authDomain = str;
        }

        public void setDatabaseURL(@Nullable String str) {
            this.databaseURL = str;
        }

        public void setDeepLinkURLScheme(@Nullable String str) {
            this.deepLinkURLScheme = str;
        }

        public void setIosBundleId(@Nullable String str) {
            this.iosBundleId = str;
        }

        public void setIosClientId(@Nullable String str) {
            this.iosClientId = str;
        }

        public void setMeasurementId(@Nullable String str) {
            this.measurementId = str;
        }

        public void setMessagingSenderId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.messagingSenderId = str;
        }

        public void setProjectId(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.projectId = str;
        }

        public void setStorageBucket(@Nullable String str) {
            this.storageBucket = str;
        }

        public void setTrackingId(@Nullable String str) {
            this.trackingId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.apiKey);
            arrayList.add(this.appId);
            arrayList.add(this.messagingSenderId);
            arrayList.add(this.projectId);
            arrayList.add(this.authDomain);
            arrayList.add(this.databaseURL);
            arrayList.add(this.storageBucket);
            arrayList.add(this.measurementId);
            arrayList.add(this.trackingId);
            arrayList.add(this.deepLinkURLScheme);
            arrayList.add(this.androidClientId);
            arrayList.add(this.iosClientId);
            arrayList.add(this.iosBundleId);
            arrayList.add(this.appGroupId);
            return arrayList;
        }
    }

    public static final class PigeonInitializeResponse {

        @Nullable
        private Boolean isAutomaticDataCollectionEnabled;

        @NonNull
        private String name;

        @NonNull
        private PigeonFirebaseOptions options;

        @NonNull
        private Map<String, Object> pluginConstants;

        public static final class Builder {

            @Nullable
            private Boolean isAutomaticDataCollectionEnabled;

            @Nullable
            private String name;

            @Nullable
            private PigeonFirebaseOptions options;

            @Nullable
            private Map<String, Object> pluginConstants;

            @NonNull
            public PigeonInitializeResponse build() {
                PigeonInitializeResponse pigeonInitializeResponse = new PigeonInitializeResponse();
                pigeonInitializeResponse.setName(this.name);
                pigeonInitializeResponse.setOptions(this.options);
                pigeonInitializeResponse.setIsAutomaticDataCollectionEnabled(this.isAutomaticDataCollectionEnabled);
                pigeonInitializeResponse.setPluginConstants(this.pluginConstants);
                return pigeonInitializeResponse;
            }

            @NonNull
            public Builder setIsAutomaticDataCollectionEnabled(@Nullable Boolean bool) {
                this.isAutomaticDataCollectionEnabled = bool;
                return this;
            }

            @NonNull
            public Builder setName(@NonNull String str) {
                this.name = str;
                return this;
            }

            @NonNull
            public Builder setOptions(@NonNull PigeonFirebaseOptions pigeonFirebaseOptions) {
                this.options = pigeonFirebaseOptions;
                return this;
            }

            @NonNull
            public Builder setPluginConstants(@NonNull Map<String, Object> map) {
                this.pluginConstants = map;
                return this;
            }
        }

        @NonNull
        public static PigeonInitializeResponse fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonInitializeResponse pigeonInitializeResponse = new PigeonInitializeResponse();
            pigeonInitializeResponse.setName((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            pigeonInitializeResponse.setOptions(obj == null ? null : PigeonFirebaseOptions.fromList((ArrayList) obj));
            pigeonInitializeResponse.setIsAutomaticDataCollectionEnabled((Boolean) arrayList.get(2));
            pigeonInitializeResponse.setPluginConstants((Map) arrayList.get(3));
            return pigeonInitializeResponse;
        }

        @Nullable
        public Boolean getIsAutomaticDataCollectionEnabled() {
            return this.isAutomaticDataCollectionEnabled;
        }

        @NonNull
        public String getName() {
            return this.name;
        }

        @NonNull
        public PigeonFirebaseOptions getOptions() {
            return this.options;
        }

        @NonNull
        public Map<String, Object> getPluginConstants() {
            return this.pluginConstants;
        }

        public void setIsAutomaticDataCollectionEnabled(@Nullable Boolean bool) {
            this.isAutomaticDataCollectionEnabled = bool;
        }

        public void setName(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.name = str;
        }

        public void setOptions(@NonNull PigeonFirebaseOptions pigeonFirebaseOptions) {
            if (pigeonFirebaseOptions == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.options = pigeonFirebaseOptions;
        }

        public void setPluginConstants(@NonNull Map<String, Object> map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.pluginConstants = map;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.name);
            PigeonFirebaseOptions pigeonFirebaseOptions = this.options;
            arrayList.add(pigeonFirebaseOptions == null ? null : pigeonFirebaseOptions.toList());
            arrayList.add(this.isAutomaticDataCollectionEnabled);
            arrayList.add(this.pluginConstants);
            return arrayList;
        }
    }

    public interface Result<T> {
        void error(@NonNull Throwable th2);

        void success(T t5);
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
