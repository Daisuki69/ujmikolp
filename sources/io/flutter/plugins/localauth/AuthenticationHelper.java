package io.flutter.plugins.localauth;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.biometric.BiometricPrompt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.flutter.plugins.localauth.Messages;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
class AuthenticationHelper extends BiometricPrompt.AuthenticationCallback implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
    private final FragmentActivity activity;
    private BiometricPrompt biometricPrompt;
    private final AuthCompletionHandler completionHandler;
    private final boolean isAuthSticky;
    private final Lifecycle lifecycle;
    private final BiometricPrompt.PromptInfo promptInfo;
    private final Messages.AuthStrings strings;
    private final boolean useErrorDialogs;
    private boolean activityPaused = false;
    private final UiThreadExecutor uiThreadExecutor = new UiThreadExecutor();

    public interface AuthCompletionHandler {
        void complete(Messages.AuthResult authResult);
    }

    public static class UiThreadExecutor implements Executor {
        final Handler handler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.handler.post(runnable);
        }
    }

    public AuthenticationHelper(Lifecycle lifecycle, FragmentActivity fragmentActivity, @NonNull Messages.AuthOptions authOptions, @NonNull Messages.AuthStrings authStrings, @NonNull AuthCompletionHandler authCompletionHandler, boolean z4) {
        int i;
        this.lifecycle = lifecycle;
        this.activity = fragmentActivity;
        this.completionHandler = authCompletionHandler;
        this.strings = authStrings;
        this.isAuthSticky = authOptions.getSticky().booleanValue();
        this.useErrorDialogs = authOptions.getUseErrorDialgs().booleanValue();
        BiometricPrompt.PromptInfo.Builder confirmationRequired = new BiometricPrompt.PromptInfo.Builder().setDescription(authStrings.getReason()).setTitle(authStrings.getSignInTitle()).setSubtitle(authStrings.getBiometricHint()).setConfirmationRequired(authOptions.getSensitiveTransaction().booleanValue());
        if (z4) {
            i = 33023;
        } else {
            confirmationRequired.setNegativeButtonText(authStrings.getCancelButton());
            i = 255;
        }
        confirmationRequired.setAllowedAuthenticators(i);
        this.promptInfo = confirmationRequired.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onActivityResumed$0(BiometricPrompt biometricPrompt) {
        biometricPrompt.authenticate(this.promptInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showGoToSettingsDialog$1(DialogInterface dialogInterface, int i) {
        this.completionHandler.complete(Messages.AuthResult.FAILURE);
        stop();
        this.activity.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showGoToSettingsDialog$2(DialogInterface dialogInterface, int i) {
        this.completionHandler.complete(Messages.AuthResult.FAILURE);
        stop();
    }

    @SuppressLint({"InflateParams"})
    private void showGoToSettingsDialog(String str, String str2) {
        View viewInflate = LayoutInflater.from(this.activity).inflate(R.layout.go_to_setting, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_required);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.go_to_setting_description);
        textView.setText(str);
        textView2.setText(str2);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.activity, R.style.AlertDialogCustom);
        final int i = 0;
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(this) { // from class: io.flutter.plugins.localauth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthenticationHelper f17308b;

            {
                this.f17308b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                switch (i) {
                    case 0:
                        this.f17308b.lambda$showGoToSettingsDialog$1(dialogInterface, i4);
                        break;
                    default:
                        this.f17308b.lambda$showGoToSettingsDialog$2(dialogInterface, i4);
                        break;
                }
            }
        };
        final int i4 = 1;
        new AlertDialog.Builder(contextThemeWrapper).setView(viewInflate).setPositiveButton(this.strings.getGoToSettingsButton(), onClickListener).setNegativeButton(this.strings.getCancelButton(), new DialogInterface.OnClickListener(this) { // from class: io.flutter.plugins.localauth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AuthenticationHelper f17308b;

            {
                this.f17308b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i42) {
                switch (i4) {
                    case 0:
                        this.f17308b.lambda$showGoToSettingsDialog$1(dialogInterface, i42);
                        break;
                    default:
                        this.f17308b.lambda$showGoToSettingsDialog$2(dialogInterface, i42);
                        break;
                }
            }
        }).setCancelable(false).show();
    }

    private void stop() {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.removeObserver(this);
        } else {
            this.activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void authenticate() {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            lifecycle.addObserver(this);
        } else {
            this.activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
        BiometricPrompt biometricPrompt = new BiometricPrompt(this.activity, this.uiThreadExecutor, this);
        this.biometricPrompt = biometricPrompt;
        biometricPrompt.authenticate(this.promptInfo);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.isAuthSticky) {
            this.activityPaused = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (this.isAuthSticky) {
            this.activityPaused = false;
            final BiometricPrompt biometricPrompt = new BiometricPrompt(this.activity, this.uiThreadExecutor, this);
            this.uiThreadExecutor.handler.post(new Runnable() { // from class: io.flutter.plugins.localauth.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17309a.lambda$onActivityResumed$0(biometricPrompt);
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    @android.annotation.SuppressLint({"SwitchIntDef"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAuthenticationError(int r1, @androidx.annotation.NonNull java.lang.CharSequence r2) {
        /*
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L7d
            r2 = 7
            if (r1 == r2) goto L75
            r2 = 9
            if (r1 == r2) goto L6d
            r2 = 14
            if (r1 == r2) goto L51
            r2 = 4
            if (r1 == r2) goto L35
            r2 = 5
            if (r1 == r2) goto L24
            r2 = 11
            if (r1 == r2) goto L35
            r2 = 12
            if (r1 == r2) goto L7d
            io.flutter.plugins.localauth.AuthenticationHelper$AuthCompletionHandler r1 = r0.completionHandler
            io.flutter.plugins.localauth.Messages$AuthResult r2 = io.flutter.plugins.localauth.Messages.AuthResult.FAILURE
            r1.complete(r2)
            goto L84
        L24:
            boolean r1 = r0.activityPaused
            if (r1 == 0) goto L2d
            boolean r1 = r0.isAuthSticky
            if (r1 == 0) goto L2d
            return
        L2d:
            io.flutter.plugins.localauth.AuthenticationHelper$AuthCompletionHandler r1 = r0.completionHandler
            io.flutter.plugins.localauth.Messages$AuthResult r2 = io.flutter.plugins.localauth.Messages.AuthResult.FAILURE
            r1.complete(r2)
            goto L84
        L35:
            boolean r1 = r0.useErrorDialogs
            if (r1 == 0) goto L49
            io.flutter.plugins.localauth.Messages$AuthStrings r1 = r0.strings
            java.lang.String r1 = r1.getBiometricRequiredTitle()
            io.flutter.plugins.localauth.Messages$AuthStrings r2 = r0.strings
            java.lang.String r2 = r2.getGoToSettingsDescription()
            r0.showGoToSettingsDialog(r1, r2)
            return
        L49:
            io.flutter.plugins.localauth.AuthenticationHelper$AuthCompletionHandler r1 = r0.completionHandler
            io.flutter.plugins.localauth.Messages$AuthResult r2 = io.flutter.plugins.localauth.Messages.AuthResult.ERROR_NOT_ENROLLED
            r1.complete(r2)
            goto L84
        L51:
            boolean r1 = r0.useErrorDialogs
            if (r1 == 0) goto L65
            io.flutter.plugins.localauth.Messages$AuthStrings r1 = r0.strings
            java.lang.String r1 = r1.getDeviceCredentialsRequiredTitle()
            io.flutter.plugins.localauth.Messages$AuthStrings r2 = r0.strings
            java.lang.String r2 = r2.getDeviceCredentialsSetupDescription()
            r0.showGoToSettingsDialog(r1, r2)
            return
        L65:
            io.flutter.plugins.localauth.AuthenticationHelper$AuthCompletionHandler r1 = r0.completionHandler
            io.flutter.plugins.localauth.Messages$AuthResult r2 = io.flutter.plugins.localauth.Messages.AuthResult.ERROR_NOT_AVAILABLE
            r1.complete(r2)
            goto L84
        L6d:
            io.flutter.plugins.localauth.AuthenticationHelper$AuthCompletionHandler r1 = r0.completionHandler
            io.flutter.plugins.localauth.Messages$AuthResult r2 = io.flutter.plugins.localauth.Messages.AuthResult.ERROR_LOCKED_OUT_PERMANENTLY
            r1.complete(r2)
            goto L84
        L75:
            io.flutter.plugins.localauth.AuthenticationHelper$AuthCompletionHandler r1 = r0.completionHandler
            io.flutter.plugins.localauth.Messages$AuthResult r2 = io.flutter.plugins.localauth.Messages.AuthResult.ERROR_LOCKED_OUT_TEMPORARILY
            r1.complete(r2)
            goto L84
        L7d:
            io.flutter.plugins.localauth.AuthenticationHelper$AuthCompletionHandler r1 = r0.completionHandler
            io.flutter.plugins.localauth.Messages$AuthResult r2 = io.flutter.plugins.localauth.Messages.AuthResult.ERROR_NOT_AVAILABLE
            r1.complete(r2)
        L84:
            r0.stop()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.localauth.AuthenticationHelper.onAuthenticationError(int, java.lang.CharSequence):void");
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
    }

    @Override // androidx.biometric.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult authenticationResult) {
        this.completionHandler.complete(Messages.AuthResult.SUCCESS);
        stop();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        onActivityPaused(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        onActivityResumed(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void stopAuthentication() {
        BiometricPrompt biometricPrompt = this.biometricPrompt;
        if (biometricPrompt != null) {
            biometricPrompt.cancelAuthentication();
            this.biometricPrompt = null;
        }
    }
}
