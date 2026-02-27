package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.WorkerThread;
import androidx.media3.common.PlaybackException;
import cj.t;
import com.dynatrace.android.callback.Callback;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.text.MatchGroup;
import org.json.JSONArray;
import zj.C2581c;
import zj.m;
import zj.n;
import zj.o;
import zj.y;

/* JADX INFO: loaded from: classes2.dex */
public interface AFc1oSDK {

    public static final class AFa1vSDK {
        public final String AFInAppEventParameterName;
        public final Boolean AFInAppEventType;
        public Boolean AFKeystoreWrapper;

        public AFa1vSDK() {
        }

        public static JSONArray AFInAppEventParameterName(List<AFc1wSDK> list) {
            j.g(list, "");
            List<AFc1wSDK> list2 = list;
            ArrayList arrayList = new ArrayList(t.l(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AFc1wSDK) it.next()).AFInAppEventParameterName());
            }
            return new JSONArray((Collection) arrayList);
        }

        public static boolean AFInAppEventType(HttpURLConnection httpURLConnection) {
            j.g(httpURLConnection, "");
            return Callback.getResponseCode(httpURLConnection) / 100 == 2;
        }

        public static String AFKeystoreWrapper(String str) {
            j.g(str, "");
            byte[] bytes = str.getBytes(C2581c.f21468b);
            j.f(bytes, "");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            j.f(strEncodeToString, "");
            return strEncodeToString;
        }

        public static int values(String str) {
            Integer numF;
            Integer numF2;
            Integer numF3;
            j.g(str, "");
            n nVarD = new o("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").d(str);
            if (nVarD == null) {
                return -1;
            }
            m mVar = nVarD.c;
            MatchGroup matchGroupA = mVar.a(1);
            int iIntValue = 0;
            int iIntValue2 = ((matchGroupA == null || (numF3 = y.f(matchGroupA.f18206a)) == null) ? 0 : numF3.intValue()) * PlaybackException.CUSTOM_ERROR_CODE_BASE;
            MatchGroup matchGroupA2 = mVar.a(2);
            int iIntValue3 = (((matchGroupA2 == null || (numF2 = y.f(matchGroupA2.f18206a)) == null) ? 0 : numF2.intValue()) * 1000) + iIntValue2;
            MatchGroup matchGroupA3 = mVar.a(3);
            if (matchGroupA3 != null && (numF = y.f(matchGroupA3.f18206a)) != null) {
                iIntValue = numF.intValue();
            }
            return iIntValue3 + iIntValue;
        }

        public AFa1vSDK(String str, Boolean bool) {
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = bool;
        }

        public static String AFInAppEventParameterName(String str) throws NoSuchAlgorithmException {
            String string = "";
            j.g(str, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(C2581c.f21468b);
            j.f(bytes, "");
            byte[] bArrDigest = messageDigest.digest(bytes);
            j.f(bArrDigest, "");
            for (byte b8 : bArrDigest) {
                StringBuilder sbW = androidx.camera.core.impl.a.w(string);
                sbW.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b8)}, 1)));
                string = sbW.toString();
            }
            return string;
        }
    }

    @WorkerThread
    void AFKeystoreWrapper(byte[] bArr, Map<String, String> map, int i);
}
