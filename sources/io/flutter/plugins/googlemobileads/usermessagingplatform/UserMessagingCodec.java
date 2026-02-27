package io.flutter.plugins.googlemobileads.usermessagingplatform;

import L1.c;
import L1.i;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pg.C2037D;

/* JADX INFO: loaded from: classes4.dex */
public class UserMessagingCodec extends C2037D {
    private static final byte VALUE_CONSENT_DEBUG_SETTINGS = -126;
    private static final byte VALUE_CONSENT_FORM = -125;
    private static final byte VALUE_CONSENT_REQUEST_PARAMETERS = -127;
    private static final byte VALUE_FORM_ERROR = -124;
    private final Map<Integer, c> consentFormMap = new HashMap();

    @Nullable
    private List<String> asList(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if (obj2 instanceof String) {
                    arrayList.add((String) obj2);
                }
            }
        }
        return arrayList;
    }

    public void disposeConsentForm(c cVar) {
        this.consentFormMap.remove(Integer.valueOf(cVar.hashCode()));
    }

    @Override // pg.C2037D
    public Object readValueOfType(byte b8, @NonNull ByteBuffer byteBuffer) {
        switch (b8) {
            case -127:
                return new ConsentRequestParametersWrapper((Boolean) readValueOfType(byteBuffer.get(), byteBuffer), (ConsentDebugSettingsWrapper) readValueOfType(byteBuffer.get(), byteBuffer));
            case -126:
                return new ConsentDebugSettingsWrapper((Integer) readValueOfType(byteBuffer.get(), byteBuffer), asList(readValueOfType(byteBuffer.get(), byteBuffer)));
            case -125:
                return this.consentFormMap.get((Integer) readValueOfType(byteBuffer.get(), byteBuffer));
            case -124:
                Integer num = (Integer) readValueOfType(byteBuffer.get(), byteBuffer);
                return new i(num.intValue(), (String) readValueOfType(byteBuffer.get(), byteBuffer));
            default:
                return super.readValueOfType(b8, byteBuffer);
        }
    }

    public void trackConsentForm(c cVar) {
        this.consentFormMap.put(Integer.valueOf(cVar.hashCode()), cVar);
    }

    @Override // pg.C2037D
    public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, @NonNull Object obj) {
        if (obj instanceof ConsentRequestParametersWrapper) {
            byteArrayOutputStream.write(-127);
            ConsentRequestParametersWrapper consentRequestParametersWrapper = (ConsentRequestParametersWrapper) obj;
            writeValue(byteArrayOutputStream, consentRequestParametersWrapper.getTfuac());
            writeValue(byteArrayOutputStream, consentRequestParametersWrapper.getDebugSettings());
            return;
        }
        if (obj instanceof ConsentDebugSettingsWrapper) {
            byteArrayOutputStream.write(-126);
            ConsentDebugSettingsWrapper consentDebugSettingsWrapper = (ConsentDebugSettingsWrapper) obj;
            writeValue(byteArrayOutputStream, consentDebugSettingsWrapper.getDebugGeography());
            writeValue(byteArrayOutputStream, consentDebugSettingsWrapper.getTestIdentifiers());
            return;
        }
        if (obj instanceof c) {
            byteArrayOutputStream.write(-125);
            writeValue(byteArrayOutputStream, Integer.valueOf(obj.hashCode()));
        } else {
            if (!(obj instanceof i)) {
                super.writeValue(byteArrayOutputStream, obj);
                return;
            }
            byteArrayOutputStream.write(-124);
            i iVar = (i) obj;
            writeValue(byteArrayOutputStream, Integer.valueOf(iVar.f2805a));
            writeValue(byteArrayOutputStream, iVar.f2806b);
        }
    }
}
