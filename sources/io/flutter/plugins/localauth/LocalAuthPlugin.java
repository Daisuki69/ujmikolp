package io.flutter.plugins.localauth;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.BiometricManager;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugins.localauth.AuthenticationHelper;
import io.flutter.plugins.localauth.Messages;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import pg.w;

/* JADX INFO: loaded from: classes4.dex */
public class LocalAuthPlugin implements FlutterPlugin, ActivityAware, Messages.LocalAuthApi {
    private static final int LOCK_REQUEST_CODE = 221;
    private Activity activity;
    private AuthenticationHelper authHelper;
    private BiometricManager biometricManager;
    private KeyguardManager keyguardManager;
    private Lifecycle lifecycle;
    Messages.Result<Messages.AuthResult> lockRequestResult;

    @VisibleForTesting
    final AtomicBoolean authInProgress = new AtomicBoolean(false);
    private final w resultListener = new w() { // from class: io.flutter.plugins.localauth.LocalAuthPlugin.1
        @Override // pg.w
        public boolean onActivityResult(int i, int i4, Intent intent) {
            LocalAuthPlugin localAuthPlugin;
            Messages.Result<Messages.AuthResult> result;
            if (i != LocalAuthPlugin.LOCK_REQUEST_CODE) {
                return false;
            }
            if (i4 != -1 || (result = (localAuthPlugin = LocalAuthPlugin.this).lockRequestResult) == null) {
                LocalAuthPlugin localAuthPlugin2 = LocalAuthPlugin.this;
                localAuthPlugin2.lambda$createAuthCompletionHandler$0(localAuthPlugin2.lockRequestResult, Messages.AuthResult.FAILURE);
            } else {
                localAuthPlugin.lambda$createAuthCompletionHandler$0(result, Messages.AuthResult.SUCCESS);
            }
            LocalAuthPlugin.this.lockRequestResult = null;
            return false;
        }
    };

    private boolean canAuthenticateWithBiometrics() {
        BiometricManager biometricManager = this.biometricManager;
        return biometricManager != null && biometricManager.canAuthenticate(255) == 0;
    }

    private boolean hasBiometricHardware() {
        BiometricManager biometricManager = this.biometricManager;
        return (biometricManager == null || biometricManager.canAuthenticate(255) == 12) ? false : true;
    }

    private void setServicesFromActivity(Activity activity) {
        if (activity == null) {
            return;
        }
        this.activity = activity;
        Context baseContext = activity.getBaseContext();
        this.biometricManager = BiometricManager.from(activity);
        this.keyguardManager = (KeyguardManager) baseContext.getSystemService("keyguard");
    }

    @NonNull
    private Messages.AuthClassificationWrapper wrappedBiometric(Messages.AuthClassification authClassification) {
        return new Messages.AuthClassificationWrapper.Builder().setValue(authClassification).build();
    }

    @Override // io.flutter.plugins.localauth.Messages.LocalAuthApi
    public void authenticate(@NonNull Messages.AuthOptions authOptions, @NonNull Messages.AuthStrings authStrings, @NonNull Messages.Result<Messages.AuthResult> result) {
        if (this.authInProgress.get()) {
            result.success(Messages.AuthResult.ERROR_ALREADY_IN_PROGRESS);
            return;
        }
        Activity activity = this.activity;
        if (activity == null || activity.isFinishing()) {
            result.success(Messages.AuthResult.ERROR_NO_ACTIVITY);
            return;
        }
        if (!(this.activity instanceof FragmentActivity)) {
            result.success(Messages.AuthResult.ERROR_NOT_FRAGMENT_ACTIVITY);
        } else {
            if (!isDeviceSupported().booleanValue()) {
                result.success(Messages.AuthResult.ERROR_NOT_AVAILABLE);
                return;
            }
            this.authInProgress.set(true);
            sendAuthenticationRequest(authOptions, authStrings, !authOptions.getBiometricOnly().booleanValue() && canAuthenticateWithDeviceCredential(), createAuthCompletionHandler(result));
        }
    }

    @VisibleForTesting
    public boolean canAuthenticateWithDeviceCredential() {
        if (Build.VERSION.SDK_INT < 30) {
            return isDeviceSecure();
        }
        BiometricManager biometricManager = this.biometricManager;
        return biometricManager != null && biometricManager.canAuthenticate(32768) == 0;
    }

    @NonNull
    @VisibleForTesting
    public AuthenticationHelper.AuthCompletionHandler createAuthCompletionHandler(@NonNull final Messages.Result<Messages.AuthResult> result) {
        return new AuthenticationHelper.AuthCompletionHandler() { // from class: io.flutter.plugins.localauth.c
            @Override // io.flutter.plugins.localauth.AuthenticationHelper.AuthCompletionHandler
            public final void complete(Messages.AuthResult authResult) {
                this.f17311a.lambda$createAuthCompletionHandler$0(result, authResult);
            }
        };
    }

    @Override // io.flutter.plugins.localauth.Messages.LocalAuthApi
    @NonNull
    public Boolean deviceCanSupportBiometrics() {
        return Boolean.valueOf(hasBiometricHardware());
    }

    @VisibleForTesting
    public final Activity getActivity() {
        return this.activity;
    }

    @Override // io.flutter.plugins.localauth.Messages.LocalAuthApi
    @NonNull
    public List<Messages.AuthClassificationWrapper> getEnrolledBiometrics() {
        ArrayList arrayList = new ArrayList();
        if (this.biometricManager.canAuthenticate(255) == 0) {
            arrayList.add(wrappedBiometric(Messages.AuthClassification.WEAK));
        }
        if (this.biometricManager.canAuthenticate(15) == 0) {
            arrayList.add(wrappedBiometric(Messages.AuthClassification.STRONG));
        }
        return arrayList;
    }

    @VisibleForTesting
    public boolean isDeviceSecure() {
        KeyguardManager keyguardManager = this.keyguardManager;
        return keyguardManager != null && keyguardManager.isDeviceSecure();
    }

    @Override // io.flutter.plugins.localauth.Messages.LocalAuthApi
    @NonNull
    public Boolean isDeviceSupported() {
        return Boolean.valueOf(isDeviceSecure() || canAuthenticateWithBiometrics());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addActivityResultListener(this.resultListener);
        setServicesFromActivity(activityPluginBinding.getActivity());
        this.lifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Messages.LocalAuthApi.CC.g(flutterPluginBinding.getBinaryMessenger(), this);
    }

    /* JADX INFO: renamed from: onAuthenticationCompleted, reason: merged with bridge method [inline-methods] */
    public void lambda$createAuthCompletionHandler$0(Messages.Result<Messages.AuthResult> result, Messages.AuthResult authResult) {
        if (this.authInProgress.compareAndSet(true, false)) {
            result.success(authResult);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.lifecycle = null;
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.lifecycle = null;
        this.activity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Messages.LocalAuthApi.CC.g(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addActivityResultListener(this.resultListener);
        setServicesFromActivity(activityPluginBinding.getActivity());
        this.lifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding);
    }

    @VisibleForTesting
    public void sendAuthenticationRequest(@NonNull Messages.AuthOptions authOptions, @NonNull Messages.AuthStrings authStrings, boolean z4, @NonNull AuthenticationHelper.AuthCompletionHandler authCompletionHandler) {
        AuthenticationHelper authenticationHelper = new AuthenticationHelper(this.lifecycle, (FragmentActivity) this.activity, authOptions, authStrings, authCompletionHandler, z4);
        this.authHelper = authenticationHelper;
        authenticationHelper.authenticate();
    }

    @VisibleForTesting
    public void setBiometricManager(BiometricManager biometricManager) {
        this.biometricManager = biometricManager;
    }

    @VisibleForTesting
    public void setKeyguardManager(KeyguardManager keyguardManager) {
        this.keyguardManager = keyguardManager;
    }

    @Override // io.flutter.plugins.localauth.Messages.LocalAuthApi
    @NonNull
    public Boolean stopAuthentication() {
        try {
            if (this.authHelper != null && this.authInProgress.get()) {
                this.authHelper.stopAuthentication();
                this.authHelper = null;
            }
            this.authInProgress.set(false);
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
