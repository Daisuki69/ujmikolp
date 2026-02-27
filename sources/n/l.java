package N;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;

/* JADX INFO: loaded from: classes2.dex */
public interface l {
    Bundle A(CTInAppNotification cTInAppNotification, CTInAppAction cTInAppAction, String str, Bundle bundle, FragmentActivity fragmentActivity);

    void K(CTInAppNotification cTInAppNotification);

    void K0(CTInAppNotification cTInAppNotification, Bundle bundle);

    Bundle e0(CTInAppNotification cTInAppNotification, CTInAppNotificationButton cTInAppNotificationButton, InAppNotificationActivity inAppNotificationActivity);
}
