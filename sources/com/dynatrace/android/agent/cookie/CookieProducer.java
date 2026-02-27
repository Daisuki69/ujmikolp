package com.dynatrace.android.agent.cookie;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.conf.DataCollectionLevel;
import com.dynatrace.android.agent.data.Session;

/* JADX INFO: loaded from: classes2.dex */
class CookieProducer {

    /* JADX INFO: renamed from: com.dynatrace.android.agent.cookie.CookieProducer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel;

        static {
            int[] iArr = new int[DataCollectionLevel.values().length];
            $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel = iArr;
            try {
                iArr[DataCollectionLevel.PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel[DataCollectionLevel.USER_BEHAVIOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel[DataCollectionLevel.OFF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public String createAdkCookie(Session session, String str) {
        return session.visitorId + Global.UNDERSCORE + session.sessionId + Global.HYPHEN + session.sequenceNumber + Global.UNDERSCORE + str + "_m";
    }

    public String createAdkSettingsCookie(Session session) {
        StringBuilder sb2 = new StringBuilder("v_4_ol_");
        if (!session.isConfigurationApplied()) {
            sb2.append(ExifInterface.GPS_MEASUREMENT_2D);
        } else if (session.isActive()) {
            sb2.append("0_mul_");
            sb2.append(session.multiplicity);
        } else {
            sb2.append(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        sb2.append("_prv_");
        int i = AnonymousClass1.$SwitchMap$com$dynatrace$android$agent$conf$DataCollectionLevel[session.getPrivacyRules().getPrivacySettings().getDataCollectionLevel().ordinal()];
        if (i == 1) {
            sb2.append(ExifInterface.GPS_MEASUREMENT_3D);
        } else if (i != 2) {
            sb2.append(ExifInterface.GPS_MEASUREMENT_2D);
        } else {
            sb2.append("4");
        }
        return sb2.toString();
    }

    public String createDtCookie(long j, int i) {
        return j + Global.UNDERSCORE + i;
    }
}
