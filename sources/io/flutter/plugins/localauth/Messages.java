package io.flutter.plugins.localauth;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.work.WorkInfo;
import io.flutter.plugins.localauth.Messages;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import pg.C2037D;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;
import pg.j;
import pg.q;

/* JADX INFO: loaded from: classes4.dex */
public class Messages {

    public enum AuthClassification {
        WEAK(0),
        STRONG(1);

        final int index;

        AuthClassification(int i) {
            this.index = i;
        }
    }

    public static final class AuthClassificationWrapper {

        @NonNull
        private AuthClassification value;

        public static final class Builder {

            @Nullable
            private AuthClassification value;

            @NonNull
            public AuthClassificationWrapper build() {
                AuthClassificationWrapper authClassificationWrapper = new AuthClassificationWrapper();
                authClassificationWrapper.setValue(this.value);
                return authClassificationWrapper;
            }

            @NonNull
            public Builder setValue(@NonNull AuthClassification authClassification) {
                this.value = authClassification;
                return this;
            }
        }

        @NonNull
        public static AuthClassificationWrapper fromList(@NonNull ArrayList<Object> arrayList) {
            AuthClassificationWrapper authClassificationWrapper = new AuthClassificationWrapper();
            authClassificationWrapper.setValue(AuthClassification.values()[((Integer) arrayList.get(0)).intValue()]);
            return authClassificationWrapper;
        }

        @NonNull
        public AuthClassification getValue() {
            return this.value;
        }

        public void setValue(@NonNull AuthClassification authClassification) {
            if (authClassification == null) {
                throw new IllegalStateException("Nonnull field \"value\" is null.");
            }
            this.value = authClassification;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            AuthClassification authClassification = this.value;
            arrayList.add(authClassification == null ? null : Integer.valueOf(authClassification.index));
            return arrayList;
        }
    }

    public static final class AuthOptions {

        @NonNull
        private Boolean biometricOnly;

        @NonNull
        private Boolean sensitiveTransaction;

        @NonNull
        private Boolean sticky;

        @NonNull
        private Boolean useErrorDialgs;

        public static final class Builder {

            @Nullable
            private Boolean biometricOnly;

            @Nullable
            private Boolean sensitiveTransaction;

            @Nullable
            private Boolean sticky;

            @Nullable
            private Boolean useErrorDialgs;

            @NonNull
            public AuthOptions build() {
                AuthOptions authOptions = new AuthOptions();
                authOptions.setBiometricOnly(this.biometricOnly);
                authOptions.setSensitiveTransaction(this.sensitiveTransaction);
                authOptions.setSticky(this.sticky);
                authOptions.setUseErrorDialgs(this.useErrorDialgs);
                return authOptions;
            }

            @NonNull
            public Builder setBiometricOnly(@NonNull Boolean bool) {
                this.biometricOnly = bool;
                return this;
            }

            @NonNull
            public Builder setSensitiveTransaction(@NonNull Boolean bool) {
                this.sensitiveTransaction = bool;
                return this;
            }

            @NonNull
            public Builder setSticky(@NonNull Boolean bool) {
                this.sticky = bool;
                return this;
            }

            @NonNull
            public Builder setUseErrorDialgs(@NonNull Boolean bool) {
                this.useErrorDialgs = bool;
                return this;
            }
        }

        @NonNull
        public static AuthOptions fromList(@NonNull ArrayList<Object> arrayList) {
            AuthOptions authOptions = new AuthOptions();
            authOptions.setBiometricOnly((Boolean) arrayList.get(0));
            authOptions.setSensitiveTransaction((Boolean) arrayList.get(1));
            authOptions.setSticky((Boolean) arrayList.get(2));
            authOptions.setUseErrorDialgs((Boolean) arrayList.get(3));
            return authOptions;
        }

        @NonNull
        public Boolean getBiometricOnly() {
            return this.biometricOnly;
        }

        @NonNull
        public Boolean getSensitiveTransaction() {
            return this.sensitiveTransaction;
        }

        @NonNull
        public Boolean getSticky() {
            return this.sticky;
        }

        @NonNull
        public Boolean getUseErrorDialgs() {
            return this.useErrorDialgs;
        }

        public void setBiometricOnly(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"biometricOnly\" is null.");
            }
            this.biometricOnly = bool;
        }

        public void setSensitiveTransaction(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"sensitiveTransaction\" is null.");
            }
            this.sensitiveTransaction = bool;
        }

        public void setSticky(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"sticky\" is null.");
            }
            this.sticky = bool;
        }

        public void setUseErrorDialgs(@NonNull Boolean bool) {
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"useErrorDialgs\" is null.");
            }
            this.useErrorDialgs = bool;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.biometricOnly);
            arrayList.add(this.sensitiveTransaction);
            arrayList.add(this.sticky);
            arrayList.add(this.useErrorDialgs);
            return arrayList;
        }
    }

    public enum AuthResult {
        SUCCESS(0),
        FAILURE(1),
        ERROR_ALREADY_IN_PROGRESS(2),
        ERROR_NO_ACTIVITY(3),
        ERROR_NOT_FRAGMENT_ACTIVITY(4),
        ERROR_NOT_AVAILABLE(5),
        ERROR_NOT_ENROLLED(6),
        ERROR_LOCKED_OUT_TEMPORARILY(7),
        ERROR_LOCKED_OUT_PERMANENTLY(8);

        final int index;

        AuthResult(int i) {
            this.index = i;
        }
    }

    public static final class AuthStrings {

        @NonNull
        private String biometricHint;

        @NonNull
        private String biometricNotRecognized;

        @NonNull
        private String biometricRequiredTitle;

        @NonNull
        private String cancelButton;

        @NonNull
        private String deviceCredentialsRequiredTitle;

        @NonNull
        private String deviceCredentialsSetupDescription;

        @NonNull
        private String goToSettingsButton;

        @NonNull
        private String goToSettingsDescription;

        @NonNull
        private String reason;

        @NonNull
        private String signInTitle;

        public static final class Builder {

            @Nullable
            private String biometricHint;

            @Nullable
            private String biometricNotRecognized;

            @Nullable
            private String biometricRequiredTitle;

            @Nullable
            private String cancelButton;

            @Nullable
            private String deviceCredentialsRequiredTitle;

            @Nullable
            private String deviceCredentialsSetupDescription;

            @Nullable
            private String goToSettingsButton;

            @Nullable
            private String goToSettingsDescription;

            @Nullable
            private String reason;

            @Nullable
            private String signInTitle;

            @NonNull
            public AuthStrings build() {
                AuthStrings authStrings = new AuthStrings();
                authStrings.setReason(this.reason);
                authStrings.setBiometricHint(this.biometricHint);
                authStrings.setBiometricNotRecognized(this.biometricNotRecognized);
                authStrings.setBiometricRequiredTitle(this.biometricRequiredTitle);
                authStrings.setCancelButton(this.cancelButton);
                authStrings.setDeviceCredentialsRequiredTitle(this.deviceCredentialsRequiredTitle);
                authStrings.setDeviceCredentialsSetupDescription(this.deviceCredentialsSetupDescription);
                authStrings.setGoToSettingsButton(this.goToSettingsButton);
                authStrings.setGoToSettingsDescription(this.goToSettingsDescription);
                authStrings.setSignInTitle(this.signInTitle);
                return authStrings;
            }

            @NonNull
            public Builder setBiometricHint(@NonNull String str) {
                this.biometricHint = str;
                return this;
            }

            @NonNull
            public Builder setBiometricNotRecognized(@NonNull String str) {
                this.biometricNotRecognized = str;
                return this;
            }

            @NonNull
            public Builder setBiometricRequiredTitle(@NonNull String str) {
                this.biometricRequiredTitle = str;
                return this;
            }

            @NonNull
            public Builder setCancelButton(@NonNull String str) {
                this.cancelButton = str;
                return this;
            }

            @NonNull
            public Builder setDeviceCredentialsRequiredTitle(@NonNull String str) {
                this.deviceCredentialsRequiredTitle = str;
                return this;
            }

            @NonNull
            public Builder setDeviceCredentialsSetupDescription(@NonNull String str) {
                this.deviceCredentialsSetupDescription = str;
                return this;
            }

            @NonNull
            public Builder setGoToSettingsButton(@NonNull String str) {
                this.goToSettingsButton = str;
                return this;
            }

            @NonNull
            public Builder setGoToSettingsDescription(@NonNull String str) {
                this.goToSettingsDescription = str;
                return this;
            }

            @NonNull
            public Builder setReason(@NonNull String str) {
                this.reason = str;
                return this;
            }

            @NonNull
            public Builder setSignInTitle(@NonNull String str) {
                this.signInTitle = str;
                return this;
            }
        }

        @NonNull
        public static AuthStrings fromList(@NonNull ArrayList<Object> arrayList) {
            AuthStrings authStrings = new AuthStrings();
            authStrings.setReason((String) arrayList.get(0));
            authStrings.setBiometricHint((String) arrayList.get(1));
            authStrings.setBiometricNotRecognized((String) arrayList.get(2));
            authStrings.setBiometricRequiredTitle((String) arrayList.get(3));
            authStrings.setCancelButton((String) arrayList.get(4));
            authStrings.setDeviceCredentialsRequiredTitle((String) arrayList.get(5));
            authStrings.setDeviceCredentialsSetupDescription((String) arrayList.get(6));
            authStrings.setGoToSettingsButton((String) arrayList.get(7));
            authStrings.setGoToSettingsDescription((String) arrayList.get(8));
            authStrings.setSignInTitle((String) arrayList.get(9));
            return authStrings;
        }

        @NonNull
        public String getBiometricHint() {
            return this.biometricHint;
        }

        @NonNull
        public String getBiometricNotRecognized() {
            return this.biometricNotRecognized;
        }

        @NonNull
        public String getBiometricRequiredTitle() {
            return this.biometricRequiredTitle;
        }

        @NonNull
        public String getCancelButton() {
            return this.cancelButton;
        }

        @NonNull
        public String getDeviceCredentialsRequiredTitle() {
            return this.deviceCredentialsRequiredTitle;
        }

        @NonNull
        public String getDeviceCredentialsSetupDescription() {
            return this.deviceCredentialsSetupDescription;
        }

        @NonNull
        public String getGoToSettingsButton() {
            return this.goToSettingsButton;
        }

        @NonNull
        public String getGoToSettingsDescription() {
            return this.goToSettingsDescription;
        }

        @NonNull
        public String getReason() {
            return this.reason;
        }

        @NonNull
        public String getSignInTitle() {
            return this.signInTitle;
        }

        public void setBiometricHint(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"biometricHint\" is null.");
            }
            this.biometricHint = str;
        }

        public void setBiometricNotRecognized(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"biometricNotRecognized\" is null.");
            }
            this.biometricNotRecognized = str;
        }

        public void setBiometricRequiredTitle(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"biometricRequiredTitle\" is null.");
            }
            this.biometricRequiredTitle = str;
        }

        public void setCancelButton(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"cancelButton\" is null.");
            }
            this.cancelButton = str;
        }

        public void setDeviceCredentialsRequiredTitle(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"deviceCredentialsRequiredTitle\" is null.");
            }
            this.deviceCredentialsRequiredTitle = str;
        }

        public void setDeviceCredentialsSetupDescription(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"deviceCredentialsSetupDescription\" is null.");
            }
            this.deviceCredentialsSetupDescription = str;
        }

        public void setGoToSettingsButton(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"goToSettingsButton\" is null.");
            }
            this.goToSettingsButton = str;
        }

        public void setGoToSettingsDescription(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"goToSettingsDescription\" is null.");
            }
            this.goToSettingsDescription = str;
        }

        public void setReason(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"reason\" is null.");
            }
            this.reason = str;
        }

        public void setSignInTitle(@NonNull String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"signInTitle\" is null.");
            }
            this.signInTitle = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(10);
            arrayList.add(this.reason);
            arrayList.add(this.biometricHint);
            arrayList.add(this.biometricNotRecognized);
            arrayList.add(this.biometricRequiredTitle);
            arrayList.add(this.cancelButton);
            arrayList.add(this.deviceCredentialsRequiredTitle);
            arrayList.add(this.deviceCredentialsSetupDescription);
            arrayList.add(this.goToSettingsButton);
            arrayList.add(this.goToSettingsDescription);
            arrayList.add(this.signInTitle);
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

    public interface LocalAuthApi {

        /* JADX INFO: renamed from: io.flutter.plugins.localauth.Messages$LocalAuthApi$-CC, reason: invalid class name */
        public abstract /* synthetic */ class CC {
            public static q a() {
                return LocalAuthApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(LocalAuthApi localAuthApi, Object obj, InterfaceC2041d interfaceC2041d) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, localAuthApi.isDeviceSupported());
                } catch (Throwable th2) {
                    arrayList = Messages.wrapError(th2);
                }
                interfaceC2041d.reply(arrayList);
            }

            public static /* synthetic */ void c(LocalAuthApi localAuthApi, Object obj, InterfaceC2041d interfaceC2041d) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, localAuthApi.deviceCanSupportBiometrics());
                } catch (Throwable th2) {
                    arrayList = Messages.wrapError(th2);
                }
                interfaceC2041d.reply(arrayList);
            }

            public static /* synthetic */ void d(LocalAuthApi localAuthApi, Object obj, InterfaceC2041d interfaceC2041d) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, localAuthApi.stopAuthentication());
                } catch (Throwable th2) {
                    arrayList = Messages.wrapError(th2);
                }
                interfaceC2041d.reply(arrayList);
            }

            public static /* synthetic */ void e(LocalAuthApi localAuthApi, Object obj, InterfaceC2041d interfaceC2041d) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, localAuthApi.getEnrolledBiometrics());
                } catch (Throwable th2) {
                    arrayList = Messages.wrapError(th2);
                }
                interfaceC2041d.reply(arrayList);
            }

            public static /* synthetic */ void f(LocalAuthApi localAuthApi, Object obj, final InterfaceC2041d interfaceC2041d) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                localAuthApi.authenticate((AuthOptions) arrayList2.get(0), (AuthStrings) arrayList2.get(1), new Result<AuthResult>() { // from class: io.flutter.plugins.localauth.Messages.LocalAuthApi.1
                    @Override // io.flutter.plugins.localauth.Messages.Result
                    public void error(Throwable th2) {
                        interfaceC2041d.reply(Messages.wrapError(th2));
                    }

                    @Override // io.flutter.plugins.localauth.Messages.Result
                    public void success(AuthResult authResult) {
                        arrayList.add(0, Integer.valueOf(authResult.index));
                        interfaceC2041d.reply(arrayList);
                    }
                });
            }

            public static void g(j jVar, final LocalAuthApi localAuthApi) {
                C2042e c2042e = new C2042e(jVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.isDeviceSupported", a(), null);
                if (localAuthApi != null) {
                    final int i = 0;
                    c2042e.b(new InterfaceC2040c() { // from class: io.flutter.plugins.localauth.d
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i) {
                                case 0:
                                    Messages.LocalAuthApi.CC.b(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.LocalAuthApi.CC.c(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.LocalAuthApi.CC.d(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 3:
                                    Messages.LocalAuthApi.CC.e(localAuthApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.LocalAuthApi.CC.f(localAuthApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e.b(null);
                }
                C2042e c2042e2 = new C2042e(jVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.deviceCanSupportBiometrics", a(), null);
                if (localAuthApi != null) {
                    final int i4 = 1;
                    c2042e2.b(new InterfaceC2040c() { // from class: io.flutter.plugins.localauth.d
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i4) {
                                case 0:
                                    Messages.LocalAuthApi.CC.b(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.LocalAuthApi.CC.c(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.LocalAuthApi.CC.d(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 3:
                                    Messages.LocalAuthApi.CC.e(localAuthApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.LocalAuthApi.CC.f(localAuthApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e2.b(null);
                }
                C2042e c2042e3 = new C2042e(jVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.stopAuthentication", a(), null);
                if (localAuthApi != null) {
                    final int i6 = 2;
                    c2042e3.b(new InterfaceC2040c() { // from class: io.flutter.plugins.localauth.d
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i6) {
                                case 0:
                                    Messages.LocalAuthApi.CC.b(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.LocalAuthApi.CC.c(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.LocalAuthApi.CC.d(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 3:
                                    Messages.LocalAuthApi.CC.e(localAuthApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.LocalAuthApi.CC.f(localAuthApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e3.b(null);
                }
                C2042e c2042e4 = new C2042e(jVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.getEnrolledBiometrics", a(), null);
                if (localAuthApi != null) {
                    final int i10 = 3;
                    c2042e4.b(new InterfaceC2040c() { // from class: io.flutter.plugins.localauth.d
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i10) {
                                case 0:
                                    Messages.LocalAuthApi.CC.b(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.LocalAuthApi.CC.c(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.LocalAuthApi.CC.d(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 3:
                                    Messages.LocalAuthApi.CC.e(localAuthApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.LocalAuthApi.CC.f(localAuthApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                } else {
                    c2042e4.b(null);
                }
                C2042e c2042e5 = new C2042e(jVar, "dev.flutter.pigeon.local_auth_android.LocalAuthApi.authenticate", a(), null);
                if (localAuthApi == null) {
                    c2042e5.b(null);
                } else {
                    final int i11 = 4;
                    c2042e5.b(new InterfaceC2040c() { // from class: io.flutter.plugins.localauth.d
                        @Override // pg.InterfaceC2040c
                        public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                            switch (i11) {
                                case 0:
                                    Messages.LocalAuthApi.CC.b(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 1:
                                    Messages.LocalAuthApi.CC.c(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 2:
                                    Messages.LocalAuthApi.CC.d(localAuthApi, obj, interfaceC2041d);
                                    break;
                                case 3:
                                    Messages.LocalAuthApi.CC.e(localAuthApi, obj, interfaceC2041d);
                                    break;
                                default:
                                    Messages.LocalAuthApi.CC.f(localAuthApi, obj, interfaceC2041d);
                                    break;
                            }
                        }
                    });
                }
            }
        }

        void authenticate(@NonNull AuthOptions authOptions, @NonNull AuthStrings authStrings, @NonNull Result<AuthResult> result);

        @NonNull
        Boolean deviceCanSupportBiometrics();

        @NonNull
        List<AuthClassificationWrapper> getEnrolledBiometrics();

        @NonNull
        Boolean isDeviceSupported();

        @NonNull
        Boolean stopAuthentication();
    }

    public static class LocalAuthApiCodec extends C2037D {
        public static final LocalAuthApiCodec INSTANCE = new LocalAuthApiCodec();

        private LocalAuthApiCodec() {
        }

        @Override // pg.C2037D
        public Object readValueOfType(byte b8, @NonNull ByteBuffer byteBuffer) {
            switch (b8) {
                case WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT /* -128 */:
                    return AuthClassificationWrapper.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return AuthOptions.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return AuthStrings.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b8, byteBuffer);
            }
        }

        @Override // pg.C2037D
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AuthClassificationWrapper) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((AuthClassificationWrapper) obj).toList());
            } else if (obj instanceof AuthOptions) {
                byteArrayOutputStream.write(TsExtractor.TS_STREAM_TYPE_AC3);
                writeValue(byteArrayOutputStream, ((AuthOptions) obj).toList());
            } else if (!(obj instanceof AuthStrings)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((AuthStrings) obj).toList());
            }
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
