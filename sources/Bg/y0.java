package bg;

import android.content.ComponentName;
import android.hardware.fingerprint.FingerprintManager;
import android.provider.Settings;
import android.view.autofill.AutofillManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0955B0 f9142b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(C0955B0 c0955b0, int i) {
        super(1);
        this.f9141a = i;
        this.f9142b = c0955b0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ComponentName autofillServiceComponentName;
        FingerprintManager fingerprintManager;
        switch (this.f9141a) {
            case 0:
                return String.valueOf(Integer.valueOf(C0955B0.i(this.f9142b).areBubblesEnabled() ? 1 : 0));
            case 1:
                return String.valueOf(C0955B0.i(this.f9142b).getImportance());
            case 2:
                return String.valueOf(C0955B0.i(this.f9142b).getNotificationPolicy().priorityCallSenders);
            case 3:
                return String.valueOf(C0955B0.i(this.f9142b).getNotificationPolicy().priorityCategories);
            case 4:
                return String.valueOf(C0955B0.i(this.f9142b).getNotificationPolicy().priorityConversationSenders);
            case 5:
                return Settings.Secure.getString(this.f9142b.c, "accessibility_display_inversion_enabled");
            case 6:
                return String.valueOf(C0955B0.i(this.f9142b).getNotificationPolicy().priorityMessageSenders);
            case 7:
                return Settings.System.getString(this.f9142b.c, "alarm_alert");
            case 8:
                return String.valueOf(C0955B0.i(this.f9142b).getNotificationPolicy().suppressedVisualEffects);
            case 9:
                AutofillManager autofillManagerN = androidx.media3.common.util.e.n(this.f9142b.m.getValue());
                if (autofillManagerN == null || (autofillServiceComponentName = autofillManagerN.getAutofillServiceComponentName()) == null) {
                    return null;
                }
                return autofillServiceComponentName.toString();
            case 10:
                return String.valueOf(Integer.valueOf(C0955B0.i(this.f9142b).areNotificationsPaused() ? 1 : 0));
            case 11:
                AutofillManager autofillManagerN2 = androidx.media3.common.util.e.n(this.f9142b.m.getValue());
                if (autofillManagerN2 != null) {
                    return String.valueOf(autofillManagerN2.isEnabled());
                }
                return null;
            case 12:
                return String.valueOf(Integer.valueOf(C0955B0.i(this.f9142b).areNotificationsEnabled() ? 1 : 0));
            case 13:
                AutofillManager autofillManagerN3 = androidx.media3.common.util.e.n(this.f9142b.m.getValue());
                if (autofillManagerN3 != null) {
                    return String.valueOf(autofillManagerN3.isAutofillSupported());
                }
                return null;
            case 14:
                return String.valueOf(this.f9142b.f8714d.orientation);
            case 15:
                return Settings.Global.getString(this.f9142b.c, "contact_metadata_sync_enabled");
            case 16:
                return Settings.Secure.getString(this.f9142b.c, "rtt_calling_mode");
            case 17:
                return Settings.Secure.getString(this.f9142b.c, "default_input_method");
            case 18:
                return Settings.System.getString(this.f9142b.c, "screen_brightness");
            case 19:
                return Settings.System.getString(this.f9142b.c, "end_button_behavior");
            case 20:
                return Settings.System.getString(this.f9142b.c, "screen_brightness_mode");
            case 21:
                C0955B0 c0955b0 = this.f9142b;
                if (((FingerprintManager) c0955b0.f8716k.getValue()) == null || (fingerprintManager = (FingerprintManager) c0955b0.f8716k.getValue()) == null) {
                    return null;
                }
                return String.valueOf(Integer.valueOf(fingerprintManager.hasEnrolledFingerprints() ? 1 : 0));
            case 22:
                return Settings.System.getString(this.f9142b.c, "screen_off_timeout");
            case 23:
                return Settings.System.getString(this.f9142b.c, "font_scale");
            case 24:
                return Settings.System.getString(this.f9142b.c, "sound_effects_enabled");
            case 25:
                return Settings.System.getString(this.f9142b.c, "haptic_feedback_enabled");
            case 26:
                return Settings.System.getString(this.f9142b.c, "auto_punctuate");
            case 27:
                return String.valueOf(C0955B0.i(this.f9142b).getCurrentInterruptionFilter());
            case 28:
                return Settings.System.getString(this.f9142b.c, "auto_replace");
            default:
                return Settings.System.getString(this.f9142b.c, "show_password");
        }
    }
}
